$$
\newcommand\partderi[2]{\dfrac{\part #1}{\part #2}}
$$

# Multiple Integral

## Jacobian matrix

Suppose the original function is:
$$
\bold{r} = \bold{f}(\bold{u}) \\
$$
where $\bold f: \R^n \to \R^n$ is a bijection. 

and the corresponding integral is
$$
\int_{R}g(\bold{r})\ dV_{R(rect)}
$$

Note: the $dV_{rect}$ is respect to the **rectangular coordinate system** to give the integral proper geometric meaning.

The region $R$ could written as:
$$
R = \lim_{N \to \infin}\sum_{i = 1}^{N}\Delta{R}_i
$$
for single area $\Delta{R}_i$, it could be interpreted such as the area spanned by $n$ vectors. Carefully select those vectors so that each of them looks like:
$$
\Delta\bold{r_i} = \bold{f}(\bold{u} + \Delta{u}_i\hat{u}_i) - \bold{f}(\bold{u})
$$
Since
$$
\left. \partderi{\bold{f}}{u_i} \right|_{\bold{u} = \bold{u_0}} = \lim_{\Delta{u_i}\to 0}\frac{\bold{f}(\bold{u} + \Delta{u}_i{\widehat{\bold{u_i}}}) - \bold{f}(\bold{u})}{\Delta{u}_i} \\
\partderi{\bold{f}}{u_i} + {\boldsymbol{\phi_i}(\Delta{u}_i)\over\Delta{u}_i})\Delta{u}_i = {\bold{f}(\bold{u} + \Delta{u}_i{\widehat{\bold{u_i}}}) - \bold{f}(\bold{u})}
$$
So
$$
\Delta\bold{r_i} = (\partderi{\bold{f}}{u_i} + {\boldsymbol{\phi_i}(\Delta{u}_i)\over\Delta{u}_i})\Delta{u}_i
$$
Thus
$$
\Delta{R}_i = \abs{\det
\begin{bmatrix}
\Delta\bold{r_1} \\
\vdots \\
\Delta\bold{r_n}
\end{bmatrix}}
= \abs{\det
\begin{bmatrix}
\partderi{f_1}{u_1} + \dfrac{\phi^1_1(u_1)}{\Delta{u_1}} & \dots & \partderi{f_n}{u_1} + \dfrac{\phi^n_1(u_1)}{\Delta{u_1}} \\
\vdots & \ddots & \vdots\\
\partderi{f_1}{u_n} + \dfrac{\phi^1_n(u_n)}{\Delta{u_n}} & \dots & \partderi{f_n}{u_n} + \dfrac{\phi^n_1(u_n)}{\Delta{u_n}} \\
\end{bmatrix}}\prod_{i = 1}^{n}\Delta{u_i}
$$
As $N \to \infin$, $\Delta{R}_i \to 0$ and $\Delta{u}_i = 0$.

Since
$$
\lim_{\Delta{u}_i \to 0}{\bold{R_i}(\Delta{u}_i) \over \Delta{u}_i} = 0 
$$
So
$$
\Delta{R}_i = \abs{\det(\bold{D_f^T})}\prod_{j = 1}^{n}\Delta{u_j} = \abs{\det(\bold{D_f}(\bold{u}_i))}\prod_{j = 1}^{n}\Delta{u_j}
$$
So, the original integral is:
$$
\begin{align}
 &\int_{R}g(\bold{r})\ dV_{R(rect)} \\
=&\lim_{N \to \infin}\sum_{i = 0}^{N}g(\bold{r}_i)\Delta{R}_i \\
=&\lim_{N \to \infin}\sum_{i = 0}^{N}g(\bold{f}(\bold{u}_i))\abs{\det(\bold{D_f})}\prod_{j = 1}^{n}\Delta{u_j} \\
=&\lim_{N \to \infin}\sum_{i = 0}^{N}g(\bold{f}(\bold{u}_i))\abs{\det(\bold{D_f}(\bold{u}_i))}\Delta{U}_{i(rect)} \\
=&\int_{U}g(\bold{f}(\bold{u}))\abs{\det(\bold{D_f}(\bold{u}))}\ dV_{U(rect)} 

\end{align}
$$

### Polar coordinate

In the polar coordinate: 
$$
\begin{cases}
x = r\cos\theta \\
y = r\sin\theta
\end{cases}
$$
So, the $\norm{\bold{D_f}}$ in the polar coordinate is: 
$$
\begin{Vmatrix}
\partderi{x}{r} & \partderi{x}{\theta} \\
\partderi{y}{r} & \partderi{y}{\theta} \\
\end{Vmatrix}
=
\begin{Vmatrix}
\cos\theta & -r\sin\theta \\
\sin\theta & r\cos\theta \\
\end{Vmatrix}
= r\cos^2\theta + r\sin^2\theta = r
$$
So,x  
$$
\iint_{R}f(x, y)\ dxdy = \iint_{U}f(r\cos\theta, r\sin\theta)r\ drd\theta
$$

### Spherical coordinate

In spherical coordinate
$$
\begin{cases}
x = \rho\sin\phi\cos\theta \\
y = \rho\sin\phi\sin\theta \\
z = \rho\cos\phi
\end{cases}
$$
So, the $\norm{\bold{D_f}}$ in the spherical coordinate is: 
$$
\begin{align}
\begin{Vmatrix}
\partderi{x}{\rho} & \partderi{x}{\theta} & \partderi{x}{\phi} \\
\partderi{y}{\rho} & \partderi{y}{\theta} & \partderi{y}{\phi} \\
\partderi{z}{\rho} & \partderi{z}{\theta} & \partderi{z}{\phi} \\
\end{Vmatrix} =&
\begin{Vmatrix}
\sin\phi\cos\theta & -\rho\sin\phi\sin\theta & \rho\cos\phi\cos\theta \\
\sin\phi\sin\theta & \rho\sin\phi\cos\theta & \rho\cos\phi\sin\theta \\
\cos\phi & 0 & -\rho\sin\phi
\end{Vmatrix} \\
=&\ -\rho^2\sin^3\phi\cos^2\theta \\
 &\ - \rho\sin\phi\sin\theta(\rho\sin^2\phi\sin\theta + \rho\cos^2\phi\sin\theta)\\
 &\ - \rho^2\cos^2\phi\sin\phi\cos^2\theta \\
=&\ -\rho^2\sin^3\phi\cos^2\theta \\
 &\ - \rho^2\sin^3\phi\sin^2\theta - \rho^2\sin\phi\cos^2\phi\sin^2\theta\\
 &\ - \rho^2\cos^2\phi\sin\phi\cos^2\theta \\
=&\ \abs{-\rho^2\sin\phi} = \rho^2\sin\phi
\end{align}
$$
Since $\phi \in [0, \pi]$.

### 













