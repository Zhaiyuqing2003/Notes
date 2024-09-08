$$
\newcommand\vec[1]{\bold{#1}}
$$

### 1.3.4

(b) the set of all solutions $S$ is
$$
S = \left\{
\begin{bmatrix}
2 \\
1 \\
0 \\
\end{bmatrix}
+ a 
\begin{bmatrix}
-1 \\
-1 \\
1 \\
\end{bmatrix}

\left.
\vphantom{\begin{bmatrix}
foo\\
bar \\
baz \\
\end{bmatrix}}
\right|\
a \in R
\right\}
$$
(d) the set of all solution $S$ is
$$
S = \left\{
\begin{bmatrix}
-3 \\
-4 \\
0 \\
0 \\
\end{bmatrix}
+ a 
\begin{bmatrix}
1 \\
2 \\
1 \\
0 \\
\end{bmatrix}
+ b
\begin{bmatrix}
2 \\
3 \\
0 \\
0 \\
\end{bmatrix}
\left.
\vphantom{\begin{bmatrix}
foo\\
bar \\
baz \\
bee \\
\end{bmatrix}}
\right|\
a, b \in R
\right\}
$$
(f) There is no solution, the set of all solution $S$ is $\empty$

### 1.3.6

(a)

There should exist a three variable pair $x_1, x_2, x_3$ such that
$$
\begin{array}{cccccccc}
1 \cdot x_1 &+& 0 \cdot x_2 &+& 2 \cdot x_3 &=& b_1 \\
0 \cdot x_1  &+& 2 \cdot x_2 &+& -1 \cdot x_3 &=& b_2 \\
-1 \cdot x_1  &+& 1 \cdot x_2 &+& 0 \cdot x_3 &=& b_3 \\
0 \cdot x_1  &+& 1 \cdot x_2 &+& 0 \cdot x_3 &=& b_1 \\
\end{array}
$$
the corresponding augmented matrix is
$$
\begin{bmatrix}
1 & 0 & 2 & b_1 \\
0 & 2 & -1 & b_2 \\
-1 & 1 & 0 & b_3 \\
0 & 1 & 0 & b_4
\end{bmatrix}
$$
and its RREF form is
$$
\begin{bmatrix}
1 & 0 & 0 & b_1 + 2b_2 - 4b_4 \\
0 & 1 & 0 & b_4 \\
0 & 0 & 1 & -b_2 + 2b_4 \\
0 & 0 & 0 & b_1 + 2b_2+ b_3 - 5b_4
\end{bmatrix}
$$
In order for it to be consistent, the equation
$$
b_1 + 2b_2 + b_3 - 5b_4 = 0
$$
must be satisfied.

(b) the (i)  and (iv)

### 1.3.12

By saying $\bold{v_1}, \bold{v_2}, \bold{v_3}$ is in the same plane containing the origin in $\R^3$, it's equivalent to say that one vector is the span of other two.

In the infinite solutions, we could assume there are two solution $x_1, y_1, z_1$ and $x_2, y_2, z_2$ such that either $x_1 \neq x_2$ or $y_1 \neq y_2$ or  $z_1 \neq z_2$. 

If $z_1 \neq z_2$, we could get
$$
x_1\vec{v_1} + y_1\vec{v_2} + z_1\vec{v_3} = x_2\vec{v_1} + y_2\vec{v_2} + z_2\vec{v_3} \\
$$
which means
$$
\vec{v_3} = \frac{(x_2 - x_1)\vec{v_1} + (y_2 - y_1)\vec{v_2}}{z_1 - z_2}
$$
which indicates that $\vec{v_3}$ is indeed in the span of $\vec{v_1}$ and $\vec{v_2}$.

In the case of $x_1 \neq x_2$, and $y_1 \neq y_2$, same logic applies, and we could always find one vector in the span of other two.

Q.E.D.

### 1.4.1

let $a = 1, b = 0$, $1 + 0\cdot \sqrt 5 = 1$

let $a = 0, b = 0$, $0 + 0\cdot\sqrt{5} = 0$

So $0, 1 \in \mathbb{F}$



Suppose $x, y \in F$

$x + y = (a_x + b_x\sqrt{5}) + (a_y + b_y\sqrt5) = (a_x +a_y) + (b_x + b_y) \sqrt5$

$(a_x +a_y) + (b_x + b_y) \sqrt5$ has the form $a + b\sqrt5$ by letting $a = a_x + a_y$ and $b = b_x + b_y$. So, it is in $\mathbb{F}$

$x \cdot y = (a_x + b_x\sqrt{5}) \cdot (a_y + b_y\sqrt5) = (a_xa_y + 5b_xb_y) + (a_xb_y + b_xa_y) \sqrt5$ 

this has the form of $a + b\sqrt5$.

So, the summation and product is actually in $\mathbb{F}$



For $z \in \mathbb{F}$， $z = a + b \sqrt 5 $ 

It has additive inverse $-a-b\sqrt5$, which has a form of $a + b\sqrt 5$

If $z \neq 0 + 0\sqrt5$, it has an multiplicative inverse $\frac{a - b\sqrt5}{a^2 - 5b^2}$, which has a form of $a + b\sqrt5$

So, the multiplicative and additive inverse is in $\mathbb{F}$



So $\mathbb{F}$ is a field.

### 1.4.6

(a) the set of all solution $S$ is
$$
S = \left\{
\begin{bmatrix}
1 \\
1 \\
0 \\
\end{bmatrix}
+ a 
\begin{bmatrix}
1\\
0 \\
1 \\
\end{bmatrix}

\left.
\vphantom{\begin{bmatrix}
foo\\
bar \\
baz \\
\end{bmatrix}}
\right|\
a \in \mathbb{F}_2
\right\}
$$
(b) the set of all solution $S$ is
$$
S = \left\{
\begin{bmatrix}
1 \\
1 \\
0 \\
\end{bmatrix}
\right\}
$$

### 1.4.8

(a) Since $\vec{x}$ is a solution, express $\vec{x}_j = c_j + d_ji$ for $j \in [1, n]$, it means for $k \in [1, m]$
$$
\sum_{j = 1}^{n} a_{kj}x_j = b_k \\
\sum_{j = 1}^{n} a_{kj}(c_j + d_ji) = b_k \\
\sum_{j = 1}^{n} a_{kj}c_j + \sum_{j = 0}^{n}a_{kj}d_ji = b_k \\
$$
where $c_j$ and $d_j$ is in $\R$. 

Since $b_k$ is in $\R$, that means all its imaginary part is $0$. So,
$$
\sum_{j = 1}^{n}d_ji =  0i
$$
and thus 
$$
\sum_{j = 1}^{n} a_{kj}c_j = b_k \\
$$
So, there exists a vector $\vec{y} \in \R$, which $\vec{y}_j = c_j$ for $j \in [1, n]$ (that means the $\vec{y}$ is just the real part of the $\vec{x}$)

(b) Suppose there is another solution $\vec{y} \in \C^n$. Express $\vec{y} = c_j + d_ji$ for $j \in [1, n]$ So, it satisfies for $k \in [1, m]$
$$
\sum_{j = 1}^{n} a_{kj}c_j + \sum_{j = 1}^{n}a_{kj}d_ji = b_k \\
$$
It could be separated by real part and imaginary part
$$
\sum_{j = 1}^{n} a_{kj}c_j = b_k \quad \text{and} \quad  \sum_{j = 1}^{n}a_{kj}d_j = 0 \\
$$
For the real part solution, we know that the only solution to that is $\vec{x}$, which means $\vec{x}_j = c_j$ for $j \in [1, n]$. (That means $\vec{x}$ and $\vec{y}$ has same real part).

Since there is only one unique solution in $\R^n$, let $b_i = 0$ for $i \in [0, m]$. Thus, there is only unique solution for the imaginary part equation, and we could find that zero vector $\vec{0}$ satisfies the equation. (That means $\vec{y}$ has no imaginary part)

So, $\vec{y}$ have same real part as $\vec{x}$, and zero imaginary part, which means $\vec{y} = \vec{x}$.

So, the assumption is false, there is only one unique solution in $\C^n$

(c) An example is $x^2 + 1=0$

### 1.4.18

From the definition of $\mathbb{F}$, the multiplicative inverse for $a, a^{-1} \in \mathbb{F}$ is $a^{-1}$ and $(a^{-1})^{-1}$ respectively. So
$$
a^{-1} \cdot a = 1 \\
a^{-1} \cdot (a^{-1})^{-1} = 1
$$
So
$$
a^{-1} \cdot a = a^{-1} \cdot (a^{-1})^{-1} \\
a\cdot a^{-1} \cdot a = a \cdot a^{-1} \cdot (a^{-1})^{-1} \\
a = (a^{-1})^{-1}
$$

### 1.5.2

The $\vec{0}$ is not included in the solution set. Since the linear system is nonhomogeneous, the equation for $k \in [1, m]$
$$
\sum_{j = 1}^{n} a_{kj}x_j = 0 \\
$$
where the $a_{kj}$ is the corresponding coefficient in the matrix. $x_j$ is the entry for the solution vector.

the above equation could not be satisfied if all $x_j$ is 0, which means $\vec{0}$ is not a solution, and by theorem, if $\vec{0}$ is not in the solution set, then solution set could not be a subspace of $\mathbb{F}^n$ 

### 1.5.4

(a), (c), (d)

### 1.5.10

Since the elements in the $U \cap W$ is both in $U$ and $W$, it is in the $V$. Thus $U \cap W \sube V$.

Since $0$ is both in $U$ and $W$, and thus it is in $U \cap W$.

Suppose $x, y \in U \cap W$, since they are in $U$, $x + y \in U$. Since they are also in $W$, $x + y \in W$. So $x + y \in U \cap W$.

Suppose $x, y \in U \cap W$, since they are in $U$, $x \cdot y \in U$. Since they are also in $W$, $x \cdot y \in W$. So $x \cdot y \in U \cap W$.

So, by theorem, $U \cap W$ is a subspace of $V$.

### 1.5.18

By definition, the additive inverse for $v, -v \in V$ are $-v, -(-v)$ respectively. So,
$$
v +(-v) = 0 \\
-(-v) + (-v) = 0
$$
So
$$
v + (-v) = -(-v) + (-v) \\
v + (-v) + v = -(-v) + (-v) + v \\
v = -(-v)
$$
Q. E. D.