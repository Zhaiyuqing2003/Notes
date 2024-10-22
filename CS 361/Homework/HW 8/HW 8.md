$$
{\def\fac#1/#2;{\frac{#1}{#2}}}
{\def\dfac#1/#2;{\dfrac{#1}{#2}}}
{\def\hx{{\hat{x}}}}
{\def\(#1);{\left( {#1} \right)}}
{\def\sets#1{  \left\{  \matrix{#1}  \right\}   }}
{\def\mean#1{\text{mean} \( \sets{#1} ); }}
{\def\std#1{\text{std}   \( {\sets{#1}} ); }}
{\def\var#1{\text{var}   \( {\sets{#1}} ); }}
{\def\stdsq#1{\text{std}^{2} \( {\sets{#1}} ); }}
{\def\align[[#1]]{   {\begin{align*}#1\end{align*}}   }  }
{\def\alignbr[[[#1]]]{\left\{ \ \begin{align*}#1\end{align*} \right. }}
{\def\inv#1{\frac{1}{#1}}}
{\def\iv#1;{\frac{1}{#1}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\|#1|;{\left| #1 \right|}}
{\def\median#1{\text{median}  \( \sets {#1} ); }}
{\def\half{\frac{1}{2}}}
{\def\quarter{\frac{1}{4}}}
{\def\sqt#1]{\sqrt{#1}}}
{\def\tsub#1;{_{\text{#1}}}}
{\def\tsup#1;{^{\text{#1}}}}
{\def\comb#1in#2;{
\left(\matrix{#2\\#1}\right)
}}
{\def\rfac#1//#2;;{\frac{#1}{#2}}}
{\def\rdfac#1//#2;;{\dfrac{#1}{#2}}}
{\def\rrfac#1///#2;;;{\frac{#1}{#2}}}
{\def\rrdfac#1///#2;;;{\dfrac{#1}{#2}}}
{\def\intinf{\int_{-\infin}^{\infin}}}
{\def\intupinf{\int_{0}^{\infin}}}
{\def\intdwinf{\int_{-\infin}^{0}}}
{\def\it from#1to#2;{\int_{#1}^{#2}}}
{\def\eval#1 at #2;{\left.#1\right|_{#2}}}
{\def\eal#1 from #2 to #3;{\left.#1\right|_{#2}^{#3}}}
{\def\d{\text{d}}}
{\def\stderr{\text{stderr}}}
{\def\stdunbiased{\text{stdunbiased}}}
{\def\deri#1/#2;{\frac{\d #1}{\d #2}}}
{\def\pderi#1/#2;{\frac{\part #1}{\part #2}}}
$$

#### Problem 1

$$
P(x|\theta) = \theta e^{-\theta x} \\
X = \sum x_i\\
L(\theta) = \prod P(x_i|\theta) = \theta^N e^{-\theta X} \\
\log \pderi L(\theta)/\theta; = \pderi \log (\theta^N e^{-\theta X})/\theta; = \pderi N\log(\theta) - \theta X/\theta; = \fac N/\theta; - X = 0 \\
\hat \theta = \fac N/X;
$$



#### Problem 2

##### (a)

$$
\hat \theta_1 = \fac 10/4; = 2.5 \\
\hat \theta_2 = \fac 5/3; \\
\hat \theta_3 = \fac 12/5;
$$

##### (b)

$$
\hat \theta_4 = \fac 13/6;
$$

##### (c)

$$
\hat \theta = \fac 10 + 5 + 12 + 13/4 + 3 + 5 + 6; = \fac 40/18; = \fac 20/9;
$$



#### Problem 3

##### (a)

The MLE of proportion of zero slots on the wheel
$$
\hat\theta = \fac 1/r + 1;
$$
So the count is simply
$$
N\theta + 36 = N \\
N(1 - \theta) = 36\\
\hat N = \fac 36/1-\theta; = 36\fac r + 1/r;  \\
$$

##### (b)

It's unreliable, as we have only taken one observation. (and for a geometric distribution, the $r$ has a large std which varies largely across different observations)

##### (c)
$$
R = \sum r_i \\
L(\theta) = (1-\theta)^{R} \theta^k \\
\pderi L(\theta)/\theta; = -R(1-\theta)^{R - 1} \theta^k + k(1 - \theta)^R \theta^{k - 1} = 0 \\
R(1- \theta)^{R - 1} \theta^{k} = k(1 - \theta)^R \theta^{k - 1} \\
R\theta = k(1 - \theta) \\
R\theta =k-k\theta \\
\theta= \fac 1 /R/k + 1; = \fac 1/\bar r + 1;
$$

So, similarly, $\hat N = 36 \cdot \fac  \bar r + 1/ \bar r;$



##### Problem 4

##### (a)

$$
P(n|0) = 0\\
P(n|1) = 1/37 \\
P(n|2) = 2/38 \\
P(n|3) = 3/39
$$

##### (b)

$$
P(0|D) = \fac P(D|0) \cdot P(0)/P(D);
$$

$P(0) = 0.1$, so the observations must be able to happen, given that there are zero holes in the roulette, for $P(0|D) \neq 0$

##### (c)

$$
P(z|D) = \fac P(D|z) \cdot P(z) / P(D);
$$

Could use a binomial distribution for the data
$$
P(D|0) = 0 \\
P(D|1) = \comb 34 in 36;(1/37)^2(36/37)^{34} \approx 0.181\\
P(D|2) = \comb 34 in 36;(2/38)^2(36/38)^{34} \approx 0.278 \\
P(D|3) = \comb 34 in 36;(3/39)^2(36/39)^{34} \approx 0.245 \\
$$

$$
P(D) = P(D|0)P(0) + P(D|1)P(1) + P(D|2)P(2) + P(D|3)P(3) \\
= 0 + 0.181 \cdot 0.2 + 0.278 \cdot 0.4 + 0.245 \cdot 0.3 \\
= 0.221
$$

So
$$
P(0|D) = 0 \\
P(1|D) = 16.42\%\\
P(2|D) = 50.28\% \\
P(3|D) = 33.31\% 
$$


#### Problem 5

##### (a)

$$
L(\theta) = \comb 35 in 50;\theta^{35}(1-\theta)^{15}
$$

##### (b)

Ignore the last toss as the each toss is independent
$$
L(\theta) = \comb 54 in 99;\theta^{54}(1-\theta)^{45}
$$

##### (c)

$$
L(\theta) = \theta(1-\theta)^2 \cdot \comb 5 in 10;\theta^{5}(1-\theta)^{5} = \comb 5 in 10;\theta^{6}(1-\theta)^{7} 
$$







