explain physical phenomenon by physical processes



quiz 1

jitters (do an action at specific time), drifts ()

Indivsibly / atomically, race.

timely



quiz 2

timer (pooling model of IO), pooling

interruptting, pooling.



quiz 3

no

higher

disable ?

save, atomically



##### Quiz 3.1

Do locks guarantee the execution of tasks not to be preempted by other
tasks? **No**

##### Quiz 3.2

In order to support physical atomicity, the hardware must be designed in
such a way that interrupt handlers will have **higher** priorities than applications. No
application can run until all ISRs terminate.

Quiz 3.3: The hardware shall ______ all interrupts before an ISR starts execution.
Quiz 3.4: An ISR shall first ______ register values and execute instructions that must
be executed ______ before it enables higher priority interrupts.



quiz 4

Quiz 4.1 The purpose of line Quiz 4.1 is to let
the application 

wait for external events / data without hogging hte CPU



Quiz 4.2: The purpose of line Quiz 4.2 is to

prevent the ISR from updating the buffer while the application is working on the input



quiz 5

exit

no applicaton task can be executed until all ISR exits



quiz 6

user processes

user processes

a user process and ISR, or between ISRs



quiz 7

yes



quiz 8

no







enable higher priority task

