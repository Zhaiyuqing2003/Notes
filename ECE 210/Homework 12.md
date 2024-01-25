$$
{\def\rect{\text{rect}}}
{\def\sinc{\text{sinc}}}
{\def\fourier{\mathcal{F}}}
{\def\Hz{\text{Hz}}}
$$

Sign acknowledging you will abide by this course’s and the University’s Academic Integrity policies
or face sanctions for not doing so. These policies include, among others, plagiarism: representing the
words or ideas of others as your own; cheating: using unauthorized materials and/or information. The
possible sanctions include, among others, reduced letter grades and an F in the course. If your solution
upload does not include your signature, your homework will NOT be graded, resulting in a zero.
sign:  Yuqing Zhai

#### Question 2

Simplify the following expressions involving the impulse, unit step function, rectangular pulse, and/or triangular pulse and sketch the results.

##### (a)

$$
\align[[
g(t) &= \cos(2\pi t) \(\deri u(t)/t; + \delta(t + 0.5)); \\
&= \cos(2\pi t)(\delta (t) + \delta(t+0.5)) \\
&= \cos(2\pi t)\delta(t) + \cos(2\pi t) \delta (t+ 0.5) \\
&= \cos(2\pi \cdot 0)\delta(t) + \cos(2\pi \cdot (-0.5))\delta(t + 0.5) \\
&= \delta(t) - \delta(t + 0.5) \\
]]
$$

<img src="./Homework 12.assets/image-20231115002218533.png" alt="image-20231115002218533" style="zoom:25%;" />

##### (b)

$$
\align[[
a(t) &= \intlh -\infin;t; \delta(\tau + 1)\d \tau + \rect(\fac t/6;) \delta(t - 2) \\
&= u(t+1) + \rect(\fac 2/6;)\delta(t - 2) \\
&= u(t+1) + \delta(t - 2)
]]
$$

<img src="./Homework 12.assets/image-20231115002605521.png" alt="image-20231115002605521" style="zoom:25%;" />

##### (c)

$$
b(t) = \delta(t - 3) * u(t) = u(t - 3)
$$

<img src="./Homework 12.assets/image-20231115002412586.png" alt="image-20231115002412586" style="zoom: 25%;" />

##### (d)

$$
f(t) = (1+t^2) (\delta(t) - \delta(t+1)) \\
= (1+t^2)\delta(t) - (1+t^2)\delta(t+1)  \\
= (1+0^2)\delta(t) - (1+(-1)^2)\delta(t+1) \\
= \delta(t) -2\delta(t+1)
$$

<img src="./Homework 12.assets/image-20231115002659549.png" alt="image-20231115002659549" style="zoom:25%;" />

##### (e)

$$
y(t) = \intlh -1; \infin; (\tau^2 + 1) \delta(\tau + 2) \d \tau = 0 
$$

<img src="./Homework 12.assets/image-20231115002747566.png" alt="image-20231115002747566" style="zoom:25%;" />

##### (f)

$$
c(t) = \triangle (\fac t/4;) * (\delta (t) - \delta(t + 2)) \\
=  \triangle (\fac t/4;) * \delta (t) - \triangle (\fac t/4;) * \delta(t + 2) \\
= \triangle (\fac t/4;) - \triangle (\fac t + 2/4;) \\
$$

<img src="./Homework 12.assets/image-20231115003355578.png" alt="image-20231115003355578" style="zoom:25%;" />

#### Question 3

##### (a)

We know that $f(t) * \delta(t - t_0) = f(t - t_0)$. So we have
$$
h(t) * \rect(\fac t/3;) = \rect(\fac t-3/3;) \\
\delta(t - 3) * \rect(\fac t/3;) = \rect(\fac t-3/3;)
$$
so $h(t) = \delta(t - 3)$

##### (b)

Notice that $y(t) = \half (f(t - \fac 3/2;) -f(t - \fac 9/2;)) $, then it's obvious that
$$
\half (\delta(t - \fac 3/2;) - \delta(t - \fac 9/2;)) * f(t) = y(t) \\
h(t) = \half (\delta(t - \fac 3/2;) - \delta(t - \fac 9/2;))
$$

##### (c)

Notice that $y(t) = f(t - 2) + f(t - 3) + f(t - 4)$, then it's obvious that
$$
(\delta(t - 2) + \delta(t - 3) + \delta(t - 4)) * f(t) = y(t) \\
h(t) = \delta(t - 2) + \delta(t - 3) + \delta(t - 4)
$$

 #### Problem 4

##### (a)

$$
\fourier (f(t)) = 5\fourier (\cos(5t)) + 3 \fourier (\sin(15t)) \\
= 5\pi (\delta (\omega - 5) + \delta (\omega + 5)) + j \cdot 3\pi (\delta (\omega + 15) - \delta (\omega - 15)) \\ 
= 5\pi \delta (\omega - 5) + 5\pi \delta (\omega + 5) + 3j\pi \delta (\omega + 15) - 3j\pi \delta (\omega - 15))
$$


##### (b)

$$
x(t) = \cos^2(6t) = \half (\cos(12t) + 1) \\
\fourier (x(t)) = \half \fourier (\cos(12t)) + \half \fourier(1) \\
= \fac \pi/2; (\delta (\omega - 12) + \delta (\omega + 12)) + \pi \delta(\omega )
$$

<img src="./Homework 12.assets/image-20231114220249264.png" alt="image-20231114220249264" style="zoom: 25%;" />

##### (c)

$$
\fourier (y(t)) = \fourier (e^{-2t} u(t) * \cos(2t)) = \fourier(e^{-2t} u(t))\fourier(\cos(2t)) \\
= (\iv 2+ j\omega;)\cdot \pi (\delta(\omega - 2) + \delta (\omega + 2)) \\
= \fac \pi/2+j\omega; (\delta(\omega - 2) + \delta (\omega + 2)) \\
= \fac \pi/2+2j;\delta(\omega - 2) + \fac \pi/2-2j; \delta(\omega + 2)
$$

##### (d)

$$
\fourier (z(t)) = \fourier (e^{-t}u(t)) + \fourier (e^{-t} u(t) \cos(3t)) \\
= (\iv 1 + j\omega;) + (\fac 1 + j\omega/ (1 + j\omega)^2 + 9; )
$$

#### Problem 5

##### (a)

$f_0 = 2F = 40 \cdot 2 = 80 \text{KHz}$

##### (b)

$$
\fourier (f(t)) = \iv 40; \rect (\fac \omega/80\pi;)
$$

$\Omega = 40\pi \cdot  \text{rad Hz}$, $F = \fac \Omega/2\pi; = 20 \Hz$,

$f_0 = 2F = 20 \cdot 2 = 40 \text{Hz}$

##### (c)

$$
\fourier (g(t)) = \iv 100; \rect(\fac \omega/200\pi;) + \fac 1/2\pi; \iv 40; \rect (\fac \omega/80\pi;) * \pi(\delta(\omega - 200\pi) + \delta(\omega + 200\pi) \\
= \iv 100; \rect(\fac \omega/200\pi;) + \fac 1/2; \iv 40; (\rect (\fac \omega- 200\pi /80\pi;) + \rect (\fac \omega + 200\pi /80\pi;))
$$

non-zero frequency:  $-50\Hz \sim 50\Hz$, $80\Hz \sim 120\Hz$, $-120\Hz \sim -80\Hz$

So, $F = 120\Hz$ and $f_0 = 2F = 120 \cdot 2 = 240 \text{Hz}$



#### Problem 6

##### (a)

$$
\fourier (f_1(t)) = F(\omega) * j\pi(\delta(\omega + 4000\pi) - \delta(\omega - 4000\pi)) \\
= j\pi(F(\omega + 4000\pi) - F(\omega - 4000\pi))
$$

non-zero frequency: $-4000\pi - \Omega \sim -4000\pi + \Omega$, $4000\pi - \Omega \sim 4000\pi + \Omega$.

So, $\omega_s = 8000\pi + 2\Omega$ rad/s

##### (b)

$$
\fourier (f_2(t)) = \iv 2\pi; F(\omega) \cdot j\pi(\delta(\omega + 4000\pi) - \delta(\omega - 4000\pi)) \\
= \half j(F(-4000\pi)\delta(\omega +4000\pi) - F(4000\pi)\delta(\omega - 4000\pi)) \\
$$

If $\Omega < 4000\pi$, then the entire Fourier transformed function will be evaluated to 0, and $w_s = 0$

Else, the $w_s = 2 \cdot 4000\pi = 8000\pi$ rad/s

##### (c)

$$
\fourier (f_3(t)) = f(t) * f(t) = \iv 2\pi; F(\omega)F(\omega)
$$

This still has the same bandwidth as the $F(\omega)$, so $\omega_s = 2\Omega$ rad/s

##### (d)

$$
\fourier (f_4(t)) = \iv 2\pi; F(\omega) * F(\omega)
$$

$\Delta\omega_{F} = 2\Omega$, $\Delta \omega_{F_4} = \Delta\omega_{F} + \Delta\omega_{F} = 2\Delta\omega_{F} = 4\Omega$. (Width property)

$\omega_s = \Delta \omega_{F_4} = 4\Omega$ rad/s

##### (e)

$$
\fourier (f_5(t)) = F(\omega) e^{-2j\omega }
$$

This still has the same bandwidth as the $F(\omega)$, so $\omega_s = 2\Omega$ rad/s



#### Problem 7

##### (a)

$$
h(t) = \deri g(t)/t; = 5\delta(2t - 5) \cdot 2 = 10\delta(2t - 5)
$$

##### (b)

$$
h(t) = \deri g(t)/t; = 3t^2u(t) + t^3\delta(t) = 3t^2u(t)
$$

##### (c)

$$
h(t) = \deri g(t)/t; = e^{-t}u(t - 5) + (2 - e^{-t})\delta(t - 5) = e^{-t}u(t - 5) + (2 - e^{-5})\delta(t - 5)
$$



#### Problem 8

##### (a)

Convolution is linear operation, so it's linear.

It's not time-invariant, $y'(t) = y(t - u) = 5f(t - u) * u(t - u) \neq 5f(t-u) * u(t)$.

It's $\intinfin 5f(\tau) \cdot u(t - \tau) \d \tau$, this considered all future input of $f(t)$, so it's not causal.

It's not BIBO, consider simplest function $f(t) = 1$, then $\intinfin 5u(\tau) f(t - \tau) \d\tau = \intinfin 5u(\tau) d\tau$ is infinity and certainly not bounded.

##### (b)

Taking the square of input signal $f$ is not linear operation. Consider $f' = 2f$, then $\delta(t - 4) * (2f)^2 = 4\delta(t- 4) * f^2 \neq 2y(t)$

It's causal, since it only uses present and past value.

It's BIBO stable since $y(t) = f^2(t - 4)$, if f is bounded, then y is bounded.

It's not time-invariant, as it depends on $t$ other than the input function.

##### (c)

It's linear since integral is a linear operation.

It's causal, we see it only depends on the input from $t - 2$ to past infinity.

It's time-invariant since $\intlh -\infin; t-2; f(\tau - u) d\tau = \intlh -\infin; t-u-2; f(x)\d x = y(t - u)$.

It's not BIBO, even like $f(t) = 1$, this function will not be bounded, (it will increase to infinity as t increase)

##### (d)

It's linear since addition is linear operation.

It's not causal since it uses the future input $f(t+1)$

It's time invariant, $y'(t) = y(t - u) = f(t - u - 1) + f(t - u + 1) = f'(t-1) + f'(t+1)$

It's BIBO, as both $f(t - 1)$ and $f (t + 1)$ is bounded.

##### (e)

It's causal since it only uses present input.

It's not time-invariant, say $f' = f(t - u)$, then $y(t - u) = f(2(t - u) = f(2t - 2u) \neq f(t - u)$

It's linear suppose $y(t) = f(2t), x(t) = g(2t)$, then $af(2t) + bg(2t) = ay(t) + bg(t)$

It's BIBO, as $y(t) = f(2t)$ is bounded.

##### (f)

It's causal since it only uses present input.

It's not time-invariant, $y(t - u) =(t + u - 1)f(t - u) \neq (t+1)f(t-u)$

It's linear, suppose $y(t) = (t+1)f(t), x(t) = (t+1)g(t)$, then $(t+1)(af(t) + bg(t)) = a(t+1)f(t) + b(t+1)g(t) = ay(t) + bx(t)$

It's not BIBO, as (t+1) could be arbitrarily large.
