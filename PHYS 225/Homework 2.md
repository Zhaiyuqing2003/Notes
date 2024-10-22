Name: Yuqing Zhai

Section: D4A

### Homework 2

#### Problem 1

From the question, we know that
$$
x = 100 \text{ km} \\
y = 10 \text{ km} \\
z = 0.5 \text{ km} \\
t = 0.5 \text{ ms} = 0.0005 \text{ s} \\
v = -0.8c
$$
With information given, we could calculate
$$
\beta = \frac{v}{c} = -0.8 \\
\gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1-0.64}} = \frac{1}{0.6} = \frac{5}{3}
$$
Applying Lorentz Transformation
$$
x' = \gamma(x - \beta c t) = \frac{5}{3}(100 +0.8 \cdot 300000 \cdot 0.0005) = \frac{5}{3}\cdot 220 \approx 366 \text{ km} \\
t' = \gamma(t - \frac{\beta x}{c}) = \frac{5}{3}(0.0005 + \frac{0.8 \cdot 100}{300000}) \approx 0.00128 \text{ s}
$$

$$
y' = y = 10 \text{ km} \\
z' = z = 0.5 \text{ km}
$$

#### Problem 2

From the problem, we know
$$
x' = 10 \text{ m} \\
y' = 4 \text{ m} \\
z' = 6 \text{ m} \\
t' = 0.4 \text{ ms} = 0.0004 \text{ s} \\
$$
Only the $x$ and $t$ is our concern, because the $K'$ only move on $xx'$ axis, $y = y' = 4 \text{ m}$ and $z = z' = 6\text{ m}$ in all three cases.

(a) we could calculate
$$
\beta = \frac{500}{c} = 1.67 \cdot 10^{-6} \\
\gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1 - 2.78\cdot 10^{-12}}} \approx 1.000000000001389 \approx 1
$$
Applying inverse Lorentz Transformation
$$
x = \gamma(x' + \beta c t') \approx 1\cdot(10 + 500 \cdot 0.0004) = 10.2 \text{ m} \\
t = \gamma(t' + \frac{\beta x'}{c}) \approx 1\cdot(0.0004 + \frac{1.67 \cdot 10^{-6} \cdot 10}{3\cdot10^{8}}) \approx 0.0004 \text{ s}
$$
(b)
$$
\beta = \frac{-500}{c} = -1.67 \cdot 10^{-6} \\
\gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1 - 2.78\cdot 10^{-12}}} \approx 1.000000000001389 \approx 1
$$
Applying inverse Lorentz Transformation
$$
x = \gamma(x' + \beta c t') \approx 1\cdot(10 - 500 \cdot 0.0004) = 9.8 \text{ m} \\
t = \gamma(t' + \frac{\beta x'}{c}) \approx 1\cdot(0.0004-\frac{1.67 \cdot 10^{-6} \cdot 10}{3\cdot10^{8}}) \approx 0.0004 \text{ s}
$$
(c)


$$
\beta = \frac{2 \cdot 10^{8}}{c} = \frac{2}{3} \\
\gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1 - \frac{4}{9}}} \approx 1.342
$$
Applying inverse Lorentz Transformation
$$
x = \gamma(x' + \beta c t') \approx 1.342 \cdot(10 + 2 \cdot 10^8 \cdot 0.0004) = 107373.42 \text{ m} \\
t = \gamma(t' + \frac{\beta x'}{c}) \approx 1.342\cdot(0.0004 + \frac{\frac{2}{3} \cdot 10}{3\cdot10^{8}}) \approx 0.000537 \text{ s}
$$
(d) the relativity effect is only significant when the relative speed between two frame is close to the speed of light. The classical model works fairly well in the case of small relative speed (the speed typically use in everyday life).

#### Problem 3

Call the observer's frame $S$, spaceship's frame $S'$ (set the positive direction of $xx'$ axis the direction spaceship moves to)

From the problem, we know
$$
\Delta{x'} = 100 \text{ m} \\
\Delta{t'} = 4 \text{ $\mu$s} \\
\Delta{x} = 0 \text{ m}
$$
The $\Delta{x} = 0 \text{ m}$ because in the observer's frame, two event (the front end and back end pass him) happen in the same place (where he stands).

Suppose the relative speed is $v$, applying Lorentz Transformation,
$$
\Delta{x} = \frac{1}{\sqrt{1 - (\frac{v}{c})^2}}(\Delta x' + v\Delta{t}') = 0 \text{ m}
$$
the $\gamma \neq 0$, that means
$$
\Delta{x}' = -v\Delta{t}'\\
v= -\frac{\Delta{x}'}{\Delta{t}'} = \frac{100 \text{ m}}{4 \text{ $\mu$s}} = -25000000 \text{ m/s}
$$
The negative sign on the $v$ means the earth travels backward (with respect to positive $xx'$ axis) in the frame of spaceship.

So, the relative speed between earth and spaceship is $25000000 \text{ m/s}$

#### Problem 4

(a) We know that from earth point of view, $x_1 = 0$
$$
t_1 = \gamma(t_1' + \beta x_1/c) = \gamma t_1'
$$
So, $t_1' = \frac{t_1}{\gamma} = (\sqrt{1 - (\frac{v}{c})^2})t_1$

(b) We know that $x_1 = 0$, $t_1$
$$
x_1' = \gamma(x_1 - vt_1) = -\gamma vt_1
$$
That means the clock relative to the ship is $-\gamma vt_1$ in backward from the ship, which means the spaceship is  $\gamma v t_1 = \frac{v t_1}{\sqrt{1 - (\frac{v}{c})^2}}$ away from the earth.

(c) the time when it's taken is when $t_2$ on earth's clock. So, same as the (a)'s calculation, $t_2' = \frac{t_2}{\gamma} = (\sqrt{1 - (\frac{v}{c})^2})t_2$

(d) When the pursuit happens ($t_1'$), when it ends ($t_2'$), the difference in time in the reference of slow spaceship is $t_2' - t_1' = (\sqrt{1-(\frac{v}{c})^2})(t_2 - t_1)$

(e) Same as the (b)'s calculation, the distance covered is ($\Delta{x} = 0$, since the clock on the earth never moves)
$$
\Delta{x}' = \gamma(\Delta{x} - v\Delta{t}) = -\gamma v(t_2 - t_1)
$$
That means, in the reference frame of spaceship, the distance of spaceship moves in when the super spaceship start to chase, and eventually catch it, is $\gamma v (t_2 - t_1) = \frac{v(t_2 - t_1)}{\sqrt{1 - (\frac{v}{c})^2}}$
