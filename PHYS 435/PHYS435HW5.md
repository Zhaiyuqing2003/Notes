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

Using method of images, we know for every charge that is above the plane $(x, y, z)$, there is a image charge below the plane $(x, y, -z)$. Therefore, the green function is
$$
G(\vec r, \vec r') = \invsqrt {(x - x')^2 + (y - y')^2 + (z - z')^2} - \invsqrt {(x - x')^2 + (y - y')^2 + (z + z')^2}
$$

##### (b)

Just taking the derivative
$$
\pderi G(\vec r, \vec r')/z'; = (z - z')((x - x')^2 + (y - y')^2 + (z - z')^2)^{-3/2} + (z + z')((x - x')^2 + (y - y')^2 + (z + z')^2)^{-3/2}
$$

##### (c)

If $z' = 0$, then
$$
\pderi G(\vec r, \vec r')/z'; = 2z ((x - x')^2 + (y - y')^2 + z^2)^{-3/2}
$$

##### (d)

We know that
$$
V(r) = \inv {4\pi \varepsilon_0} \int_\V G(\vec r, \vec r') \rho(\vec r') \d^3 r' + \inv {4\pi} \int_{\partial \V} \hat m ' \cdot \grad_{r'} G(\vec r, \vec r') V(\vec r') \d a'
$$
Since we are only considering the potential due to volatage biased disk, then
$$
V(r) = \inv {4\pi} \int_{\partial \V} \hat m ' \cdot \grad_{r'} G(\vec r, \vec r') V(\vec r') \d a'
$$
We notice that the $\hat m'$ is just $\hat z$ in this case (the normal vector on the boundary), and therefore the $\hat m ' \cdot \grad_{r'} G(\vec r, \vec r')$ is just $\pderi G(\vec r, \vec r')/z';$. On the boundary it's when $z = 0$, so that's just what we got at in part $(c)$. Thus,
$$
V(r) = \inv {4\pi} \int_{\partial \V} \.\pderi G(\vec r, \vec r')/z';|;_{z'=0} V(\vec r ') \d a'
$$
The $V(\vec r')$ is only $V$ when it's in the disk, therefore
$$
V(r) = \fac V/4\pi; \int\tsub sphere; 2z ((x - x')^2 + (y - y')^2 + z^2)^{-3/2} \d a'
$$

##### (e)

Since we only care about the $V(r)$ along $x$ axis, so that $x = 0$ and $y = 0$. Using the cylindrical coordinate, we could write $x'^2 + y'^2 = s'^2$
$$
\align[[
V(r) &= \fac zV/2\pi; \int_0^R \int_0^{2\pi} \fac s'/(s'^2 + z^2)^{3/2}; \d\theta\d s \\
&= zV \int_0^R  \fac s'/(s'^2 + z^2)^{3/2}; \d s \\
&= zV(\inv z - \invsqrt {z^2 + R^2}) \\
&= V(1 - \fac z/\sqrt {z^2 + R^2};)
]]
$$
If $z \ll R$, (i.e., just above origin) then
$$
V(r) \approx V(1 - \fac 0/\sqrt {0^2 + R^2} ;) = V
$$
It matches the intuition, because as the voltage gradually "propagates" to the space above the plane, its potential decrease gradually to $0$ (when reaches infinity). If it's close to the disk, its potential should be close to potential of the disk (that is, just $V$ approximately). Or, if we want to be more accurate on our approxiamation, we could do a taylor expansion and see
$$
V(r) = V(1 - \fac z/R; + \fac z^2/2R^3; + \cdots)
$$
since $z \ll R$, we only keep the linear team and it is
$$
V(r) = V(1 - \fac z/R;)
$$
this could be understand as: when the $z \ll R$, all the influence from the $V=0$ conductor outside this charged biased circle could be ignored, and this situation is similar to the top/bottom plate of the capacitor.  (where the potential linearly decreased)



##### (f)

Set $V(r)$ to $k V$, define $l = 1-k$
$$
V(r) = V(1 - \fac z/\sqrt {z^2 + R^2};) = kV \\
\fac z/\sqrt {z^2 + R^2}; = l\\
\(\fac z/l;);^2 = z^2 + R^2 \\
z = R\sqrt {\fac l^2/1-l^2;}
$$
 therefore, set $k = 1/2, 1/4, 1/16$. therefore, $l = 1/2, 3/4, 15/16$, we get
$$
z_{1/2} = \fac 1/\sqrt 3;R \\
z_{1/4} = \fac 3/\sqrt 7;R \\
z_{1/16} = \fac 15/\sqrt {31};R
$$

##### (g)

we see that
$$
\begin{align}
V(r) &= V(1 - \fac z/\sqrt {z^2 + R^2};) \\
&= V \(1- (1- \fac R^2/z^2;)^{-1/2}); \\
&\approx V (1-1 +\half \fac R^2/z^2;) \\
&= \fac VR^2/2z^2;
\end{align}
$$
We see that the $V \sim \dfac 1/z^2;$



#### Problem 2

##### (a)

We know that the monopole moment is $Q\tsub total; = 0$. The dipole moment is
$$
\vec p = Q((a\hat x + a\hat y) + (-a\hat x - a\hat y)) - Q((-a\hat x +a\hat y) + (a\hat x  - a\hat y)) = \vec 0
$$
is a zero vector. 

##### (b)

We know that
$$
\align[[
Q_{xx} &= \half \int \rho(r') (2x'^2  - y'^2  -z'^2)\d^3 r'\\
&= \half \cdot Q \iiint\tsub cartisan; (\delta(x' - a) \delta(y' -a)\delta(z') + \delta(x'+a)\delta(y'+a)\delta(z'))(2x'^2 - y'^2 -z'^2) \d x' \d y' \d z' \\
&+ \half \cdot (-Q) \iiint\tsub cartisan; (\delta (x'+a)\delta(y'-a)\delta(z') + \delta(x'-a)\delta(y'+a)\delta(z'))(2x'^2 - y'^2 -z'^2)\d x'\d y' \d z' \\
&= \half Q (2a^2 -a^2 + 2a^2 -a^2) -\half Q(2a^ 2-a^2 +2a^2 -a^2) = 0
]]
$$
for $Q_{yy}$, we have
$$
Q_{yy} = \half Q (2a^2 -a^2 + 2a^2 -a^2) - \half Q(2a^ 2-a^2 +2a^2 -a^2) = 0
$$
and for $Q_{zz}$, we have
$$
Q_{zz} = \half Q(-a^2 - a^2 -a^2 -a^2) - \half Q(-a^2 - a^2 -a^2 -a^2) = 0
$$

##### (c) 

From the symmatrical property of $Q$, we know that $Q_{xy} = Q_{yx}$. So, we only solve for $Q_{xy}$:
$$
\align[[
Q_{xy} &= \half \int \rho(r') (3x'y')\d^3 r'\\
&= \half \cdot Q \iiint\tsub cartisan; (\delta(x' - a) \delta(y' -a)\delta(z') + \delta(x'+a)\delta(y'+a)\delta(z'))(3x'y') \d x' \d y' \d z' \\
&+ \half \cdot (-Q) \iiint\tsub cartisan; (\delta (x'+a)\delta(y'-a)\delta(z') + \delta(x'-a)\delta(y'+a)\delta(z'))(3x'y')\d x'\d y' \d z' \\
&=\half Q (3a^2 + 3a^2) - \half Q(-3a^2 -3a^2) = 6Qa^2
]]
$$

##### (d)

We know that
$$
\align[[
Q_{xx} &= \half \int \rho(r') (2x'^2  - y'^2  -z'^2)\d^3 r'\\
&= \half \cdot Q \iiint\tsub cartisan; (\delta(x' - \sqrt 2a) \delta(y')\delta(z') + \delta(x'+\sqrt 2 a)\delta(y')\delta(z'))(2x'^2 - y'^2 -z'^2) \d x' \d y' \d z' \\
&+ \half \cdot (-Q) \iiint\tsub cartisan; (\delta (x')\delta(y'-\sqrt 2 a)\delta(z') + \delta(x')\delta(y'+\sqrt 2 a)\delta(z'))(2x'^2 - y'^2 -z'^2)\d x'\d y' \d z' \\
&= \half Q (4a^2 + 4a^2) - \half Q(-2a^2 - 2a^2) = 6Qa^2
]]
$$
Also
$$
\align[[
Q_{yy} &= \half \int \rho(r') (2y'^2  - x'^2  -z'^2)\d^3 r'\\
&= \half \cdot Q \iiint\tsub cartisan; (\delta(x' - \sqrt 2a) \delta(y')\delta(z') + \delta(x'+\sqrt 2 a)\delta(y')\delta(z'))(2y'^2 - x'^2 -z'^2) \d x' \d y' \d z' \\
&+ \half \cdot (-Q) \iiint\tsub cartisan; (\delta (x')\delta(y'-\sqrt 2 a)\delta(z') + \delta(x')\delta(y'+\sqrt 2 a)\delta(z'))(2y'^2 - x'^2 -z'^2)\d x'\d y' \d z' \\
&= \half Q (-2a^2 + -2a^2) - \half Q(4a^2 + 4a^2) = -6Qa^2
]]
$$
From the symmatrical property of $Q$, we know that $Q_{xy} = Q_{yx}$. So, we only solve for $Q_{xy}$:
$$
\align[[
Q_{xy} &= \half \int \rho(r') (3x'y')\d^3 r'\\
&= \half \cdot Q \iiint\tsub cartisan; (\delta(x' - \sqrt 2a) \delta(y')\delta(z') + \delta(x'+\sqrt 2 a)\delta(y')\delta(z'))(3x'y') \d x' \d y' \d z' \\
&+ \half \cdot (-Q) \iiint\tsub cartisan; (\delta (x')\delta(y'-\sqrt 2 a)\delta(z') + \delta(x')\delta(y'+\sqrt 2 a)\delta(z'))(3x'y')\d x'\d y' \d z' \\
&= \half Q \cdot 0 - \half Q \cdot 0 = 0
]]
$$

##### (e)

The original tensor is
$$
Q = \(\matrix{0 & 6Qa^2  \\ 6Qa^2 & 0});
$$
and the rotated one is
$$
Q' = \(\matrix{6Qa^2 & 0 \\ 0 & -6Qa^2});
$$
the corresponding $2\text{x} 2$ matrix is actually
$$
R = \(\matrix{
\cos \theta & -\sin \theta \\
\sin \theta & \cos \theta\\
});
$$
and we could apply this on the tensor we have to see it actually works
$$
RQ = \(\matrix{
\cos -\fac \pi/2; & -\sin -\fac \pi/2; \\
\sin -\fac \pi/2; & \cos -\fac \pi/2; \\
});\(\matrix{0 & 6Qa^2  \\ 6Qa^2 & 0}); = \(\matrix{
0 & 1\\
-1 & 0\\
});\(\matrix{0 & 6Qa^2  \\ 6Qa^2 & 0}); = \(\matrix{6Qa^2 & 0 \\ 0 & -6Qa^2}); = Q'
$$
So it indeed works.

For the more general 3d rotational case. The rotation matrix is
$$
R=  R_z(\alpha)R_y(\beta) R_x(\gamma) = \(\matrix{
\cos \alpha & -\sin \alpha & 0 \\
\sin \alpha & \cos \alpha & 0 \\
0 & 0 & 1
});\(\matrix{
\cos \beta & 0 & \sin \beta \\
0 & 1 & 0 \\
-\sin \beta & 0 & \cos \beta
});\(\matrix{
1 & 0 & 0 \\
0 & \cos \gamma & -\sin \gamma \\
0 & \sin \gamma & \cos \gamma
});
$$
where each part is yaw, pitch, roll. The 2d rotation case only use the first matrix. (That is, $\beta = 0$ and $\gamma  = 0$)

