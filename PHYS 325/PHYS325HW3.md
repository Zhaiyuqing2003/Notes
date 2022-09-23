$$
\newcommand\rt{\vec{r}(t)}
\newcommand\tt{t^2}
\newcommand\ttt{t^3}
\newcommand\t[1]{t^#1}
\newcommand\ex{\vec{e}_x}
\newcommand\ey{\vec{e}_y}
\newcommand\ez{\vec{e}_z}
\newcommand\er{\vec{e}_r}
\newcommand\e[1]{\vec{e}_#1}

\newcommand\aone{\alpha_1}
\newcommand\atwo{\alpha_2}
\newcommand\athr{\alpha_3}
\newcommand\vt{\vec{v}(t)}
\newcommand\deri[2]{\frac{\d#1}{\d#2}}
\newcommand\derit[1]{\deri{#1}{t}}
\newcommand\deritn{\derit{}}
\newcommand\at{\vec{a}(t)}

\newcommand\vt{\vec{v}(t)}
\newcommand\ats{\vec{a}’(t)}
\newcommand\dvt{\dot{v}(t)}
\newcommand\drt{\dot{r}(t)}
\newcommand\ddrt{\ddot{r}(t)}
\newcommand\dvts{\dot{v}'(t)}
\newcommand\drts{\dot{r}'(t)}
\newcommand\ddrts{\ddot{r}'(t)}
\newcommand\ux{U(x)}
\newcommand\derix[1]{\deri{#1}{x}}
\newcommand\xx{x^2}
\newcommand\xxx{x^3}
\newcommand\half{{1\over2}}
\newcommand\pderi[2]{\frac{\part #1}{\part #2}}
\newcommand\pderin[1]{\pderi{}{#1}}
\newcommand\a{\alpha}
\newcommand\ao{\alpha_1}
\newcommand\at{\alpha_2}
\newcommand\const{\text{const}}
\newcommand\d{\text{d}}
\newcommand\invfrac[1]{\frac{1}{#1}}
$$

#### Question 1: Rocket in the atmosphere

>A rocket travels horizontally through the atmosphere and experiences a linear drag force $F_{drag} = -kv$, where $k > 0$ is a constant. Let $m_i$ be the initial mass of the rocket plus fuel and let $m_f$ be the final mass of the rocket after all fuel has burned. Let $u$ be the speed of the fuel relative to the rocket. Assume that all other external forces are negligible, i.e., ignore gravity.

##### (a)

>Write down the differential equation of motion, i.e, Newton's 2nd law

From the Lecture 05 Notes:
$$
\begin{align}
dp &= p_f - p_i \\ 
&= (M - \d m)(v + \d v) + \d m(v - u) - Mv \\ 
&= Mv + M\d v - v\d m -\d m\d v + v\d m - u\d m - Mv \\
&= M\d v  - u\d m
\end{align}
$$
Thus

#####   (b)

>The rocket burns a fuel at a constant rate $\derit{M} = -\a = \const$. Assume that the rocket starts from rest. Determine the final speed of the rocket in terms of $m_i$, $m_f$, $\alpha$, $u$ and $k$.

We know that $\derit{m} = -\derit{M} = \a$, and notice $M(t)$ depends on time. 
$$
\derit{M} = -\a \\
\int_{m_i}^{m(t)}\d M = -\int_{0}^{t} \a \d t \\
M(t) = m_i -\a t
$$
and thus 
$$
\begin{align}
-kv &= M\derit{v} - u\derit{m} \\
-kv &= M\derit{v} - u\a \\
u\a - kv &= M\derit{v} \\
\invfrac{M} \d t &= \frac{\d v}{u\a - kv} \\
\int_0^{t} \invfrac{m_i - \a t} \d s &= \int_{v(0)}^{v(t)} \frac{\d v}{u\a - kv} \\
-\invfrac \a \ln (m_i -\a t)\vline^t_0 &= -\invfrac k \ln (u\a - kv)\vline^{v(t)}_{v(0)} \\
k\ln(\frac{m_i - \a t}{m_i}) &=\a \ln(\frac{u\a - kv}{u\a - kv_0}) \\
\left (\frac{m_i -\a t}{m_i} \right )^k &= \left (\frac{u\a - kv}{u\a - kv_0} \right )^\a 
\end{align}
$$
$M(t_f) = m_f = m_i - \a t_f$ and thus $\a t = m_i - m_f$
$$
\left(\frac{m_f}{m_i} \right)^{k} = \left (\frac{u\a - kv}{u\a - kv_0} \right )^\a \\
\left(\frac{m_f}{m_i} \right)^{k \over \a} = \frac{u \a - kv}{u\a - kv_0} \\
(u\a -kv_0)\left(\frac{m_f}{m_i} \right)^{k \over \a} = u\a - kv \\
\fbox{$v = \invfrac{k} \left(u\a - (u\a -kv_0)\left(\frac{m_f}{m_i} \right)^{k \over \a}\right)$}
$$

#### Question 2: Particle motion

>A particle of mass $m$ moves in 3D in response to the force field
>$$
>\vec F(\vec r) = Az^2 \ex + Ay^3 \ey + 2Axz\ez
>$$

##### (a)

>Show that $\vec F$ is a conservative force and determine the potential energy.

$$
\pderi{F_x}{y} = 0 = \pderi{F_y}{x} \\
\pderi{F_x}{z} = 2Az  = \pderi{F_z}{x} \\
\pderi{F_y}{z} = 0 = \pderi{F_z}{y}
$$

So, exist $-\grad U = F$.
$$
U = \int -F_x \d x = -Az^2x +\phi_1(y, z) \\
$$

$$
\pderi{U}{y} = \pderi{\phi_1(y, z)}{y} = -Ay^3
$$

$$
\pderi{U}{z} = -2Axz + \pderi{\phi_1(y, z)}{z} = -2Axz \\
$$

$$
\phi_1(y,z) = \int Ay^3 \d y = -\frac{Ay^4}{4} + \psi_1(z)
$$

$$
\pderi{\phi_1(y, z)}{z} = \pderi{\psi_1(z)}{z} = 0
$$

$$
\phi_1(y, z) = -\frac{1}{4}Ay^4 + C_1
$$

$$
\fbox{$U = -Az^2x - \frac{1}{4}Ay^4 + C_1$}
$$

##### (b)

$$
E = T_0 + U_0 = T_f + U_f
$$

$$
\begin{align}
T_f - T_0 &= U_0 - U_f \\
&= U(0, 0, 0) - U(-1, 2, 1) \\ 
&= 0 - (-A\cdot 1^2 \cdot (-1) - \frac{1}{4}A\cdot(2)^4) \\
&= -A +4A \\
&= 3A
\end{align}
$$

$$
\half mv^2 = \half mv_0^2 + 3A \\
v^2 = v_0^2 + \frac{6A}{m} \\
\fbox{$v = \sqrt{v_0^2 + \frac{6A}{m}}$}
$$

#### Question 3: Nuclear forces and Yukawa potential


$$
f(r) = -\deri{V}{r} = -K(-\a e^{-\a r} r^{-1} + (-1)\cdot r^{-2}e^{-\a r}) = \a K \frac{e^{-\a r}}{r} + K\frac{e^{-\a r}}{r^2}
$$

$$
U_{\text{eff}} = \frac{L^2}{2mr^2} + \frac{Ke^{-\a r}}{r}
$$

We want to find the critical point of the $U_{\text{eff}}$:
$$
\deri{U}{r}  = -\frac{L^2}{mr^3} - Ke^{-\a r}(\frac{\a}{r} + \invfrac{r^2})
$$

$$
\lim_{r \to 0} U_{\text{eff}}  = \infin \quad \lim_{r \to \infin}U_{\text{eff}} = 0
$$

