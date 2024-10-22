# Quantum Physics

## 1. Waves

Harmonic waves: 
$$
y(x, t) = A\cos(kx - \omega t + \phi) \\
k = \frac{2\pi}{\lambda}, \omega = 2\pi f
$$
| Symbol    | Formula                 | Description       | SI unit  |
| --------- | ----------------------- | ----------------- | -------- |
| $k$       | $\dfrac{2\pi}{\lambda}$ | Wave number       | $m^{-1}$ |
| $\omega$  | $2\pi f$                | Angular Frequency | $s^{-1}$ |
| $\lambda$ |                         |                   |          |

## 9 Harmonic Oscillator

### 9.1 Wave functions

Suppose the external potential $U = {1\over2}kx^2$, then the possible solution to the Time Dependent Schrodinger Equation will be:
$$
\Psi(x) = Ae^{-\alpha x^2}, \quad \alpha = {1\over 2\hbar}{\sqrt{mk}}
$$
Notice the choice of $a > 0$, so that the wave function won't diverge. 
$$
\begin{align}
E\Psi(x, t) &= -\frac{\hbar^2}{2m}\parffrac{\Psi(x, t)}{x}+U(x)\Psi(x, t) \\
EAe^{-\alpha x^2} &= -\frac{\hbar^2}{2m}A(-2\alpha + 4\alpha^2x)e^{-\alpha x^2}+ {1\over2}kx^2Ae^{-\alpha x^2} \\
E &= -\frac{\hbar^2}{2m}4\alpha^2x^2 + {1\over2}kx^2 + \frac{\hbar^2\alpha}{m} \\
E &= x^2(\frac{1}{2}k - \frac{4\hbar^2\alpha^2}{2m}) + \frac{\hbar^2\alpha}{m} \\
E &= {\hbar^2\alpha \over m}
\end{align}
$$
Define a fake variable $\omega = \sqrt{\dfrac{k}{m}}$ for simplification.


$$
\alpha = 
$$














$$
\newcommand\parfrac[2]{\frac{\part #1}{\part #2}}
\newcommand\parffrac[2]{\frac{\part^2 #1}{\part #2^2}}
$$

## 10 Time Dependence in Quantum Mechanics

### 10.1 Time Independent Schrodinger Equation

Time dependent Schrodinger Equation:
$$
i\hbar\parfrac{\Psi(x, t)}{t} = -\frac{\hbar^2}{2m}\parffrac{\Psi(x, t)}{x}+U(x)\Psi(x, t)
$$
### 10.2 Time Dependent Wave Function

If there exists a solution $\Psi(x)$ with **energy eigenstate** $E$ to the **Time Independent Schrodinger Equation**, then the 
$$
\Psi(x, t) = e^{-i\omega t}\Psi(x, 0) = e^{-i\omega t}\Psi(x)
$$
where $E = \hbar \omega$ fulfills the **Time Dependent Schrodinger Equation.**

Notice that the $\Psi(x, t)$ fulfills the Time Independent Schrodinger Equation:
$$
\begin{align}
  & -\frac{\hbar^2}{2m}\parffrac{\Psi(x, t)}{x}+U(x)\Psi(x, t)  \\
= & -\frac{\hbar^2}{2m}\parffrac{e^{-i\omega t}\Psi(x, 0)}{x}+U(x)e^{-i\omega t}\Psi(x, 0) \\
= & e^{-i\omega t}(-\frac{\hbar^2}{2m}\parffrac{\Psi(x, 0)}{x}+U(x)\Psi(x, 0)) \\
= & e^{-i\omega t}E\Psi(x, 0) \\
= & E\Psi(x, t)
\end{align}
$$
So, the plug the $\Psi (x, t)$ into the left side of the Time Dependent Schrodinger Equation:
$$
\begin{align}
  & i\hbar\parfrac{\Psi(x, t)}{t} \\
= & i\hbar\parfrac{e^{-i\omega t}\Psi(x, 0)}{t} \\
= & i\hbar \cdot (-i\omega)\cdot e^{-i\omega t}\Psi(x, 0) \\
= & \hbar\omega \cdot e^{-i\omega t}\Psi(x, 0) \\
= & \hbar\omega \Psi(x, t)
\end{align}
$$
Plugging the $\Psi(x,t)$ into the right side of the Time Dependent Schrodinger Equation:
$$
-\frac{\hbar^2}{2m}\parffrac{\Psi(x, t)}{x}+U(x)\Psi(x, t)
$$
which is exactly the same as the Time Independent Schrodinger Equation.

So, it's equals to $E\Psi (x, t)$

Since $E = \hbar\omega$, as we predefined, So left side $E\Psi(x, t)$ equal to right side $\hbar \omega \Psi(x, t)$, and we proves that the $\Psi(x, t) = e^{-i\omega t}\Psi(x)$ indeed fulfills the Time Dependent Schrodinger Equation.

and the $\boldsymbol{e^{-i \omega t}}$ is called the **phase** of the function.

### 10.3 Superposition

Supposition of the wave function is:
$$
\Psi(x, t) = \frac{1}{\sqrt{n}}\sum^n_{i = 1}e^{-i\omega_i t}\Psi_i(x, 0)
$$

### 10.4 Beat Frequencies

Suppose there is superposition of two wave functions:
$$
\Psi(x, t) = \frac{1}{\sqrt{2}}(e^{-i\omega_1 t}\Psi_1(x, 0) + e^{-i\omega_2 t}\Psi_2(x, 0))
$$
Pulling the factor $e^{-i\omega_1 t}$ out of it, we get:
$$
\Psi(x, t) = \frac{1}{\sqrt{2}}e^{-i\omega_1 t}(\Psi_1(x, 0) + e^{-i(\omega_2 - \omega_1) t}\Psi_2(x, 0))
$$
The corresponding probability density function is:
$$
\begin{align}
\rho(x, t) &= \Psi(x, t)\Psi^\star (x, t) \\
		   &= \frac{1}{2}(\Psi_1(x, 0) + e^{-i(\omega_2 - \omega_1) t}\Psi_2(x, 0))(\Psi^\star_1(x, 0) + e^{i(\omega_2 - \omega_1) t}\Psi^\star_2(x, 0)) \\
		   &= \frac{1}{2}(\abs{\Psi_1(x, 0)}^2 + \abs{\Psi_2(x, 0)}^2 + e^{-i(\omega_2 - \omega_1)t}\Psi_2(x, 0)\Psi^\star_1(x, 0) \\ \ & \qquad + e^{i(\omega_2 - \omega_1)t}\Psi^\star_2(x, 0)\Psi_1(x, 0))
\end{align}
$$
So, for the equation $\Psi(x, t) = \Psi(x, t + \Delta{t})$ and $\rho(x, t) = \rho(x, t + \Delta{t})$:
$$
\Delta t = \frac{2\pi}{\omega_2 - \omega_1} = \frac{2\pi\hbar}{E_2 - E_1}
$$
which is the **period of oscillation**, which is only depend of the **difference between the energy**.

In more general cases, the wave function could be written as:
$$
\Psi(x, t) = \frac{1}{\sqrt{n}}e^{-i\omega_1 t} \sum^n_{i = 1}e^{-i(\omega_i - \omega _1) t}\Psi_i(x, 0)
$$
For the any subset of all wave functions, that is:
$$
\sum_{i \in A}{e^{-i(\omega_i - \omega _1) t}\Psi_i(x, 0)}, \quad{A \sube \{ i | 1 \leq i \leq n \}}
$$
the corresponding **period of oscillation** is:
$$
\Delta t = 2 \pi \hbar \gcd(\{\frac{1}{\Delta E_i} |1 < i \leq n\})
$$

## 11 Tunneling

### 11.1 Finite Square Well

Just like the **Infinite Square Well**, the wave function of the **Finite Square Well** has the similar form. 

However, outside the well, which is the **classically forbidden area**, the probability of finding the particles is not zero since the potential $U(x) < \infin$.

Inside the well:
$$
\Psi(x) \approx \sqrt{2\over L} \sin({n\pi x \over L})
$$
Outside the well (Suppose the $U(x)$ outside the well is $V$):
$$
E\Psi(x) = -\frac{\hbar^2}{2m}\parffrac{\Psi(x)}{x}+V\Psi(x)
$$
A solution to the equation is $\Psi(x) = Ae^{-Kx}$ , where $K = \sqrt{2m(V-E)\over \hbar^2}$
$$
\begin{align}
  & -\frac{\hbar^2}{2m}\parffrac{\Psi(x)}{x}+V\Psi(x) \\
= & {-\hbar^2\over2m}K^2 \Psi(x) + V\Psi(x) \\
= & (E-V)\Psi(x) + V\Psi(x) \\
= & E\Psi(x)
\end{align}
$$
Some general rules:

* Overall shape is similar to Infinite Square Well. Higher the well potential, greater similarity.
* Higher the energy eigenstate or lower the well potential, slower the wave function decays outside the well.
* Higher the well potential, the greater the energy for all energy eigenstates.

![image-20211009151216737](Physics.assets/image-20211009151216737.png)

### 11.2 Two Wells

Two wells could be considered as a combination of two wells. The first two lowest energy eigenstate are formed by either **symmetric combination** or **asymmetric combination**. The asymmetric combination has higher energy than the symmetric one.

The difference between two lowest energy is:
$$
\Delta E = Ce^{-\kappa \sqrt{mV} L}
$$
where the $C$ and $\kappa$ depend on the system, $m$ is the mass of the particle, and $V$ is the potential (height) of the barrier, and the $L$ is the thickness of the barrier.

Some general rules:

* The overall shape is similar to the single well.
* Higher the potential of the barrier or the thickness of the barrier, less the probability the particle will appear there. (the wave function approach to 0)

* Higher the potential of the barrier or the thickness of the barrier, greater the energy for all energy eigenstates. 

### 11.3 Tunneling

Suppose there is a superposition of first two energy eigenstate in the two well system:
$$
\Psi(x, t) = \frac{1}{\sqrt{2}}(e^{-i\omega_1 t}\Psi_1(x, 0) + e^{-i\omega_2 t}\Psi_2(x, 0))
$$
Since the **period of oscillation** is $\Delta t = \dfrac{2\pi\hbar}{\Delta E}$, the time for the tunneling is:
$$
\Delta t_{tunnel} = \frac{\pi \hbar}{\Delta E}
$$
So, if two wire are close to each with distance $L$, they could be considered as a two well system. If one wire has current $I$, the the tunneling current is:
$$
I_{tunnel} = {Q_{tunnel}\over t} = {It \cdot {1 \over \Delta t } \over t} = { I\Delta E \over \pi \hbar} = {I \over \pi \hbar} Ce^{-\kappa \sqrt{mV} L}
$$
The tunneling current limits the size of circuits.

















