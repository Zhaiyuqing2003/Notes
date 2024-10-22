$$
\newcommand\d{\text{d}}
$$

#### Problem 1

$y = Ce^{t^2}$. So, 
$$
y' = 2Cte^{t^2} = 2t Ce^{t^2} = 2ty
$$
the $y = Ce^{t^2}$ indeed is the solution to $y' = 2ty$. 

Apply condition $y(0) = 3$. So
$$
y(0) = Ce^{0^{2}} = C= 3
$$
So, $y$ for this initial condition is $y = 3e^{t^2}$

#### Problem 2

$$
y'(t) = \begin{cases}
	0 \quad  \text{if }t \leq 0 \\
  2t \ \ \, \text{if }t > 0
\end{cases}
$$

If $t \leq 0$, $y' = 0$ and $2\sqrt y = 0$. So $y' = 2\sqrt y$

If $t > 0$, $y' = 2t$ and $2\sqrt y = 2\sqrt{t^2} = 2|t| = 2t$. So $y' = 2\sqrt y$.

Thus $y' = 2\sqrt y$. Also $y(1) = 1^2 = 1$.

So the $y(t)$ is a solution of the IVP.

For $y_{another}(t) = t^2$, $y_{another}'(t) = 2t$. when $t < 0$, $2 \sqrt y_{another} = 2\sqrt{t^2} = 2|t| = -2t$, and $y_{another}'(t) = 2t$. Thus, $y_{another}'(t) \neq y_{another}(t)$ when $t < 0$. So, the $y_{another}(t)$ is not a solution for all real $t$. 

#### Problem 3

First, I will show that $y(t, C) = (t + C)e^{-t}$ for every $C$ satisfies the ODE. 
$$
\derivative{e^ty}{t} = \derivative{e^te^{-t}(t+C)}{t} = \derivative{(t+C)}{t} = 1
$$
So, the function indeed satisfied the ODE.

Then, I will show that every solution has the form $f(t, C)$ for some $C$.
$$
\begin{align}
\derivative{e^ty(t)}{t} &= 1 \\
\int_{0}^{t}\derivative{e^uy(u)}{u} \d u &= \int_{0}^{t}1\ \d u \\
e^ty(t)\bigg|^{t}_{0} &= t \\
e^ty(t) - e^0y(0) &= t \\
e^ty(t) &= t+ y(0) \\
y(t) &= (t + y(0))e^{-t}
\end{align}
$$

where $y(0)$ is a constant. Let $y(0) = C$. So, $y(t) = (t + C)e^{-t}$, which has the form $f(t, C)$ for $C = f(0)$.

Thus, every solution has the form $f(t, C)$ for some $C$.

Thus, $y(t, C) = (t + C)e^{-t}$ is the general solution fo the ODE $\derivative{e^ty}{t} = 1$. 

#### Problem 4

The linear population growth model should be $y' = (b - d)y$. Solve the equation,
$$
\int_{0}^{t}\frac{\d y(u)}{y(u)} = \int_{0}^{t} (b - d)\d u \\
\ln{y(u)}\bigg|^{t}_{0} = (b - d)t \\
\ln y(t) - \ln y(0) = (b-d)t \\
\ln y(t) = (b - d)t + \ln y(0) \\
e^{\ln y(t)} = e^{(b - d)t}e^{\ln y(0)} \\
y(t) = y(0)e^{(b - d)t}
$$
227 million is 227000 thousand. So
$$
y(40) = y(0)e^{(15.9 - 8.7)/1000 \cdot 40} = 227000 \cdot e^{0.288} \approx 302762.91 \text{ thousand}
$$
According to the google, the actual US population is approximately 329500 thousand. The difference between the predicted and actual population is 
$$
\frac{329500 - 302762.91}{329500} = 8.11\%
$$
the linear growth model is definitely not realistic, because the complicated growth mechanic is impossible to be described by single liear growth model.
