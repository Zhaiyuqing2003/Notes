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
\def\inv#1{\frac{1}{#1}}
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
\def\H{\text{H}}
\def\intzh#1;{\intlh 0;#1;}
\def\k{\text{k}}
\def\F{\text{F}}
$$

#### Problem 1

> Sign acknowledging you will abide by this course’s and the University’s Academic Integrity policies or face sanctions for not doing so. These policies include, among others, plagiarism: representing the words or ideas of others as your own; cheating: using unauthorized materials and/or information. The possible sanctions include, among others, reduced letter grades and an F in the course. If your solution upload does not include your signature, your homework will NOT be graded, resulting in a zero.

Sign: Yuqing Zhai

#### Problem 2

> <img src="./Homework 4.assets/image-20230918104209920.png" alt="image-20230918104209920" style="zoom: 25%;" />

##### (a)

Before the switch close, it looks like

<img src="./Homework 4.assets/image-20230918154153045.png" alt="image-20230918154153045" style="zoom: 25%;" />

In the DC-steady state, the inductor will act like a short, therefore the voltage across it will be $0\V$. Using node-voltage method, we will see that
$$
v_L(0^-) - 0\V = 0\V
$$
which means that $\note v_L(0^-) = 0\V!$

Using node method, we see that
$$
v_s - 0\V = 12\V
$$
and therefore $v_s = 12\V$. On node $v_L$, we see that
$$
\fac v_s - v_L(0^-) / 3\ohm; = i_L(0^-)
$$
and therefore $\note i_L(0^-) = 4\A!$

##### (b)

See after $(c)$

##### (c)

<img src="./Homework 4.assets/image-20230919001224565.png" alt="image-20230919001224565" style="zoom:25%;" />

Using node voltage method on node $v_L(t)$
$$
\fac v_s - v_L(t)/3; + \fac v_s - v_L(t)/6; = i_L(t) \\
\fac v_s - v_L(t)/2; = i_L(t)
$$
We know that the inductor follows
$$
v_L(t) = L\deri i_L(t)/t;
$$
Setting up the equation
$$
\align [[
v_s - v_L(t) &= 2\cdot i_L(t) \\
v_s - L\deri i_L(t)/t; &= 2 \cdot i_L(t) \\
v_s - 6 \cdot \deri i_L(t)/t; &= 2 \cdot i_L(t) \\
i_L'(t) + \fac 1/3; \cdot i_L(t) &= \fac 1/3; (\half v_s) 
]]
$$

From the textbook 3.4.2, we know this form of equation has solution of
$$
i_L(t) = (i_L(0^-) - \half v_s)e^{-t/3} + \half v_s
$$
which is
$$
i_L(t) = (4 - 6) e^{-t/3} + 6 \\
\note i_L(t) = (-2e^{-t/3} + 6)\A !
$$
and thus
$$
\note v_L(t) = L\deri i_L(t)/t; = 6 \cdot -2 \cdot (-\fac 1/3;) e^{-t/3} = (4 e^{-t/3})\V!
$$
It's obvious that their $\tau = 3\s$

##### (b)

From $(c)$, we see that
$$
i_L(t) = (i_L(0^-) - \half v_s) e^{-t/3} + \half v_s \\
i_L(t) = \half v_s (1 - e^{-t/3}) + i_L(0^-)e^{-t/3} \\
\note i_L(t) = (6(1 - e^{-t/3}) + 4e^{-t/3}) \A !
$$
and we could see that

* Let $i_L(0^-) = 0$, the **zero-state response** is $\note i_{L, \txt ZS;}(t) = \half v_s (1 - e^{-t/3}) = 6 (1 - e^{-t/3})!$
* Let $v_s = 0$, the **zero-input response** is $\note i_{L, \txt ZI;} = i_L(0^-)e^{-t/3}! = 4e^{-t/3}\A$

##### (d)

<img src="./Homework 4.assets/image-20230919004132403.png" alt="image-20230919004132403" style="zoom:25%;" />

$\tau = 3\s$

* The blue line is $v_L(t)$. At $t = 0^+$, $v_L = 4\V$. As $t \to \infin$, $v_L \to 0\V$. At $t = \tau$, $v_L(t) = 4e^{-1}\V$
* The green line is $i_L(t)$. At $t = 0$, $i_L = 4\A$. As $t \to \infin$, $v_L = 6\V$. At $t = \tau$, $i_L(t) = (-2e^{-1} + 6)\A$

#### Problem 3

> <img src="./Homework 4.assets/image-20230919000933633.png" alt="image-20230919000933633" style="zoom:33%;" />

Before the $t = 0$:

<img src="./Homework 4.assets/image-20230918153056309.png" alt="image-20230918153056309" style="zoom:33%;" />

Since the switch has been in position $A$ for a long time, the circuit will be in a steady state, and the inductor will act like a short. 

Since in this case the $1\ohm$ resistor will have $1\A$ current (provided by the current source), using KCL on the node $a$, we see that
$$
I + 1 = 1
$$
that means the $I = 0\A$, and therefore, do the KCL on the node $b$, we see the current on $R$ is just $i$. Therefore, do the KVL as indicated, we see
$$
Ri = v_L \\
$$
since the inductor acts like a switch, $v_L = 0\V$, and therefore $i(0) = 0\A$

At $t = 0$, when the switch moves to $B$, we see

<img src="./Homework 4.assets/image-20230918202308315.png" alt="image-20230918202308315" style="zoom:33%;" />

From the textbook 3.4.2, this kind of circuit has the solution of
$$
i(t) = (i(0^-) - I_s) e^{-\fac t/L/R;} + I_s
$$
given $I_s = 1\A$, $R = 1\ohm$ in this case, it is
$$
i(t) = 1 - e^{-t/L}
$$
at $t = 2\s$, we want $i(2) = (1 - e^{-1}) \A$
$$
i(2) = 1\A (1 - e^{-2/L}) = (1 - e^{-1}) \A \\
-\fac 2/L; = -1 \\
\note L  = 2\H!
$$
Then after $t = 2\s$, it moves back to $A$ again, as mentioned earlier, that means
$$
Ri(t) = v_L(t)\\
Ri(t) = L\deri i(t)/t; \\
\fac R/L; \d t = \iv {i(t)};\d i(t) \\
\intlh 2\s;t; \fac R/L; \d s = \intlh i(2\s);i(t); \iv i; \d i \\
\ln i(t) = \ln i(2) - \fac R/L; (t - 2) \\
i(t) = i(2)e^{-\fac R/L;(t-2)}
$$
we know that $i(2) = (1 - e^{-1}) \A$. Therefore
$$
i(t) = (1 - e^{-1}) \A \cdot e^{-\fac R/L;(t - 2)}
$$
we want $i(8) = (1-e^{-1})e^{-2}\A$, that is
$$
i(8) = (1 - e^{-1}) \A \cdot e^{-\fac R/L;(8-2)} = (1-e^{-1})e^{-2}\A \\
-\fac R/L;(8 - 2) = -2 \\
\note R = \fac L/3; = \fac 2/3; \ohm !
$$

#### Problem 4

<img src="./Homework 4.assets/image-20230919000914565.png" alt="image-20230919000914565" style="zoom:33%;" />

##### (a)

Since the switch has been closed for a long time, the capacitor will act like a open-circuit. Therefore $\note i_C = 0\A !$ We see that in this case, the current flowing through the $4\ohm$ is $10\A$. Therefore
$$
\note v_R(0^-) = 4\ohm \cdot 10\A = 40\V !
$$
doing the KVL as indicated, we see that
$$
\note v_C(0^-) = v_R(0^-) = 40\V!
$$

##### (b)

See after $(d)$

##### (c)

Apply KCL at node $a$,
$$
i_s = i_R + i_C
$$
and applying node-method at node $a$
$$
v_a = i_R \cdot (4 + 8) = v_C + 8 \cdot i_C
$$
At the capacitor
$$
i_C = C\deri v_C/t; = 1 \deri v_C/t;
$$
and therefore 
$$
12(i_s - i_C) = v_C + 8i_C \\
12i_s = 20i_C + v_C \\
20v'_C + v_C = 12i_s \\
v'_C + \iv 20; v_C = \iv 20; (12 i_s)
$$

From textbook 3.4.1, we know this kind of differential equation has solution
$$
v_C(t) = (v_C(0^-) - 12i_s) e^{-t/20} + 12i_s
$$
we know that $I_s = 10\A$ and $v_C(0^-) = 40\V$, therefore
$$
\note v_C(t) = (-80e^{-t/20} + 120) \V!
$$
therefore we know that
$$
\note i_C = \deri v_C/t; = 4e^{-t/20} \A!
$$

##### (d)

It follows that
$$
i_R = i_s - i_c = (10 - 4e^{-t/20})\A
$$
and therefore
$$
\note v_R = 4\ohm \cdot i_R = (40 - 16 e^{-t/20}) \V!
$$

##### (b)

From $(c)$, we see that
$$
v_C(t) = (v_C(0^-) - 12i_s) e^{-t/20} + 12i_s \\
v_C(t) = 12i_s(1 - e^{-t/20}) + v_C(0^-)e^{-t/20} \\
\note v_C(t) = (120(1-e^{-t/20}) + 40e^{-t/20})\V !
$$
and we could see that

* Let $v_C(0^-) = 0$, the **zero-state response** is $\note v_{C, \txt ZS;}(t) = 12i_s(1 - e^{-t/20})  = 120(1- e^{-t/20})\V !$
* Let $i_s = 0$, the **zero-input response** is $\note v_{C, \txt ZI;} = v_C(0^-)e^{-t/20} = 40e^{-t/20} \V!$

##### (e)

<img src="./Homework 4.assets/image-20230919003925167.png" alt="image-20230919003925167" style="zoom:25%;" />

$\tau = 20\s$

* The purple line is the $v_C(t)$. At $t = 0$, $v_C(t) = 40\V$. As $t \to \infin$, $v_C(t) \to 120\V$. At $t = \tau$, $v_C(t) = (-80e^{-1} + 120) \V$
* The green line is the $v_R(t)$. At $t = 0^+$, $v_R(t) = 24\V$. As $t \to \infin$, $v_R(t) = 40\V$. At $t = \tau,$ $v_R(t) = (40-16e^{-1})\V$
* The gray line is the $i_C(t)$. At $t = 0^+$, $i_C(t) = 4\A$. As $t\to \infin$, $i_C(t) = 0\A$. At $t = \tau$, $i_C(t) = 4e^{-1}\A$

#### Problem 5

> <img src="./Homework 4.assets/image-20230918235505321.png" alt="image-20230918235505321" style="zoom: 33%;" />

Using node-voltage method, we see that
$$
v_{O+} - 0\V = v_c(t)
$$
therefore $v_{O+} = v_c(t)$, and therefore $v_{O-} = v_{O+} = v_c(t)$ under the ideal op-amp approximation. Therefore, the current $i_1$ is 
$$
i_1 = \fac 1\V - v_c(t) /1\k \ohm ;
$$
since under ideal op-amp approximation
$$
i_{O-} = i_{O+} = 0\A
$$
therefore at node $O_-$ (using KCL)
$$
\fac v_c(t) - v_{o+}(t)/ 1\k \ohm; = \fac 1V - v_c(t) /1\k \ohm ;
$$

>Notice the difference between $v_{O+}$ and $v_{o+}$

and therefore we get
$$
v_{o+}(t) = (2v_c(t) - 1)\V
$$
we see that at node $O_+$
$$
\fac v_c(t) - 0\V/1\k \ohm; = -i_c(t)
$$
and at the same time
$$
i_c(t) = C\deri v_c(t)/t; = 1\mu \F \cdot \deri v_c(t)/t;
$$
therefore
$$
v_c(t) = -1\k \ohm \cdot 1\mu \F  \cdot \deri v_c(t)/t; = -1m \V\cdot \s \deri v_c/t;
$$
and therefore (the derivation is similar to problem 3, so the process is skipped)
$$
v_c(t) = v_c(0) e^{-1000t}\V
$$
therefore
$$
v_{o+}(t) = (2v_c(0) e^{-1000t} - 1)\V
$$
Let $t = 2m\s$, we get
$$
v_{o+}(t) = (2 \cdot (-2\V) \cdot e ^{-1000 \cdot 2\m s} -1) \V \\
v_{o+}(t) = (-4e^{-2} -1)\V
$$
we see that therefore
$$
\note v_o(t) = v_{o+}(t) - v_{o-}(t) = (-4e^{-2} -1)\V - 0\V = (-4e^{-2} -1)\V !
$$



