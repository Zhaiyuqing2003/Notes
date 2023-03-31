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
$$

####  Problem 1

##### (a)

We know that $\vec J_B = \vec \nabla \cross \vec M$ and $\vec M = M_0 \hat z$. Therefore, 
$$
\vec J_B = \vec \nabla \cross \vec M = 0
$$

##### (b)

We know that $\vec K_B = \vec M \cross \hat n$. We see that on the sphere, $\hat n = \hat r$ and therefore
$$
\vec K_B = \vec M \cross \hat n = M_0(\cos \theta \hat r - \sin \theta \hat \theta) \cross \hat r   = M_0 \sin \theta \hat \phi
$$

##### (c)

We see such a sphere, when rotating, must satisfy that $\vec J_B = 0$ and $\vec K_B =  M_0 \sin\theta (\cos\phi \hat y - \sin\phi \hat x )$. This means there should only be surface charge density (otherwise the $\vec J_B$ will not equal to $0$). We know that at point $(R, \theta, \phi)$ on the surface of the sphere:
$$
\vec K_B = \sigma \vec v = \sigma R \sin \theta \omega \hat \phi
$$
 and therefore the relationship that
$$
\sigma = \fac M_0/\omega R;
$$

##### (d)

We know that $\vec J_B = \vec \nabla \cross \vec M$ and $\vec M = M_0 \hat z$. Therefore, 
$$
\vec J_B = \vec \nabla \cross \vec M = 0
$$

Same as $(a)$.

Also, for the side of the cylinder, we see that $\hat n = \hat s$ and therefore
$$
\vec K\sub B, \text {side}; = \vec M \cross \hat n = M_0 \hat z \cross \hat s = M_0 \hat \phi
$$
and for the top and bottom of the cylinder, we see that $\hat n = \pm \hat z$ and therefore
$$
\vec K\sub B, \text {tb}; = \vec M \cross \hat n = M_0 \hat z \cross (\pm\hat z) = 0
$$

##### (e)

We see that it should only have surface charge density otherwise it would product non-zero $\vec J_B$. We see that on the side of the 
$$
\vec K\sub B, \text {side}; = \sigma\tsub side; \vec v = \sigma\tsub side; R \omega \hat \phi
$$
and therefore
$$
\sigma{\tsub side;} = \fac M_0/\omega R;
$$
and on the top / bottom of the cylinder
$$
\vec K\sub B, \text {tb}; = \sigma\tsub tb; \vec v = \sigma\tsub tb; r \omega \hat \phi
$$
we see that
$$
\sigma\tsub tb; r \omega = 0
$$
we see that $\omega$ is not zero, and $0 \le r \le R$. That means we must make the $\sigma\tsub tb; = 0$. That means $\sigma\tsub tb; = 0$. (There is only charge density on the side, but not on the top and bottom)

##### (f)

We know that $\vec J_B = \vec \nabla \cross \vec M$ and $\vec M = M_0 \hat z$. Therefore, 
$$
\vec J_B = \vec \nabla \cross \vec M = 0
$$

This is also same as $(a)$

We see that on the six side of the cube, the normal vector is:\
$$
\hat n\tsub left; = -\hat x \qquad \hat n\tsub right; = \hat x \\
\hat n\tsub front; = -\hat y \qquad \hat n\tsub back; = \hat y \\
\hat n\tsub top; = \hat z \qquad \hat n\tsub bottom; = -\hat z
$$
and therefore
$$
\align[[
\vec K\sub B, \text {left}; &= M_0 \hat z \cross (-\hat x) = -M_0 \hat y \\
\vec K\sub B, \text {right}; &= M_0 \hat z \cross \hat x = M_0 \hat y \\
\vec K\sub B, \text {front}; &= M_0 \hat z \cross (-\hat y) = M_0 \hat x \\
\vec K\sub B, \text {back}; &= M_0 \hat z \cross \hat y = -M_0 \hat x \\
\vec K\sub B, \text {top}; &= M_0 \hat z \cross \hat z = 0 \\
\vec K\sub B, \text {left}; &= M_0 \hat z \cross (-\hat z) = 0 \\
]]
$$
and we see that in this case, on the left side of the cube, we have
$$
\vec K\sub B, \text {left}; = \sigma\tsub left; \vec v = \sigma\tsub left; r \omega \hat \phi
$$






