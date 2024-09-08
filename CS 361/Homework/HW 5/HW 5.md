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
$$

#### Problem 1


$$
\intinf g(x) = \it from -\pi/2 to \pi/2; \cos(x) = \eal \sin(x) from -\pi/2 to \pi/2; = 2
$$
We need to make $\intinf f(x) = 1$. So, $f(x) = \half g(x)$
$$
\intupinf f(x) = \it from 0 to \pi/2; \half \cos(x) = \half \eal \sin(x) from 0 to \pi/2; = \half
$$
Then we calculate the integral of
$$
\it from -1 to 1; f(x) = \it from -1 to 1; \half \cos(x); = \half \eal \sin(x) from -1 to 1; = \sin(1) \approx 0.842 = 84.2\%
$$

#### Problem 2

##### (a)

There is 8 possible combinations

```
TTT, HTT, THT, TTH, HHT, HTH, THH, HHH
```

the case where there are 2 T and 1 H, or 2 H and 1 T will have a odd person.

So the probability is $6/8 = 75\%$

##### (b)

It is just the case where we have 3T and 1H or 3H and 1T.

```
combine(4, 1) + combine(4, 3) = 8
```

and all possible combination is just $2^4 = 16$

So the probability is $8/16 = 50\%$

##### (c)

It is just the case where we have 4T and 1H or 1T and 4H

```
combine(5, 1) + combine(5, 4) = 10
```

and all possible combination is just $2^5 = 32$.

So the probability is $10/32 = 5/16 = 31.25\%$​

This is geometric distribution, with stopping probability $p = 5/16$, so the expected number of rounds is $1/p = 16/5 = 3.2$.

#### Problem 3

The chance of getting same side of the coin is $p^2 + (1-p)^2$, and the chance of getting different side of the coin is $2p(1-p)$, (either head then tail or tail then head) and when we get the change of reporting the coin, we choose first of them, and therefore reporting the change of head is $P(\text{head then tail}) = p(1-p)$ for each roll, and reporting tail (tail then head) is also $p(1-p)$ for each roll, the remaining chance goes to rolling the dices again. So we see that when we actually reporting the coin, $P(H|\text{report}) = 1/2$ and same for $P(T|\text{report}) = 1/2$. So, when we report the dice, we will have a same probability for reporting head and tail.

Since this is an geometric sequence with the probability of $2p(1-p)$ (stopping condition). So, the mean (number of pair dice flips) is $1/(2p(1-p))$, but since you flip coin twice for one step of this process, so the total number of flips is actually $1/(p(1-p))$



#### Problem 4

##### (a)

Since woman and man will appear at same probability, so $p = 0.5$, and therefore we have the binomial distribution of $P(h;6, 0.5) = \comb h in 6; 0.5^6 $. The chance of pilot flies is $P(H \ge 1)$ so
$$
\sum_{i = 1}^{6}\comb i in 6;0.5^6 = \fac 63/64; = 98.4375\%
$$

##### (b)

We basically want to find the chance that there are less than s passengers appear at flight. Then number of passengers that appear at flight is
$$
P(h;t,p) = \comb h in t;p^h(1-p)^{t-h}
$$
and we want $P(H < s)$. So it is
$$
\sum_{h = 0}^{s - 1} P(h; t, p) = \sum_{h = 0}^{s - 1}\comb h in t; p^h (1 - p)^{t-h} 
$$


#### Problem 5

So we have the Poisson Distribution of $P(X = k) = \fac 0.1^k e^{-0.1}/k!;$.

The probability that there are no new post means $X = 0$, so $P(X = 0) = \fac 0.1^0 e^{-0.1}/0!; = e^{-0.1} \approx 90.4837\% $

The probability that there is exactly one new post when you look is $P(X = 1) = \fac 0.1^1 e^{-0.1}/1!; = 0.1e^{-0.1} \approx 9.04837\%$

The probability that there are exactly two new posts is then $P(X = 2) = \fac 0.1^2e^{-0.1}/2!; = 0.005\cdot e^{-0.1} = 0.452419\%$

The intensity in this case is $\lambda = 0.1 \cdot 24 = 2.4$, and therefore $P'(X = 0) = \fac 2.4^0e^{-2.4}/0!; = e^{-2.4} = 9.0718\%$



#### Problem 6

From 5.6, we know that
$$
\sum_{i = 1}^{\infin}i^2 r^i = \fac r(1+r)/(1-r)^3;
$$
We see that
$$
E[X^2] = \sum_{i = 1}^{\infin} i^2(1-p)^{i - 1}p = \fac p/1-p;\sum_{i = 1}^{\infin} i^2(1-p)^i = \fac p/1-p;\fac (1-p)(2-p)/(1 - (1-p))^3; = \fac p/1-p; \fac (1-p)(2-p)/p^3;
$$
as expected, then using that
$$
Var[X] = E[X^2] - E[X]^2 =  \fac p/1-p; \fac (1-p)(2-p)/p^3; - \fac 1/p^2; = \fac 2-p/p^2; -\fac 1/p^2; = \fac 1-p/p^2;
$$
as expected.

