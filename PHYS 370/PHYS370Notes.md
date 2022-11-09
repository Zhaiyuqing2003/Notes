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
\def\ba#1;{\bra {#1}}
$$

##### Expectation value of an operator

The expectation value of an operator is defined to be
$$
\expect A; = \bra \psi A\ket\psi
$$
since $A$ is a Hermitian matrix, apply spectral decomposition gives us
$$
A = c_i \ketbra u_i;u_i;
$$
where $\ket {u_i}$ is the eigenvectors, and that
$$
\ket \psi = a_i\ket {u_i}
$$
and the true definition of expectation value becomes clear
$$
\expect A; = a_i^*\bra {u_i}c_i\ketbra u_i;u_i;a_i\ket{u_i} = a_i^2c_i
$$
is the **probability weighted sum of the eigenvalues**.

the **standard deviation** (uncertainty) is defined as
$$
\Delta A = \sgrt \expect A^2; - \expect A;^2 />
$$

##### Function of operators

Function of operator could be defined as
$$
f(A) = \fac x_n/n!;A^n
$$
which is the Taylor expansion of the function. If $A$ could be spectral decomposed to $A = c_i\ketbra u_i;u_i;$,
$$
f(A) = \fac x_n/n!;c_i \ketbra u_i;u_i; = f(c_i)\ketbra u_i;u_i;
$$
which means for a Hermitian matrix $H = \phi_i \ketbra u_i;u_i;$, we have
$$
U = e^{i\varepsilon H} = e\sup i \varepsilon \phi_i;\ketbra u_i;u_i;
$$
the operator $U$ is unitary since
$$
UU^\dagger = e\sup i\varepsilon \phi_i;\ketbra u_i;u_i;e\sup -i\varepsilon \phi_j;\ketbra u_j;u_j; = e\sup i\varepsilon \phi_i;e\sup -i\varepsilon \phi_i;\ketbra u_i;u_i; = \ketbra u_i;u_i; 
$$

##### Unitary Transformation

Consider the basis set $\kt u_i;$ and $\kt v_i;$, then, the change of basis matrix is
$$
U = \bold 1\cdot \bold 1 = \ketbra u_i;u_i;\ketbra u_j;u_j; = \braket u_i;u_j;\ketbra u_i;u_j;
$$

##### Projection operators

The projection operator is defined to be
$$
P = \ketbra \psi;\psi;
$$
has properties of
$$
P^2 = P \quad P^\dagger = P
$$
Using spectral decomposition, every operator could be written as
$$
A = a_i\ketbra u_i;u_i; = a_iP_i \qquad I= P_i
$$

##### Positive Operators

A positive semidefinite is
$$
\expect A;= \bra \psi A \ket \psi \ge 0 \quad \txt for all; \quad \ket\psi
$$
A equivalent definition is that all eigenvalues of $A$ is positive.

##### Commutators

Commutator is defined to be
$$
[A, B] = AB-BA
$$
If $[A, B] = 0$, we say the operator $A$ and $B$ commute. The commutator is **linear** and **distributive**, and **antisymmetric**.
$$
[A, B] = AB - BA = -(BA - AB) = -[B, A] \\
[A, B+C] = [A, B] + [A, C] \\
[A, BC]  =[A, B]C + B[A, C]
$$

##### Uncertainty principle

Uncertain principle states that
$$
\Delta A \Delta B \ge \half |\expect [A, B];|
$$
The most famous one is that
$$
\Delta x \Delta p \ge \fac \hbar /2;
$$

##### Tensor Product

Just consider the quantum states and operator the staff on the "quantum circuit", then tensor product make sense. Tensor product is **linear**.

##### Inner product of Tensor product

$$
\kt \psi_1; = \kt \phi_1\chi_1; \\
\kt \psi_2; = \kt \phi_2\chi_2;
$$

and the inner product is defined to be
$$
\braket \psi_1;\psi_2; = \braket \phi_1;\phi_2;\braket \chi_1;\chi_2;
$$

##### Tensor product (Vectors)

For vectors, tensor product could be represent as
$$
\ket \psi = \two a;b; \quad \ket \chi = \two c;d; \quad \kt \psi\chi; = \four ac;ad;bc;bd;
$$
which is just multiply each vector's entries by other vector.

##### Operators in tensor products

Using quantum circuit analogy, the tensor product like
$$
(A \otimes B)(\ket \phi \otimes \ket \chi) = A\ket\phi \otimes B\ket\chi
$$
The tensor product keep the property of matrix, like Hermitian, Projection Operators, Unitary, Positive. The tensor product of matrices follows the similar operations as vectors.

##### Density operator

Pure state is a single quantum state. Mixed state is few quantum states mixed classically (consider few atoms in a material).

Density operator in pure state is given by
$$
\rho = \ketbra \psi;\psi;
$$

##### Density operator for expectation values

It allows us to calculate the expectation value in new ways. Consider a state $\ket \psi = c_i\kt u_i;$ (the states are orthonormal), then
$$
\expect A; = \bra \psi A \ket \psi = c_j^* \ba u_j; A c_i\kt u_i; = c_j^* c_i\ba u_j; A\kt u_i;
$$
we know that $\braket u_i;\psi; = c_i$ and $\braket \psi;u_j; = c_j^*$.
$$
\expect A; = \braket u_i;\psi;\braket \psi;u_j;\ba u_j; A\kt u_i;= \ba u_i; \rho \kt u_j;\ba u_j; A\kt u_i;
$$
the $\ketbra u_j;u_j;$ is just $I$
$$
\expect A; = \ba u_i; \rho A\kt u_i; = \Tr(\rho A)
$$

##### Density operator of mixed states

we define the density operator in mixed as
$$
\rho = p_i\rho_i
$$
that is, the combination of density operator in pure state based on their classical probability.

##### Characteristic of Density operators

* It's Hermitian. $\rho^\dagger = p_i\ketbra \psi_i;\psi_i; = \rho$

* $Tr(\rho) = 1$

  We could show that the $\rho$ for pure state is $1$.
  $$
  \Tr(\rho) = \braket u_i;\psi; \braket \psi;u_i; = |\braket \psi;u_i;|^2 = 1
  $$
  because the sum of probability is $1$.

  Thus the $\rho$ for a mixed state is simply
  $$
  \Tr(\rho) = p_i\Tr(\rho_i) = p_i\cdot 1 = 1
  $$
  because the sum of classical probability is $1$

* It's a **Positive operator**.

  We could show that the $\rho$ for pure state is **positive operator**
  $$
  \ba u;\rho\kt u; = \braket u;\psi;\braket \psi;u; = |\braket u;\psi;|^2 \ge 0
  $$
  since the probability of measuring any specific state could never be smaller than $0$.

  Thus the $\rho$ for the mixed state is
  $$
  \ba u;\rho \kt u; = p_i \ba u;\rho_i \kt u; \ge 0
  $$
  because the classical probability is never smaller than $0$.

##### Density operator for expectation values (mixed states)

We usually calculate expectation value by
$$
\expect A; = p_i \ba \psi_i;A\kt \psi_i; = p_i\Tr(\rho_iA) = \Tr(p_i\rho_iA) = \Tr(\rho A)
$$
which means our expectation value formula also works for the density operator of mixed states.

##### Probability of measurement

we know that the probability of measuring $\kt u_i;$ of a state $\kt \psi; = p_i\kt u_i;$ is $p_i^2$, which could also be calculate by
$$
p_i^2 = (\kt u_i;\braket u_i;\psi;)^2 = (P_i\ket\psi)^2 = \ba \psi;P_i^*P_i\kt \psi; = \ba \psi; P_i \kt \psi; = \expect P_i;
$$
 and thus
$$
\expect P_i; = \Tr(P_i\rho) = \braket u_n;u_i;\ba u_i;\rho \kt u_n; = \ba u_i;\rho \kt u_i;
$$
after the measurement, the density operator will just be $\ketbra u_i;u_i;$, and that is
$$
\rho' = \ketbra u_i;u_i; = \fac \ba u_i;\rho\kt u_i; \ketbra u_i;u_i;/\Tr(P_i\rho); = \fac \ketbra u_i;u_i;\rho \ketbra u_i;u_i;/\Tr(P_i\rho); = \fac P_i\rho P_i/\Tr(P_i\rho);
$$

##### Differentiate the Pure state and mixed state

Density operator has special property that:

* $\Tr(\rho^2) < 1$ for a mixed state
* $\Tr(\rho^2) = 1$ for a pure state







