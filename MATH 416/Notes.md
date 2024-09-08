### Abstract Linear Algebra

A **Linear system** of $m$ **equation** in $n$ **variable** over $\R$ has the form
$$
\sum_{j = 1}^{n} a_{ij}x_j = b_i, \quad i \in [1, m] 
$$
A **solution** of such system is the one



**REF (reduced echelon form)**: A matrix is in REF if

1. for any $i, j \in [1, m]$, if $[A]_{ik} = 0$ for all $k \in [1, n]$, and exists $[A]_{jk} \neq 0$ for all $k \in [1, n]$, then $i > j$.
2. for any $i \in [1, m]$, define $k$ if all $[A]_{il} = 0$, $l \in [1, k)$ and $[A]_{ik} \neq 0$, then $[A]_{ik} = 1$.
3. for any $i, j \in [1, m]$, define $p$ if all $[A]_{ik} = 0$, $k \in [1, p)$ and $[A]_{ip} \neq 0$, define $q$ if all $[A]_{jl} = 0$, $l \in [1, q)$, and $[A]_{jq} \neq 0$ Then, if $j > i$, $q > p$.

**REF** (human readable): A matrix is in REF if

1. zero rows below non-zero rows

2. row's first non-zero entry is $1$

3. if one row is above another row, its first non-zero entry is prior to the another row's.

   
