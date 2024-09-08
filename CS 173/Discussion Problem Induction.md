# Discussion Problems: Induction

## 11.1 Simple Examples

### (b)

 $\sum^{n}_{k = 1} {1\over k(k+1)} = {n \over n+ 1} (\text{for all positive integers})$

Proof: we will show this formula is true for any positive integer, using induction on  $n$.

Base: For $n = 1$, since $\sum^{1}_{k = 1} {1\over k(k+1)} = {1 \over 2}$, and ${n \over n + 1} = {1 \over 2}$. So, $\sum^{n}_{k = 1} {1\over k(k+1)} = {n \over n+ 1} = {1 \over 2}$

Induction: Suppose the $\sum^{n}_{k = 1} {1\over k(k+1)} = {n \over n+ 1}$ is true for $n$, then we will show that it's also true for $n + 1$.

So, the left side has the form:
$$
\begin{align}
    &\sum^{n + 1}_{k = 1} {1\over k(k+1)} 
\\= &\sum^{n}_{k = 1} {1\over k(k+1)} + {1\over{(n+1)(n+2)}}
\\= &{n\over{n+1}} + {1\over{(n+1)(n+2)}}
\\= &{\frac{n(n+2) + 1}{(n+1)(n+2)}}
\\= &{\frac{(n+1)^2}{(n+1)(n+2)}}
\\= &{\frac{(n+1)}{(n+1) + 1}}
\end{align}
$$
In the above proof, since $n > 0$, so dividing / multiplying the fraction by $n + 1$ and $n + 2$ is okay.

So, the right side has the form: $n+1 \over n+1 + 1$.

So, the right side and the left side has the same form, and so they are equal. The $\sum^{n + 1}_{k = 1} {1\over k(k+1)} = {n \over n+ 1}$ is true.

Q.E.D

### (c)
