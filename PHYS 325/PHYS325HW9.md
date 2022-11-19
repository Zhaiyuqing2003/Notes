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
\def\kg{\txt kg;}
\def\s{\txt s;}
\def\m{\txt m;}
\def\stwo{\txt s;^2}
\def\iv#1;{\inv{#1}}
\def\sumninfin{\sum\sub n=1;\sup\infin;}
\def\sumninfinz{\sum\sub n = 0;\sup\infin;}
\def\intinfin{\int\sub-\infin;\sup\infin;}
\def\cases[[#1]]{\begin{cases}#1\end{cases}}
$$

##### Problem 1

>A simple pendulum with a point mass $m$ on the end of a massless rod of length $L$ is suspended from the roof of a truck that is smoothly accelerating at a rate $a$ in $x$-direction. Ignore the rotation of the Earth.

###### (a)

>Construct a free-body diagram showing the (true and fictitious) forces acting on the mass. At what angle $\theta$ away from the vertical will the pendulum hang when it is at equilibrium.

From the free-body diagram, we know that
$$
F\tsub rod;\sin \theta = F\tsub fic; = ma\\
F\tsub rod;\cos \theta = mg
$$
and thus
$$
\theta = \arctan \(\fac ma/mg;); = \arctan \(\fac a/g;);
$$

###### (b)

>What is the tension in the rod as it is in equilibrium?

From the free-body diagram, we could see that
$$
F\tsub rod; = m\sqrt {a^2 + g^2} = m (a\sin \theta  + g\cos \theta)
$$

###### (c)

>What is the normal frequency $w_n$ of free oscillations of the pendulum around that equilibrium.

From the free-body diagram, we could see that the torque is
$$
I\ddot \theta = F\tsub fic;L\cos \theta  - mg L \sin \theta \\
mL^2 \ddot\theta = ma L \cos\theta - mg L \sin \theta \\
L \ddot \theta = a\cos\theta  - g\sin\theta \\
L\Delta\ddot \theta = a\cos(\theta\tsub eq; + \Delta \theta) - g\sin (\theta\tsub eq; + \Delta \theta) \\
L\Delta\ddot\theta = a (\cos \theta\tsub eq; \cos \Delta\theta  - \sin \theta \tsub eq; \sin \Delta\theta ) - g (\sin \theta \tsub eq;\cos \Delta \theta + \cos \theta \tsub eq; \sin \Delta \theta) \\
$$
We know that
$$
a\cos \theta\tsub eq; - g\sin \theta\tsub eq; = 0
$$
and thus
$$
L\Delta\ddot \theta = -a\sin \theta\tsub eq; \sin \Delta\theta - g\cos \theta\tsub eq;\sin\Delta\theta \\
L\Delta\ddot \theta  + (a\sin \theta\tsub eq; + g\cos \theta \tsub eq;)\sin \Delta \theta = 0
$$
using small angle approximation $\sin\Delta\theta \approx \Delta\theta$.
$$
L\Delta \ddot \theta + (a \sin \theta \tsub eq; + g\cos \theta \tsub eq;) \Delta \theta = 0
$$
and thus the $\omega_n$ is
$$
\omega_n = \sqrt {\fac a\sin \theta \tsub eq; + g \cos \theta \tsub eq; / L;} = \sqrt { \fac F\tsub rod;/mL;}
$$


##### Problem 2

From lecture note 19 equation $(7), (8)$, the settings with only only centrifugal force and Coriolis force has the differential equation of
$$
\ddot x = \omega^2 x + 2\omega \dot y \\
\ddot y = \omega^2 y - 2\omega \dot x
$$
Let's say bugs are moving from center downwards in negative $x$ direction with speed $v_r$, then:
$$
x(0) = 0, \dot x(0) = -v_r, y(0) = 0, \dot y(0) = 0
$$
we know that the above equation has solution given in lecture note 19 equation $(17)$ as
$$
\psi(t) = A\exp(-i\omega t) + Bt\exp(-i\omega t)
$$
taking the initial condition
$$
\psi(t = 0) = A = x(0) + iy(0) = 0  \\
\dot \psi(t = 0) = -i\omega A + B = \dot x(0) + i\dot y(0) = -v_r
$$
and thus
$$
A = 0 \qquad B = -v_r
$$
and
$$
\psi(t) = -v_r t\exp(-i \omega t) \\
\ddot \psi(t) = v_r\omega\exp(-i \omega t)(2i + t\omega)
$$
and thus the distance from center $r$ and acceleration $a$ is
$$
r(t) = v_r t \\
a(t) = \omega v_r\sqrt {4 + t^2\omega^2}
$$
when $F(t) = \mu mg$, the bug begins to\dot x = -v_r \\                             	
\dot y = 0 \\ slip, so
$$
\mu mg \le ma(t) \\
\mu g \le a(t) =\omega v_r\sqrt {4 + t^2\omega^2} \\
\omega\sqrt {4v_r^2  + (v_r^2 t^2)\omega ^2} \ge \mu g \\
\omega\sqrt {4v_r^2 + r^2\omega^2} \ge \mu g \\
\note r \ge \sqrt{\(\fac \mu g/\omega^2;);^2 - 4\(\fac v_r/\omega;);^2}!
$$
This makes sense because if the part $(\fac \mu g/\omega^2;)$ is the part when we only needs centrifugal force, the addition of Coriolis force increase the overall force needed and reduce the radius when the bug begins to slip.

###### (b)

$$

$$





