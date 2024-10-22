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

In cylindrical coordinate, we have
$$
\grad^2 V(\vec r) = \fac 1/s; \pderi /s; (s \pderi f/s;) + \inv {s^2}\ppderi f/\theta; + \ppderi f/z; = 0
$$

##### (b)

We write $V(\vec r) = V(s, \theta) = S(s)\Theta(\theta)$, and then we have
$$
\grad^2 V(\vec r) = \fac 1/s; \Theta(\theta) \pderi /s; (s \pderi S/s;) + \inv {s^2} S(s) \ppderi \Theta/\theta; = 0
$$
divide both side by $S(s)\Theta(\theta)$, we get
$$
\fac 1/s \cdot S(s); \pderi /s; (s \pderi S/s;) + \fac 1/s^2 \Theta(\theta); \ppderi \Theta/\theta; = 0
$$
we could multiply both side by $s^2$, 
$$
\fac s/S(s); \pderi /s; (s \pderi S/s;) + \fac 1/ \Theta(\theta); \ppderi \Theta/\theta; = 0
$$
and thus we get the equation of $s$ part and $\theta$ part:
$$
\fac s/S(s); \pderi /s; (s \pderi S/s;) \quad \txt and; \quad  \fac 1/ \Theta(\theta);\ppderi \Theta/\theta;
$$
We set the $s$ part to positive the attenuation of force from the sphere surface, and thus the $\theta$ should be negative. Let's set the $s$ part constant be $m^2$ and $\theta$ part constant to be $-m^2$. 

##### (c)

We transform the part into
$$
s\pderi S/s;+ s^2 \ppderi S/s; =  m^2S(s)
$$
this is
$$
s^2S'' + sS' - m^2S = 0
$$
Try solution $S = C_ms^m$. Then, we get
$$
C_m s^m(m(m-1) + m - m^2) = 0 \\
s^{m} \cdot 0 = 0
$$
which satisfy the equation. So, we get:
$$
S_m = C_m s^m
$$

##### (d)

We solve the $\theta$ part first:
$$
\ppderi \Theta/\theta; = -m^2\Theta(\theta)
$$
and we have
$$
\Theta(\theta) = P_m \cos m\theta  + Q_m\sin m\theta
$$
we need to impose the boundary condition $\Theta(\theta = 0) = \Theta(\theta = 2n\pi )$. This means
$$
\Theta(0) = \Theta(2n\pi) = P_m
$$
and we find that $\cos m \cdot 2n\pi = 1$, and this indicates that $m\cdot 2n \pi$ needs to be a multiple of $2\pi$ for all $n$. That means $m$ must also be an integer. This means the solution in $(c)$ will always have integer exponent (the $r^m$). This also means the number of solution (with respect to different $m$) is countably infinite, and we could express them using a summation.



##### (e)

Combine the solution we have
$$
V(s, \theta) = \sum_{m = -\infin}^{\infin} s^m (A_m \cos m\theta  + B_m\sin m\theta)
$$
where $A_m = P_mC_m$ and $B_m = Q_mC_m$, we merge them together for two constant is already enough. We notice that outside the cylinder, we should get $V(\infin, \theta) = 0$, and that means any $m > 0$ term needs to be $0$. Therefore, we get
$$
V(s, \theta) = \sum_{m = -\infin}^{0} s^m (A_m \cos m\theta  + B_m\sin m\theta)
$$


##### (f) 

Similarly, in this case we are inside the cylinder, we expect the $V$ is close to the boundary condition as $r$ increase, so all $m < 0$ term needs to be $0$. We get
$$
V(s, \theta) = \sum_{m = 0}^{\infin} s^m (A_m \cos m\theta  + B_m\sin m\theta)
$$


##### (g)

we consider the boundary condition when the $s = R$, and $V(\theta) = V_0(\sin^2(\theta) - \cos^2(\theta))$. Then, we get
$$
V\tsub in; = \sum_{m = 0}^{\infin} R^m (A_m \cos m\theta  + B_m\sin m\theta)
$$
and we notice that this is similar to Fourier series (only be a constant). Then we could do
$$
A_m = \inv {R^m} \inv {\pi} \int_{-\pi}^{\pi} V\tsub in; \cos (m \theta) \d \theta \\
B_m = \inv {R^m} \inv {\pi} \int_{-\pi}^{\pi} V\tsub in; \sin (m\theta) \d \theta \\
$$
and we get
$$
A_m = \fac 1/\pi; \fac V_0/R^m; \int_{-\pi}^{\pi} (\sin^2(\theta) - \cos^2(\theta)) \cos (m \theta) \d \theta = -\fac 1/\pi; \fac V_0/R^m;\dfrac{2m\sin\left({\pi}m\right)}{m^2-4} \\
B_m = \fac 1/\pi; \fac V_0/R^m; \int_{-\pi}^{\pi} (\sin^2(\theta) - \cos^2(\theta)) \sin (m \theta) \d \theta =0
$$
and thus
$$
V\tsub in;(s, \theta) = -\fac V_0/\pi;\sum_{m = 0}^{\infin} \fac s^m/R^m;\dfrac{2m\sin\left({\pi}m\right)}{m^2-4} \cos m\theta
$$
do the same for $V\tsub out;$:
$$
V\tsub out; = \sum_{m = -\infin}^{0} R^m (A_m \cos m\theta  + B_m\sin m\theta)
$$
It should have the same coefficient, and yield the similar result (since only the summation start and end is different):
$$
V\tsub out; = -\fac V_0/\pi;\sum_{m = -\infin}^{0} \fac s^m/R^m;\dfrac{2m\sin\left({\pi}m\right)}{m^2-4} \cos (m\theta)
$$
We could do some simplification by let $n = -m$. Then $\cos(n\theta) = \cos(m\theta)$ and $\sin(n\pi) = -\sin (m\pi)$.
$$
V\tsub out; = -\fac V_0/\pi;\sum_{n = 0}^{\infin} \fac R^n/s^n;\dfrac{2(-n)\cdot (-\sin\left({n\pi}\right))}{n^2-4} \cos (n\theta) \\
= -\fac V_0/\pi;\sum_{m = 0}^{\infin} \fac R^m/s^m;\dfrac{2m \sin\left({m\pi}\right)}{m^2-4} \cos (m\theta)
$$


#### Problem 2

We know that the $V$ has the form of (when not depend on $\phi$)
$$
V(r, \theta) = \sum_{l = 0}^{\infin} (A_l r^l + \frac{B_l}{r^{l + 1}}) P_l(\cos \theta)
$$

##### Inside

Since the term $\fac B_l/ r^{l+1};$ vanish as $r$ increase, this term could not be present when considering $V$ insider the sphere. Therefore, set $B_l = 0$, and we get
$$
V(r, \theta) = \sum^{\infin}_{l = 0} A_lr^lP_l(\cos\theta)
$$
We know that
$$
\int_{-1}^{1}\d x P_l(x) P_l'(x) = \fac 2/2l+1; \delta_{ll'} \\
$$
Let $x = \cos \theta$, then $\d x = -\sin\theta \d \theta$, and thus
$$
\int_{-1}^{1}\d x P_l(x) P_l'(x) = \ \int_{\pi}^{0} -P_l(\cos\theta) P_{l'}(\cos \theta) \sin\theta \d \theta = \int_{0}^{\pi} P_l(\cos\theta) P_{l'}(\cos \theta) \sin\theta \d \theta
$$
and thus
$$
V(r, \theta) = \sum^{\infin}_{l = 0} A_lr^lP_l(\cos\theta) \\
\int_0^{\pi}\d\theta \sin\theta P_m(\cos \theta) V(r, \theta) = \sum^{\infin}_{l = 0} A_lr^l\int_0^{\pi}\d\theta P_m(\cos \theta)  P_l(\cos\theta)\sin\theta  \\
\int_0^{\pi}\d\theta \sin\theta P_m(\cos \theta) V(r, \theta) = \sum^{\infin}_{l = 0} A_lr^l \fac 2/2l+1; \delta_{lm} \\
A_mr^m \fac 2/2m+1; = \int_0^{\pi}\d\theta \sin\theta P_m(\cos \theta) V(r, \theta)
$$
since this happened on the boundary of the sphere, that is $r = R$, then
$$
A_m = \fac 2m + 1/2R^m; \int_0^{\pi} V(\theta) P_m(\cos\theta) \sin\theta \d \theta
$$
Plug in the $V(\theta)$, we get
$$
A_m = \fac 2m + 1/2R^m; \int_0^{\pi} V_0 \cos^3(\theta) P_m(\cos\theta) \sin\theta \d \theta \\
$$
Let $x = \cos\theta$, and $\d x = -\sin\theta \d \theta$, and thus
$$
A_m = \fac 2m + 1/2R^m; V_0\int_{-1}^{1}  P_m(x)x^3   \d x \\
$$
and thus we have
$$
V(r, \theta) = \sum^{\infin}_{l = 0} \(\fac 2l + 1/2R^l; V_0\int_{-1}^{1}  P_l(x)x^3   \d x );r^lP_l(\cos\theta)
$$
**Outside**

Since we know that $V(\infin) = 0$, so the term $A_l r^l$ must be $0$, and thus we set $A_l = 0$. We get
$$
V(r, \theta) = \sum^{\infin}_{l = 0} \frac{B_l}{r^{l + 1}}P_l(\cos\theta)
$$
Similarly, following the same process in $(a)$, we have
$$
\int_0^{\pi}\d\theta \sin\theta P_m(\cos \theta) V(r, \theta) = \sum^{\infin}_{l = 0}\frac{B_l}{r^{l + 1}}\fac 2/2l+1; \delta_{lm} \\
$$
and thus
$$
\frac{B_m}{r^{m + 1}}\fac 2/2m+1; = \int_0^{\pi}\d\theta \sin\theta P_m(\cos \theta) V(r, \theta) \\
$$
and thus
$$
B_m =\fac 2m + 1/2; R^{m + 1} V_0\int_{-1}^{1}  P_m(x)x^3   \d x \\
$$
therefore
$$
V(r, \theta) = \sum^{\infin}_{l = 0} \frac{1}{r^{l + 1}}\(\fac 2l + 1/2; R^{l + 1} V_0\int_{-1}^{1}  P_l(x)x^3   \d x); P_l(\cos\theta)
$$
**Surface Charge Density**

We know that
$$
[E^\perp\tsub out; (r, \theta) - E^\perp\tsub in;(r, \theta)]_{r = R} = \fac \sigma(\theta) / \epsilon_0;
$$
and in this case it becomes
$$
\left[\pderi V\tsub out; (r, \theta)/r; - \pderi V\tsub in;(r, \theta)/r;\right]_{r = R} = - \fac \sigma(\theta) / \epsilon_0;
$$
and the derivative for $V\tsub out;$ and $V\tsub in;$
$$
V\tsub out;(r, \theta) = \sum^{\infin}_{l = 0} \(\fac 2l + 1/2R^l; V_0\int_{-1}^{1}  P_l(x)x^3   \d x );r^lP_l(\cos\theta) \\
\pderi V\tsub out; (r, \theta)/r; = \sum^{\infin}_{l = 1}l \(\fac 2l + 1/2R^l; V_0\int_{-1}^{1}  P_l(x)x^3   \d x );r^{l - 1}P_l(\cos\theta) \\
\left.\pderi V(r, \theta)\tsub out;/r; \right|_{r = R} = \sum^{\infin}_{l = 1} \(l(2l + 1) );\fac  V_0/2R;\(\int_{-1}^{1}  P_l(x)x^3   \d x  ); P_l(\cos\theta) \\
= \sum^{\infin}_{l = 0} \(l(2l + 1) );\fac  V_0/2R;\(\int_{-1}^{1}  P_l(x)x^3   \d x  ); P_l(\cos\theta)
$$
notice the change of start of summation ($l = 0$ / $l = 1$).

and that
$$
V\tsub in;(r, \theta) = \sum^{\infin}_{l = 0} \frac{1}{r^{l + 1}}\(\fac 2l + 1/2; R^{l + 1} V_0\int_{-1}^{1}  P_l(x)x^3   \d x); P_l(\cos\theta) \\
\pderi V\tsub in; (r, \theta)/r; = \sum^{\infin}_{l = 0} -(l + 1) \frac{1}{r^{l + 2}}\(\fac 2l + 1/2; R^{l + 1} V_0\int_{-1}^{1}  P_l(x)x^3   \d x); P_l(\cos\theta) \\
\left.\pderi V(r, \theta)\tsub in;/r; \right|_{r = R} = \sum^{\infin}_{l = 0} -(l + 1)(2l + 1) \frac{V_0}{2R}\( \int_{-1}^{1}  P_l(x)x^3   \d x); P_l(\cos\theta)
$$
and thus we get
$$
\left[\pderi V\tsub out; (r, \theta)/r; - \pderi V\tsub in;(r, \theta)/r;\right]_{r = R} = \sum^{\infin}_{l = 0} \(-l(2l + 1) - (l + 1)(2l + 1));\fac  V_0/2R;\(\int_{-1}^{1}  P_l(x)x^3   \d x  ); P_l(\cos\theta) \\
= \sum^{\infin}_{l = 0} -(2l + 1)^2\fac  V_0/2R;\(\int_{-1}^{1}  P_l(x)x^3   \d x  ); P_l(\cos\theta)
$$
which means
$$
\sigma(\theta) = \epsilon_0 \sum^{\infin}_{l = 0} (2l + 1)^2\fac  V_0/2R;\(\int_{-1}^{1}  P_l(x)x^3   \d x  ); P_l(\cos\theta)
$$
