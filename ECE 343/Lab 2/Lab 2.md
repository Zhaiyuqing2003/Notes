$$
{\def\I{\text{I}}}
{\def\V{\text{V}}}
{\def\mV{\text{mV}}}
{\def\R{\text{R}}}
{\def\L{\text{L}}}
{\def\for{\text{for}}}
{\def\if{\text{if}}}
{\def\tsub#1;{{_{\text{#1}}}}}
{\def\k{\text{k}}}
{\def\P{\text{P}}}
{\def\mW{\text{mW}}}
{\def\d{\text{d}}}
$$
# ECE 343 Lab #2: Diodes

## <a id="1"></a>1   Introduction

In this lab we’ll be working with diodes and exploring some of their practical applications. The objectives for this lab are:

* Simulation of diode I-V curves.
* Using diodes as reference voltages
* Using diodes as a rectifier

## <a id="2"></a>2   Diodes-Review

In previous courses, you should have been introduced to diodes and simple models of their I-V behavior. We can create an ideal model of the diode that satisfies the following equations:
$$
\I_D = 0 \ \for \ \V \le \V\!_D \\
\V = \V\!_D \ \for \ \I_D \ge 0
$$
This forms a “right-angle” curve on the current-versus-voltage v $-$ i graph. While this is a nice approximation, real life models are not quite as simple. A key difference between the “ideal” diode you have seen earlier and a practical diode is that for a practical diode $\V \neq \V\!_D$ when $\I_D \neq 0$. The full semiconductor model of a diode is beyond the scope of this class. The v $-$ i characteristic for a practical diode can be approximated using the following equation:
$$
\I_D = \I_S (e^{V_D / V_T} - 1) \approx \I_S e^{\V\!_D / V\!_T},\, \if \ \V\!_D \gg \V
\!_T
$$
where $\I_S$ is the reverse saturation current, $\I_D$ is the diode current, $\V\!_D$ is voltage across the diode terminals, $\V_T$ is a constant called thermal voltage. In figure <a name="red">1</a> below, we plot an ideal model compared to a real one to show the difference.

<img src="./Lab 2.assets/image-20241001125952787.png" alt="image-20241001125952787" style="zoom: 15%;" id="figure_1"/>

<a name="center black block pad-bottom small">Figure 1: Ideal diode compared to real diode I-V curves.</a>

<div name="page-break"></div>

## <a id="3"></a>3   Simulations

In this section we will perform *Spice* simulations to first obtain diode I $-$ V characteristics and then explore how this diode can be used as a simple voltage reference.

### <a id="3.1"></a>3.1   Diode Characterization

<img src="./Lab 2.assets/image-20241001130051218.png" alt="image-20241001130051218" style="zoom:33%;" id="figure_2"/>

<a name="center black block pad-bottom small">Figure 2: Diode characterization test bench</a>

**Component Values:** Diode: 1N914/1N4148, $\V\tsub IN; = 4\V, \R = 1\k\ohm$

1. Draw the circuit shown in Fig. <a name="red" href="#figure_2">2</a> in LTspice.

   ><img src="./Lab 2.assets/image-20241001133140985.png" alt="image-20241001133140985" style="zoom:20%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 1: Test bench circuit in LTSpice.</a>

2. Perform a DC sweep simulation on the circuit. Use the following parameters:

   * Source to sweep: $\V\tsub in;$
   * Type of sweep: Linear
   * Start Value: $0.2\V$
   * Stop Value: $3\V$
   * Increment: $0.01$


3. Plot and take a screenshot of the I $-$ V characteristics of the diode:

   * The current can be selected by clicking directly on the diode.
   * The voltage across the diode can be plotted by right-clicking the x-axis and typing in the correct formula in the “Quality Plotted” box.

   ><img src="./Lab 2.assets/image-20241001132912330.png" alt="image-20241001132912330" style="zoom: 20%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 2: Diode I-V characteristics</a>

4. What is $\V\tsub FWD;$ of the diode? (An approximate value of $\V\tsub FWD;$ can be found by extrapolating a line from the steepest part of the curve. To draw a line, right click the plot and select draw.)

   > $\V\tsub FWD; = 578.0\mV$

<div name="page-break"></div>

### <a id="3.2"></a>3.2   Diode as a Reference

When designing circuits, we often only have one voltage as an input: $\V\tsub DD;$. With this in mind, we may also need different reference voltages and biases elsewhere in the circuit. One simple way to generate a reference voltage is by using a diode. In this section, we will explore how a diode can be used as a simple voltage reference.

<img src="./Lab 2.assets/image-20241001130131456.png" alt="image-20241001130131456" style="zoom: 33%;" id="figure_3"/>

<a name="center black block pad-bottom small">Figure 3: Left, one diode as a reference. Right two diodes as a reference.</a>

1. Assuming we re using the same diodes in the previous section, compute the expected values of $\V\tsub D1;$, $\V\tsub D2;$.

   >$$
   >\begin{align}
   >\V\!\tsub D1; &= \V\tsub FWD; = 578.0\mV  \\
   >\V\!\tsub D2; &= 2 \cdot \V\tsub FWD; = 2 \cdot 0.578\mV =  1.156 \V
   >\end{align}
   >$$

2. Now assume that the source voltage has a sinusoidal noise component (i.e. $\V_1 = \V\tsub DC; + v\tsub n; \sin (2\pi\cdot 100t)$). Derive an expression for the incremental output voltage ($\Delta \V_0$) in terms of the diode incremental resistance $\bold{r_d}$ for **each** circuit.

   >The diode is essentially a resistor with resistance $\bold{r_d}$ in incremental analysis. So,
   >$$
   >\Delta {\V_{01}} = \frac{\bold {r_d}}{\bold{r_d} +\R\tsub ref;} v_n;
   >$$
   >
   >$$
   >\Delta \V_{02} = \frac{2\cdot \bold {r_d}}{2\cdot \bold{r_d} +\R\tsub ref;} v_n
   >$$

3. Draw the circuits shown in Fig. <a name="red" href="#figure_3">3</a> in LTspice. Let $\V_1 = 4 + 0.5\sin(2 \pi \cdot 100t) \V$ and $\R\tsub ref; = 1\k\ohm$ . Make sure to use the 1N914 diodes as before. Perform a **transient** simulation on the circuits with the following parameters:

   * Stop time: 50m
   * Time to start saving data: 5m
   * Maximum timestep: 1u

   > <img src="./Lab 2.assets/image-20241001132136856.png" alt="image-20241001132136856" style="zoom: 15%;" /><img src="./Lab 2.assets/image-20241001132330541.png" alt="image-20241001132330541" style="zoom: 15%;" />
   >
   > <a name="center black block pad-bottom small">Figure Solution 3: Reference cirucit in LTSpice</a>

4. Note down the peak-to-peak variation in output voltage ($\bold {\Delta V_0}$) for both circuits. Take a screenshot of one of the plots.

   ><img src="./Lab 2.assets/image-20241001132546314.png" alt="image-20241001132546314" style="zoom:10%;" /><img src="./Lab 2.assets/image-20241001132529435.png" alt="image-20241001132529435" style="zoom:10%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 4: Left is $\V\tsub D1;$, Right is $\V\tsub D2;$</a>
   >$$
   >\Delta \bold {V_{01}} = 13.96\mV
   >$$
   >
   >$$
   >\Delta \bold {V_{02}} = 33.42\mV
   >$$

<div name="page-break"></div>

### <a id="3.3"></a>3.3   Diode Reference Test Circuit

In an ideal reference, the output voltage should not change under any load conditions. We will now see how well the diode based reference circuit discussed in section <a name="red" href="#3.1">3.1</a> acts under different load conditions.

<img src="./Lab 2.assets/image-20241001130233935.png" alt="image-20241001130233935" style="zoom:33%;" id="figure_4"/>

<a name="center black block pad-bottom small">Figure 4: Simple reference generator measurement circuit</a>

1. Draw the voltage reference circuit shown in <a name="red" href="#figure_3">3(b)</a> with a resistive load $\bold {R_L}$ as shown in Fig. <a name="red" href="#figure_4">4</a>. Set $\V_1 = 4 + 0.5\sin(2\pi \cdot 100t)$ with $\R\tsub ref; = 100\ohm$. Perform a **DC operating point** simulation while sweeping the resistive load from $10\ohm$ to $2\k\ohm$ with an increment of $10\ohm$. Please refer to the LTSpice tutorial on the website for details on how to set the resistor as the sweep variable.

2. In LTSpice, plot $\V\tsub ref;$ vs $\R_\L$ and record the $\R_\L$ at which the curve is 95% of the maximum voltage (use your best estimation in getting $\R\tsub L, min;$). Take a screenshot of your graph.

3. Repeat steps 1 and 2 for $\R\tsub ref; = 470\ohm$ and $\R\tsub ref; = 1\k\ohm$,

   ><img src="./Lab 2.assets/image-20241001125847701.png" alt="image-20241001125847701" style="zoom:25%;"/>
   >
   ><a name="center black block pad-bottom small">Figure Solution 5: The curve when `Rref = 100Ohms, 470Ohms, 1kOhms`(from bottom to top)</a>


4. Use $\R\tsub ref; = 100\ohm$ and replace the load resistor with its corresponding $\R\tsub L, min;$.

5. Run a transient simulation and record the value of $\bold{\Delta V_0}$, $\P\tsub supplied;$, and $\P\tsub load;$ in Table <a name="red" href="#table-1">1</a> (**HINT**: Instantaneous $\P\tsub supplied;$ and $\P \tsub load;$ can be obtained by holding the “**alt**” key and clicking on the component to be measured. Average power can be obtained by holding “**ctrl**” button and clicking on the name of the measurement in the waveform window.

6. Repeat steps 4 and 5 for $\R \tsub ref; =  470\ohm$ and $\R\tsub ref; = 1\k\ohm$.

   <center id="table-1"> Table 1: Performance of a Diode based Voltage Regulator     </center>

| $\bold R\tsub ref;$ | $\Delta \V_{0}$ | $\P\tsub supplied;$ | $\P\tsub load;$ | $\R\tsub L,min;$ |
| ------------------- | --------------- | ------------------- | --------------- | ---------------- |
| $100 \ohm$          | $72.96\mV$      | $-103.38\mW$        | $18.21\mW$      | $110\ohm$        |
| $470\ohm$           | $68.66\mV$      | $-23.35\mW$         | $4.148\mW$      | $380\ohm$        |
| $1\k\ohm$           | $71.81\mV$      | $-11.29\mW$         | $2.039\mW$      | $680\ohm$        |

7. From the table above, briefly explain what happens as a larger $\bold{R_{ref}}$ is used.

   > When a larger $\bold R\tsub ref;$ is used, the $\P\tsub supplied;$, and $\P\tsub load;$ decreases (since current is limited, of course.), and the $\R\tsub L, min;$ increases. The $\Delta \V\tsub 0;$ doesn’t seems to change, it always around $70\mV$.

