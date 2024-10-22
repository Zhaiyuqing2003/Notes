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
$$

#### Question 1

##### (a)

So
$$
x_a = \fac 495000 - 10^6 \cdot 0.5/\sqrt {10^6 \cdot 0.5 \cdot 0.5}; = -10 \qquad
x_b = \fac 505000 - 10^6 \cdot 0.5/\sqrt {10^6 \cdot 0.5 \cdot 0.5}; = 10
$$
so we know that 
$$
P(x \in [-10, 10]) \approx \int_{-10}^{10} \(\fac 1/\sqrt{2\pi};); \exp(\fac -u^2/2;)\d u
$$

##### (b)

So
$$
x = \fac 9000 - 10^4 \cdot 0.5/\sqrt {10^4 \cdot 0.5 \cdot 0.5}; = 80
$$
so we know that
$$
P(x \in [80, \infin)) = \int_{80}^{\infin} \(\fac 1/\sqrt{2\pi};); \exp(\fac -u^2/2;)\d u
$$


##### (c)

So
$$
x_a = \fac 40 - 10^2 \cdot 0.5/\sqrt {10^2 \cdot 0.5 \cdot 0.5}; = -2 \qquad x_b = \fac 60 - 10^2 \cdot 0.5/\sqrt {10^2 \cdot 0.5 \cdot 0.5}; = 2
$$
so we know that
$$
P(x \in (-\infin, -2] \cup [2, \infin)) = \int_{-\infin}^{-2} \(\fac 1/\sqrt{2\pi};); \exp(\fac -u^2/2;)\d u + \int_{2}^{\infin} \(\fac 1/\sqrt{2\pi};); \exp(\fac -u^2/2;)\d u
$$

#### Question 2

$$
\text{stderr}(\sets x) = \fac \text{stdunbiased}(\sets x)/\sqrt N;
$$

Count blue as 1 and yellow as 0, we get:
$$
\text{stdunbiased}(\sets x) = \sqrt{\fac 3 \cdot (1-0.3)^2 + 7\cdot (0-0.3)^2/10 - 1;} \approx 0.483
$$
So
$$
\text{stderr}(\sets x) = \fac \text{stdunbiased}(\sets x)/\sqrt N; \approx 0.153
$$
Assume we have a sample of $N$ now, then in this case we assume that 30% of the sample is blue card, and 70% of them is yellow card. So
$$
\text{stdunbiased}(\sets x) = \sqrt{\fac 0.3N \cdot 0.7^2 + 0.7N \cdot 0.3^2/ N - 1;}
$$
and so
$$
\text{stderr}(\sets x) = \fac \sqrt{0.3N \cdot 0.7^2 + 0.7N \cdot 0.3^2}/\sqrt {N(N-1)}; \le 0.05
$$
which is
$$
\fac 0.21 / N - 1; \le 0.0025 \\
$$
and
$$
N \ge \fac 0.21/0.0025; + 1 = 85
$$
So, we need to repeat it at least 85 times.

#### Question 3

So we know that the $\text{stderr}$​ is (assuming the given standard deviation is the stdunbiased as pointed out in Ed)
$$
\stderr(\sets x) = \fac \stdunbiased(\set x)/\sqrt N; = \fac 75/\sqrt {40}; \approx 11.86
$$
We are assuming that our sample is large enough so that we use standard normal distribution instead of t-distribution.

We are asked to find the 68% confidence interval, so we want the $z = 1$, and so
$$
[340 - 11.86, 340 + 11.86] \to [328.14, 351.86]
$$
We are asked to find 80% confidence interval, so $ 1- 2\alpha = 0.8$, and $\alpha = 0.1$, that means we want to find $P(\set{T\ge z}) = 0.1$ and that is $z \approx 1.28$, and so
$$
[340 - 1.28 \cdot 11.86, 340 + 1.28 \cdot 11.86] \to [324.82, 355.18]
$$
For Problem 6.5, the t-distribution should be used as the sample size is too small. The degree of freedom in this case $N - 1 = 9$​.



#### Question 4

##### (a)

So the sample mean is $\std x = 1026/2009 \approx 0.511$, and the $\stderr$ is
$$
\stderr(\set x) = \fac \stdunbiased(\set x)/\sqrt N; = \sqrt {\fac 1026 \cdot {(983/2009)}^2 + 983 \cdot {(1026/2009)}^2 /2009 \cdot 2008;} = 0.0111
$$
So we see that roughly $z = 2.58$ will give us the $P(\sets{T > z}) = 0.005 = \alpha$, which will create a 99% confidence interval. Therefore, the confidence interval is
$$
[0.511 - 2.58 \cdot 0.0111, 0.511 + 2.58 \cdot 0.0111] \to [0.482, 0.539]
$$

##### (b)

So the sample mean is $\std x = 983/2009 \approx 0.489$, and the stderr is
$$
\stderr(\set x) = \fac \stdunbiased(\set x)/\sqrt N; = \sqrt {\fac 1026 \cdot {(983/2009)}^2 + 983 \cdot {(1026/2009)}^2 /2009 \cdot 2008;} = 0.0111
$$
So we see that roughly $z = 2.58$ will give us the $P(\sets{T > z}) = 0.005 = \alpha$, which will create a 99% confidence interval. Therefore, the confidence interval is
$$
[0.489 - 2.58 \cdot 0.0111, 0.489 + 2.58 \cdot 0.0111] \to [0.461, 0.518]
$$

##### (c)

The intervals does overlap. That means it's possible that the actual population mean of boy could be larger than the actual population mean of girl. (As opposed to what sample shows). This is expected as we generally think that the female/male birth should be 50%/50%.



#### Problem 5

The mean, stderr for the sample 1 is
$$
\mean x= 2.98 \quad \stderr(\set x ) = 0.052
$$
and confidence interval
$$
[2.849, 3.116]
$$


Do the same thing for region 3
$$
\mean x= 0.781 \quad \stderr(\set x ) = 0.0424
$$
and confidence interval
$$
[0.672, 0.891]
$$
These interval does not overlap. We could say that the mean of the flavanoids for wine from Region 1 is higher than the wine from Region 3.





#### Problem 6

The normal distribution has the formula of
$$
f(x) = \iv \sigma \sqrt{2 \pi}; e^{-\half (\fac x - \mu/\sigma;)^2}
$$
We could first consider the case for the standard normal distribution
$$
N(x) = \iv\ \sqrt{2 \pi}; e^{-\half x^2}
$$
So
$$
E[N(x)] = \int_{-\infin}^{\infin} \iv\ \sqrt{2 \pi}; e^{-\half x^2}  x\d x = 0
$$
Since we could see the integrand is an odd function.

So
$$
\text{Var}[N(x)] = \int_{-\infin}^{\infin} (x - E[N(x)])^2 N(x) \d x = \int_{-\infin}^{\infin} \iv\ \sqrt{2 \pi}; e^{-\half x^2}  x^2 \d x = 1
$$








#### Code

```python
from ucimlrepo import fetch_ucirepo 
  
# fetch dataset 
wine = fetch_ucirepo(id=109) 
  
# data (as pandas dataframes) 
X = wine.data.features 
y = wine.data.targets 
  
# metadata 
print(wine.metadata) 
  
# variable information 
print(wine.variables) 

# calculate the mean value of hte flavanoids variable for wine from region 1

region_1 = []
x = list(X["Flavanoids"])

for i in range(len(X["Flavanoids"])):
    if y["class"][i] == 1:
        region_1.append(x[i])

mean = sum(region_1)/len(region_1)

# calculate the stderr of the flavanoids variable for wine from region 1
stdunbiased = (sum([(i - mean)**2 for i in region_1])/(len(region_1)-1))**0.5
stderr = stdunbiased/(len(region_1)**0.5)

# calculate the 99% confidence interval of the flavanoids variable for wine from region 1
print(mean - 2.576*stderr, mean + 2.576*stderr)
print(mean, stderr)

region_3 = []
x = list(X["Flavanoids"])

for i in range(len(X["Flavanoids"])):
    if y["class"][i] == 3:
        region_3.append(x[i])

mean = sum(region_3)/len(region_3)

# calculate the stderr of the flavanoids variable for wine from region 3
stdunbiased = (sum([(i - mean)**2 for i in region_3])/(len(region_3)-1))**0.5
stderr = stdunbiased/(len(region_3)**0.5)

# calculate the 99% confidence interval of the flavanoids variable for wine from region 3
print(mean - 2.576*stderr, mean + 2.576*stderr)
print(mean, stderr)
```

