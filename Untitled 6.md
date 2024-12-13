$$
\def\encode#1{\langle #1 \rangle}
$$





For a given input $\encode G \#  \encode u \# \encode v$, accept the answer if and only if $\text{Con}(\encode G \#  \encode u \# \encode v)$ and $\text{Con}(\encode G \#  \encode v \# \encode u)$. It should be pretty straightforward to see such algorithm still uses only logspace as it just run the $\text{Con}$ twice, one forward and another one backward.



Define $f(x =\encode G \#  \encode u \# \encode v) = \encode {G'} \#  \encode {(u, 0)} \# \encode {(v, 0)} = y$ where $G' = (V', E')$, where $V' = V \cross \{0, 1\}$ and $E' = \set{ (u, 0) \to (u, 1) \bigm | u \in V} $ $\cup \set{(u,1) \leftrightarrow (v, 0) \bigm | u \to v \in V}$. We see that if $x \in \text{Con}$, then it is obvious that exists a path from $u$ to $v$. Then for each two nodes within that path, call it $s$ and $t$, there will be an undirected path between $(s, 0)$ and $(t, 0)$ in $\encode {G'}$, as $(s, 0) \to (s, 1) \to (v,







Then there exists a Turing machine $M_B$ that $L(M_B) = B$ and have a time bound of $\text{NP}$. Since $A \le_m^{\log} B$, that means there exists a $f(a) = b$ where $a \in A$ if and only if $b \in B$. Therefore, build a Turing machine $M_A$, for an input $x$, run $M_B$ on $f(x)$, and accepts if and only if $M_B$ accepts. It is obvious that $L(M_A) = A$ and since $f$ is a logspace function and both $f$ and $M_B$ could be finished in $\text{NP}$ time bound, so $M_A$ is also under the $\text{NP}$ time bound, and therefore $A \in \text{NP}$



We see that now the total length of the string in Lpad is $x^2$. So we could just simulate the $L$ in $L_{pad}$, the $L_{pad}$ will have $\text{DSPACE}(x^2 = n)$. Also, we need to check structure of the $L_{pad}$, which we only need to check the length of the $x$. Therefore, we see $L_{pad} \in \text{DSPACE}(n)$