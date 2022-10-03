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



##### (a)

In the infinite long distance, the angular momentum should just be
$$
|\ell| = |r||v|\sin \alpha \\
= |r||v| \fac b/|r|; \\
=vb
$$

##### (b)

In the infinite long distance, the potential is just $\Phi = 0$, and the energy should just be
$$
e = t + \Phi = \half v^2
$$

##### (c)

It's hyperbolic, it's pretty self-evident as it has two asymptotic line.

##### (d)

since the total energy is conserved:
$$
e = \half v^2 = \half v'^2
$$
and thus
$$
v = v'
$$

##### (e)

since the angular momentum is conserved, and thus
$$
\ell = v'b' = vb
$$

$$
b' = b
$$

##### (f)

The minimum $r\sub min;$ is when $\cos \phi = 1$ and that is $\phi = 0$, specifically, when $v^2b = GM$, $v\tsub min;$ is
$$
v\tsub min; = \fac \ell^2/GM; \(1 + \sqrt{1 + \fac 2e\ell^2/G^2M^2;});\sup -1; \\
= \fac v^2b^2/GM; \(1 + \sqrt{1 + \fac 2(\half v^2)v^2b^2 / G^2M^2 ;});\sup -1; \\
= b\(1 + \sqrt{1 + \fac v^4b^2/G^2M^2;});\sup -1; \\
= b\(1 + \sqrt 2);\sup -1;\\
= \note \fac b/1 + \sqrt 2; !
$$




