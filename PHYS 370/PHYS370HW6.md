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
\def\twotwo#1;#2;#3;#4;{\(\matrix{#1 & #2\\#3 & #4});}
\def\expect#1;{\left\langle#1\right\rangle}
\def\txt#1;{\text{#1}}
\def\ketbra#1#2{\ket #1 \bra #2}
$$

#### Question 1

>Using $X = \twotwo 0;1;1;0;$, calculate the expectation value $\expect X;$ for the states $\ket \pm = \invsqrt 2(\ket 0 \pm \ket 1)$ (related to McMahon 3.3)

The expectation value $\expect X;$ for $\ket +$ and $\ket -$
$$
\bra + X \ket + = \braket + =1 \\
\bra - X \ket - = -\braket - = -1
$$

It's expected since $\ket +$ and $\Ket -$ is the eigenstate of the $X$.

#### Question 2

>Determine the unitary operator needed to transform from the $\ket 0$, $\ket 1$ "computational" basis to the $\ket +$, $\ket -$ basis. Using this unitary matrix, transform $X$, above, from the computational to the $\ket \pm$ basis and compare with the result in McMahon 3.3

This is the Hadamard Gate $H$, since
$$
H\ket 0 = \invsqrt 2(\ket 0 + \ket 1) = \ket + \\
H\ket 1 = \invsqrt 2(\ket 0 - \ket 1) = \ket - \\
$$

$$
X' = HXH = \invsqrt 2 \twotwo 1;1;1;-1; \twotwo 0;1;1;0; \invsqrt 2 \twotwo 1;1;1;-1; = \inv 2 \twotwo1;1;1;-1; \twotwo1;-1;1;1; = \twotwo 1;0;0;-1;
$$

which has the same result in McMahon 3.3. This indicates the unitary matrix (the change-basis matrix) is indeed correct.

#### Question 3

>A three-state system is in the state
>$$
>\ket \psi = \half \ket 0 + \half \ket 1 + \fac i/\sqrt 2; \ket2
>$$
>Write down the necessary projection operators and calculate the probabilities $\txt Pr;(0)$, $\txt Pr(1);$ and $\txt Pr;(2)$

So,
$$
P_0 = \ket 0 \bra 0 \\
P_1 = \ket 1 \bra 1 \\
P_2 = \ket 2 \bra 2
$$

$$
\txt Pr;(0) = \bra \psi P_0 \ket \psi = \bra \psi \half \ket 0 = \inv 4 \\
\txt Pr;(1) = \bra \psi P_1 \ket \psi = \bra \psi \half \ket 1 = \inv 4 \\
\txt Pr;(2) = \bra \psi P_2 \ket \psi = \bra \psi \fac i/\sqrt 2;\ket 2 = -\fac i/\sqrt 2;\cdot \fac i/\sqrt 2; = \half
$$

