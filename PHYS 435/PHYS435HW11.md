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
\def\arcsinh{\text{arcsinh}}
\def\eo{\varepsilon_{0}}
$$



#### Problem 1

##### (a)

According to Lecture 38, we know that it's always that $\theta\tsub inc; = \theta \tsub refl;$. For the $\theta\tsub tran;$, according to the Snell's law, we have $\sin \theta\tsub tran; n_2 = \sin \theta\tsub inc; n _1$ and therefore
$$
\theta\tsub tran; = \arcsin (\fac n_1/n_2; \sin \theta\tsub inc;)
$$

However, if we just want $\cos\theta\tsub tran;$, then it's
$$
\cos\theta\tsub tran; = \sqrt { 1 - \sin^2 \theta\tsub tran; } = \sqrt { 1 - \(\fac n_1/n_2; \sin\theta\tsub inc;);^2}
$$

>For $(b)$, $(c)$, $(d)$, and $(e)$, $(f)$. This is similar to what Lecture 38 did in the case 1. We just follow the similar process. Denote the income electric field $E_i$, reflected electric field $E_r$, transmitted electric field $E_t$. Same for the magnetic field. 

##### (b) 

Call the space outside the material *space 1*, call the space inside the material *space 2*. We know from the fact that **D-normal** is continuous is:
$$
\align[[
\vec D_1 \cdot \hat n &= \vec D_2 \cdot \hat n \\
\epsilon_0 \kappa_1 (\vec E_i + \vec E_r) \cdot \hat n &= \epsilon_0 \kappa_2 \vec E_t \cdot \hat n \\
-\epsilon_0 \kappa_1 (E_i \sin \theta\tsub inc; + E_r \sin\theta\tsub inc;) &= -\epsilon_0 \kappa_2 (E_t \sin\theta\tsub tran;) \\
n_1 \cdot n_1 \sin\theta\tsub inc; (E_i + E_r) &= n_2 \cdot n_2 \sin \theta\tsub tran; E_t  \\
]]
$$
since from Snell's Law, we know that $n_1 \cdot \sin\theta\tsub inc; = n_2 \cdot \sin\theta_2$ therefore
$$
n_1 (E_i + E_r) = n_2 \cdot E_t
$$

##### (c)

We know from the fact that $E_\parallel$ is continuous:
$$
\vec E_{\parallel, 1} = \vec E_{\parallel, 2} \\
E_i \cos\theta\tsub inc; - E_r \cos\theta\tsub inc; = E_t \cos\theta\tsub tran;
$$
and therefore we get
$$
(E_i - E_r) \cos\theta\tsub inc; = E_t \cos\theta\tsub tran;
$$

##### (d)

Since we know from the fact that $H_\parallel$ is continuous:
$$
\vec H_{\parallel, 1} = \vec H_{\parallel, 2} \\
\vec B_i + \vec B_r = \vec B_t \\
\fac E_i/c;n_1 + \fac E_r / c;n_1 = \fac E_t/c; n_2
$$
so that
$$
n_1(E_i + E_r) = n_2 E_t
$$

##### (e)

we see that the equation we get from $(b)$ and $(d)$ is actually the same (so that they are degenerate). To solve the equation, we have
$$
(E_i - E_r) \cos\theta\tsub inc; = E_t \cos\theta\tsub tran; \\
n_1(E_i + E_r) = n_2 E_t
$$
We see that
$$
1  - \fac E_r/E_i; = \fac E_t/E_i; \fac \cos \theta\tsub tran;/ {\cos \theta\tsub inc;}; \\
1 + \fac E_r/E_i; = \fac n_2 E_t/n_1E_i;
$$
Therefore we have
$$
\fac E_t/E_i; = \fac 2 n_1 \cos\theta\tsub inc; /{ n_2 \cos\theta\tsub inc; + n_1 \cos\theta\tsub tran;}; =  \fac 2n_1n_2 \cos\theta\tsub inc;/{n_2^2 \cos\theta\tsub inc; + n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};
$$
and (with some messy derivation listed in the slides),
$$
\fac E_r/E_i; = \fac n_2^2 \cos\theta\tsub inc; - n_1 \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}/{n_2^2 \cos\theta\tsub inc; + n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};
$$

##### (f)

Then we just want that the numerator of $E_r/E_i$ to be zero, so
$$
n_2^2 \cos\theta\tsub inc; = n_1 \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;} \\
n_2^4 \cos^2\theta\tsub inc; = n_1^2 (n_2^2 - n_1^2 \sin^2 \theta\tsub inc;) \\
(n_2^4 - n_1^2n_2^2) \cos^2\theta\tsub inc; = (n_1^2n_2^2 - n_1^4) \sin^2\theta\tsub inc; \\
n_2^2(n_2^2 - n_1^2) \cos^2\theta\tsub inc; = n_1^2(n_2^2 - n_1^2) \sin^2\theta\tsub inc; \\
n_2 \cos\theta\tsub inc; = n_1 \sin\theta\tsub inc;
$$
Therefore, we find that
$$
\fac n_2/n_1; = \fac \sin\theta\tsub inc; /{\cos\theta\tsub inc;};
$$
when
$$
\theta\tsub inc; = \arctan (\fac n_2/n_1;)
$$
Then the reflected wave vanishes.

##### (g)

$$
R = \(\fac E_r/E_i;);^2 = \(\fac n_2^2 \cos\theta\tsub inc; - n_1 \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}/{n_2^2 \cos\theta\tsub inc; + n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};);^2
$$

It's still that when 
$$
\theta\tsub inc; = \arctan (\fac n_2/n_1;)
$$
the reflected wave vanishes.

##### (h)

Then,
$$
T = \fac n_2/n_1; \fac \cos\theta\tsub tran;/{\cos\theta\tsub inc;}; \(\fac 2n_1n_2 \cos\theta\tsub inc;/{n_2^2 \cos\theta\tsub inc; + n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};);^2
$$
we find that

we see that
$$
{n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}} = n_1n_2 \sqrt { 1 - \(\fac n_1/n_2; \sin\theta\tsub inc;);^2} = n_1n_2\cos\theta
$$
therefore,
$$
R + T = \(\fac n_2^2 \cos\theta\tsub inc; - n_1 \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}/{n_2^2 \cos\theta\tsub inc; + n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};);^2 + \fac n_2/n_1; \fac \cos\theta\tsub tran;/{\cos\theta\tsub inc;}; \(\fac 2n_1n_2 \cos\theta\tsub inc;/{n_2^2 \cos\theta\tsub inc; + n_1\sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};);^2 \\
=  \fac 4n_1 n_2^3 \cos\theta\tsub tran;\cos\theta\tsub inc; + \(n_2^2 \cos\theta\tsub inc; - n_1n_2\cos\theta\tsub inc;);^2/ {\(n_2^2 \cos\theta\tsub inc; + n_1n_2\cos\theta);}^2 ; \\
$$
we see that let $a = n_2^2 \cos\theta\tsub inc;$ and $b = n_1 n_2 \cos\theta\tsub tran;$, the formula becomes
$$
R + T = \fac 4ab + (a - b)^2/(a+b)^2; = 1
$$
this is true because energy is conserved $(S\tsub inc; = S\tsub ref; + S\tsub tran;)$. (Similar to the case in Lecture 37 Page 10)

#### Problem 2

##### (a)

$E_\parallel$, $B_\parallel$, $B_\perp$

##### (b)

Call the space outside the material *space 1*, call the space inside the material *space 2*. We know from the fact that **B-normal** is continuous is:
$$
\align[[
\vec B_1 \cdot \hat n &= \vec B_2 \cdot \hat n \\
B_i \sin \theta\tsub inc; + B_r \sin \theta\tsub inc; &= B_t \sin \theta\tsub tran; \\
\fac E_i/c; n_1 \sin \theta\tsub inc; + \fac E_r/c; n_1 \sin \theta\tsub inc; &= \fac E_t/c; n_2 \sin \theta\tsub tran; \\
n_1\sin\theta\tsub inc; (E_i + E_r) &= E_t n_2 \sin\theta\tsub tran;
]]
$$
since from Snell's Law, we know that $n_1 \cdot \sin\theta\tsub inc; = n_2 \cdot \sin\theta_2$ therefore
$$
E_i + E_r = E_t
$$

##### (c)

We know from the fact that $E_\parallel$ is continuous:
$$
\vec E_{\parallel, 1} = \vec E_{\parallel, 2} \\
E_i + E_r = E_t
$$

##### (d)

Since we know from the fact that $H_\parallel$ is continuous:
$$
\vec H_{\parallel, 1} = \vec H_{\parallel, 2} \\
\vec B_i + \vec B_r = \vec B_t \\
B_i \cos\theta\tsub inc; - B_r \cos\theta\tsub inc; = B_t \cos\theta\tsub tran;\\
\fac E_i/c; n_1 \cos\theta\tsub inc; - \fac E_r/c; n_1 \cos\theta\tsub inc; = \fac E_t/c; n_2 \cos\theta\tsub tran; 
$$
so that
$$
n_1(E_i - E_r) \cos\theta\tsub inc; = n_2 E_t \cos\theta \tsub tran;
$$

##### (e)

e see that the equation we get from $(b)$ and $(c)$ is actually the same (so that they are degenerate). To solve the equation, we have
$$
E_i + E_r = E_t \\
n_1(E_i - E_r) \cos\theta\tsub inc; = n_2 E_t \cos\theta \tsub tran;
$$
That means
$$
1 + \fac E_r/E_i; = \fac E_t/E_i; \\
1 - \fac E_r/E_i; = \fac E_t/E_i; \fac n_2 \cos\theta \tsub tran; / {n_1 \cos\theta \tsub inc;};
$$
and therefore
$$
\(1 + \fac n_2 \cos\theta \tsub tran; / {n_1 \cos\theta \tsub inc;};); \fac E_t/E_i; = 2\\
\fac E_t/E_i; = \fac 2n_1 \cos\theta\tsub inc; / {n_1\cos\theta\tsub inc; + n_2 \cos \theta \tsub tran;}; = \fac 2n_1 \cos\theta\tsub inc; / {n_1\cos\theta\tsub inc; + \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};
$$
and we find that
$$
\fac E_r/E_i; = \fac E_t/E_i; -1 = \fac n_1 \cos\theta\tsub inc; - \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;} / {n_1\cos\theta\tsub inc; + \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};
$$

##### (f)

we see that
$$
R = \(\fac n_1 \cos\theta\tsub inc; - \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;} / {n_1\cos\theta\tsub inc; + \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};);^2
$$

##### (g)

$$
T = \fac n_2/n_1; \fac \cos\theta\tsub tran;/{\cos\theta\tsub inc;}; \(\fac 2n_1 \cos\theta\tsub inc; / {n_1\cos\theta\tsub inc; + \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}};);^2
$$

We see that
$$
T = \fac 4 n_1 n_2 \cos\theta \tsub tran;  \cos\theta \tsub inc;/ {\({n_1\cos\theta\tsub inc; + \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}});}^2;
$$
Let $a = n_1 \cos\theta\tsub inc;$. Let $b = \sqrt {n_2^2 - n_1^2 \sin^2 \theta\tsub inc;}$, we see that $b = n_2 \cos \theta \tsub tran;$. 

Therefore


$$
R + T = \(\fac a - b / a + b;);^2 + \fac 4ab/(a + b)^2; = 1
$$
this is true because energy is conserved $(S\tsub inc; = S\tsub ref; + S\tsub tran;)$. (Similar to the case in Lecture 37 Page 10)





