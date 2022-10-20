$$
\phantom {derivatives}
\newcommand\d{\text{d}}
\def\ffrac(#1/#2){\frac{#1}{#2}}
\def\hfrac #1(#2/#3){\ffrac (#1#2/#1#3)}
\def\deri#1/#2;{\hfrac \d(#1/#2)}
\def\dderi#1/#2;{\nderi #1/#2^2; }
\def\nderi#1/#2^#3;{\ffrac (\d^#3 #1/\d #2^#3)}
\def\derin1/#1{\ffrac (1/#1) }
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
$$

##### Problem 1: Driven oscillator

>Consider a mass on a spring with an exponentially decreasing external (i.e. driving) force described by the equation of motion
>$$
>\eq m\ddot x + kx = F_0e^{-\lambda t}!eq1!
>$$
>with $\lambda > 0$ constant.

###### (a)

>Write down the general **homogeneous** solution, $x_h(t)$, of the **homogeneous** part of the equation of motion, i.e., without the driving force. Determine the natural frequency $\omega_t$ in terms of $m$ and $k$.

The **homogeneous** equation is
$$
m\ddot x + kx = 0
$$
and its solution is just
$$
x = Ae\sup \sgrt {\fac k/m;} /> t;\quad \txt where; \quad \omega_t = \sgrt \fac k/m; />
$$

###### (b)

>Derive the particular solution, $x_p(t)$, of Equation $\eqref {eq:eq1}$ using the ansatz $x(t) = De^{-\lambda t}$. Determine $D$ in terms of $m$, $k$, $F_0$, and $\lambda$

Put the ansatz $x(t) = De\sup -\lambda t;$ into the equation
$$
\lambda^2 De\sup \lambda t;  -\lambda De\sup \lambda t; + De\sup \lambda t; = F_0e\sup \lambda t;
$$
and thus
$$
D = \fac F_0 / \lambda^2 - \lambda + 1 ;
$$

###### (c)

>Show that the general (total) solution Eq. $(1)$ is $x(t) = x_h(t) + x_p(t)$.



###### (d)

>Now consider initial conditions $x_0 = x(t=0) = 0$ and $\dot x_0 = \dot x_0(t = 0) = 0$ and determine the two free constants of the general homogeneous solution. Write down the full solution $x(t)$. Explain the behavior of $x(t)$ as $t \gg \inv \lambda$ 

##### Question 2

