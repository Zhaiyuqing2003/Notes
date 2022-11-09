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
$$

##### Simple Harmonic Oscillator

$$
m\ddot x + c\dot x + kx = 0
$$

$$
\zeta = \fac c/2m\omega_n;
$$

$$
\ddot x + 2\zeta \omega_n \dot x + \omega_n^2 x = 0
$$

Assume
$$
x(t) = \exp(\lambda t)
$$

$$
\lambda^2 \exp(\lambda t) + 2\zeta \omega_n \lambda \exp(\lambda t) + \omega_n^2 \exp(\lambda t) = 0
$$

$$
\lambda^2 + 2\zeta\omega_n \lambda +\omega_n^2 = 0
$$

$$
\lambda = \fac -2\zeta \omega_n \pm \sqrt {4\zeta^2\omega_n^2 - 4\omega_n^2}/2; = -\zeta \omega_n \pm \sqrt {\zeta^2 \omega_n^2 - \omega_n^2} = -\zeta \omega_n \pm \omega_n \sqrt {\zeta^2 - 1}
$$

$$
\lambda = -\omega_n (\zeta \mp \sqrt {\zeta^2 - 1})
$$

If $\zeta = 0$, undamped (**cosine wave**)
$$
\lambda = \pm  i \omega_n
$$

$$
x(t) = C_1\exp(i\omega_n t) + C_2\exp (i \omega_n t) \\
= A\sin(\omega t) + B\cos(\omega t) \\
= C\cos(\omega t - \phi)
$$

