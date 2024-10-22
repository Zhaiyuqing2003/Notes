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
\def\ketbra#1;#2;{|#1\rangle\langle#2|}
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
\def\ko{\ket 0}
\def\ki{\ket 1}
\def\kt#1;{\ket {#1}}
$$

##### Question 1

>A system is in the state
>$$
>\ket \psi = \half \kt u_1; - \fac \sqrt 2/2;\kt u_2; + \half \kt u_3;
>$$
>where the orthonormal basis states $\kt u_1;$, $\kt u_2;$, $\kt u_3;$, correspond to possible measurement results $\hbar \omega$, $2\hbar \omega$, and $3\hbar \omega$, respectively. Write down the projection operators corresponding to each possible measurement result, and determine the probability of find the system in each of the states $\kt u_1;$, $\kt u_2;$, $\kt u_3;$. What is the average energy of the system?

$$
P_1 = \ketbra u_1;u_1; \quad P_2 = \ketbra u_2;u_2; \quad P_3 = \ketbra u_3;u_3;
$$

$$
\Pr1; = |P_1\ket\psi|^2 = \inv 4 \\
\Pr2; = |P_2\ket\psi|^2 = \inv 2 \\
\Pr3; = |P_3\ket\psi|^2 = \inv 4 \\
$$

and thus the average energy is
$$
\expect E; = \inv 4 \hbar \omega + \inv 2 \cdot 2 \hbar \omega + \inv 4 3\hbar \omega = 2\hbar \omega
$$

##### Question 2

>A qubit is in the state $\ket \psi = \ki$. A measurement of $X$ is made. What are the matrix representation of the projection operators corresponding to measurement results $\pm 1$? What is the probability of finding measurement results $\pm 1$?

the eigenvector of $X$ is $\ket +$, $\ket -$. (with corresponding eigenvalue of $1$ and $-1$), and thus
$$
P\sub +1; = \ketbra +;+; \\
P\sub -1; = \ketbra -;-;
$$
and thus
$$
\Pr +1; = |P\sub +1; \ket 1|^2 = \half \\
\Pr -1; = |P\sub-1; \ket 1|^2 = \half \\
$$

##### Question 3

>A system is in the state
>$$
>\ket \psi = \invsqrt 6 \ko + \fac \sqrt5/\sqrt6;\ki
>$$
>A measurement is made with respect to the observable $Y$. What is the expectation or average value.

the eigenvector is
$$
\kt +_Y; = \invsqrt 2 (\ket 0 + i\ket 1) \\
\kt -_Y; = \invsqrt 2 (\ket 0 - i\ket 1) \\
$$
the projection operator is
$$
P\sub+1; = \ketbra +_Y;+_Y; \\
P\sub-1; = \ketbra -_Y;-_Y; \\
$$
and thus the probability for 
$$
\Pr+1; = |P\sub +1; \ket\psi|^2 = \half \\
\Pr-1; = |P\sub -1; \ket\psi|^2 = \half 
$$
and thus
$$
\expect Y; = \half (+1) + \half (-1) = 0
$$
we could also find that
$$
\expect Y; =  \bra \psi  Y\ket \psi = \inv 6 (1 \quad \sqrt 5) \twotwo 0;-i;i;0; \two 1 ;\sqrt 5; = 0 
$$
as both methods agree.

##### Question 4

>A three-qubit system is in the state
>$$
>\ket \psi = \(\fac \sqrt 2 + i /\sqrt {20};);\kzzz + \invsqrt 2 \kzzo + \invsqrt {10} \kzoo + \fac i/2; \kooo
>$$

###### (a)

>What is the probability that the system is found in the state $\kzoo$ if all three qubits are measured?

$$
\Pr \kt 001;; = \inv {10}
$$

###### (b)

>What is the probability that a measurement on the second qubit only gives 1? What is the postmeasurement state of the system? Show that the postmeasurement state is normalized.

$$
\Pr \kt *1*;; = \inv {10} + \inv 4 = \fac 7/20;
$$

The measurement operator is
$$
P = I\otimes P_1\otimes I
$$
and thus
$$
\ket \psi' = \fac P \ket \psi / \sqrt {\bra \psi P\ket\psi}; = \fac \sqrt 2/\sqrt 7;\kt 011; + \fac \sqrt 5/\sqrt 7;i \kt 111;
$$
and it's normalized since
$$
\(\fac \sqrt 2/\sqrt 7;);^2 + \(\fac \sqrt 5/\sqrt 7;);^2 = 1
$$

##### Question 5

>A two qubit system is in the state
>$$
>\ket \phi = \invsqrt 6 \kzo + \fac \sqrt 5/\sqrt6;\koz
>$$
>Is the state normalized? An $X$ gate is applied to the second qubit. After this is done, what are the possible measurement results if both qubits are measured, and what are the respective probabilities of each measurement result?

It's normalized since
$$
(\invsqrt 6)^2 + (\fac \sqrt 5/\sqrt 6;)^2 = 1
$$
Apply $X$ gate to second qubit, we get
$$
\ket \phi' = \invsqrt 6 \kt 00; + \fac\sqrt 5/\sqrt 6;\kt 11;
$$
The possible measurement results are
$$
\kt 00; \quad \txt or; \quad \kt 11;
$$
the possibility are
$$
\Pr \kt 00;; = \fac 1/6; \\
\Pr \kt 11;; = \fac 5/6;
$$

##### Question 6

>Suppose $\ket \psi = \ki$ and $\ket\phi = (\ko + \ki)/\sqrt 2$. Write down a **POVM** that allows for imperfect distinguishability between the two states.

According to the example given by the McMahon, we have
$$
\cos \theta = \invsqrt 2
$$

$$
E_1 = \fac I-\ketbra \psi;\psi;/ 1 +\cos\theta; = \fac \sqrt 2/1 +\sqrt 2;\ketbra 0;0; \\
E_2 = \fac I-\ketbra \phi;\phi;/ 1 +\cos\theta; = \fac \sqrt 2/1 + \sqrt 2;\half (\ketbra 0;0; + \ketbra 1;1; - \ketbra 0;1; - \ketbra 1;0;) \\
E_3 = I - E_1 - E_2
$$







