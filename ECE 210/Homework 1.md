$$
\def\V{\text{V}}
\def\A{\text{A}}
\def\mA{\text{mA}}
\phantom {derivatives}
\newcommand\d{\text{d}}
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
\def\eq#1!#2!{\begin{equation} #1 \label{eq:#2} \end{equation}}
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
\def\eo{\varepsilon_{0}}
\def\W{\text{W}}
$$

#### Problem 1

> Sign acknowledging you will abide by this course’s and the University’s Academic Integrity policies or face sanctions for not doing so. These policies include, among others, plagiarism: representing the words or ideas of others as your own; cheating: using unauthorized materials and/or information. The possible sanctions include, among others, reduced letter grades and an F in the course. If your solution upload does not include your signature, your homework will NOT be graded, resulting in a zero.

Sign: Yuqing Zhai

#### Problem 2

>Consider the circuit below, where $R_1 = 5\ohm$, $R_3 = 3\ohm$, $V_{R_2} = \fac 2/3; \V$ and $V_{R_3} = 1\V$. Let the top-right node be the reference node. Determine the resistance $R_2$ and the voltage $V_x$ in the following circuit, as well all the remaining node voltages. 
>
><img src="./Homework 1.assets/image-20230829221622963.png" alt="image-20230829221622963" style="zoom:50%;" />

Since all components are in series, it's obvious that $I_1 = I_2 = I_3$. Using Ohm's Law on $R_3$, we see that
$$
I_3 R_3 = V_{R_3} \\
I_3 = \fac V_{R_3}/R_3; = \fac 1\V/3\ohm; = \fac 1/3;\A
$$
and we see $I_1 = I_2 = I_3 = \fac 1/3; \A$. Applying Ohm's Law on $R_2$,
$$
I_2R_2 = V_{R_2} \\
\note R_2 = \fac V_{R_2}/I_2; = \fac {\fac 2/3;}V/{\fac 1/3;}A; = 2\ohm !
$$
and then apply KVL for the loop
$$
I_1 R_1 + V_{R_2} + V_{R_3} + V_X = 0 \\
\fac 1/3;A \cdot 5\ohm + \fac 2/3;\V + 1\V + V_X = 0 \\
\note V_X = -\fac 10/3;\V !
$$

Since we are taking $V_4$ as reference point, that means $V_4 = 0\V$, and therefore (node method)
$$
I_2 R_2 = V_{R_2} = V_4 - V_1 \\
\note V_1 = V_4 - V_{R_2} = -\fac 2/3;\V !
$$
Similarly
$$
I_1R_1 = V_1 - V_2 \\
\note V_2 = V_1 -I_1 R_1 = -\fac 2/3;\V - \fac 5/3;\V = -\fac 7/3;\V!
$$
and
$$
I_3R_3 = V_{R_3} =  V_3 - V_2 \\
\note V_3 = V_2 - V_{R_3} = -\fac 7/3;\V - 1\V = -\fac 10/3;\V !
$$


#### Problem 3

>Consider the circuit below, where $V_s = 8\V$, $I_s = 2\A$ and $R = 4\ohm$. Determine the current $I$ and calculate the absorbed power at each circuit element. Clearly indicate if the power is absorbed or injected. 
>
><img src="./Homework 1.assets/image-20230826173018873.png" alt="image-20230826173018873" style="zoom:50%;" />

Using Ohm's Law on $R$, we could get
$$
I_R \cdot R = V_s \\
I_R = \fac V_s/R; = \fac 8\V/4\ohm; = 2\A
$$
Applying KCL at $a$, we see that
$$
I_R + I_s + I = 0 \\
\note I = -I_R - I_s = - 2\A - 2\A = -4\A !
$$
Power used by $R$
$$
\note P_R = I_R^2 R = (2A)^2 \cdot 4\ohm = 16 \W !\\
$$
Since $V_s$ and $I_s$ are parallel, we see that $V_{I_s} = V_s = 8\V$. So
$$
\note P_{I_s} = V_{I_s} I_s = 8\V \cdot 2\A = 16\W !
$$
Similarly, 
$$
\note P_{V_s} = V_s I = 8\V \cdot (-4\A) = -32\W !
$$
$\note R \text{ and } I_s \  \text {absorbs}!$ power (indicated by $P_R > 0\W$ and $P_{I_s} > 0\W$), but $\note V_s \  \text{injects} !$ power (indicated by $P_{V_s} < 0\W$)

#### Problem 4

>Consider the circuit below, where $I_s = 5\A$, $R = 2\ohm$ and $K = 2\A/\V$. Determine the voltage $V_x$ and calculate the absorbed power at each circuit element. Clearly indicate if the power is absorbed or injected.
>
><img src="./Homework 1.assets/image-20230829221853856.png" alt="image-20230829221853856" style="zoom:50%;" />

Applying KCL on node a, we see that
$$
I_R = I_S + I_K
$$
and applying Ohm's Law on $R$, we see that
$$
I_R \cdot R = -V_x \\
(I_s + I_K) \cdot R = -V_x \\
(I_s + KV_x) \cdot R = -V_x \\
\note V_x = -\fac R\cdot I_s/RK + 1;  = -\fac 2\ohm \cdot 5\A/2\ohm \cdot 2\A/V + 1; = -2\V !
$$
Therefore
$$
I_R = -\fac V_x/R; = -\fac -2\V/\ \ \ 2\ohm; = 1\A
$$
and
$$
\note P_R = (-V_x) I_R = -(-2\V) \cdot 1\A = 2\W ! \\
$$
We see that $I_s$, $R$ and $V_K$ are in parallel, so $V_{I_s} = V_K = -V_x = 2\V$, and therefore
$$
\note P_{I_s} = (-V_{I_s})I_s  = 5\A \cdot (-2\V) = -10\W !
$$
We know that
$$
I_R = I_s + I_K \\
I_K = I_R - I_s = 1\A - 5\A = -4\A
$$
and therefore
$$
\note P_{I_K} = (-V_K) \cdot I_K = -2\V \cdot (-4\A) = 8\W !
$$
$\note R \text{ and } I_K \  \text {absorbs}!$ power (indicated by $P_R > 0\W$ and $P_{I_K} > 0\W$), but $\note I_s \  \text{injects} !$ power (indicated by $P_{I_s} < 0\W$)

#### Problem 5

>Consider the circuit below, where $V_s = 3\V$, $R_1 = 1\ohm$, $R_2 = 2\ohm$, and $K = 2$. Determine the current $I$ and the voltage $V_x$.
>
><img src="./Homework 1.assets/image-20230826212937512.png" alt="image-20230826212937512" style="zoom:50%;" />

Since all components are in series, they have same current $I$ passing through them indicated in the graph. Using KVL indicated in the graph, we have
$$
\eq I R_1 + KV_x + V_x - V_s = 0 !kvl!  \\
$$
also, we could apply the Ohm's Law on $R_2$, and we get
$$
I \cdot R_2 = V_x
$$

substitute this to $\eqref{eq:kvl}$, we get
$$
V_s = (K + 1)IR_2 + IR_1 \\
I((K + 1)R_2 + R_1) = V_s \\
\note I = \fac V_s/(K + 1)R_2 + R_1; = \fac 3\V /(2+1)\cdot 2\ohm + 1\ohm; = \fac 3\V/7\ohm; = \fac 3/7;\A !
$$
and therefore
$$
\note V_x = I\cdot R_2 = \fac 3/7;\A \cdot 2\ohm =\fac 6/7;\V!
$$

#### Problem 6

>Consider the circuit below, where $R_1 = 6\ohm$, $R_2 = 6\ohm$, $R_3 = 2\ohm$, $V_2 = 18 \V$, and $I_s = 5\A$. Determine the current $I_1$ and the voltage $V_1$.
>
><img src="./Homework 1.assets/image-20230827121958669.png" alt="image-20230827121958669" style="zoom:50%;" />

Applying Ohm's Law on $R_2$, we see that
$$
I_2 = \fac V_2/R_2; = \fac 18\V/6\ohm; = 3\A
$$
Applying KCL on node a, we see that
$$
I_s = I_1 + I_2 \\
\note I_1 = I_s - I_2 = 5\A - 3\A = 2\A!
$$
Applying KVL indicated in the graph, we see that
$$
-I_1R_1 + V_2 - V_1 = 0 \\
\note V_1 = V_2 - I_1R_1 = 18\V - 2\A \cdot 6\ohm = 6\V!
$$

#### Problem 7

>Some of the following circuits violate $\txt KVL/KCL;$ and / or basic definitions of two-terminal elements given in Section 1.3. For each one of the circuits, determine if it is correct or ill-specified. If it is ill-specified, explain the problem and indicate what will happen if the incorrect circuit has been built up in your life?
>
><img src="./Homework 1.assets/image-20230827133452459.png" alt="image-20230827133452459" style="zoom: 25%;" /><img src="./Homework 1.assets/image-20230829222018630.png" alt="image-20230829222018630" style="zoom:25%;" /><img src="./Homework 1.assets/image-20230829223243186.png" alt="image-20230829223243186" style="zoom:25%;" />
>
>

$a)$ and $b)$ is ill-formed because:

If we apply KVL indicated in the graph $(a)$, we will find out
$$
V_2 - V_1 = 3\V - 2\V = 1\V \neq 0\V
$$
which violates KVL, so the circuit is ill-formed in this case.

If we apply KCL on node $a$ in the graph $(b)$, we will find out that
$$
I_1 + I_2 = 3\A \neq I\tsub flow in; = 0\A
$$
which violates KCL, so the circuit is ill-formed in this case. 

The independent voltage sources and independent current sources seen in graph are ideal sources. In reality, the non-ideal sources could be roughly modeled by

<img src="./Homework 1.assets/image-20230827144909702.png" alt="image-20230827144909702" style="zoom:33%;" />

>TL;DR. They voltage source will likely get burnt in real life.

Each non-ideal voltage source could be represent roughly by an ideal voltage source and a internal resistance (the $R_1$ and $R_2$, it's usually small) in series. Applying KCL on node $a$, we see that
$$
I_1 + I_2 = I_R
$$
and applying KVL on Loop $A$ and $B$, we see
$$
I_R \cdot 1\ohm + I_1R_1 = V_1 \\
I_R \cdot 1\ohm + I_2R_2 = V_2 \\
$$
and we could solve the them
$$
(I_1 + I_2) \cdot 1\ohm + I_1 \cdot \alpha \ohm = 2\V \\
(I_1 + I_2) \cdot 1\ohm + I_2 \cdot \beta \ohm = 3\V \\
$$
and
$$
I_1 (1 + \alpha) \ohm + I_2 (1) \ohm = 2\V \\
I_1 (1) \ohm + I_2 (1 + \beta) \ohm = 3\V 
$$
we find that
$$
I_1 = \fac 2(1 + \beta) - 3/(1 + \alpha) (1 + \beta) - 1; \A \\
I_2 = \fac 3(1 + \alpha) - 2/(1 + \alpha) (1 + \beta) - 1; \A
$$
Since $\alpha$ and $\beta$ are usually are far less than $1$ (the $R_1$ and $R_2$ are usually few mili-ohms), we could check what is the power dissipation on the internal resistor of the power source as it becomes more ideal
$$
\lim_{\alpha \to 0} P_{I_1} 
= \lim_{\alpha \to 0} I_1^2 R_1 
= \lim_{\alpha \to 0} \(\fac 2(1 + \beta) - 3/(1 + \alpha) (1 + \beta) - 1;);^2 \alpha \W 
= \infin \W
$$

$$
\lim_{\beta \to 0} P_{I_2} 
= \lim_{\beta \to 0} I_2^2 R_2 
= \lim_{\beta \to 0} \(\fac 3(1 + \alpha) - 2/(1 + \alpha) (1 + \beta) - 1; );^2 \beta \W 
= \infin \W
$$

The power (heat) dissipation on the internal resistor in each voltage source will grow to infinity as the itself becomes more ideal. Usually, the voltage source will have a relatively small internal resistance (few milliohms). That means it's likely to have high heat dissipation which could be dangerous and damage the power source.

<img src="./Homework 1.assets/image-20230827153640382.png" alt="image-20230827153640382" style="zoom:33%;" />

>TL;DR. It is also likely going to get burnt.

Now we see the what happened in $b)$, each non-ideal current source could be considered as an ideal current source and an internal resistance (the $R_1$ and $R_2$, it's usually large) in parallel. (Take this approximation with grain of salt, it might not *exactly* reflect the real situation) First applying KCL on both node $a$ and $b$, we see that
$$
I_{R_2} = I_C - I_2 \\
I_{R_1} = -(I_C + I_1)
$$
and since $R_x$ and $R_y$ are in parallel, $V_{R_x} = V_{R_y}$ and $I_{R_y} + I_{R_x} = I_C$ and
$$
I_{R_x}R_x = I_{R_y} R_y \\
$$
and
$$
I_{R_x} + \fac R_x/R_y; I_{R_x} = I_C \\
I_C = (1+ \fac R_x/R_y;) I_{R_x} = (1+ \fac 2\ohm/1\ohm;) I_{R_x} = 3 I_{R_x}
$$
Applying KVL on the loop indicated in the graph
$$
I_{R_2}R_2 + R_x I_{R_x} - I_{R_1} R_1 = 0\V\\
(I_C - I_2)R_2 + R_x I_{R_x} + (I_C + I_1) R_1 = 0\V \\
(3I_{R_x} - 2\A)\cdot N\ohm + I_{R_x} \cdot 2\ohm + (3I_{R_x} + 1\A)M\ohm =0\V
$$

Solving the equation

$$
I_{R_x} = \fac 2N - M/3N + 3M +2; \A \\
$$
and therefore
$$
I_C = 3I_{R_x} = \fac 6N - 3M/3N + 3M + 2; \A
$$
and 
$$
I_{R_2} = I_C - I_2 = \fac 6N - 3M/3N + 3M + 2;- 2 = -\fac 9M + 4/3N + 3M +2; \\
I_{R_1} = -(I_C - I_1) = -\(\fac 6N - 3M/3N + 3M + 2; + 1); = -\fac 9N + 2/3N + 3M + 2;
$$
this is hard to analysis. Typically, in real life, the internal resistance is rather big (like few kilo or mega ohms), and if we assume $N = \alpha M$. We could see (given $M$ is large enough)
$$
I_{R_2} = -\fac 9M + 4/3\alpha M + 3M +2; \approx \fac 9/3\alpha + 3; = \fac 3/\alpha + 1; \A \\
I_{R_1} = -\fac 9\alpha M + 2/3\alpha M + 3M + 2; \approx \fac 9\alpha / 3\alpha +3; = \fac 3\alpha /\alpha + 1;\A
$$
and we have
$$
P_{R_2} = (I_{R_2})^2 \cdot R_2 = \(\fac 3/\alpha +1;);^2 \cdot \alpha M \W
$$

$$
P_{R_1} = (I_{R_1})^2 \cdot R_1 = \(\fac 3\alpha/\alpha + 1;);^2\cdot M\W
$$

Then, if we *assume* $\alpha$ is small relative to $M$ (that is $a \ll M$), and $M$ is large enough. That means the resulting $P_{R_2}$ and $P_{R_1}$ will likely be big. (Take $\alpha = 1$ and $M = 1000$ as example, this will produce a few $\txt k; \W$ power, which is not small). This high power (the heat dissipation in this case) will burn the circuit.

#### Problem 8

Let $A = \sqrt 3 - j \cdot 2\sqrt 3$ and Let $B = -3 - j \cdot \sqrt 3$.

##### (a)

<img src="./Homework 1.assets/image-20230828144118771.png" alt="image-20230828144118771" style="zoom:50%;" />

we see the magnitude is $r = \sqrt { (\sqrt 3) ^2 + (2\sqrt 3)^2} = 4$ and the angle/phase is $\arctan(-\fac 2\sqrt 3/\sqrt 3;) = \arctan(-2)$ (it's in fourth quadrant). Therefore
$$
A = 4e^{i \arctan(-2)}
$$

##### (b)

<img src="./Homework 1.assets/image-20230828143849398.png" alt="image-20230828143849398" style="zoom:50%;" />

we see that the magnitude is $r = \sqrt {(-3)^2 + (-\sqrt 3)^2} = 2\sqrt 3$ and the angle/phase is $\arctan(\fac -\sqrt 3/- 3;) + \pi = \fac 7/6; \pi $ 
$$
B = 2\sqrt 3 e^{i \fac 7/6; \pi}
$$


##### (c)

$$
A + B = (\sqrt 3 - 3) - j\cdot (3\sqrt 3) \\
A - B = (\sqrt 3 + 3) - j\cdot \sqrt 3 
$$

$$
|A+B| = \sqrt { (\sqrt 3 - 3)^2 + (-3\sqrt 3)^2} = \sqrt {9 + 3 - 6\sqrt 3 + 27} = \sqrt {39 - 6\sqrt 3}
$$

$$
|A - B| = \sqrt { (\sqrt 3 + 3)^2 + (-\sqrt 3)^2} = \sqrt {9 + 3 + 6\sqrt 3 + 3} = \sqrt {15 + 6\sqrt 3}
$$

##### (d)

$$
\align [[
AB &= -(\sqrt 3 - j\cdot 2 \sqrt 3)(3 + j \cdot \sqrt 3) \\
&= -(3\sqrt 3 + j\cdot 3 - j \cdot 6\sqrt 3 + 6) \\
&= -(3\sqrt 3 + 6) + j\cdot (6\sqrt 3 - 3)
]]
$$

$$
\align [[
A/B &= \fac AB^*/BB^*; = \fac AB^*/|B|^2; \\
&= \fac (\sqrt 3 - j\cdot 2\sqrt 3)(-3 + j\sqrt 3)/12; \\
&= \iv 12; (-3\sqrt 3  + j \cdot 3 + j \cdot 6 \sqrt 3 + 6) \\
&= \iv 4; (2-\sqrt 3) + \iv 4; j\cdot (2 \sqrt 3 + 1)
]]
$$



