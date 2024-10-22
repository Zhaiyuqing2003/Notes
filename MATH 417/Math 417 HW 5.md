$$
\newcommand\F{\mathbb F}
\newcommand\u{\bold u}
\newcommand\v{\bold v}
\newcommand\nil{\bold 0}
\newcommand\bmatrix[1]{\begin{bmatrix}#1\end{bmatrix}}
$$

#### Exercise 2.6.3

>Prove Proposition 2.6.8: If $(G, \ast)$ is a group and $H \sub G$ is a subgroup, then the group operation on $G$ restrict to an operation on $H$ making it into a group

**Associativity:**  

Since for all $g, h \in H$, also $g, h \in G$, thus $g \ast h = h\ast g$, and thus the operation $\ast$ in $H$ is also associative.

**Idenitity**:

Since for all $g \in H$, $g \in G$, $g^{-1} \in G$, therefore $g \ast g^{-1} = e \in G$, and since $g^{-1} \in H$ and that for all $g, h \in H$, $g \ast h \in H$, thus $e \in H$. Therefore, there is an identity $e \in H$, and for all $g \in H$, $g \in G$, and $e \ast g = g \ast e = g$. 

**Inverse**:

Since for all $g \in H$, $g^{-1} \in H$, and $g \in G$ and $g^{-1} \in G$, and thus $g \ast g^{-1} = g^{-1} \ast g = e \in H$ 

#### Exercise 2.6.4

>Prove that the roots of unity $C_n$, defined in Example 2.3.18 form a subgroup of the group $S^1$ from Example 2.6.12

$C_n = \{ e^{2\pi ki / n} | k \in {0, \cdots, n-1} \}$

$S^1 = \{ e^{i\theta} | \theta \in R \}$ with the complex number multiplicaiton.

$C_n$ is a subset of $S^1$ since any $e^{2\pi ki / n} \in C_1$ is also $e^{i(2\pi k / n)} \in S^1$ since $2\pi k \in R$

1. suppose $g = e^{2\pi k i / n}, h = e^{2\pi j i / n}$, $k \in {0, \cdots, n-1}, j \in {0, \cdots, n-1}$ from $C_n$, then $g \ast h = e^{2\pi k i / n}e^{2\pi ji / n} = e^{2\pi(j+k)i / n} = e^{2\pi ai / n} e^{2\pi mni / n} = e^{2\pi a i / n} \in C_n$ where write $j + k = mn + a$, where $m \in \Z$, and use the fact that $e^{2\pi i} = 1$
2. for $g = e^{2\pi ki/n}$,$k \in {0, \cdots, n-1}$,  the $g^{-1}$ is $e^{-2\pi ki / n}$ because $g \cdot g^{-1} = e^{0} = 1$ is also in $C_n$ since
   1. If $k = 0$, then $e^{-2\pi k i / n} = e^{2\pi 0i / n} \in C_n $
   2. If $k \in 1, \cdots, n - 1$, the $e^{-2 \pi k i / n } = e^{2\pi (n - k)i / n}e^{-2\pi ni/ n} = e^{2\pi (n-k)i /n } \in C_n$ since $n - k \in 1, \cdots, n - 1$. 

Thus, $C_n$ is subgroup of $S^1$

#### Exercise 2.6.9

>Suppose $R$ is a ring and $X$ is a nonempty set. Complete the proof that $R^X$ forms a ring by proving (a) that pointwise addition on $R^X$ is commutative, (b) 0 is an additive identity, (c) $-f$ is the additive inverse of any $f \in R^X$ (and so $(R^X, +)$ is abelian group), and (d) multiplication distributes over addition. If $R$ is a commutative ring, prove that $R^X$ is a commutative ring. If $R$ has 1, prove that function $1(x) =  1$ is a $1$ for $R^X$

1. Suppose $f, g \in R^X$, then $(f + g)(x) = f(x) + g(x) = r_1 + r_2$, $r_1, r_2 \in R$, since the $+$ on $R$ is communtative, $f(x) + g(x) = r_1 + r_2 = g(x) + f(x) = (g + f)(x)$. Thus, the pointwise addition on $R^X$ is commutative.
2. Suppose $f \in R^X$ and $0(x) = 0$, $(f + 0)(x) = f(x) + 0(x) = f(x)$. Thus $f + 0 = f$, and $0(x) = 0$ is indeed additive identity.
3. for $f \in R^X$, $(-f)(x) = -f(x)$  $(f + (-f))(x) = f(x) + (-f(x)) = 0 = 0(x)$, and thus $f + (-f) = 0$. $-f$ is indeed additive inverse.
4. for $f, g, h \in R^X$, $(f(g+h))(x) = f(x)((g+h)(x)) = f(x)(g(x) + h(x)) = f(x)g(x) + g(x)h(x) = (fg)(x) + (fh)(x)$ and thus $f(g + h) = fg + fh$
5. If $R$ is commutative ring, then suppose $f, g \in R^X$, $(fg)(x) = f(x)g(x) = g(x)f(x) =(gf)(x)$, $fg =gf$ and $R^X$ is also a commutative ring.
6. If $R$ has 1, then $1(x) = 1$, for $f \in R^X$, $(1f)(x) = 1(x)f(x) = 1f(x) = f(x) = f(x)1 = f(x)1(x) = (f1)(x)$, and thus $1f = f1 = f$, the $1(x) =x $ is the $1$ for $R^X$ 

####  Exercise 2.6.11

> Suppose $\F$ is any field. Find a pair of linear transformations $S, T \in \mathcal{L}(\F^2, \F^2)$ such that $ST \neq TS$

Let $T(\bmatrix{a \\ b}) = \bmatrix {-a \\ b}$ and $S(\left[ \matrix{a \\ b} \right]) = \begin{bmatrix}a - b \\ b \end{bmatrix}$, then $TS(\begin{bmatrix} a \\ b \end{bmatrix}) = T(\begin{bmatrix} a - b \\ b\end{bmatrix}) = \begin{bmatrix}b - a \\ b\end{bmatrix}$but $ST = (\bmatrix{a \\ b}) = S(\bmatrix{-a \\ b}) = \bmatrix{-a - b \\ b}$, and thus $ST \neq TS$

#### Exercise 3.1.1

>Prove part (ii) of Proposition 3.1.1
>
>(i) If $g, h \in G$ and either $g \ast h = h$ or $h \ast g = h$, then $g = e$
>
>(ii) If $g, h \in G$ and $g \ast h = e$ then $g = h^{-1}$ and $h = g^{-1}$

If $g, h \in G$, and $g \ast h = e$, then $g^{-1} \ast g \ast h = g^{-1}\ast e \to e \ast h = g^{-1}$. that means $h = g^{-1}$. Also

$g \ast h = e$, then $g \ast h \ast h^{-1} = e \ast h^{-1} \to g \ast e = h^{-1}$, that means $g = h^{-1}$. 

#### Exercise 3.1.3

>Suppose that $G$ is a nonempty set with an associative operation $\ast$ such that the following holds:
>
>1. There exists an element $e \in G$ so that $e \ast g = g$ for all $g \in G$ and
>2. for all $g \in G$, there exists an element $g^{-1} \in G$ so that $g^{-1} \ast g = e$
>
>Prove that $(G, \ast)$ is a group
>
>The difference between this and the definition of a group is that we are only assuming that $e$ is a "left identity", and that elements have a "left inverse". Of course, we could have replaced "left" with "right" and there is an analogous definition of a group. *Hint : Start by proving that if $g \in G$ and $g \ast g = g$, then $g = e$. Then prove that $g \ast g^{-1} = e$ (that is, the left inverse is also a right inverse for the left identity). Finally, prove that the left identity is also a right identity.*

If $g \in G$ and $g \ast g = g$, then $g^{-1} \ast g \ast g = g^{-1} \ast g \to e \ast g = e \to g = e$ **(Eq 1)**. 

If $g \in G$, then $(g \ast g^{-1}) \ast (g\ast g^{-1}) = g \ast (g^{-1} \ast g ) \ast g^{-1} = g \ast e \ast g^{-1} = g\ast g^{-1}$. Therefore, according to **(Eq 1)** that must mean $g \ast g^{-1} = e$ **(Eq 2)** 

If $g \in G$, according to **(Eq 2)** $g \ast g^{-1} = e$, thus $g \ast g^{-1} \ast g = e \ast g = e$, and thus $g \ast e = e \ast g = e$. **(Eq 3)**

With the properties already holds and **(Eq 2)** and **(Eq 3)**, $(G,\ast)$ is a group.

