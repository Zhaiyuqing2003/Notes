$$
\newcommand\d{\text{d}}
$$

### Homework 3

#### Problem 1

From the problem, define the concentration of salt in the container at any moment $t$ as $\rho(t)$. Then, we could get the equation:
$$
\derivative{m}{t} = \gamma\derivative{V_{in}}{t} - \rho\derivative{V_{out}}{t} \\
120 \cdot\derivative{\rho}{t} = 2\gamma - 2\rho \\
\derivative{\rho}{t}  + \frac{1}{60}\rho = \frac{1}{60}\gamma
$$
This is a first order linear equation, the integrating factor is
$$
I = e^{\int{\frac{1}{60}} \d t} = e^{\frac{1}{60}t}
$$
Thus, the solution is
$$
\rho = \frac{1}{I}\int{\frac{1}{60}\gamma \cdot e^{\frac{1}{60}t}}\d t = e^{-\frac{1}{60}t}\gamma(e^{\frac{1}{60}t} +  C)
$$
with respect to the initial condition $\rho(0) = 0$
$$
\rho(0) = \gamma (1 + C) = 0 \\
C = -1
$$
So, $\rho = \gamma(1 - e^{-\frac{1}{60}t})$. As a result, $m = V_{\text{container}}\rho = 120\gamma(1 - e^{-\frac{1}{60}t})$

As $t \to \infin$, $m = 120\gamma$.

#### Problem 2

Since from the given information
$$
\frac{N_x - M_y}{xM - yN} = R(xy) \\
N_x - M_y = R(xy)xM - R(xy)yN \\
N_x - M_y = (R(xy)M)_y -(R(xy)N)_x \\
(R(xy)N + N)_x = (R(xy)M + M)_y \\
(N(R(xy) + 1))_x = (M(R(xy) + 1))_y  
$$
It's reasonable to set integrating factor $I(xy) = R(xy) + 1$, so that the integrating factor is only depends on $xy$, and
$$
IM + INy' = 0
$$
Since $(IM)_y = (IN)_x$, there exists $\phi$ that
$$
\phi_x = IM \quad \text{and} \quad \phi_y = IN
$$
We could rewrite the equation
$$
\derivative{\phi}{x} = 0
$$
which indicates that $I(xy) = R(xy) + 1$ is indeed the right formula for integrating factor.

#### Problem 3

Set Integrating factor $I = y^3$, multiply the equation by it:
$$
(2xy^4 - 2\frac{y^3}{x^3}) + (4x^2y^3 + 3\frac{y^2}{x^2})\derivative{y}{x} = 0
$$
The derivatives
$$
\derivative{M}{y} = 8xy^3 - 6\frac{y^2}{x^3} \\
\derivative{N}{x} = 8xy^3 - 6\frac{y^2}{x^3} \\
$$
is equal, so that there exists $\phi$ such $\phi_x = M$ and $\phi_y = N$. So
$$
\phi = \int (2xy^4 - 2\frac{y^3}{x^3}) \d x = x^2y^4 + \frac{y^3}{x^2} + g(y)
$$

$$
\derivative{\phi}{y} = 4x^2y^3 + 3\frac{y^2}{x^2} + g'(y) = 4x^2y^3 + 3\frac{y^2}{x^2}
$$

$$
g'(y) = 0 \\
g(y) = C_1
$$

So, $\phi = x^2y^4 + \frac{y^3}{x^2} + C_1$.

Rewrite original equation, we could get
$$
\derivative{\phi}{x} = 0
$$
That means $\phi = C_2$.

Thus, combine the constant, we get
$$
x^2y^4 + \frac{y^3}{x^2} = C
$$
which is the solution.

#### Problem 4

From the problem, call the money in the bank $S$, the interest rate $r = 0.0525$, the inflation rate $q = 0.025$, the base withdraw $D = 20000$.

Written in discrete form, we could find such relationship
$$
\begin{align}
S(t + \Delta{t}) &= (S(t) - D(1+q)^t\Delta{t})(1 + r\Delta{t}) \\
								 &= S(t) + rS(t)\Delta{t} - D(1+q)^t\Delta{t} - D(1 +q)^tr{\Delta{t}}^2
\end{align}
$$
So, as $\Delta{t} \to 0$
$$
\derivative{S}{t} = rS - D(1 + q)^t
$$
So
$$
\derivative{S}{t} - rS = - D(1 + q)^t
$$
So, let integrating factor $I = e^{\int -r \d t} = e^{-rt}$

So,
$$
S = -e^{rt}\int e^{-rt}D(1+q)^t  \d t \\
= -e^{rt} (\frac{e^{-rt}D(1+q)^t}{\ln(q+1) - r} + \frac{D}{\ln(q+1) - r} + S(0)\mu(0)) \\
= -e^{0.0525t} (\frac{D(e^{-0.0525t}(1+0.025)^t - 1)}{\ln(0.025+1) - 0.0525}  + 450000)
$$
Set $S(t) = 0$, we could solve the equation, and the result is $t = 35.336$, which means, in real scenario, that her money will last $16$ year to sustain her life.





