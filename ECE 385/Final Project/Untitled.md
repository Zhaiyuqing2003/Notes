##### Baseline

* Receiving input from keyboard (A, B, Select, Start, Up, Down, Left, Right mapped to keyboard keys)

​	**Complete**



* Reading game disk file from SD card.

​	**Using ROM flash in Vivado instead**

​	

* Executing game using 6502 CPU.

​	**Complete, though you could only verify that in simulation / LED output in FPGA board**



* Outputting game graphics using PPU and HDMI signal generator.

​	**Partially complete, PPU could operate normally, and PPU video signal could be converted to HDMI signal. The interaction 	between PPU and CPU (through 0x2000 - 0x2007 registers) is only partially finished.**



* Outputting game audio using pAPU to the audio jacks.

  **It seems that there are no consensus in pAPU, and their lacks reverse engineering document for pAPU, this should actually be removed from the proposal**