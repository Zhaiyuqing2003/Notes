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
\def\ketbra#1#2{|#1\rangle\langle#2|}
\def\bk#1#2{\langle #1|#2\rangle}
\def\two#1;#2;{\(\matrix{#1 \\ #2});}
\def\ketkron#1*#2;{\ket #1 \otimes \ket #2}
\def\brakron#1*#2;{\bra #1 \otimes \bra #2}
\def\infac#1;{\fac 1/#1;}
\def\four#1;#2;#3;#4;{\(\matrix{#1 \\ #2 \\ #3 \\ #4});}
\def\kket#1#2;{\ket #1 \ket #2}
\def\bbra#1#2;{\bra #1 \bra #2}
\def\[[#1]]{\{#1\}}
\def\sgrt#1/>{\sqrt{#1}}
\def\Pr#1;{\txt Pr;_{#1}}
\def\braket #1;#2;{\langle #1|#2\rangle}
$$

##### Question 1

>Consider the following state vector:
>$$
>\ket \psi = \sgrt \fac 5/6; />\ket 0 + \invsqrt 6 \ket 1
>$$

###### (a)

>Is the state normalized?

$$
\(\sgrt \fac 5/6; />);^2 + \(\invsqrt 6);^2 = 1
$$

The state is normalized.

###### (b)

>What is the probability that the system is found to be in state $\ket 0$, if $Z$ is measured?

The probability is
$$
\Pr 0; = \(\sgrt \fac 5/6; />);^2 = \fac 5/6;
$$

###### (c)

>Write down the density operator

$$
\rho = \ketbra \psi\psi = (\fac \sqrt 5/\sqrt 6;\ket 0 + \invsqrt 6 \ket 1)(\fac \sqrt 5/\sqrt 6;\bra 0 + \invsqrt 6 \bra 1) \\
= \fac 5/6;\ketbra 00 + \fac \sqrt 5/6;\ketbra 01 + \fac \sqrt 5/6;\ketbra 10 + \inv 6 \ketbra 11
$$

###### (d)

>Find the density matrix in the $\[[\ket 0, \ket 1]]$ basis, and show that $\txt Tr;(\rho) = 1$

From $(c)$, the density matrix is just
$$
\rho = \twotwo 5/6;\sqrt 5/6; \sqrt 5/6 ; 1/6 ;
$$
and $\txt Tr;(\rho) = 5/6 + 1/6 = 1$

##### Question 2

>Consider the state
>$$
>\ket \psi = \two \cos \theta ; i\sin \theta ;
>$$
>Is this state normalized? Is $\rho = \ketbra \psi \psi$ a density operator?

The state is normalized since
$$
\braket{\psi|\psi} = \cos^2\theta + \sin\theta^2 = 1
$$
and
$$
\rho = \ketbra \psi \psi = (\cos\theta \ket 0 + i\sin \theta\ket 1)(\cos \theta \bra 0 - i\sin \theta\bra 1) = \twotwo \cos^2\theta;-i\sin\theta\cos\theta;i\sin\theta\cos\theta;\sin\theta^2;
$$
and

* $\txt Tr;(\rho) = \cos^2\theta + \sin^2\theta = 1$
* $\rho^\dagger = \twotwo \cos^2\theta;-i\sin\theta\cos\theta;-(-i\sin\theta\cos\theta);\sin\theta^2; = \rho$
* let $\ket \phi = \two a;b;$, and thus $\bra \phi \rho \ket \phi = $

$$
\(a^* \quad b^*); \two a\cos^2\theta - bi\sin\theta\cos\theta;ai\sin\theta\cos\theta + b\sin^2\theta;
= a^2\cos^2\theta - a^*b(i\sin\theta\cos\theta) + ab^*(i\sin\theta\cos\theta) + b^2\sin^2\theta 
$$





##### Question 3

>Let
>$$
>\ket \psi = \sgrt \fac 3/7; /> \ket 0 + \fac 2/\sqrt 7; \ket 1
>$$

###### (a)

>Write down the density matrix in the $\[[\ket 0 , \ket 1]]$ basis.

$$
\rho = \twotwo 3/7;2\sqrt 3 / 7;2\sqrt 3 / 7;4/7;
$$

###### (b)

>Determine whether or not this is a pure state.



###### (c)

>Write down the density matrix in the $\[[\ket +, \ket -]]$ basis, show that $\txt Tr;(\rho) = 1$ still holds, and determine is you still obtain the same result as in part $(b)$

##### Question 4

>Suppose that a system is in the state
>$$
>\ket \psi = \sgrt \fac 2/3; />\ket 0 + \fac 1/\sqrt 3;\ket 1
>$$

###### (a)

>Compute $\txt Tr;(\rho)$ and $\txt Tr;(\rho^2)$. Is this a mixed state?

###### (b)

>Find $\expect X;$ for this state

##### Question 5

>Suppose that
>$$
>\rho = \twotwo 1/3; i/4; -i/4; 2/3;
>$$

###### (a)

>Is this a valid density matrix? If not, why not?

###### (b)

>Is this is a valid density matrix, does it represent a pure state or a mixed state?

##### Question 6

>For the density matrix given by
>$$
>\rho = \inv 5\twotwo 3;1-i;1+i;2;
>$$

###### (a)

> Is this a mixed state?

###### (b)

>Find $\expect X;$, $\expect Y;$, and $\expect Z;$ for this state