$$
\newcommand\rt{\vec{r}(t)}
\newcommand\tt{t^2}
\newcommand\ttt{t^3}
\newcommand\t[1]{t^#1}
\newcommand\ex{\vec{e}_x}
\newcommand\ey{\vec{e}_y}
\newcommand\ez{\vec{e}_z}
\newcommand\er{\vec{e}_r}

\newcommand\aone{\alpha_1}
\newcommand\atwo{\alpha_2}
\newcommand\athr{\alpha_3}
\newcommand\vt{\vec{v}(t)}
\newcommand\deri[2]{\frac{d#1}{d#2}}
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
$$



#### Question 1

##### (a)

$$
\begin{align}
\vt &= \deri{\vec{r}(t) - \vec{r}'(t)}{t} \\
		   &= \deritn{((6\aone\tt + 4\atwo t)\ex - 3\atwo\ttt\ey + 6\athr\ez) - (6\aone\tt\ex - (3\atwo\ttt-7\athr)\ey + 4\athr\ez)}\\
		   &= \deritn(\atwo t\ex + 7\athr \ey + 2\athr\ez) \\
		   &= \atwo\ex
\end{align}
$$

##### (b)

$$
\at = \dvt = \ddrt = 12\aone\ex - 18\atwo t\ey \\
\ats = \dvts = \ddrts = 12\aone\ex - 18\atwo t\ey
$$

##### (c)

Yes, since $\at = \ats$, that means the $S'$ is not accerating, and the change in the frame is a Galilean transformations. So, since Newton's law applies in the $S$ frame for it's a intertial frame, it also applies in the $S'$ frame. Therefore, $S'$ is also a inertial frame.

#### Question 2

##### (a)

$$
\vec{F}_r = -\frac{GMm}{r^2} = m\dvt
$$

$$
vm\derit v = -{GMm \over r^2}\derit r \\
\int_{v_0}^{v(r)} vmdv = \int_{R}^{r} -{GMm \over r^2} dr \\
\left.{1\over2}mv^2\right|^{v(r)}_{v_0} = \left.{GMm \over r}\right|^{r}_{R} \\
{1\over2}m(v^2 - v_0^2) = {GMm \over r} - {GMm \over R} \\
$$

$$
\fbox{$v = \sqrt{2({GM\over r}-{GM\over R}) + v_0^2}$}
$$

##### (b)

When the rocket have minimum velocity, it will reach $v = 0$ after escape the Mars ($r = \infin$). That is
$$
\lim_{r \to \infin} v = 0 \\
\sqrt{{-2GM\over R} + v_0^2} = 0 \\
v_0^2 = {2GM \over R} \\
v_0 = \sqrt{2GM \over R} = \sqrt{2 \cdot 6.674\cdot 10^{-11}m^3kg^{-1}s^{-2} \cdot 6.39\cdot 10^{23}kg \over 3396 \cdot 1000 m} \approx 5011.58m
$$

#### Question 3

##### (a)

$$
F = -\derix{\ux} = -2Ax - 3B\xx
$$

##### (b)

The total energy of the particle is
$$
E_0 = U(0) + T(0) = \half mv_0^2 
$$
Thus, the kinetic energy at given point $T(x)$ is
$$
T = E_0 - U(x)
$$
The potential function $\ux$ have extrema points
$$
\derix{\ux} = 0 = 2Ax + 3Bx^2 \\
x = 0, -\frac{2A}{3B}
$$

$$
\frac{d^2 \ux}{dx^2} = 2A + 6Bx \\
\derix{U}(-\frac{2A}{3B})= 2A -6B\frac{2A}{3B} = -2A < 0
$$

$x = -\frac{2A}{3B}$ is a local maximum.

When $B > 0$, $\ux$ increase and goes unbounded as $x \to \infin$, while as $x \to -\infin$, it first approaches  $x = -\frac{2A}{3B}$ the local maximum, and the decrease to $-\infin$

When $B < 0$, $U(x)$ increase and goes unbounded as $x \to -\infin$ while as $x \to \infin$, it first approaches $x = -\frac{2A}{3B}$ the local maximum, and the decrease to $-\infin$

When, $B = 0$, $U(x)$ increase as $|x| \to \infin$, and approaches $\infin$.

Thus, the particles must have at least $U(-\frac{2A}{3B})$ total energy to pass through the point $x = -\frac{2A}{3B}$, that is
$$
E_0 \geq U(-\frac{2A}{3B}) = A(-\frac{2A}{3B})^2 + B(-\frac{2A}{3B})^3 = \frac{4A^3}{9B^2} - \frac{8A^3}{27B^2} = \frac{4A^3}{27B^2}
$$
and thus
$$
\half mv_0^2 \geq \frac{4A^3}{27B^2} \\
|v_0| \geq \sqrt{\frac{8A^3}{m\cdot 27B^2}}
$$

$$
v_c = \sqrt{\frac{8A^3}{m\cdot 27B^2}}
$$

#### Question 4

![image-20220908233201886](PHYS325HW1.assets/image-20220908233201886.png)

Same results as in the 3(a)

#### Question 5

Let
$$
\derix{U} = -2ax^{-3}+2bx = 0 \\
ax^{-3} =bx \\
x^4 = \frac{a}{b} \\
x = \sqrt[4]{\frac{a}{b}}
$$

$$
\derix{U} = 6ax^{-4} + 2b = 6a \frac{b}{a} + 2b = 8b > 0
$$

Thus, $x_0 = \sqrt[4]{\frac{a}{b}}$.
$$
U(x) \approx U(x_0) + \derix{U}(x_0)(x - x_0) + \half\frac{d^2U}{dx^2}(x_0)(x-x_0)^2 + O(x^3) \cdots
$$
The linear term is $0$, thus
$$
U(x) \approx U(\sqrt[4]{\frac{a}{b}}) + \half 8b (x-x_0)^2 = 2\sqrt{ab} + \half 8b z^2
$$
and $k = 8b$

##### (c)

$\omega = \sqrt{\frac{k}{m}} = \sqrt{\frac{8b}{m}}$

and the period of oscillation is $T = \frac{2\pi}{\omega} = 2\pi\sqrt{\frac{m}{8b}}$

#### Question 6

##### (a)

$A$: distance divided by time (like $m / s$)

$\beta$: inverse of distance $m^{-1}$

##### (b)

$$
F = m\derit{v} = m\derix{v}\derit{x}  = m\dot{v}v \\
$$

$$
F = m \cdot \half A( \beta e^{\beta x} - \beta e^{\beta x} ) \cdot \half A( e^{\beta x} + e^{-\beta x})
$$

$$
F = {1 \over 4} mA^2 \beta (e^{2\beta x} - e^{-2\beta x})
$$

##### (c)

$A^2$ : distance squared divided by time squared

$m$: mass ($kg$)

$(e^{2\beta x} - e^{-2\beta x})$: dimensionless

$F$: distance squared divided by time squared multiply by inverse of distance and mass ($kg \cdot m^2 / s^2 \cdot m^{-1} = kg \cdot m / s^2$) is **distance times mass divided by time squared**, which is correct unit for force, the dimension is consistant. 
