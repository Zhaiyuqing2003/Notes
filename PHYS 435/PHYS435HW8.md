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

We see that on the six side of the cube, the normal vector is:
$$
\hat n\tsub side; = \hat s \\
\hat n\tsub top; = \hat z \qquad \hat n\tsub bottom; = -\hat z
$$
and therefore
$$
\align[[
\vec K\sub B, \text {side}; &= M_0 \hat z \cross \hat s = M_0 \hat \phi \\
\vec K\sub B, \text {top}; &= M_0 \hat z \cross \hat z = 0 \\
\vec K\sub B, \text {bottom}; &= M_0 \hat z \cross (-\hat z) = 0 \\
]]
$$
we see that on the side of the cube, the distance to the z-axis is
$$
s\tsub left;(\phi) = -a\sec \phi \\
s\tsub right;(\phi) = a\sec \phi \\
s\tsub front;(\phi) = -a\csc \phi \\
s\tsub back;(\phi) = a\csc\phi
$$
and we see that in this case, on the side of the cube, we have
$$
\vec K\sub B, \text {left}; = \sigma\tsub left; \vec v = \sigma\tsub left; s\tsub left;(\phi) \omega \hat \phi \\
$$

and thus we have
$$
\sigma\tsub left;(\phi) = \fac M_0/ s{\tsub left;}(\phi) \omega; =  -\fac M_0/a\sec(\phi) \omega; \\
$$
and similarly that
$$
\sigma\tsub right;(\phi) = \fac M_0/ s{\tsub right;}(\phi) \omega; =  \fac M_0/a\sec(\phi) \omega; \\
$$

$$
\sigma\tsub front;(\phi) = \fac M_0/ s{\tsub front;}(\phi) \omega; =  -\fac M_0/a\csc(\phi) \omega; \\
$$

$$
\sigma\tsub back;(\phi) = \fac M_0/ s{\tsub back;}(\phi) \omega; =  \fac M_0/a\csc(\phi) \omega; \\
$$

the intuition here is that the part where it's farer from the z-axis (it rotate faster), the charge density is smaller.

and we see that the on the top and bottom side of the cube, the
$$
\sigma\tsub tb; s\tsub tb;(\phi) \omega = 0 
$$
and therefore $\sigma\tsub tb; = 0$

#### Problem 2

##### (a)

We know that in the case where paramagnet is placed in an external potential field, there is no free current.

We know that
$$
\vec H\tsub out; = \fac \vec B\tsub out;/\mu_0; = \fac B_0/\mu_0;(\cos\theta \hat x + \sin\theta \hat z)
$$
Therefore, we know that $\vec H^\parallel\tsub out; = \vec H^\parallel\tsub in ; = \fac B_0/\mu_0; \cos\theta \hat x $

We know that at boundary, the $\vec B^\perp\tsub in; =\vec B^\perp\tsub out; =B_0 \sin\theta \hat z $.

Since we know that inside the paramagnet the $\vec B\tsub in; = \mu_0(1 + \chi_m)\vec H\tsub in;$. That means
$$
\vec B^\parallel\tsub in; = \mu_0(1 + \chi_m) \vec H^\parallel\tsub in; = \mu_0(1 + \chi_m)\fac B_0/\mu_0; \cos\theta \hat x  = B_0(1 + \chi_m)\cos\theta \hat x
$$
and therefore
$$
\vec B\tsub in; = B_0((1 + \chi_m) \cos\theta \hat x + \sin\theta\hat z)
$$

##### (b)

We use the formula that
$$
\vec B\tsub in; = \mu_0(1 + \chi_m )\vec H\tsub in;
$$
and therefore
$$
\vec H = \fac B_0/\mu_0; (\cos\theta\hat x + \fac \sin\theta/1 + \chi_m; \hat z)
$$

##### (c)

We know that in this case the $\vec H$ in the slab is
$$
\vec H\tsub out; = \fac B_0\hat z/\mu_0(1 + \chi_m);
$$
Using the method mentioned in Lecture 28. We define a $\vec H = -\vec \nabla \phi_m(\vec r)$, and we could therefore solve the equation
$$
\phi_m(\vec r) = \sum_{i = 0}^{l} (A_lr^l + \fac B_l/r^{l+1};)P_l(\cos \theta)
$$
So, in the outside of the sphere, we see as $r \to \infin$, the
$$
\phi_m(\vec r) = -\fac B_0/\mu_0(1 + \chi_m); z
$$
therefore, to satisfy the boundary condition, only $l = 1$ term remains.

we have 
$$
\phi_{m, \text {out}}(\vec r) = \alpha\tsub out; r \cos \theta  + \fac \beta\tsub out;/r^2;\cos \theta
$$
and the following must be true
$$
\alpha\tsub out; r\cos\theta = -\fac B_0/\mu_0(1 + \chi_m); z
$$
we see that $r\cos\theta = z$ and therefore
$$
\alpha\tsub out; = -\fac B_0/\mu_0(1 + \chi_m);
$$
Inside the sphere we find that 
$$
\phi_{m, \text {in}}(\vec r) = \alpha\tsub in; r \cos \theta  + \fac \beta\tsub in;/r^2;\cos \theta
$$
and since $\phi_{m, \text{in}} (\vec r)$ should be a finite value as $r \to 0$, we see $\beta\tsub in; = 0$

From the lecture 28 notes, we see that
$$
\vec B\tsub out; \cdot \hat n = \vec B\tsub in; \cdot \hat n
$$
and
$$
\mu_0 (1 + \chi_m) \vec H\tsub out; \cdot \hat n = \mu_0 \vec H\tsub in; \cdot \hat n
$$
then
$$
(1+ \chi_m)\pderi \phi_{m, \text {out}}(\vec r)/r; = \pderi \phi_{m, \text {in}}(\vec r);/r; \\
(1+ \chi_m)\pderi /r; \(\alpha\tsub out; r  + \fac \beta\tsub out;/r^2;); = \pderi /r; (\alpha\tsub in; r)  \\
(1+ \chi_m)(\alpha\tsub out;  - \fac 2 \beta\tsub out;/r^3;) =  \alpha\tsub in;  \\
$$
evaluated at $r = R$
$$
(1+ \chi_m)(\alpha\tsub out;  - \fac 2 \beta\tsub out;/R^3;) =  \alpha\tsub in;
$$
and then
$$
-\fac B_0/\mu_0(1 + \chi_m); - \fac 2 \beta\tsub out;/R^3; = \fac \alpha\tsub in;/ 1+ \chi_m;
$$
 the other boundary condition is that $\vec H_{\text{in}, \parallel} = \vec H_{\text{out}, \parallel}$. We see that
$$
-\fac 1/R; \pderi /\theta; \phi_{m, \text{in}}(\vec r) = -\fac 1/R; \pderi /\theta; \phi_{m, \text{out}}(\vec r)
$$
this giving us
$$
-\fac 1/R; \pderi /\theta; \(\alpha\tsub out; r  + \fac \beta\tsub out;/r^2;);\cos\theta = -\fac 1/R; \pderi /\theta; \alpha\tsub in; r\cos\theta
$$
therefore
$$
\alpha\tsub out; r  + \fac \beta\tsub out;/r^2; = \alpha\tsub in; r
$$
and therefore
$$
\alpha\tsub out;  + \fac \beta\tsub out;/r^3; = \alpha\tsub in;
$$
and thus at $r = R$
$$
-\fac B_0/\mu_0(1 + \chi_m); + \fac \beta\tsub out;/R^3; = \alpha\tsub in;
$$
and therefore
$$
-\fac 3B_0/\mu_0(3 + 2\chi_m); = \alpha\tsub in;
$$
and therefore
$$
\phi_{m, \text{in}} = \alpha\tsub in; r \cos\theta = -\fac 3B_0/\mu_0(3 + 2\chi_m); z
$$

$$
\vec H\tsub in; = -\vec \nabla \phi_{m, \text{in}} = \hat z \fac B_0/\mu_0 (1 + {\fac 2/3; \chi_m});
$$

$$
\vec B\tsub in; = \mu_0 \vec H\tsub in; = \hat z \fac B_0/(1 + {\fac 2/3; \chi_m});
$$

##### (d)

When $\chi_m \to 0$, the $\vec B\tsub in; = B_0 \hat z$. If $\chi_m \to \infin$, $\vec B\tsub in; = 0$. The $\chi_m$ is the magnetic susceptibility of the slab. If it's large, that means the paramagnet slab will generate a huge $M$ for the external $B$. (it's easy to get magnetized)

