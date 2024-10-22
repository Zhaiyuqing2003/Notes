$$
\def\V{\text{V}}
\def\A{\text{A}}
\def\mA{\text{mA}}
\phantom {derivatives}
\def\ffrac(#1/#2){\frac{#1}{#2}}
\def\hfrac #1(#2/#3){\ffrac (#1#2/#1#3)}
\def\deri#1/#2;{\hfrac \d(#1/#2)}
\def\dderi#1/#2;{\nderi #1/#2^2; }
\def\nderi#1/#2^#3;{\ffrac (\d^#3 #1/\d #2^#3)}
\def\derin #1;{\deri /#1;}
\def\pderi#1/#2;{\hfrac \part(#1/#2) }
\def\ppderi#1/#2;{\npderi #1/#2^2;}
\def\npderi#1/#2^#3;{\ffrac (\part^#3 #1/\part #2^#3)}
\def\pderin1/#1;{\ffrac (\part / \part #1)}
\def\fac #1/#2;{\frac{#1}{#2}}

\phantom {fraction}
\def\inv#1{\ffrac (1/#1)}
\newcommand\invsqrt[1]{\frac{1}{\sqrt{#1}}}
\newcommand\half{\frac{1}{2}}
\newcommand\tri{\frac{1}{3}}
\newcommand\quar{\frac{1}{4}}
\phantom {vectors}
\newcommand\vfunc[2]{}

\phantom {common vectors}
\def\vfn #1(#2){\vec #1(\vec #2)}
\def\v #1{\vec #1}
\newcommand\vf{\v f}
\newcommand\vx{\v x}
\newcommand\vy{\v y}
\newcommand\vz{\v z}
\newcommand\vr{\v r}
\newcommand\vv{\v v}
\newcommand\va{\v a}
\newcommand\vtheta{\v \theta}
\newcommand\vphi{\v \phi}
\newcommand\vs{\v s}

\phantom {randomstaff}
\def\tsub#1;{_{\text {#1}}}
\def\sub#1;{_{#1}}
\def\(#1);{\left(#1\right)}
\def\intl#1;{\int_{#1}}
\def\intlh#1;#2;{\int_{#1}^{#2}}
\def\sup#1;{^{#1}}
\def\tsup#1;{^{\text{#1}}}
\def\align[[#1]]{\begin{align*}#1\end{align*}}
\def\note#1!{\fbox{$#1$}}
\def\.#1|;{\left.#1\right|}
\def\ssqrt/#1/;{\sqrt{#1}}
\def\noteeq#1!#2!{\begin{equation} \label{eq:#2} \fbox{$#1$}\end{equation}}
\def\raf#1;{\ref{#1}}
\def\eqraf#1;{\eqref{#1}}
\def\dfac#1/#2;{\dfrac{#1}{#2}}
\def\sqt#1/;{\sqrt{#1}}
\def\sgrt#1/>{\sqrt{#1}}
\def\txt#1;{\text{#1}}
\def\const{\text{const}}
\def\eq#1!#2!{\begin{equation} \label{eq:#2} #1 \end{equation}}
\def\kg{\txt kg;}
\def\s{\txt s;}
\def\m{\txt m;}
\def\stwo{\txt s;^2}
\def\iv#1;{\inv{#1}}
\def\sumninfin{\sum\sub n=1;\sup\infin;}
\def\sumninfinz{\sum\sub n = 0;\sup\infin;}
\def\intinfin{\int\sub-\infin;\sup\infin;}
\def\cases[[#1]]{\begin{cases}#1\end{cases}}
\def\arcsinh{\text{arcsinh}}
\def\Hz{\text{Hz}}
\def\C{\text{C}}
\def\R{\text{R}}
\def\k{\text{k}}
\def\Z{\text{Z}}
\def\L{\text{L}}
\def\I{\text{I}}
$$

# ECE 343 Lab #1: Passive Filters

## <a id="1"></a>1   Introduction

Welcome to ECE343! This class provides an opportunity to get hands-on circuit experience as an accompaniment to ECE342. Each lab will follow a “*Prove, Simulate, Verify*” methodology:

1. First we mathematically prove concepts. This provides intuition for what comes next.
2. Next we introduce non-idealities by using `SPICE` models in simulation.
3. Finally, we validate all of the above by doing real measurements (using M2K Kits and lab equipment)

Lab 1 serves as a quick review of key concepts from ECE 210, as well as an introduction to the tools you’ll be using for the rest of the lab. We will specifically be doing that in the context of a simple RC filter.



### <a id="1.1"></a>1.1   Learning Objectives

* Review Fourier/Laplace transforms and filter design
* Use LTspice to simulate circuit performance
* Use graphs to present simulation results
* Setup software/hardware needed in the experiments
* Take measurements using SCOPY and lab equipment
* Compare and analyze theoretical, simulated, and experimental results
* Explain the impact of $R\tsub in;$ and $R\tsub out;$ on the gain/frequency response of a system

## <a id="2"></a>2   Analysis$\bold -$ RC Filters

The work in this section involves only “paper work” and no bench setups. It requires you to use circuit analysis techniques learned in ECE 210 to compute the frequency response $\bold H(\omega)$ for circuit shown in Figs. <a name="red" href="#fig_1">1</a> and <a name="red" href="#fig_2">2</a>. This exercise will also help set up the framework for Section <a name="red" href="#3">3</a>.

<div name="page-break"></div>

### <a id="2.1"></a>2.1   First Order RC Filters

While we do not require you to memorize Fourier transform derivations for this lab, you should be able to do common time domain to/from frequency domain conversions. Consider the circuit shown below:

<img id="fig_1" src="./Lab 1.assets/image-20240829171351638.png" alt="image-20240829171351638" style="zoom:25%;padding-left:4%" />

<a name="block center black small">Figure 1: First Order RC Filter</a>

1. Based on your intuition, comment on the type of filter. (i.e. Low-pass, High-pass, ...)(Hint: Think about what the impedance of a capacitor is at $\omega = 0$ and $\omega = \infin$.)

   > **Low-pass**

2. Compute the complex frequency response $\bold H(\omega)$.

   >$$
   >\align[[ \bold H(\omega) &= {\V\tsub in; \over \V_\C} = {\Z_\C \over \Z_\C + \Z_\R} = {1/j\omega \C_1 \over \R_1 + 1/j\omega \C_1} = \inv {1 + j \omega \R_1\C_1} ]]
   >$$

3. Compute and sketch the magnitude response $|\bold H(\omega)|$. Compute the 3-dB cutoff frequency. Check the calculated result with your judgement in Question 1.

   >Therefore,
   >$$
   >|\bold H (\omega)| = {1 \over \sgrt 1 + (\omega \R_1\C_1)^2 />}
   >$$
   >Set $|\bold H(\omega)| = 1 / \sqrt2$.
   >$$
   >\align[[
   >1+(\omega \R_1\C_1)^2 &=2\\
   >\omega \R_1\C_1 &= 1 \\
   >\omega &= \note  {1 / \R_1 \C_1}!
   >]]
   >$$
   >It makes sense. As $\omega \to 0$, $|\bold H(\omega)| \to 1$. As $\omega \to \infin$, $|\bold H(\omega)| \to 0$. So, it's indeed low pass filter. Sketch the magnitude response:

   ><img id="fig_sol_1" src="./Lab 1.assets/image-20240830143448413.png" alt="image-20240830143448413" style="zoom:33%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 1: Magnitude of $\bold H(\omega)$ (V) / Frequency $\omega$ (Hz) given ($\R_1\C_1 = 1$)</a>
   
   <div name="page-break"></div>
### <a id="2.2"></a>2.2   RC filter with load resistor

In this section we expand the analysis done in section <a href="#2.1" name="red">2.1</a> by attaching a load resistor at the output node.

<img id="fig_2" src="./Lab 1.assets/image-20240830150006408.png" alt="image-20240830150006408" style="zoom:50%;padding-left:6%" />

<a name="block center black small">Figure 2: First Order RC Filter with load resistor</a>

For the circuit shown in Fig. <a href="#fig_2" name="red">2</a> above:

1. Find the complex frequency response $\bold H(\omega)$

   >$$
   >\align[[
   >\Z_C \parallel \Z_\L &= {\R\tsub L; / j\omega \C_1 \over \R\tsub L; + 1/j\omega \C_1} = { \R\tsub L; \over 1 + j\omega \R\tsub L; \C_1} \\
   >\\
   >\bold H(\omega) &= {\Z_\C \parallel \Z_\L  \over \Z_\R + (\Z_\C \parallel \Z_\L)} \\ &= {\R_\L / ( 1+ j\omega \R_\L \C_1) \over \R_1 + \R_\L / ( 1+ j\omega \R_\L \C_1)} \\ &= {\R_\L \over \R_\L + \R_1 + j\omega \R_1\R\tsub L;\C_1}
   >]]
   >$$

2. Compute and sketch the magnitude response. Compute the **3** $-$ **dB** cut-off frequency.

   >$$
   >\align [[
   >|\bold H(\omega)| &= {\R_\L \over \sgrt (\R_\L + \R_1)^2 + (\omega \R_1 \R_\L \C_1)^2 />} \\
   >|\bold H (0) | &= {\R_\L \over \R_\L + \R_1}
   >]]
   >$$
   >
   >Set $|\bold H(\omega) \bigm/ |\bold H(0)| = 1/\sqrt 2$, 

   >$$
   >\align[[
   >{\R_\L \over \sgrt (\R_\L + \R_1)^2 + (\omega \R_1 \R_\L )^2 />} &= {1\over \sqrt 2} {\R_\L \over \R_\L + \R_1} \\
   >{\R_\L + \R_1 \over \sgrt (\R_\L + \R_1)^2 + (\omega \R_1 \R_\L \C_1)^2 />} &= {1\over \sqrt 2} \\
   >{(\R_\L + \R_1)^2 + (\omega \R_1 \R_\L \C_1)^2 \over (\R_\L + \R_1)^2 }  &= 2 \\
   >{\omega \R_1 \R_\L \C_1 \over \R_\L+\R_1} &= 1 \\
   >]]
   >$$
   >
   >and we get
   >$$
   >\note \omega = {\R_\L + \R_1 \over \R_1 \R_\L \C_1} = {1 \over (\R_1 \parallel \R_\L) \, \C_1}!  \\
   >$$
   >
   >Sketch the magnitude response:
   >
   ><img id="fig_sol_2" src="./Lab 1.assets/image-20240830153223148.png" alt="image-  20240830153223148" style="zoom: 20%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 2: Magnitude of $\bold H(\omega)$ (V) / Frequency $\omega$ (Hz) given ($\R_1, \R_\L, \C_1 = 1$)</a>


3. If we want the **3** $-$ **dB** cut-off frequency of the circuit in Fig. <a name="red" href="#fig_2">2</a> be the same as that of Fig. <a href="#fig_1" name="red">1</a>, how will you change the value of the load resistor in Fig. <a href="#fig_2" name="red">2</a>

   >Set $\R_\L = \infin$

<div name="page-break"></div>

### <a id="2.3"></a>2.3   RC filter with Op-Amp

In this section we expand the analysis done in section <a href="#2.2" name="red">2.2</a> by inserting an Op-Amp between the filter and load resistor.

<img id="fig_3" src="./Lab 1.assets/image-20240830154713238.png" alt="image-20240830154713238" style="zoom: 67%;" />

<a name="block center black small">Figure 3: First Order RC Filter with Op-Amp</a>

For the circuit shown in Fig. <a href="#fig_3" name="red">3</a> above:

1. What is the input resistance looking into the (ideal) Op-Amp?

   >**Infinity**

2. Find the complex frequency response $\bold H(\omega)$ and compute the **3** $-$ **dB** cut-off frequency.

   >Assume ideal Op-Amp, then $\I_+ = \I_- = 0\text A$, which means that $\I_{\R_1} = \I_{\C_1}$ and $\I_{\R_1}(\Z_1 + \Z_\C) = \V\tsub in;$. We recover the same equation as in section <a name="red" href="#2.1">2.1</a>. So
   >$$
   >\align[[ \bold H(\omega) &= \inv {1 + j \omega \R_1\C_1} \\ |\bold H (\omega)| &= {1 \over \sgrt 1 + (\omega \R_1\C_1)^2 /> } \\[8pt]
   >]]
   >$$
   >So, the result is
   >$$
   >\note \omega = 1 / \R_1 \C_1!
   >$$

3. Compare the result of section <a name="red" href="#2.2">2.2</a> and <a name="red" href="#2.3">2.3</a>, what is the advantage of the filter with Op-Amp.

   >We see that section 2.3 has a same response function as section 2.1. (Equivalent to section 2.2 if we set $\R_\L \to \infin$, but that is practically impossible).

   >The advantage of the filter with Op-Amp is that we could get the ideal response function as in section 2.1, (as it separates the RC circuit from the load resistor) and the response $\bold H(\omega)$ is independent from the $\R_\L$ that we choose. Therefore we could freely choose the $\R_\L$ we want to achieve desired effect.

<div name="page-break"></div>

## <a id="3"></a>3   Simulation

In this section we will verify the analysis done in section <a name="red" href="#2">2</a> using a circuit simulation software called LTspice. Please refer to the tutorial on the course website to get started with LTspice.

### <a id="3.1"></a>3.1   Simulation$-$ First Order RC Filter with Op-Amp

<img id="fig_4" src="./Lab 1.assets/image-20240901202843938.png" alt="image-20240901202843938" style="zoom:33%;" />

<a name="block center black small">Figure 4: First Order RC Filter</a>

**Component Values:**$\text{V}\tsub in; = 1\sin(\omega t)\V, \text{R}_1 = 1\text{k}\ohm$

1. Consider the first order RC circuit shown in Fig. <a name="red" href="#fig_4">4</a>. Compute the value of $\bold C$ so that the **3** $-$ **dB** cut-off frequency is at **160Hz**.

   > $$
   > \C_1 = {1\over \R_1 \cdot (2\pi f)} = {1\over 1000\ohm \cdot 2\pi \cdot 160\Hz} \approx 0.995\mu\C \approx 1\mu\C
   > $$
   > 

2. Draw the circuit shown in Fig. <a name="red" href="#fig_4">4</a> in LTspice. Use the capacitor value that you calculate above.

   ><img id="fig_sol_3" src="./Lab 1.assets/image-20240902171748703.png" alt="image-20240902171748703" style="zoom:20%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 3: Section 2.1 circuit in LTspice</a>


3. Plot and **save** the magnitude and phase response of the RC filter in LTspice using the following parameters.

   * Type of Sweep: Decade
   * Number of points per decade: 100
   * Start Frequency: 1 Hz
   * Stop Frequency: 100 kHz

   <a name="red block">**NOTE:**If you are using the MATLAB smaple code from course website, please make sure the exported data is saved in **Cartesian**format under *“Select Traces to Export”*</a>

   ><img src="./Lab 1.assets/image-20240902171900702.png" alt="image-20240902171900702" style="zoom:33%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 4: $ \V\tsub out;$ Section 2.1 circuit in LTspice</a>

4. Export the data from LTspice to MATLAB using the instruction given in LTspice tutorial on the website. Then plot and **save** each of the graphs specified below (in MATLAB):

   * Magnitude (dB) vs log Frequency
   * Magnitude (dB) vs linear Frequency
   * Phase (deg) vs log Frequency
   * Magnitude (V/V) vs log Frequency

   ><img id="fig_sol_5" src="./Lab 1.assets/plot.svg" alt="plot" />
   ><a name="center black block pad-bottom small">Figure Solution 5: Magnitude (V/V or dB) and Phase (degree)/ Frequency $\omega$ (Hz or log Hz)</a>


5. Fill out Table <a href="#table_1" name="red">1</a>. Note: you can either do this in LTspice (by changing the axes from linear to logarithm) or do it in MATLAB.

| Frequency | $|\bold H(\omega)| $ [V/V] | $|\bold H(\omega)|$ [dB] | $\angle \bold H(\omega)$ [deg] |
| --------- | -------------------------- | ------------------------ | :----------------------------- |
| 40 Hz     | $0.9701$                   | $-0.2636$                | $-14.0437$                     |
| 60 Hz     | $0.9352$                   | $-0.5817$                | $-20.7366$                     |
| 80 Hz     | $0.8948$                   | $-0.9659$                | $-26.5234$                     |
| 100 Hz    | $0.8467$                   | $-1.4451$                | $-32.1419$                     |
| 120 Hz    | $0.7979$                   | $-1.9608$                | $-37.0676$                     |
| 140 Hz    | $0.7479$                   | $-2.5229$                | $-41.5898$                     |
| 160 Hz    | $0.7086$                   | $-2.9921$                | $-44.8799$                     |
| 180 Hz    | $0.6583$                   | $-3.6310$                | $-48.8264$                     |
| 200 Hz    | $0.6236$                   | $-4.1021$                | $-51.4219$                     |

<a name="center black block pad-bottom small" id="table_1">Table 1: Simulation Results -First Order RC filter</a>

6. After looking at your plots, why do we plot magnitude vs log frequency most of the time?

   >Plotting magnitude vs frequency directly results in a graph where magnitude quickly decreases to 0, making it harder to analysis the characteristic of the response function. Plotting magnitude vs log frequency results in a graph where it’s easier to see the relationship between magnitude and frequency. Therefore, we plot magnitude vs log frequency most of the time.

7. In the plot of magnitude (dB) vs log Freq, mark the gains at **1kHz** and **10kHz** with the ‘Data Cursors’ in MATLAB. **Save** this plot with both markers included. Finally, compute the slope of the line segment between the two frequencies (in units of **dB/decade**)

   >| Frequency | $|\bold H(\omega)|$ [V/V] | $|\bold H(\omega)|$ [dB] |
   >| --------- | ------------------------- | ------------------------ |
   >| 1 kHz     | $0.1572$                  | $-16.0722$               |
   >| 10 kHz    | $0.0159$                  | $-35.9647$               |
   >
   ><a name="center black block pad-bottom small">Table Solution 1: Magnitude at 1kHz and 10kHz </a>
   ><img id="fig_sol_6" style="padding-left:70px; margin: -1.8em 0; margin-bottom: -2em;" src="./Lab 1.assets/untitled-1725305572257-7.svg" alt="untitled" style="zoom:50%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 6: Magnitude (dB) / Frequency $\omega$ (log Hz) with marked 1kHz and 10kHz datapoint</a>
   >$$
   >\text{Slope [dB/decade]} = -35.9647 - (-16.0722)= \note -19.8925!
   >$$

<div name="page-break"></div>

### <a id="3.2"></a>3.2   RC filter with load resistor

<img id="fig_5" src="./Lab 1.assets/image-20240902011425482.png" alt="image-20240902011425482" style="zoom:33%;" />

<a name="block black center small">Figure 5: RC filter with load resistor</a>

**Component Values:** $\V\tsub in; = 1\sin(\omega) \V$, $\R_1 = 1\text{k}\ohm$, $\R\tsub L; = 330\ohm, 1\k\ohm, 5\k\ohm$, $\C_1 = 1\mu \text{F}$

1. Draw the circuit shown in Fig. <a name="red" href="#fig_6">6</a> in LTspice. (Note: It's always a good idea to draw different circuits in a new LTspice schematic in case the TA asks you to see your circuit. You can always copy and paste from an existing schematic so you don't have to draw from scratch.)

   ><img id="fig_sol_7" src="./Lab 1.assets/image-20240902171349216.png" alt="image-20240902171349216" style="zoom: 25%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 7: Section 2.2 circuit in LTspice</a>

2. Fill out Table <a name="red" href="#table_2">2</a>.

   | RL         | **3** $-$ **dB** cut-off frequency |
   | ---------- | ---------------------------------- |
   | $330\ohm$  | $645.6542\Hz$                      |
   | $1000\ohm$ | $316.2278\Hz$                      |
   | $5000\ohm$ | $190.5461 \Hz$                     |

   <a name="block black center small" id="table_2">Table 2: Simulation Results - RC filter with load resistor</a>

3. Based on the simulation result (or your intuition), how will the **3** $-$ **dB** cut-off frequency change if the load resistance is very large. (Give an approximate frequency).
   >As $\R_\L \to \infin$, $\omega\tsub 3dB; \to 1/\R_1 \C_1 \approx 160\Hz$

4. In the plot of magnitude (dB) vs log Freq, mark the gains at **1kHz** and **10kHz**. **Save** this plot with both markers included. Finally, compute the slope of the line segment between the two frequencies (in units of **dB/decade**)(You only need to do this with one load resistance.)
   > Choose $\R_\L = 5000\ohm$,
   >| Frequency | $|\bold H(\omega)|$ [V/V] | $|\bold H(\omega)|$ [dB] |
   >| --------- | ------------------------- | ------------------------ |
   >| 1 kHz     | $0.1563$                  | $-16.1192$               |
   >| 10 kHz    | $0.0159$                  | $-35.9652$               |
   >
   ><a name="center black block pad-bottom small">Table Solution 2: Magnitude at 1kHz and 10kHz </a>
   ><img id="fig_sol_8" style="padding-left:70px; margin: -1.5em auto -2em; zoom:50%;" src="./Lab 1.assets/Lab1.2.svg" alt="Lab1.2" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 8: Magnitude (dB) / Frequency $\omega$ (log Hz) with marked 1kHz and 10kHz datapoint</a>
   >$$
   >\text{Slope [dB/decade]} = -35.9652 - (-16.1192)= \note -19.8460!
   >$$
<div name="page-break"></div>

### <a id="3.3"></a>3.3   RC filter with Op-Amp

<img id="fig_6" style="margin: 3em auto !important; zoom: 25%;" src="./Lab 1.assets/image-20240902122057170.png" alt="image-20240902122057170" />

<a name="block black center small">Figure 6: RC filter with Op-Amp</a>

**Component Values:** $\V\tsub in; = 1\sin(\omega) \V$, $\R_1 = 1\text{k}\ohm$, $\R\tsub L; = 330\ohm, 1\k\ohm, 5\k\ohm$, $\C_1 = 1\mu \text{F}$

1. Draw the circuit shown in Fig. <a name="red" href="#fig_6">6</a> in LTspice. (Note: Use the opamp2 LTspice symbol and include the .MOD file of the Op-Amp. Change the value of component to “LM741/NS”)

   ><img id="fig_sol_9" src="./Lab 1.assets/image-20240902174631143.png" alt="image-20240902174631143" style="zoom: 50%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 9: Section 2.3 circuit in LTspice</a>

2. Fill out Table <a name="red" href="#table_3">3</a>.

   | RL         | **3** $-$ **dB** cut-off frequency |
   | ---------- | ---------------------------------- |
   | $330\ohm$  | $158.4893\Hz$                      |
   | $1000\ohm$ | $158.4893\Hz$                      |
   | $5000\ohm$ | $158.4893\Hz$                      |

   <a name="block black center small" id="table_3">Table 3: Simulation Results - RC filter with load resistor</a>

3. Check the voltage at the two input nodes of the Op-Amp. Why can we assume that the voltage at two input pins of the Op-Amp are equal to each other?
   ><img id="fig_sol_10" src="./Lab 1.assets/image-20240902165408146.png" alt="image-20240902165408146" style="zoom: 25%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 10: Voltage Response at $\V_+$ (`V(n003)`) and $\V_-$ (`V(n001)`)</a>
   >
   >From the empirical data, we see that under three different load resistor, the positive input node  `V(n003)` and negative input node `V(n001)` are almost same across different frequency (except at high frequency when they diverge in phase). Soi we could safely assume that they are equal.
   >
   >Also, from Ideal Op-Amp assumption, we could assume they have same voltage, since the internal resistance connects them are assumed to be infinity.


4. What is the functionality of the Op-Amp in the circuit?

   >Op-Amp separates the load resistor from the RC circuit (no current will flow from $\R_1$ to $\R_\L$), so that the voltage of positive input side (i.e. the $\V\tsub out;$) only depends on $\R_1$ and $\C_1$, which makes equivalent to the circuit in section 2.1. Therefore, the $\V\tsub out;$ only depends on RC circuit and we could pick whatever $\R_\L$ we wish without worrying changing the behavior of response function.
<div name="page-break"></div>
## <a id="4"></a>4   Measurement Data

In this section you will build the circuits from the previous sections on a breadboard and take measurements in `SCOPY` using your own `ADALM1000` module. Once again, refer to the tutorials given on the website to become more familiar with setting up and using `SCOPY`.
### <a id="4.1"></a>4.1   Measurements $-$ First Order RC Filter

1. Build the first-order RC circuit shown in Fig. <a name="red" href="#fig_7">7</a> on the breadboard. Use the same values of resistors and capacitors computed in section <a href="#3.1" name="red">3.1</a>.

   <img id="fig_7" src="./Lab 1.assets/image-20240903141214428.png" alt="image-20240903141214428" style="zoom:50%;" />

   <a name="center black block pad-bottom small">Figure 7: First Order RC Filter</a>

2. Connect your circuit to the `ADALM2000` board with `Analog Output1 (W1)` as the input, `Analog Input1`, `Positive(1+)` to the input, `Analog Input 2`, `Positive(2+)` as the output, and `GND` to ground. 

3. Open up `SCOPY` and change the device measurement settings in the `Signal Generator` on the left.

   * Enable `CH1`. The orange circle on the bottom left should be filled. Set `Amplitude=1`, `Offset=0.5`, `Freq=40`, and `shape` to `sine`.
   * Click the green `RUN` button on the top right.

4. Change the settings in the oscilloscope to display the results properly.

   * Click on the Oscilloscope on the left menu.
   * Select `CH-1`, the orange circuit on the bottom left should be filled.
   * Run both the oscilloscope and signal generator.
   * Click on Autoset to automatically scale the waveform.
   * Manual adjustment is recommended (Time base $=$ $10  \text{ ms}$, Volts/Div = 20 mV, Position = 0)
   * Select `CH-2`, the purple circle on the bottom left should be filled.
   * Apply the same `CH-1` setting to `CH-2`

5. Run the time domain measurement by selecting `RUN`. Make sure to **save** a screenshot (only one screenshot is needed in total. No need to save it for each of the frequencies).

   ><img id="fig_sol_11" src="./Lab 1.assets/image-20240907153601716.png" alt="image-20240907153601716" style="zoom:50%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 11: Input Waveform (orange) and Output Waveform (purple). `Time/Div: 3ms.; Voltage/Div: 100mV; Center Voltage: 500mV; Input Freq: 40Hz`</a>


6. Fill out (mag [V/V] and phase [deg]) of the following table by changing the frequencies in the AWG window and reading the measurements from the oscilloscope.

   | Frequency | $|\bold H(\omega)| $[V/V] | $|\bold H(\omega)|$ [dB] | $\angle \bold H(\omega)$ [deg] |
   | --------- | ------------------------- | ------------------------ | ------------------------------ |
   | 40 Hz     | $0.9731$                  | $-0.2369$                | $-16.3008$                     |
   | 60 Hz     | $0.9253$                  | $-0.6743$                | $-22.8312$                     |
   | 80 Hz     | $0.8790$                  | $-1.1202$                | $-29.6928$                     |
   | 100 Hz    | $0.8250$                  | $-1.6709$                | $-33.5094$                     |
   | 120 Hz    | $0.7756$                  | $-2.2072$                | $-39.1245$                     |
   | 140 Hz    | $0.7296$                  | $-2.7383$                | $-43.1094$                     |
   | 160 Hz    | $0.6797$                  | $-3.3537$                | $-47.8189$                     |
   | 180 Hz    | $0.6399$                  | $-3.8778$                | $-48.9057$                     |
   | 200 Hz    | $0.5993$                  | $-4.4471$                | $-50.7170$                     |

   **NOTE:** The phase given by `CH1-2` Phase may not match the phase given in the simulations. For these phases, you should use cursors to measure the time delay $t_d$ between the output and input signal to calculate $\angle \bold H(\omega)$ as shown below:
   $$
   {\angle \bold H(\omega) \over 360} = {t_d \over T_p}
   $$

7. Plot and **save** the frequency response by following the steps below:

   * Click on `Network Analyzer` on the left menu.
   * Click on setting icon on the top right, choose `Bode` in Type.
   * Click on adjustment icon on the top right.
   * Under `CH-1 Reference`, set `Amplitude = 1`, `Offset = 0`
   * Under `SWEEP` set `Start Freq = 10Hz`, `Stop Freq = 1kHz`, `Samples/dec > 20`
   * Click on Run
   * Read the 3-dB cutoff frequency from Orange waveform (when `Magnitude(f) = Magnitude(start) - 3dB`).
   * Purple waveform at the bottom plots `Phase` vs `Freq`.

   ><img id="fig_sol_12" src="./Lab 1.assets/4.1-cursor.bmp" alt="4.1-cursor" style="zoom:33%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 12: Output Frequency Response for Section 4.1 Circuit.</a>


8. Comment on the results obtained from measurements and simulations for the 1st-order RC filter.

   >The measurement data are largely in agree with the simulation results, with measurement data slightly deviates from the simulation result. This could be caused by the inaccuracy of resistance and capacitance due to manufacturing error, and the unavoidable error from Scopy’s measurement.
<div name="page-break"></div>
### <a id="4.2"></a>4.2   RC filter with load resistor

Build the second order RC circuit in Fig. <a name="red" href="#fig_8">8</a> on the breadboard.

<img id="fig_8" src="./Lab 1.assets/image-20240903150324186.png" alt="image-20240903150324186" style="zoom: 67%;" />

<a name="center black block pad-bottom small">Figure 8: RC filter with load resistor</a>

**Component Values:** $\V\tsub in; = 1\sin(\omega t) \V$, $\R_1 = 1\k \ohm$, $\R_\L =330\ohm, 1\k\ohm, 5\k\ohm$, $\C_1 = 1\mu \text F$

1. Follow the same procedure given in section <a name="red" href="#4.1">4.1</a> and fill out the following table.

   | RL         | **3** - **dB** cut-off frequency |
   | ---------- | -------------------------------- |
   | $330 \ohm$ | $631.2\Hz$                       |
   | $1000\ohm$ | $296.31\Hz$                      |
   | $5000\ohm$ | $178.08\Hz$                      |

   <a name="center black block pad-bottom small">Table 5: Measurement Results $-$ RC filter with load resistor</a>

2. Make sure to **save** the screenshots of the results in both the time-domain and frequency domain as before.

   ><img id="fig_sol_13" src="./Lab 1.assets/image-20240907155346166.png" alt="image-20240907155346166" style="zoom:50%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 13: Input Waveform (orange) and Output Waveform (purple). `Time/Div: 500us; Voltage/Div: 100mV; Center Voltage: 500mV; RL: 5kOhm; Input Freq:  200Hz`</a>

   ><img id="fig_sol_14" src="./Lab 1.assets/4.2-330-cursor.bmp" alt="4.2-330-cursor" style="zoom: 33%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 14: Output Frequency Response for Section 4.2 Circuit. `RL = 5kOhm`</a>


3. How does the load resistor change the **3** $-$ **dB** cut-off frequency? How does it change your gain at DC?

   >As $\R_\L \uparrow$, $\omega\tsub 3dB; \to 160\Hz$ (the theoretical cutoff frequency without load resistor), and the $\bold H(0) \downarrow$. 
<div name="page-break"></div>
### <a id="4.3"></a>4.3   RC filter with Op-Amp

Build the second order RC filter in Fig. <a name="red" href="#fig_9">9</a> on the breadboard. **Keep** **this** **circuit** **for** **your** **demo** **in** **lab**.

<img src="./Lab 1.assets/image-20240903151502247.png" alt="image-20240903151502247" style="zoom: 50%;" />

**Component Values:** $\V\tsub in; = 1\sin(\omega t) \V$, $\R_1 = 1\k \ohm$, $\R_\L =330\ohm, 1\k\ohm, 5\k\ohm$, $\C_1 = 1\mu \text F$

1. Using your `ADALM2000`, what can you connect the supplies of the Op-Amp to? (Hint: `Vcc+` is the upper rail and `Vcc-`)

   >There are `V+` and `V-` pin in `ADALM2000`, we could connect these to `Vcc+` and `Vcc-` pin of Op-Amp, respectively.

2. Follow the same procedure given in section <a name="red" href="#4.1">4.1</a> and fill out the following table.

   | RL         | **3** - **dB** cut-off frequency |
   | ---------- | -------------------------------- |
   | $330 \ohm$ | $148.79\Hz$                      |
   | $1000\ohm$ | $146.55\Hz$                      |
   | $5000\ohm$ | $148.79\Hz$                      |

   <a name="center black block pad-bottom small">Table 6: Measurement Results $-$ RC filter with Op-Amp</a>

   **Warning:** You may not get the correct output for $330\ohm$. Why might this be the case?

   >Although in my case the result for $330\ohm$ seems to be correct, there will be incorrect results for lower resistance. Lower resistance makes $\I\tsub out;$ bigger, given that $\V_-$ will not be change by $\R_\L$, the Op-Amp might not be able to sustain such high current, due to physical limits and insufficient supplied voltage. So, this might make actual `V-` much lower than expected, resulting in an incorrect output.

3. Make sure to **save** the screenshots of the results in both time-domain and frequency-domain as before.

   ><img id="fig_sol_15" src="./Lab 1.assets/image-20240907155829147.png" alt="image-20240907155829147" style="zoom:50%;" />
   >
   ><a name="center black block pad-bottom small"> Figure Solution 15: Input Waveform (orange) and Output Waveform (purple). `Time/Div: 10ms; Voltage/Div: 100mV; Center Voltage: 500mV; RL: 5kOhm; Input Freq: 40Hz` </a>
   >
   ><img fig="fig_sol_16" src="./Lab 1.assets/Lab4.3-5k.bmp" alt="Lab4.3-5k" style="zoom: 33%;" />
   >
   ><a name="center black block pad-bottom small">Figure Solution 16: Output Frequency Response for Section 4.3 Circuit. `RL = 5kOhm`</a>

4. Comment on the results obtained from measurements and simulations for the RC filter.

   >They are largely similar. We see that cutoff frequency both stays almost same for different $\R_\L$. Although the experiment results seems to have a lower cutoff frequency then the simulation results.
