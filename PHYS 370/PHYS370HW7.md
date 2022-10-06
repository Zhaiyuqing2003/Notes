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
\def\bk#1#2{\braket {#1|#2}}
\def\two#1;#2;{\(\matrix{#1 \\ #2});}
\def\ketkron#1*#2;{\ket #1 \otimes \ket #2}
\def\brakron#1*#2;{\bra #1 \otimes \bra #2}
\def\infac#1;{\fac 1/#1;}
\def\four#1;#2;#3;#4;{\(\matrix{#1 \\ #2 \\ #3 \\ #4});}
\def\kket#1#2;{\ket #1 \ket #2}
\def\bbra#1#2;{\bra #1 \bra #2}
\def\[[#1]]{\{#1\}}
$$

##### Question 3

$$
\[[\sigma_i, \sigma_j]] = \sigma_i\sigma_j + \sigma_j\sigma_i \\
$$

since pauli 





##### Question 4

>Given that $\bk ab = 1/2$ and $\bk cd = 3/4$, calculate $\bk \psi\phi$, where $\ket \psi = \ket a \otimes \ket c$ and $\ket \phi = \ket b \otimes \ket d$

$$
\bk \psi\phi = (\brakron a*c;)(\ketkron b*d;)
= \bk ab\bk cd = 3/8
$$

##### Question 5

>Calculate the tensor product of 
>$$
>\ket \psi = \invsqrt 2 \two 1;1; \quad \text{and} \quad \ket \phi = \half \two 1;\sqrt 3;
>$$

$$
\ketkron \psi*\phi; = \infac 2\sqrt 2; = \four 1;\sqrt 3;1;\sqrt 3;
$$

##### Question 6

>Can $\ket \psi = \half (\ket 0 \ket 0 - \ket 0\ket 1 - \ket 1\ket 0 + \ket 1 \ket 1)$ be written as a product state?

Yes,
$$
\ket \psi = \ketkron -*-; = \invsqrt 2 (\ket 0 - \ket 1) \otimes \invsqrt 2 (\ket 0 - \ket 1) = \ket \psi = \half (\ket 0 \ket 0 - \ket 0\ket 1 - \ket 1\ket 0 + \ket 1 \ket 1)
$$

##### Question 7

>Can
>$$
>\ket \psi = \fac \ket 0 \ket 0 + \ket 1\ket 1/2;
>$$
>be written as a product state?

No, write the state as vector
$$
\ket \psi = \four 1/2;0;0;1/2;
$$
Suppose it could be written as a product of two states $\ket x$ and $\ket y$
$$
\ket x \otimes \ket y = \two a;b; \otimes \two c;d; = \four ac;ad;bc;bd; = \four 1/2;0;0;1/2;
$$
which means
$$
ac \cdot bd = 1/4 \quad \txt and; \quad ad \cdot bc  = 0 \\
abcd=1/4 \quad \txt and; \quad abcd = 0
$$
and that is contradiction. Thus, there are no such states $\ket x$ and $\ket y$ that $\ketkron x*y; = \ket \psi$. and thus $\ket \psi$ could not be written as product of state.