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
\def\k{\text{k}}
$$

#### Problem 1

> Sign acknowledging you will abide by this course’s and the University’s Academic Integrity policies or face sanctions for not doing so. These policies include, among others, plagiarism: representing the words or ideas of others as your own; cheating: using unauthorized materials and/or information. The possible sanctions include, among others, reduced letter grades and an F in the course. If your solution upload does not include your signature, your homework will NOT be graded, resulting in a zero.

Sign: Yuqing Zhai

#### Problem 2

><img src="./Homework 3.assets/image-20230912210938090.png" alt="image-20230912210938090" style="zoom: 33%;" />

First leave the nodes $a$, $b$ open, we get

Use test-signal method, we get

<img src="./Homework 3.assets/image-20230912211843337.png" alt="image-20230912211843337" style="zoom:33%;" />

On node c, we find that (using KCL)
$$
3i_x = i_x + 1\A \\
i_x = 0.5\A
$$
and therefore (doing loop on there we find)
$$
V_a - V_b = 1\A \cdot 3\ohm - i_x \cdot 1\ohm 
$$
and therefore
$$
R_T = \fac V_a - V_b/1\A; = \fac 5/2;\ohm
$$
Short-circuit the nodes a, b, we get

<img src="./Homework 3.assets/image-20230912212932378.png" alt="image-20230912212932378" style="zoom: 33%;" />

applying the KCL on node c, we know that the current flowing $3\ohm$ is
$$
I_{3\ohm} = 3i_x - i_x = 2i_x
$$
and therefore apply the KVL loop indicated
$$
4\V = i_x \cdot 1\ohm - 2i_x \cdot 3\ohm = -5\ohm \cdot i_x \\
i_x = -\fac 4/5;\A
$$
and therefore the $I_N$ is
$$
I_N = -2i_x = \fac 8/5;\A
$$
and we know that
$$
V_T = I_N R_T = \fac 8/5;\A \cdot \fac 5/2;\ohm = 4\V
$$
the maximum absorbed power is therefore
$$
P_a = \fac V_T^2/4R_T; = \fac 16/4\cdot {\fac 5/2;};\W = \fac 8/5;\W
$$

#### Problem 3



<img src="./Homework 3.assets/image-20230912222752929.png" alt="image-20230912222752929" style="zoom:33%;" />

Open the circuit we see that (applying KCL and Ohm's Law):
$$
4 - 3v_x = I_1 \\
v_x = I_1 \cdot 1
$$
and therefore we see that
$$
I_1 = 1\A \\
v_x = 1\A
$$
and applying the KVL
$$
\note V_T = V_a - V_b = 1\ohm \cdot I_1 + 1\ohm \cdot (-3v_x) = -2\V !
$$
<img src="./Homework 3.assets/image-20230913002258784.png" alt="image-20230913002258784" style="zoom:33%;" />

Close the circuit we see that (Applying KCL and Ohm's Law):
$$
I_2 = I_t - 3v_x \\
I_1 = I_2 + 4 \\
I_1 = v_x \cdot 1
$$
also apply KVL as indicated
$$
I_2 \cdot 1 = - I_1 \cdot 1
$$
therefore we see that
$$
I_1 = 2\A \\
I_2 = -2\A \\
v_x = 2\V \\
I_t = 4\A
$$
Therefore $I_N = -I_t = -4\A$. Therefore $R_T = V_T/I_N = 2\V/4\A = 1/2\ohm$, and
$$
P_a = \fac V_T^2/4R_T; = \fac 4/4\cdot {\fac 1/2;};\W = 2\W
$$


#### Problem 4

><img src="./Homework 3.assets/image-20230912231030435.png" alt="image-20230912231030435" style="zoom:33%;" />

##### (a-c)

This circuit appeared on the Lecture 03 Slides 01 Page 07. From there we know that
$$
V_L = V_s(\fac R_L/R_L + R_s;) \\
P_L = \fac V_L^2/R_L; = V_s^2 \fac R_L/(R_L + R_s)^2;
$$
where $R_s = 6\k \ohm$

If $R_L = 3\k \ohm$, then
$$
P_L = (12\V)^2 \fac 3\k \ohm /(3\k\ohm + 6\k \ohm)^2; = \fac 16/3;\m\W
$$
If $R_L = 6\k\ohm$, then
$$
P_L = (12\V)^2 \fac 6\k \ohm /(6\k\ohm + 6\k \ohm)^2; = 6\m\W
$$
If $R_L = 18\k\ohm$, then
$$
P_L = (12\V)^2 \fac 18\k \ohm /(6\k\ohm + 18\k \ohm)^2; = \fac 9/2;\m\W
$$

><img src="./Homework 3.assets/image-20230912231042538.png" alt="image-20230912231042538" style="zoom:33%;" />

##### (d-f)

This circuit appeared on the Lecture 03 Slides 01 Page 07. From there we know that
$$
V_L = V_s \\
P_L = \fac V_L^2/R_L; = \fac V_s^2/R_L;
$$
If $R_L = 3\k\ohm$, then 
$$
P_L = \fac (12\V)^2/3\k \ohm; = 48\m \W
$$
If $R_L = 6\k\ohm$, then
$$
P_L = \fac (12\V)^2/6\k \ohm; = 24\m \W
$$
If $R_L = 18\k\ohm$, then
$$
P_L = \fac (12\V)^2/18\k \ohm; = 8\m \W
$$
Second circuits deliver more power, this is because (1) smaller current due to higher equivalent resistance (due to two resistors in series) (2) the resistor also divided up the total power in the circuit. Also, we see that second circuit are more "intuitive", higher the resistor, lower the power. However, the first circuit's case are more complicated (there is a maximum absorbed power when $R_L = 6\k\ohm$ according to the available power formula given in the lecture). The power vs resistance (in kiloohms) is shown below

<img src="./Homework 3.assets/image-20230912230730681.png" alt="image-20230912230730681" style="zoom:25%;" />

#### Problem 5

>
>
><img src="./Homework 3.assets/image-20230912231017761.png" alt="image-20230912231017761" style="zoom:25%;" />

Since the $I_1$ is attached to the $-$ side of the top op-amp, $I_1 = 0\A$, and therefore the $V_{x+}$ has voltage of
$$
V_{x+} = 5\V - 2\k\ohm \cdot 0\A = 5\V
$$
and since the top op-amp $+$ node has $5\V$, its $-$ will have $5\V$. Since it's connected to the $+$ side of the bottom op-amp, the bottom op-amp will have $5\V$ on $+$ side, and therefore $5\V$ on $-$ side. Therefore, the current $I_3$ is
$$
I_3 = \fac 5\V/2\k\ohm; = \fac 5/2; \m \A
$$
and since the current flows into the $-$ side of the bottom amp is $0$, using KCL, we know the current passing through $4\k\ohm$ resistor is also $I_3$, since $I_2$ only flows into that resistor, that means $I_2 = I_3 = \fac 5/2; \mA$, and therefore
$$
V_{x-} - 5\V = I_2 \cdot 4\k\ohm \\
V_{x-} = 10\V + 5\V = 15\V
$$
and therefore
$$
V_x = V_{x+} - V_{x-} = 5\V - 15\V = -10\V
$$

#### Problem 6

><img src="./Homework 3.assets/image-20230912234031010.png" alt="image-20230912234031010" style="zoom:33%;" />

We see that the left op-amp has $+$ connected to the ground, therefore its $-$ side has $0\V$. Therefore, the current flowing from the $5\V$ source to the $-$ side of the left op-amp, call it $I_1$, is
$$
I_1 = \fac 5\V/3\ohm; = \fac 5/3;\A
$$
and since $-$ side of the left op-amp should have $0$ current flow in, that means, the current on the $6\ohm$ resistor is just $I_1$, therefore, we know that
$$
0\V - V_a = I_1 \cdot 6\ohm \\
\note V_a = -I_1 \cdot 6\ohm = -\fac 5/3;\A \cdot 6\ohm = -10\V!
$$
and in the center, we see that since the right op-amp's $+$ also connected to the ground, therefore, it will have $0\V$ on its $-$ side, that mean the current flowing from $-$ side of the right op-amp to node $V_a$, call it $I_2$, will be
$$
I_2 = \fac 0\V - V_a/4\ohm; = \fac 10\V/4\ohm; = \fac 5/2;\A
$$
Also, we see that since the $-$ side of the op-amp has $0\V$, that means
$$
\note V_R = 10\V - 0\V = 10\V!
$$
and the current flowing through that $8\ohm$ resistor is just
$$
I_3 = \fac V_R/8\ohm; = \fac 5/4;\A
$$
and therefore the current flowing to the right $3\ohm$ resistor from the $-$ side of the right op-amp (call it $I_4$) 
$$
I_3 = I_2 + I_4 \\
I_4 = I_3 - I_2 = -\fac 5/4;\A
$$
therefore we see that
$$
0 - V_o = -\fac 5/4;\A \cdot 3\ohm \\
\note V_o = \fac 15/4;\V!
$$