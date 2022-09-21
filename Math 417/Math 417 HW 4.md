
$$
\newcommand\F{\mathbb F}
\newcommand\u{\bold u}
\newcommand\v{\bold v}
\newcommand\nil{\bold 0}
$$

#### Exercise 2.3.3

>Let $f = x^5 + 2x^4 + 2x^3 - x^2 - 2x - 2$ and $g = 4x^4 + 16$. Find $\gcd(f, g)$ and express it as $uf + vg$ 

$$
\begin{align}
\gcd(f, g) &= \gcd(2x^3 - x^2 - 6x - 10, 4x^4 + 16)  \\
&= \gcd(2x^3 - x^2 -6x - 10, 13x^2 + 26x + 26) \\
&= \gcd(0, 13x^2 + 26x + 26)
= 13x^2 + 26x + 26
\end{align}
$$

Thus, the **greatest common divisor** is $k(x^2 + 2x + 2)$, $k \in \mathbb F$, where $\mathbb F$ is the field the polynomials defined in. Or, the **monic greatest common divisor** is $x^2 + 2x + 2$. and from calculation:
$$
13(x^2 + 2x + 2) = -(2x+1)f + (\frac{1}{2}x^2 + {5\over4}x + \frac{3}{2})g \\
k(x^2 + 2x + 2) = -{k\over13}(2x+1)f + {k\over13}(\frac{1}{2}x^2 + {5\over4}x + \frac{3}{2})g
$$

#### Exercise 2.3.5

>Prove that a polynomial $f \in \mathbb F[x]$ of degree 3 is irreducible in $\mathbb F[x]$ if it does not have a root in $\mathbb F$

We could first write its contrapositive: *if a polynomial $f \in \mathbb F[x]$ of degree 3 does have a root in $\mathbb F$, then it's not irreducible*.

Thus, if $f$ have a root in $\F$, $f$ could be write as $f = (x - h)(ax^2 + bx + c)$ where $h$ is the root, and $a, b, c \in \F$. "**not irreducible**" means that there exists a situation that we write $f = uv$ with $u, v \in \F[x]$, both $u$ and $v$ are not unit. Since we could write $f$ as $f = (x-h)(ax^2 + bx + c)$, that means there is such situation, and thus $f$ is **not irreducible**.

Therefore, we prove the contrapositive of original claims, and hence the original claims.

#### Exercise #1

>Come up with a polynomial $g \in \Q[x]$ that has no roots in $\Q$ but is ***not*** irreducible.

Let $g = x^4 - 4x^2 + 4$, it's obvious that we could factor $q$ as $q = (x^2 - 2)(x^2 - 2)$. But all roots $x = \pm\sqrt 2$ is not in the $\Q$.

#### Exercise 2.3.6

>Consider the polynomial $f(x) = x^3 - x + 2 \in \Z_5[x]$ (more precisely, $f(x) =[1]x^2 - [1]x + [2]$). Prove that $f$ is irreducible in $\Z_5[x]$. Hint : Use *Exercise 2.3.5*

Since
$$
f([0]) = [2] \\
f([1]) = [2] \\
f([2]) = [3] \\
f([3]) = [1] \\
f([4]) = [2]
$$
which means there is no $x \in Z_5[x]$ such $f(x) = [0]$. Therefore $f(x)$ does not have root in $\Z_5[x]$. According to Exercise 2.3.5, that means $f(x)$ is irreducible in $\Z_5[x]$.

#### Exercise #2

>Consider the polynomial $p(x) = 3x^3 + 2x^2 + 4x + 2 \in \Z_7[x]$ (more precisely, $f(x) = [3]x^3 + [2]x^2 + [4]x + [2]$). Prove that $f$ is not irreducible in $\Z_7[x]$.

The process is similar to Exercise 2.3.6. Since
$$
f([0]) = [2] \\
f([1]) = [4] \\
f([2]) = [0]
$$
Thus, there exist a root for $f$, using the contrapositive of the Exercise 2.3.5: *if a polynomial $f \in \mathbb F[x]$ of degree 3 does have a root in $\mathbb F$, then it's not irreducible*. Therefore, $f$ is **not irreducible**.

#### Exercise 2.5.1

> Suppose $T$: $\R^n \to \R^n$ is a linear transformation. Prove that $T$ is an isometry if and only if $T(\bold v) \cdot T(\bold w) = \bold v \cdot \bold w$. Recall that an isometry is a *bijection* that preserves distance.
>
> ​	Note: When proving that if $T(\bold v) \cdot T(\bold w) = \bold v \cdot \bold w$ then is an isometry, make sure you verify that $T$ is a bijection

First, starting from $T$ is an isometry. That means for two vector $\u, \v \in \R^n$. $|T(\u) - T(\v)| = |\u - \v|$. Consider the special case when $\v = \nil$. Then since $T$ is a linear transformation $T(\nil) = \nil$ and thus $|T(\u) - \nil | = |u - \nil| = |T(\u)| = |u|$ for any $\u \in \R^n$, and thus
$$
\begin{align}
|T(\u) - T(\v)|^2 &= |\u - \v|^2 \\
(T(\u) - T(\v))^2 &= (\u - \v)^2 \\
|T(\u)|^ 2 + |T(\v)|^2 - 2T(\u)\cdot T(\v) &= |\u|^2 + |\v|^2 - 2\u\cdot \v \\
T(\u)\cdot T(\v) &= \u \cdot \v
\end{align}
$$

Conversely, starting from $T(\u)\cdot T(\v) = \u \cdot \v$. Consider the special case $\u = \v$, then that means
$$
\begin{align}
T(\u) \cdot T(\u) &= \u \cdot \u \\
|T(\u)|^2 &= |\u|^2 \\
|T(\u)| &= |\u|
\end{align}
$$
for all $\u \in \R^n$, and do the reverse process of above
$$
\begin{align}
T(\u)\cdot T(\v) &= \u \cdot \v \\
|T(\u)|^ 2 + |T(\v)|^2 - 2T(\u)\cdot T(\v) &= |\u|^2 + |\v|^2 - 2\u\cdot \v \\
(T(\u) - T(\v))^2 &= (\u - \v)^2 \\
|T(\u) - T(\v)|^2 &= |\u - \v|^2 \\
|T(\u) - T(\v)| &= |\u - \v| \\
\end{align}
$$
We also need to prove that $T$ is a bijection, proving injectivity is easy: Suppose $T(\u) = T(\v)$, then
$$
|T(\u) - T(\v)| = |\u - \v| \\
0 = |\u - \v| \\
0 = \sum_{i}^{n}(u_i - v_i)^2
$$
Since $(u_i - v_i)^2 \geq 0$ for all $i \in [1, n]$, that means $(u_i - v_i) = 0$, and that is $u_i = v_i$ for all $i \in [1, n]$ and thus $\u = \v$. For surjectivity, use the standard orthonormal basis $e_1, e_2 \cdots e_n$ of $\R^n$. we find for all $T(e_i), T(e_j)$, $i, j \in [i, j]$
$$
|T(e_i)| = |e_i| = 1\\
T(e_i) \cdot T(e_j) = e_i \cdot e_j = \begin{cases}
 1 \quad i = j \\
 0 \quad i \neq j
\end{cases}
$$
that means these transformed $n$ vectors,  $T(e_i)$, $i \in [1, n]$ are still orthonormal and formed a orthonormal basis of $\R^n$. That means $e_i$, $i \in [1, n]$ could be expressed as the linear combination of these $T(e_i)$, $i \in [i, n]$.

Since $T$ is a linear map, then suppose any $\bold w \in R^n$, it could be expressed as
$$
\begin{align}
\bold w &= \sum_{i}^{n}w_iT(e_i) \quad (w_i \in \R)\\
&= T\left(\sum_{i}^{n}w_ie_i\right)
\end{align}
$$
and the inner $\sum_{i}^{n}w_ie_i \in \R^n$ and thus $T$ is surjective.

Thus $T$ is bijective, and is a isometry.



