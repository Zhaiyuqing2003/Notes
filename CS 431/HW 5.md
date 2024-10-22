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
\def\eo{\varepsilon_{0}}
$$

<img src="./HW 5.assets/image-20240423193454473.png" alt="image-20240423193454473" style="zoom:33%;" />

#### Problem 1

##### (a)

For $\tau_1$, we have
$$
\fac C + B + 2S + (P - D)/P; = \fac 10 + 4 + 2 \cdot \half  + 60 - 50/60; < U(1) = 1
$$
So $\tau_1$ is **schedulable**

For $\tau_2$, we have
$$
\fac 10/60; + \fac 25 + 5 + 2 \cdot \half + (155 - 135)/155; \approx 0.496 <U(2) = 0.828
$$
So $\tau_2$ is **schedulable**

For $\tau_3$, we have
$$
\fac 10/60; + \fac 25/155; + \fac 15 + 0 + 2\cdot \half + (210 -185)/210; \approx 0.523 < U(3) = 0.779
$$
So $\tau_3$ is **schedulable**

##### (b)

The $C_a$ seems to be $26$. Let's do the analysis. If $C_a = 27$

```pseudocode
Task 0 (a)
Iteration 0
t = 27 + 0 + 2 * 0.5
= 28

Iteration 1
t = 27 + 0 + 2 * 0.5
= 28

Converged before deadline 59

Task 1
Iteration 0
t = 10 + 4 + 2 * 0.5
 + 27 + 2 * 0.5
= 43

Iteration 1
t = 10 + 4 + 2 * 0.5
 + ceil(43/59) * (27 + 2 * 0.5)
= 43

Converged before deadline 50

Task 2
Iteration 0
t = 25 + 5 + 2 * 0.5
 + 27 + 2 * 0.5
 + 10 + 2 * 0.5
= 70

Iteration 1
t = 25 + 5 + 2 * 0.5
 + ceil(70/59) * (27 + 2 * 0.5)
 + ceil(70/60) * (10 + 2 * 0.5)
= 109

Iteration 2
t = 25 + 5 + 2 * 0.5
 + ceil(109/59) * (27 + 2 * 0.5)
 + ceil(109/60) * (10 + 2 * 0.5)
= 109

Converged before deadline 135

Task 3
Iteration 0
t = 15 + 0 + 2 * 0.5
 + 27 + 2 * 0.5
 + 10 + 2 * 0.5
 + 25 + 2 * 0.5
= 81

Iteration 1
t = 15 + 0 + 2 * 0.5
 + ceil(81/59) * (27 + 2 * 0.5)
 + ceil(81/60) * (10 + 2 * 0.5)
 + ceil(81/155) * (25 + 2 * 0.5)
= 120

Iteration 2
t = 15 + 0 + 2 * 0.5
 + ceil(120/59) * (27 + 2 * 0.5)
 + ceil(120/60) * (10 + 2 * 0.5)
 + ceil(120/155) * (25 + 2 * 0.5)
= 148

Iteration 3
t = 15 + 0 + 2 * 0.5
 + ceil(148/59) * (27 + 2 * 0.5)
 + ceil(148/60) * (10 + 2 * 0.5)
 + ceil(148/155) * (25 + 2 * 0.5)
= 159

Iteration 4
t = 15 + 0 + 2 * 0.5
 + ceil(159/59) * (27 + 2 * 0.5)
 + ceil(159/60) * (10 + 2 * 0.5)
 + ceil(159/155) * (25 + 2 * 0.5)
= 185

Task 3 failed at i = 27, where deadline is 180.
```

For $C_a = 26$, we do

```pseudocode
Task 0
Iteration 0
t = 26 + 0 + 2 * 0.5
= 27

Iteration 1
t = 26 + 0 + 2 * 0.5
= 27

Converged before deadline 59

Task 1
Iteration 0
t = 10 + 4 + 2 * 0.5
 + 26 + 2 * 0.5
= 42

Iteration 1
t = 10 + 4 + 2 * 0.5
 + ceil(42/59) * (26 + 2 * 0.5)
= 42

Converged before deadline 50

Task 2
Iteration 0
t = 25 + 5 + 2 * 0.5
 + 26 + 2 * 0.5
 + 10 + 2 * 0.5
= 69

Iteration 1
t = 25 + 5 + 2 * 0.5
 + ceil(69/59) * (26 + 2 * 0.5)
 + ceil(69/60) * (10 + 2 * 0.5)
= 107

Iteration 2
t = 25 + 5 + 2 * 0.5
 + ceil(107/59) * (26 + 2 * 0.5)
 + ceil(107/60) * (10 + 2 * 0.5)
= 107

Converged before deadline 135

Task 3
Iteration 0
t = 15 + 0 + 2 * 0.5
 + 26 + 2 * 0.5
 + 10 + 2 * 0.5
 + 25 + 2 * 0.5
= 80

Iteration 1
t = 15 + 0 + 2 * 0.5
 + ceil(80/59) * (26 + 2 * 0.5)
 + ceil(80/60) * (10 + 2 * 0.5)
 + ceil(80/155) * (25 + 2 * 0.5)
= 118

Iteration 2
t = 15 + 0 + 2 * 0.5
 + ceil(118/59) * (26 + 2 * 0.5)
 + ceil(118/60) * (10 + 2 * 0.5)
 + ceil(118/155) * (25 + 2 * 0.5)
= 118

Converged before deadline 180

i = 26 is a valid value of i
```

So $C_a = 26$ for all four tasks to meet the deadlines. (Note, the Task 0 in above log is the $\tau_a$)

#### Problem 2

##### Station $S_2$ stream

First we want to write out the periodic video data stream to $S_3$ from $S_2$. We see that it sends 10 frames per second, **assume** the camera sends its frame one by one, so the period of this stream should be $100\text{ms}$. We further see that one frame has the size of
$$
128 * 128 * 4 = 2^{16} \text{ bits}
$$
and that means each frame takes $2^{16}/2^{21} = \fac 1/2^5; = 31.25\text{ms}$ to send using the 2Mbit/sec ring. $(C_{23} = 31.25, T_{23} = 100)$​

##### TTRT

Then we want to calculate the TTRT, which is the sum of hold time from each node and the walk time, which is
$$
15 + 10 + 25 + 50 = 100\text{ ms}
$$
So now we could build the equivalent periodic task net

##### Equivalence

For Station $S_1$​, it has tasks (from highest priority to lowest)

Consumed time TTRT $-$ $H_1$ = $85 \text { ms}$

* $(C=85, P=100)$ (The TTRT Task)
* $(C_{13}=15,P_{13}=105)$​



For Station $S_2$, it has tasks (from highest priority to lowest)

Consumed time TTRT $-$ $H_2$ = $90 \text { ms}$

* $(C=90, P=100)$ (The TTRT Task)
* $(C_{23} = 31.25, P_{23} = 100)$



For Station $S_3$, it has tasks (from highest priority to lowest)

Consumed time TTRT $-$ $H_3$ = $75 \text { ms}$

* $(C=75, P=100)$ (The TTRT Task)
* $(C_{31} = 7, P_{31} = 85)$
* $(C_{32}=30, P_{32}=250)$



Note, except the TTRT Task, other tasks are created just exactly the same as the streams $C$ and $T$.



#### Problem 3

First identify that since $P_S = 6$, that means this server will priority lower than $T_1$ but higher than $T_2$ and $T_3$

For this problem, since we have made an algorithm to perform exact schedulablity test on certain set of periodic tasks when I try to find the $C_a$. I could just re-use the code and make some modification. Instead of try $C_a$ starting from 0 and gradually increases until some tasks is not schedulable, we could do a **binary search**, on the $C$ now. The minimum possible value for $C$ is of course 0. Then maximum possible value should be $P_S = 6$. Initially set $C = 3$ (average of minimum possible and maximum possible $C$). If the tests pass, then increase the lower bound (set it to current $C$), set $C$ to the average of the updated lower and upper bound. If the tests doesn't pass, reduce the upper bound (Set it to the current $C$), set $C$​ to the average of the updated lower and upper bound. Repeat this possible until the upper and lower bound are decently close, that is the threshold.

The result

```
i = 1.2500000000000004
min = 1.2500000000000004
max = 1.2500000000000007
i = 1.2500000000000004 is the maximum value of i that just make all tasks meet their deadline
```

It seems that $\bold {1.25}$​ is the maximum budget (there is some floating point error, the exact value should be 1.25 here)



#### Problem 4

We want to list the table here first

|       | $\bold{S_1}$ | $\bold{S_2}$ |
| ----- | ------------ | ------------ |
| $T_1$ | 4            |              |
| $T_2$ | 5            | 8            |
| $T_3$ | 6            | 9            |
| $T_4$ |              | 10           |

First see the priority ceiling
$$
C(S_1) = \text{prio}_1 \quad C(S_2) = \text{prio}_2
$$

##### (a)

Now first want to calculate the $B\tsup task;_i$ for each task
$$
\align[[
B\tsup task;_1 &= 5 + 6 = 11 \\
B\tsup task;_2 &= 9 + 10 = 19 \\
B\tsup task;_3 &= 10 \\
B\tsup task;_4 &= 0
]]
$$
and we also want calculate the $B\tsup section;_i$ for each task
$$
\align[[
B\tsup section;_1 &= 6 \\
B\tsup section;_2 &= 6 + 10 = 16 \\
B\tsup section;_3 &= 10 \\
B\tsup section;_4 &= 0
]]
$$
and we take the minimum of the two, so
$$
\align[[
B_1 &= 6 \\
B_2 &=  16 \\
B_3 &= 10 \\
B_4 &= 0
]]
$$

##### (b)

|       | $\bold{S_1}$ | $\bold{S_2}$ |
| ----- | ------------ | ------------ |
| $T_1$ | 4            |              |
| $T_2$ | 5            | 8            |
| $T_3$ | 6            | 9            |
| $T_4$ |              | 10           |

We see that
$$
\align[[
B_1 &= \max(5, 6) = 6 \\
B_2 &= \max(6, 9, 10) = 10 \\
B_3 &= \max(10) = 10 \\
B_4 &= 0
]]
$$


