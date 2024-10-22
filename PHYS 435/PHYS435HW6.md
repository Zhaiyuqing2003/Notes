$$
\def\V{\text{V}}
\def\A{\text{A}}
\def\mA{\text{mA}}
\phantom {derivatives}
\newcommand\d{\text{d}}
\def\ffrac(#1/#2){\frac{#1}{#2}}
\def\hfrac #1(#2/#3){\ffrac (#1#2/#1#3)}
\def\deri#1/#2;{\hfrac \d(#1/#2)}
\def\dderi#1/#2;{\nderi #1/#2^2; }
\def\nderi#1/#2^#3;{\ffrac (\d^#3 #1/\d #2^#3)}
\def\derin #1;{\deri /#1;}
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

#### Problem 1

##### (a)

From the graph, we could see that
$$
\kappa(z) = \fac \kappa_1 - 1/d;z + 1 = \fac (\kappa_1 - 1)z + d /d;
$$

##### (b)

we know that for a linear dielectric, we have
$$
\vec E(z) = -\fac \sigma / \kappa(z) \epsilon_0; \hat z
$$
and the displacement field is just
$$
\vec D(z) = \epsilon_0 \kappa(z) \vec E = -\sigma\hat z
$$
the **magnitude** of $\vec E(z)$, which is $E(z) = \dfac \sigma / \kappa(z) \epsilon_0; $, depend on the $\kappa(z)$, and we find now that $\kappa(z)$ is smallest at $0$, and biggest at $d$. Therefore, the **magnitude** $E(z)$ is biggest at $0$, and smallest at $d$. (that is to say, the magnitude that $\vec E(z)$ pointing to left is the maximum at $0$, and smallest at $d$).

##### (c)

Since we know that
$$
\vec D = \epsilon_0 \vec E + \vec P \\
$$
It's true that
$$
\vec P = \vec D - \epsilon_0 \vec E = \(1 - {\fac 1 / \kappa(z);});\sigma\hat z = -\fac \kappa - 1/\kappa; \sigma \hat z
$$
It's **magnitude** is biggest at $d$, and smallest at $0$. When you compare this with the fact that the **magnitude** $E(z)$ is biggest at $0$, and smallest at $d$, this is expected because we know that
$$
\vec P = \epsilon_0 \chi \vec E
$$
we see that
$$
\chi = \kappa - 1 = \fac \kappa _1 - 1/d;z
$$
and this increases from $0$ to $d$. The effect of $\chi$ is greater than $\vec E$ and that's why the maximum and minimum (the increasing / decreasing trend) is same as $\chi$ but not $\vec E$.

##### (d)

Integrate $E$ on $z$, we get
$$
\Delta V_{0 \to d} = 
-\int_0^d -\fac \sigma / \kappa(z) \epsilon_0; \d z \\= 
\fac \sigma/\epsilon_0; \int_0^d \fac 1/\kappa(z); \d z  \\= 
\fac \sigma d/\epsilon_0; \int_0^d \fac 1/(\kappa_1 - 1)z + d; \d z \\=
\fac \sigma d/\epsilon_0; \.\ln (\fac (\kappa_1 - 1)z + d/k - 1;)|;^d_0 \\=
\fac \sigma d/\epsilon_0(\kappa_1 - 1);\ln \kappa_1
$$

##### (e)

We know that $C \equiv \fac Q/V;$ and therefore
$$
C = \fac Q/V; = \fac \sigma A \cdot  \epsilon_0 (\kappa_1 - 1)/\sigma d \ln \kappa_1; = \fac \epsilon_0 A /d; \fac \kappa_1 - 1/\ln \kappa_1;
$$

##### (f)

We know that
$$
\sigma_B = - \vec P \cdot \hat n
$$
and when on the left plate
$$
\sigma_B = \vec P \cdot \hat z = -\fac \kappa - 1/\kappa; \sigma = 0
$$
when on the right plate
$$
\sigma_B = -\vec P \cdot \hat z = \fac \kappa - 1/\kappa; \sigma = \fac \kappa_1 - 1/\kappa_1; \sigma
$$
We also know that
$$
\rho_B = -\vec \nabla\cdot \vec P = \vec \nabla \cdot \fac \kappa - 1/\kappa; \sigma \hat z \\=
\deri /z; ({\fac \kappa - 1/\kappa;} \sigma) \\=
\sigma\deri /z; (1 - \fac d/(\kappa_1 -1)z + d;) \\=
-d\sigma \deri /z; \fac 1/(\kappa_1 -1)z + d; \\=
\fac d\sigma (\kappa_1 - 1)/((\kappa_1 - 1)z + d)^2;
$$
Integrate over $z$,
$$
\sigma_{B'} = \int_0^d \fac d\sigma (\kappa_1 - 1)/((\kappa_1 - 1)z + d)^2; \d z  \\=
 d(\kappa_1 - 1) \sigma \int_0^d ((\kappa_1 - 1)z + d)^{-2} \d z \\
= d(\kappa_1 - 1) \sigma \. \({\fac 1/(\kappa_1 - 1)((\kappa_1 - 1)z + d);}); |;^{d}_{0} \\
= d(k - 1) \sigma \fac 1/\kappa_1 d;
\\= \fac \kappa_1/\kappa_1 - 1;\sigma
$$
We see that they are actually the same, $\sigma_B = \sigma_{B'}$. That's why it's common sense.

#### Problem 2

##### (a)

This is just similar as the one we did in HW4. (So the derivation will be ignored here). It's
$$
s\pderi /s; (s \pderi S/s;) = m^2 S(s)
$$

$$
\ppderi \Theta/\theta; = -m^2\Theta(\theta)
$$

The $m^2 > 0$. We choose the negative coefficient for $\Theta(\theta)$ because we want the sinusoidal solution. It's reasonable because we need to make sure the solution is periodical.

##### (b)

From HW4 we see that the general solution is that
$$
V(s, \phi) = \sum_{m = -\infin}^{\infin} s^m (A_m \cos m\phi  + B_m\sin m\phi)
$$
From symmetry, the solution should be an even function of $\phi$, We first consider the case when it's outside the cylinder:

From $E = E_0 \hat x$, we see that this
$$
V(\infin, 0) = -E_0 s \\
V(\infin, \pi) = E_0 s
$$
also we know that
$$
V(\infin, \fac \pi/2;) = V(\infin, \fac 3\pi/2;) = 0
$$
using symmetry, that means all the $B_m = 0$, and therefore
$$
V\tsub out;(s, \phi) = -s E_0 \cos \phi +  \sum_{m =0}^{\infin} s^{-m} A\tsub m,out; \cos m\phi
$$
Now consider the situation in the cylinder. Using symmetry, that means all the $B_m = 0$. We also see that we shouldn't approach infinity as $s \to 0$. Therefore 
$$
V\tsub in;(s, \phi) =  \sum_{m = 0}^{\infin} s^m A\tsub m,in; \cos m\phi
$$
In fact, only $m = 1$ is possible (this is discussed in part $(c)$, so it is
$$
V\tsub out;(s, \phi) = -s E_0 \cos \phi +  \fac 1/s; A\tsub 1, out; \cos \phi \\
V\tsub in;(s, \phi) = s A\tsub 1,in; \cos \phi
$$


##### (c)

we can write
$$
\vec D = -\epsilon_0 \kappa \vec \nabla V(s, \theta)
$$
and we see that
$$
\hat n \cdot \vec D\tsub out; = -\epsilon \hat s \cdot \vec \nabla V\tsub out
;(s, \phi) \\
\hat n \cdot \vec D\tsub in; = -\epsilon \kappa \hat s \cdot \vec \nabla V\tsub in ;(s, \phi) \\
$$
and we know that $\hat s \cdot \vec \nabla = \pderi /s;$.
$$
\pderi/s; (-s E_0 \cos \phi +  \sum_{m =0}^{\infin} s^{-m} A\tsub m,out; \cos m\phi) = \pderi/s; \kappa \sum_{m = 0}^{\infin} s^m A\tsub m,in; \cos m\phi
$$
we see that
$$
-E_0\cos \phi - m s^{-m - 1}A\tsub m, out; \cos m\phi = \kappa m s^{m - 1} A\tsub m, in; \cos m\phi
$$
replace $s$ with $R$ and we see
$$
-E_0\cos \phi - m R^{-m - 1}A\tsub m, out; \cos m\phi = \kappa m R^{m - 1} A\tsub m, in; \cos m\phi
$$
and we see that this must be true for every $\phi$, which means that $m$ could only be $1$. Therefore
$$
-E_0 \cos\phi - \fac A\tsub 1, out;/R^2;  \cos \phi = \kappa A\tsub m, in; \cos \phi
$$
which is just
$$
-E_0 - \fac A\tsub 1, out;/R^2; = \kappa A\tsub m, in;
$$
We also know that
$$
E_{\parallel} = -\hat \phi \cdot \vec \nabla V(s, \phi)
$$
we know that
$$
\hat \phi \cdot (\pderi V/s; \hat s  + \fac 1/s; \pderi V/\phi;\hat \phi + \pderi V/z;\hat z) = \fac 1/s;\pderi V/\phi;
$$
therefore
$$
E_{\parallel} = -\fac 1/s; \pderi V/\phi;
$$
we know that
$$
E_{\parallel, \txt out;} = E_{\parallel, \txt in;}\\
 -\fac 1/s; \pderi /\phi;(-s E_0 \cos \phi +  \fac 1/s; A\tsub 1, out; \cos \phi) =  -\fac 1/s; \pderi V/\phi; (s A\tsub 1,in; \cos \phi) \\
 -s E_0 +  \fac 1/s; A\tsub 1, out; = s A\tsub 1,in;
$$
Let $s = R$, we see that
$$
-E_0 + \fac A\tsub 1, out;/R^2; = A\tsub 1, in;
$$
Now, we have
$$
-E_0 - \fac A\tsub 1, out;/R^2; = \kappa A\tsub 1, in; \\
-E_0 + \fac A\tsub 1, out;/R^2; = A\tsub 1, in;
$$
we see that
$$
-E_0 - \fac A\tsub 1, out;/R^2; = \kappa(-E_0 + \fac A\tsub 1, out;/R^2;) \\
(\kappa - 1) E_0 = (1 + \kappa ) \fac A\tsub 1, out;/R^2; \\
A\tsub 1, out; = \fac \kappa - 1/\kappa + 1; E_0 R^2
$$
and
$$
A\tsub 1, in; = -\fac 2/\kappa+1;E_0
$$
Therefore
$$
V\tsub out;(s, \phi) = -s E_0 \cos \phi +  \fac 1/s; \fac \kappa - 1/\kappa + 1; E_0 R^2 \cos \phi \\
V\tsub in;(s, \phi) = -s\fac 2/\kappa+1;E_0 \cos \phi
$$

##### (d)

we see that
$$
\vec E\tsub in; = -\vec \nabla ( -s\fac 2/\kappa+1;E_0 \cos \phi)
= \fac 2/\kappa+1;E_0  \hat x
$$
therefore
$$
\epsilon_0 (\chi +2 )E\tsub in; = 2\epsilon_0 E_0 \\
\epsilon_0 E\tsub in; = \epsilon_0 E_0 - \half P
$$
and we see that it's indeed $1/2$

##### (e)

Imagine when the cylinder is parallel to the electric field direction, then actually there won't be any induced $P$ and $E$. and the formula
$$
\epsilon_0 E\tsub in; = \epsilon_0 E_0 - ? P
$$
and in this case the $?$ in above formula will just be $0$, as expected. So, the depolarizing coefficient is just $0$.

