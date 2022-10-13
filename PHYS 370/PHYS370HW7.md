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
$$

##### Question 1

>In the Example 3.17 we showed that $[\sigma_1, \sigma_2] = 2i\sigma_3$. Following the same procedure, show that $[\sigma_2, \sigma_3] = 2i\sigma_1$ and $[\sigma_3, \sigma_1] = 2i\sigma_2$

$$
\def\sq{\sigma_1}
\def\sw{\sigma_2}
\def\se{\sigma_3}
$$

$$
[\sw, \se] = \PY\PZ - \PZ\PY = \twotwo 0;i;i;0; - \twotwo 0;-i;-i;0; = 2i\sq \\
[\se, \sq] = \PZ\PX - \PX\PZ = \twotwo 0;1;-1;0; - \twotwo 0;-1;1;0; = 2i\sw
$$

>and write down the uncertainty principle corresponding to simultaneous measurements of $\sq$ and $\sw$. Is the uncertainty principle for $\sw$ and $\se$ different?

$$
\Delta \sq \Delta \sw \ge \half |\expect 2i \se;|
$$

The general uncertainty principle works for all operators, so it should follow the same equation that
$$
\Delta A\Delta B\ge \half |\expect [A, B];|
$$
which is
$$
\Delta \sw \Delta \se \ge \half |\expect 2i \sq;|
$$

##### Question 2

>Write $Z$ in terms of its projection operators (in the $\ket 0$ and $\ket 1$ basis). Using this form of $Z$, calculate the probability of obtaining the result $\ket 1$ if you measure $Z$ for the (unnormalized) state $2\ket 0 + 3i\ket 1$ 

$Z$ is equal to
$$
Z = \ketbra 00 - \ketbra 11
$$
and
$$
\ket\psi = Z(2\ket 0 + 3i\ket 1) = 2\ket 0 - 3i\ket 1
$$
the probability is
$$
\txt Pr; = \fac (3i)(-3i) / 4 + (3i)(-3i) ; = \fac 9/4+9; = \fac 9/13;
$$


##### Question 3

$$
\[[\sigma_i, \sigma_j]] = \sigma_i\sigma_j + \sigma_j\sigma_i \\
$$

we could find out that
$$
\def\PX{\twotwo 0;1;1;0;}
\def\PY{\twotwo 0;-i;i;0;}
\def\PZ{\twotwo 1;0;0;-1;}
\def\sx{\sigma_X}
\def\sy{\sigma_Y}
\def\sz{\sigma_Z}
\def\PId{\twotwo 1;0;0;1;}
$$

$$
\sx\sy = \PX\PY = \twotwo i;0;0;-i;\\
\sy\sx = \PY\PX = \twotwo -i;0;0;i; \\
\sx\sz = \PX\PZ = \twotwo 0;-1;1;0; \\
\sz\sx = \PZ\PX = \twotwo 0;1;-1;0; \\
\sy\sz = \PY\PZ = \twotwo 0;i;i;0; \\
\sz\sy = \PZ\PY = \twotwo 0;-i;-i;0; \\
\sx\sx = \PX\PX = \PId \\
\sy\sy = \PY\PY = \PId \\
\sz\sz = \PZ\PZ = \PId
$$

and thus
$$
\def\anticom#1#2{\[[#1, #2]]}
\def\anticomeq#1#2{\anticom#1#2 = #1#2 + #2#1}
$$

$$
\align[[ 
\anticomeq \sx\sx &= 2I \\
\anticomeq \sy\sy &= 2I \\
\anticomeq \sz\sz &= 2I \\
\anticomeq \sx\sy &= 0 \\
\anticomeq \sy\sx &= 0 \\
\anticomeq \sx\sz &= 0 \\
\anticomeq \sz\sx &= 0 \\
\anticomeq \sy\sz &= 0 \\
\anticomeq \sz\sy &= 0
]]
$$
and thus it's proved.

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