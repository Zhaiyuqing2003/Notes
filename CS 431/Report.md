#### Report for Enhancing Biped Navigation Capabilities through Object Detection

**Introduction**
The rapid progression of embedded systems within robotics has opened up significant opportunities for enhancing autonomous navigation and environmental interaction. This project seeks to upgrade the existing Biped platform, which is controlled by an ESP32 chip and equipped with various sensors, by integrating object detection algorithms. The goal is to enable the Biped to autonomously identify and approach specific targets. This report details the design, implementation, and outcomes of integrating the YOLO (You Only Look Once) object detection algorithm, alongside a reliable UDP communication system. Together, these components provide the Biped with the ability to recognize and pursue a specific target while maintaining accurate navigation.

**Design & Implementation**

1. **Object Detection**:
   The Biped system uses the YOLO object detection algorithm, which was implemented through Python libraries to process images in real-time from the onboard camera. The system is designed to identify specific objects (e.g., a person with the lowest ID). YOLO is particularly well-suited for this project due to its high accuracy and speed in identifying objects.
2. **Multiprocessing for Communication and AI**:
   To handle the computational load of managing UDP communication and AI, the project uses the Python `multiprocessing` library to create three separate processes:
   - **UDP Camera Process**: Receives video feed from the Biped’s camera.
   - **UDP Message Process**: Handles incoming sensor data and controls reference updates via UDP communication.
   - **AI Process**: Processes the images using YOLO to detect a target and adjust navigation instructions.
3. **Target Tracking and Control**:
   The Biped’s navigation system relies on the position of the target within the camera’s field of view. Once the target is detected, the system calculates the deviation of the target’s bounding box center from the screen center. Based on this deviation, a **Proportional** (P) controller is used to adjust the Biped’s movement to center the target within the camera frame. These adjustments are sent back to the Biped via the UDP message process, updating the attitude (z) and position (x).
4. **Communication Protocol**:
   UDP is used to ensure reliable, synchronized communication between the Biped and the ground station. The system updates the Biped’s navigation in real-time based on camera and sensor data.

**Bugs Found & Fixes**

1. **Intermittent Movement Due to Packet Buffer Overflow**:
   A significant challenge encountered was that the Biped moved only at the beginning of each 3-second period. This was traced back to the way UDP packets were handled within a single Python process, which was not efficient enough to consume incoming packets promptly. Due to the process's inability to keep up, the OS's kernel would discard older UDP packets approximately every 3 seconds to sync the application with the latest packet.

   This syncing caused the system to only read updated messages at the beginning of each cycle, leading to the Python program issuing movement commands based on delayed and hence outdated Biped messages. Consequently, the Biped would only respond to these outdated commands during the initial part of each 3-second interval, after which there would be no movement until the next cycle.

   **Solution**: The solution implemented involved restructuring the application to use multiple processes. By employing Python’s `multiprocessing` library, separate processes were dedicated to handling the camera feed, UDP message communication, and AI processing. This adjustment ensured that each component could handle its data stream independently and more efficiently. As a result, the system could handle all incoming UDP packets in real time, thus eliminating the delay in command execution and allowing continuous and accurate movement of the Biped.

**Conclusion**
The integration of the YOLO object detection algorithm, combined with the reliable UDP communication system, significantly enhanced the Biped’s navigation capabilities. The use of Python's multiprocessing library helped to resolve communication delays and improved overall system performance. With the enhanced navigation system, the Biped is now able to autonomously identify and approach a specified target with greater precision and reliability. Future improvements could involve integrating additional sensors and enhancing the decision logic to handle more complex navigation scenarios, thereby broadening the potential applications of the Biped platform.

**Code**

```python
import multiprocessing
import socket
import numpy as np
import cv2
from PyQt5.QtWidgets import QApplication, QLabel, QMainWindow, QVBoxLayout, QWidget
from PyQt5.QtGui import QImage, QPixmap
from PyQt5.QtCore import QTimer
import sys
from ultralytics import YOLO
import struct
import math

model = YOLO('yolov8n.pt')

actuation_format = '???dd'
controller_saturation = 'dddd'
pid_gains = 'dddd'
controller_parameter_format = 'dd' + controller_saturation + pid_gains * 3 + controller_saturation * 3
controller_reference_format = 'ddd'
encoder_format = 'ddddd'
imu_format = 'ddddddddddddd'
time_of_flight_format = 'ddd'

struct_format = '<' + actuation_format + controller_parameter_format + controller_reference_format + encoder_format + imu_format + 'QQ' + time_of_flight_format 


def receive_message(shared_biped_message, control_queue):
    message_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    message_socket.bind(("0.0.0.0", 4431))

    while True:
        biped_message, addr = message_socket.recvfrom(1024)
        if len(biped_message) == 467:
            shared_biped_message[:] = biped_message
        else:
            print("Invalid message size: ", len(biped_message))

        if not control_queue.empty():
            print("Sending control data")
            control_data = control_queue.get()
            message_socket.sendto(control_data, addr)

def receive_camera_frames(frame_queue):
    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    sock.bind(("0.0.0.0", 4432))

    frame_boundary_reference = b"123456789000000000000987654321"  # Binary reference string
    frame_boundary_received = False
    frame_packet_count = 0

    while True:
        try:
            data, _ = sock.recvfrom(1460)

            if not frame_boundary_received:
                if len(data) <= len(frame_boundary_reference):
                    continue

                frame_boundary = data[:len(frame_boundary_reference)]

                if frame_boundary == frame_boundary_reference:
                    frame_boundary_received = True
                    frame_packet_count = data[len(frame_boundary_reference)]

            if frame_boundary_received:
                jpg_buffer = []

                for _ in range(frame_packet_count):
                    data, _ = sock.recvfrom(1460)
                    jpg_buffer.append(data)

                # Combine the packets into a full frame
                full_frame = b"".join(jpg_buffer)
                frame_queue.put(full_frame)

                frame_boundary_received = False
                frame_packet_count = 0

        except Exception as e:
            print(f"An camera error occurred: {e}")

class VideoStream(QMainWindow):
    def __init__(self, frame_queue, shared_biped_message, control_queue):
        super().__init__()
        self.setWindowTitle("UDP Camera Stream")
        self.setGeometry(100, 100, 800, 600)

        # Main widget and layout
        main_widget = QWidget(self)
        main_layout = QVBoxLayout(main_widget)
        self.setCentralWidget(main_widget)

        # Create a label to display the video
        self.video_label = QLabel()
        main_layout.addWidget(self.video_label)

        # Shared data
        self.frame_queue = frame_queue
        self.shared_biped_message = shared_biped_message
        self.control_queue = control_queue

        # Set up timer to call the display_frame method periodically
        self.timer = QTimer()
        self.timer.timeout.connect(self.display_frame)
        self.timer.start(1000 // 30)  # 30 FPS

    def display_frame(self):
        global struct_format

        # Get the frame data from the queue
        if not self.frame_queue.empty():
            frame_data = self.frame_queue.get()
        else:
            return

        # Convert the frame data into an image
        image_array = cv2.imdecode(np.frombuffer(frame_data, np.uint8), cv2.IMREAD_COLOR)

        # Perform object detection
        results = model.track(image_array, persist=True, show=False, verbose=False)
        annotated_image = results[0].plot()

        boxes = results[0].boxes
        classes = boxes.cls

        names = results[0].names
        matched_names = [names[i.item()] for i in classes]

        first_person_x = None

        for i in range(len(matched_names)):
            if matched_names[i] == 'person':
                # retrieve the corresponding row in box tensor
                first_person_x = boxes.xywhn[i][0].item()

        turn_coefficient = 20 * math.pi / 180 * 10

        if first_person_x is not None:
            try:
                decoded_data = list(struct.unpack(struct_format, bytes(self.shared_biped_message)))

                # attitude z
                decoded_data[35 + 1] = (first_person_x - 0.5) * turn_coefficient
                # position x (move slightly forward)
                decoded_data[35 + 2] = decoded_data[35 + 3] + 0.2  # 30 cm

                print("Angle", decoded_data[35 + 1])

                self.control_queue.put(struct.pack(struct_format, *decoded_data))

            except struct.error as e:
                print("Error decoding data: ", e)

        if image_array is not None:
            # Convert the OpenCV image to an RGB QImage
            image_array = cv2.cvtColor(annotated_image, cv2.COLOR_BGR2RGB)
            height, width, channels = image_array.shape
            bytes_per_line = channels * width
            q_image = QImage(image_array.data, width, height, bytes_per_line, QImage.Format_RGB888)

            # Convert to QPixmap and set to label
            pixmap = QPixmap.fromImage(q_image)
            self.video_label.setPixmap(pixmap)

def main():
    frame_queue = multiprocessing.Queue()  # Shared frame data queue
    control_queue = multiprocessing.Queue()  # Shared control data queue
    shared_biped_message = multiprocessing.Array('B', 467) # Shared message data

    # Create processes for receiving messages and camera frames
    message_process = multiprocessing.Process(target=receive_message, args=(shared_biped_message, control_queue))
    camera_process = multiprocessing.Process(target=receive_camera_frames, args=(frame_queue,))

    # Start processes
    message_process.start()
    camera_process.start()

    # Set up the QApplication
    app = QApplication(sys.argv)

    # Create the main window
    main_window = VideoStream(frame_queue, shared_biped_message, control_queue)

    # Display the window and start the event loop
    main_window.show()
    app.exec_()

    # Stop processes
    message_process.terminate()
    camera_process.terminate()

if __name__ == "__main__":
    main()
```

