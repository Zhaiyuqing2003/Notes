# Inequality Study Problem

## Problem 1

>Prove the following claim by strong induction:
>
>Claim: For all positive integers $n≥2$, $2^nn!<(2n)!$

Prove by induction on $n$.

Base: when $n = 2$, $2^nn! = 4\cdot2 = 8$, $(2n)! = 24$, and thus $2^nn! < (2n)!$ for $n = 2$.

Inductive hypothesis: If the claims hold for $n$ that is $2 \leq n \leq k$, where $k \in \N^+$ and $k \geq 2$, then the claims holds for $k+1$.

Induction:
$$
\frac{2^{k+1}{(k+1)}!}{(2(k+1))!} = \frac{2^kk!}{(2k)!}\frac{2(k+1)}{(2k+2)(2k+1)} = \frac{2^kk!}{(2k)!}\frac{1}{2k+1}
$$
From the inductive hypothesis, $2^kk! \leq (2k)!$, which means ${2^kk!\over(2k)! } \leq 1$

So, since $k \geq 2$, $\frac{2^kk!}{(2k)!}\frac{1}{2k+1} \leq 1$, and thus $\frac{2^{k+1}{(k+1)}!}{(2(k+1))!} \leq 1$, which means $2^{k+1}(k+1)! \leq (2(k+1))!$. 

So, the inductive hypothesis is proved. 

So, the original claim is proved for all positive integer $n \geq 2$.

Q. E. D.  

