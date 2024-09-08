$$
\newcommand\nderi[2]{#1_{#2}}
\newcommand\fxx{\nderi{f}{xx}}
\newcommand\fxy{\nderi{f}{xy}}
\newcommand\fyx{\nderi{f}{yx}}
\newcommand\fyy{\nderi{f}{yy}}
\newcommand\fmm{\nderi{f}{mm}}
\newcommand\fbb{\nderi{f}{bb}}
\newcommand\fmb{\nderi{f}{mb}}
\newcommand\partderi[2]{\frac{\part#1}{\part#2}}
\newcommand\add[2]{\sum^{#1}_{#2}}
$$

# HW Assignment 7

## 14.7:11

$$
\grad{f} = {<}3x^2-3+3y^2, 6xy{>} = \vec{0}
$$
$$
(x, y) = (\pm1, 0) \text{ or } (0, \pm1)
$$
$$
D = \fxx\fyy - \fxy^2 = (6x)(6x) - (6y)^2 = 36x^2 - 36y^2
$$
$$
D(\pm1, 0) > 0, \fxx(1, 0) > 0, \fxx(-1, 0) < 0 \quad D(0, \pm1) < 0
$$
$$
(1, 0): \text{Local minimum, $f(1, 0) = -2$} \\
(-1, 0): \text{Local Maximum, $f(-1, 0) = 2$ } \\
\quad (0,\pm1): \text{Saddle points}
$$

## 14.7:59 (Least Squares Method)

The function that going to minimize is $f=\sum^{n}_{i = 1}d_i^2$
$$
\grad{f} = {<} \partderi{f}{m}, \partderi{f}{b}{>} = {<}\add{n}{i = 1}2(d_i)(-x_i), \add{n}{i = 1}2(d_i)(-1){>} = \vec{0}
$$

Simplifies the equation:
$$
\add{n}{i = 1}x_iy_i = m\add{n}{i = 1}x_i^2 + b\add{n}{i = 1}{x_i}
$$

$$
\add{n}{i = 1}y_i = m\add{n}{i = 1}x_i + nb
$$

Which is exactly the equation that the question stated.
$$
D = \fmm\fbb - \fmb^2 = (2\add{n}{i = 0}x_i^2)(2n) - (\add{n}{i = 0}2x_i)^2 > 0
$$

$$
\fmm = \add{n}{i = 0}2x_i^2 > 0
$$

So, the solution indeed minimize the $f$.

## 14.8:16

$$
\grad{f} = {<} 2x, 4y, 6z {>}
$$

$$
g = x + 2y + 3z - 10
$$

$$
\grad{g} = {<}1, 2, 3{>}
$$

$$
\grad{f} = \lambda\grad{g}
$$

$$
\begin{cases}
2x =\lambda \\
4y = 2\lambda \\
6z = 3\lambda \\
x + 2y + 3z = 10
\end{cases} \to 
\begin{cases}
\lambda = {10 \over 3} \\
x = {5 \over 3} \\
y = {5 \over 3} \\
z = {5 \over 3} \\
\end{cases}
$$

The minimum value for $f$ is $f({5 \over 3}, {5 \over 3}, {5 \over 3}) = {50 \over 3}$.

We could set $y = 0$, and set $x$ to be negative and arbitrarily small, and set $z = {{10 - x} \over 3}$.  Since $x$ could be arbitrarily small, $z$ could be arbitrarily large. $|x|$ and $|z|$ could be arbitrarily large, and the $f$ could be arbitrarily large.

let $\vec{a} = {<}1, \sqrt{2}, \sqrt{3}{>}$ and $\vec{b} = {<}x, \sqrt{2}y, \sqrt{3}z{>}$.
$$
\vec{a} \cdot \vec{b} \leq \abs{a} \abs{b} \\
x + 2y + 3z \leq \sqrt{6} \sqrt{x^2 + 2y^2 + 3z^2} \\
x + 2y + 3z = 10 \\
f \geq {50 \over 3}
$$
 So the minimum of $f$ is $50 \over 3$

## 14.8:28

$$
\grad{P(L,K)} = {<}b\alpha L^{\alpha}K^{1 - \alpha}, b(1-\alpha)L^{\alpha}K^{1-\alpha}{>}
$$

$$
\grad{C(L, K) = {<} m, n {>}}
$$

$$
\grad{C} = \lambda\grad{P} \to 
\begin{cases}
b\alpha L^{\alpha - 1}K^{1 - \alpha} = \lambda m \\
b(1-\alpha)L^{\alpha}K^{-\alpha} = \lambda n \\
bL^\alpha K^{1 - \alpha}  =  Q
\end{cases} \quad \to
\begin{cases}
K = \dfrac{Qm^\alpha(1 - \alpha)^\alpha}{bn^\alpha \alpha^\alpha}  \\
L = \dfrac{Qn^{1 - \alpha}\alpha^{1 - \alpha}}{bm^{1 - \alpha}(1 - \alpha)^{1 - \alpha}}
\end{cases}
$$

The above $K$ and $L$  minimize the cost.

## 14.8:33

$$
d = (x - 4)^2 + (y - 2)^2 + z^2
$$

$$
f=x^2 + y^2 - z^2
$$

$$
\grad{d}= {<} 2(x-4), 2(y - 2), 2z{>}
$$

$$
\grad{f} = {<}2x, 2y, -2z{>}
$$

$$
\grad{d} = \lambda\grad{f} \to
\begin{cases}
2(x - 4) = 2\lambda x \\
2(y - 2) = 2\lambda y \\
2 z = -2\lambda z\\
z^2 = x^2 + y^2
\end{cases} \quad \to
\begin{cases}
x = 2 \\
y = 1 \\
z = \pm\sqrt{5}
\end{cases}
$$

This is correspond to the minimum, so the points on the cone closest to $(4, 2, 0)$ is $(2, 1, \pm\sqrt{5})$

## 14.8:14

$$
f = \add{n}{i = 1}x_i \\ \grad{f} = {<}1, 1, ..., 1{>} 
$$

$$
g = \add{n}{i = 1}x_i^2 - 1\\
\grad{g} = 2{<}x_1, x_2,..., x_n{>}
$$

$$
\grad{f} = \lambda\grad{g} \to
\begin{cases}
1 = 2\lambda x_1 \\
1 = 2\lambda x_2 \\
... \\
\add{n}{i = 1}x_i^2 = 1
\end{cases}\to \quad


{x_i = \pm\sqrt{\frac{1}{n}}}
$$

The maximum is when $x_i = \sqrt{\dfrac{1}{n}}$. $f = \sqrt{n}$. The minimum is when $x_i = -\sqrt{\dfrac{1}{n}}$, $f = -\sqrt{n}$.

Let $\vec{a} = {<}x_1, x_2, ... x_n{>}$, $\vec{b} = {<}1, 1, ..., 1{>}$. They have same length.
$$
\abs{\vec{a} \cdot \vec{b}} \leq \abs{\vec{a}}\abs{\vec{b}} \\
\abs{\add{n}{i = 1}x_i} \leq \sqrt{n}\sqrt{\add{n}{i = 1}x_i^2} \\
-\sqrt{n} \leq \add{n}{i = 1}x_i \leq \sqrt{n}
$$
So, the minimum is $-\sqrt{n}$, and the maximum is $\sqrt{n}$.

## Proof of Cauchy-Schwarz Inequality

$$
f = \add{n}{i = 1}x_ib_i \\ \grad{f} = {<}b_1, b_2, ... ,b_n{>}
$$

$$
g = \add{n}{i = 1}x_i^2 - 1 \\
\grad{g} = {<}2x_1, 2x_2, ... ,2x_n{>}
$$

$$
\grad{f} = \lambda\grad{g} \to 
2x_i = \lambda b_i\ , \add{n}{i = 1}x_i^2 = 1 \to x_i = \frac{b_i}{\sqrt{\add{n}{i = 1}b_i^2}}
$$

The maximum value for $\add{n}{i = 1}x_ib_i = \sqrt{\add{n}{i = 1}b_i^2}$

Let $x_i = \frac{a_i}{\sqrt{\add{n}{i = 1}a_i^2}}$

The maximum value for $\add{n}{i = 1}a_ib_i = \sqrt{\add{n}{i = 1}a_i^2}\sqrt{\add{n}{i = 1}b_i^2}$

So, 
$$
\add{n}{i = 1}a_ib_i \leq \sqrt{\add{n}{i = 1}a_i^2}\sqrt{\add{n}{i = 1}b_i^2}
$$
Let $a_i = -a_i$
$$
-\add{n}{i = 1}a_ib_i \leq \sqrt{\add{n}{i = 1}a_i^2}\sqrt{\add{n}{i = 1}b_i^2}
$$
So,
$$
\abs{\add{n}{i = 1}a_ib_i} \leq \sqrt{\add{n}{i = 1}{a^{'}}_i^2}\sqrt{\add{n}{i = 1}b_i^2}
$$
