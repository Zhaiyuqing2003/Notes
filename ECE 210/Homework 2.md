

#### Problem 2

>For each one of the following two circuits, obtain $R\tsub eq;$

##### (a)

> <img src="./Homework 2.assets/image-20230903131524785.png" alt="image-20230903131524785" style="zoom:25%;" />

<img src="./Homework 2.assets/image-20230903131512333.png" alt="image-20230903131512333" style="zoom:25%;" />

Apply the rule of **resistor in parallel**, the equivalent resistor for the section $A$ and $B$, $R_A$ and $R_B$ respectively, is therefore
$$
R\tsub A; = \fac 1\ohm \cdot 1\ohm/1 \ohm + 1\ohm; = \half \ohm \\
R\tsub B; = \fac 1\ohm \cdot 1\ohm/1 \ohm + 1\ohm; = \half \ohm 
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903121236739.png" alt="image-20230903121236739" style="zoom:25%;" />

The resistor circled is in parallel with a wire, so it get short-circuited, and we could further simplify the circuit as:

<img src="./Homework 2.assets/image-20230903104240077.png" alt="image-20230903104240077" style="zoom:25%;" />

Apply the rule of **resistor in series**, the equivalent resistor for that part is
$$
R\tsub eqiv; = 1\ohm + \half \ohm = \fac 3/2; \ohm
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903104250885.png" alt="image-20230903104250885" style="zoom:25%;" />

Apply the rule of **resistor in parallel** again, the equivalent resistor for that part is
$$
\note R\tsub eq; = \fac {\fac 3/2;}\ohm \cdot 1\ohm /{\fac 3/2;}\ohm + 1\ohm; = \fac 3/5;\ohm !
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903104259569.png" alt="image-20230903104259569" style="zoom:25%;" />

##### (b)

><img src="./Homework 2.assets/image-20230903131241042.png" alt="image-20230903131241042" style="zoom: 25%;" />

<img src="./Homework 2.assets/image-20230903131340543.png" alt="image-20230903131340543" style="zoom:25%;" />

Apply the rule of **resistor in series**, the equivalent resistor for the section $A$ and $B$, $R_A$ and $R_B$ respectively, is therefore
$$
R_A = 1\ohm + 2\ohm + 3\ohm = 6\ohm \\
R_B = 2\ohm + 4\ohm = 6\ohm
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903131601620.png" alt="image-20230903131601620" style="zoom:25%;" />

Apply the rule of **resistor in parallel**, the equivalent resistor for that part is
$$
R\tsub eqiv; = \fac 6\ohm \cdot 6\ohm/6\ohm + 6\ohm; = 3\ohm
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903131721351.png" alt="image-20230903131721351" style="zoom:25%;" />

Apply the rule of **resistor in series**. the equivalent resistor for that part is
$$
R\tsub eqiv; = 2\ohm + 3\ohm = 5\ohm
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903131821081.png" alt="image-20230903131821081" style="zoom:25%;" />

Apply the rule of **resistor in parallel**, the equivalent resistor for that part is
$$
\note R\tsub eq; = \iv {\fac 1/6 \ohm; + \fac 1/3 \ohm; + \fac 1/5 \ohm;}; = \fac 10/7; \ohm!
$$
So we simplify the circuit:

<img src="./Homework 2.assets/image-20230903132059429.png" alt="image-20230903132059429" style="zoom:25%;" />

#### Problem 3

>Determine the current $I$ in the following circuit using source transformation
>
><img src="./Homework 2.assets/image-20230903132240041.png" alt="image-20230903132240041" style="zoom:25%;" />

<img src="./Homework 2.assets/image-20230903132249190.png" alt="image-20230903132249190" style="zoom:25%;" />

Transform the selected region. We know that for a current source in parallel with a resistor, we could transform that into a voltage source in series with a resistor, where the $I$ flows from $-$ to $+$ in the voltage source, and the voltage for that source is
$$
V = 1\A \cdot  4\ohm = 4\V
$$
 Therefore we get:

<img src="./Homework 2.assets/image-20230903142216650.png" alt="image-20230903142216650" style="zoom:25%;" />

we could now apply KVL on the circuit and get
$$
4\ohm \cdot I + 8\V -4\V = 0 \\
\note I= -\fac 4\V/4\ohm; = -1\A!
$$

#### Problem 4

>Consider the circuit below
>
><img src="./Homework 2.assets/image-20230903154619496.png" alt="image-20230903154619496" style="zoom:25%;" />

##### (a)

>Use the loop-current method to obtain a set of three linearly independent equations, in terms of the loop currents $I_1$, $I_2$ and $I_3$, and the sources $V_s$ and $I_s$, but no other variables, that can be used to determine the loop currents. Simplify your equations and write them with integer-valued coefficients.

On the left loop, we obtain (using KVL)
$$
V_s = I_1\cdot 3\ohm + (I_1 - I_2)\cdot 2\ohm \\
$$
We also find
$$
I_s = I_3 - I_2 \\
$$
On the outer loop, we obtain (using KVL)
$$
V_s = I_1\cdot 3\ohm + I_2 \cdot 3\ohm + I_3 \cdot 1\ohm
$$
We could simply these three equations.
$$
V_s = I_1 \cdot 5\ohm - I_2\cdot 2\ohm \\
I_s = I_3 - I_2\\
V_s = I_1\cdot 3\ohm + I_2 \cdot 3\ohm + I_3 \cdot 1\ohm
$$
and we get
$$
\note 
\align[[
I_1 = \fac 3/13;V_s - \fac 1/13;  I_s \\
I_2 = \fac 1/13;V_s - \fac 5/26;  I_s \\
I_3 = \fac 1/13;V_s + \fac 21/26; I_s 
]]!
$$

##### (b)

>Use the node-voltage method to obtain a set of three

we see that on the node labelled $V_2$, it has (using KCL)
$$
\fac V_1 - V_2/3\ohm; = \fac V_2 - 0/2\ohm; + \fac V_2 - V_3/3\ohm; \\
$$
we see that on the node labelled $V_3$,  it has (using KCL)
$$
\fac V_2 - V_3/3\ohm; + I_s = \fac V_3 - 0/1\ohm;
$$
We see that on the node labelled $V_1$, we get
$$
V_1 - 0 = V_s
$$
and therefore, simply the equation
$$
2(V_1 - V_2) =  3V_2 + 2(V_2 - V_3) \\
(V_2 - V_3) + 3\ohm \cdot I_s = 3V_3 \\
V_1 = V_s
$$
and
$$
\note 
\align[[
V_1 &= V_s \\
V_2 &= \fac 4/13; V_s + \fac 3/13;I_s \\
V_3 &= \iv 13; V_s + \fac 21/26;I_s
]]!
$$

##### (c)

>

<img src="./Homework 2.assets/image-20230903160700365.png" alt="image-20230903160700365" style="zoom:25%;" />



