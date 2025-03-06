$$
{\def\intinfin{\int_{-\infin}^{\infin}}}
{\def\intneginfin{\int_{-\infin}^{0}}}
{\def\intposinfin{\int_{0}^\infin}}
{\def\d{\text{d}}}
{\def\expect#1;{{\left\langle #1 \right\rangle}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\deri#1/#2;{{\frac{\d #1}{\d #2}}}}
{\def\pderi#1/#2;{{\frac{\partial #1}{\partial #2}}}}
{\def\dpderi#1/#2,#3;{{\frac{\partial #1}{\partial #2 \partial #3} }}}
{\def\ppderi#1/#2;{{\frac{\partial^2 #1}{\partial {#2}^2 }}}}
{\def\pppderi#1/#2;{{\frac{\partial^3 #1}{\partial {#2}^3 }}}}
{\def\pnderi#1/#2^#3;{{\frac{\partial^{#3} #1}{\partial {#2}^{#3} }}}}
{\def\ipderi#1/#2;{{\partial #1}/{\partial #2}}}
{\def\iv#1;{{1 \over #1}}}
{\def\cond{\text{cond}}}
{\def\norm#1;{\|#1\|}}
$$

### A

We want to calculate $\cond(f)$:
$$
\begin{align}
\cond(f) &= \max_{\delta x} \fac \%\delta f  /\%\delta x; \\
&= \max_{\delta x} \fac |f(x+\delta x) - f(x)| / |f(x)|; \cdot \fac \|x \|_2/\| \delta x \|_2; \\
&= \max_{\delta x} \fac |y^T \delta x| / |y^T x|; \cdot \fac \|x \|_2/\| \delta x \|_2; \\
&= \max_{\delta x} \fac  \norm y;_2 \norm \delta x;_2 \cos \angle(y, \delta x)/ {\norm y;_2 \norm x;_2 \cos \angle(y, x)}; \cdot \fac \|x \|_2/\| \delta x \|_2; \\
&= \max_{\delta x} \fac {\cos \angle(y, \delta x)}  / {\cos \angle(y, x)};  \\
&= \iv \cos \angle (y,x); \text{  from Cauchy-Schwarz}
\end{align}
$$

### B

$$
\begin{align}
\kappa_1 &= \left|\fac x p'(x)/p(x);\right| \\
&= \left|\sum_{i=0}^d i a_i x^{i-1}\right| \fac \norm x;_2 /|p(x)|;
\end{align}
$$
$$
{\def\intinfin{\int_{-\infin}^{\infin}}}
{\def\intneginfin{\int_{-\infin}^{0}}}
{\def\intposinfin{\int_{0}^\infin}}
{\def\d{\text{d}}}
{\def\expect#1;{{\left\langle #1 \right\rangle}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\deri#1/#2;{{\frac{\d #1}{\d #2}}}}
{\def\pderi#1/#2;{{\frac{\partial #1}{\partial #2}}}}
{\def\dpderi#1/#2,#3;{{\frac{\partial #1}{\partial #2 \partial #3} }}}
{\def\ppderi#1/#2;{{\frac{\partial^2 #1}{\partial {#2}^2 }}}}
{\def\pppderi#1/#2;{{\frac{\partial^3 #1}{\partial {#2}^3 }}}}
{\def\pnderi#1/#2^#3;{{\frac{\partial^{#3} #1}{\partial {#2}^{#3} }}}}
{\def\ipderi#1/#2;{{\partial #1}/{\partial #2}}}
{\def\iv#1;{{1 \over #1}}}
{\def\cond{\text{cond}}}
{\def\norm#1;{\|#1\|}}
$$

### A

We want to calculate $\cond(f)$:
$$
\begin{align}
\cond(f) &= \max_{\delta x} \fac \%\delta f  /\%\delta x; \\
&= \max_{\delta x} \fac |f(x+\delta x) - f(x)| / |f(x)|; \cdot \fac \|x \|_2/\| \delta x \|_2; \\
&= \max_{\delta x} \fac |y^T \delta x| / |y^T x|; \cdot \fac \|x \|_2/\| \delta x \|_2; \\
&= \max_{\delta x} \fac  \norm y;_2 \norm \delta x;_2 \cos \angle(y, \delta x)/ {\norm y;_2 \norm x;_2 \cos \angle(y, x)}; \cdot \fac \|x \|_2/\| \delta x \|_2; \\
&= \max_{\delta x} \fac {\cos \angle(y, \delta x)}  / {\cos \angle(y, x)};  \\
&= \iv \cos \angle (y,x); \text{  from Cauchy-Schwarz}
\end{align}
$$

### B

$$
\begin{align}
\kappa_1 &= \left|\fac x p'(x)/p(x);\right| \\
&= \left|\sum_{i=0}^d i a_i x^{i-1}\right| \fac \norm x;_2 /|p(x)|;
\end{align}
$$

Using answer from part A. Set $a = \bold x$, and $v = [x^d, x^{d-1}, ..., 1] = \bold y$ we get
$$
\kappa_2 = \iv |\cos \angle(a, v)|;
$$
If $\kappa_2 = \infin$, that means $\cos \angle(a, v) \to 0$ and $a, v$ are orthogonal, that leads to $a^T v = 0$ and $p(a, 2) = 0$. (evaluate to 0 at $x = 2$).
