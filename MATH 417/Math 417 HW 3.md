$$
\newcommand\conj[1]{\overline{#1}}
\newcommand\sqrtw{\sqrt2}
\newcommand\poly[4]{\sum_{#2}^{#1}#3_{#2}#4^{#2}}
$$

#### Exercise 2.1.1

> Prove that multiplication of complex numbers is associative. More precisely, let $z = a + bi$, $w = c+di$, and $v = g + hi$, and prove that $z(wv) = (zw)v$.

Proof:
$$
\begin{align}
z(wv) &= (a+bi)((c+di)(g+hi)) \\
&= (a+bi)(cg -dh + (ch + dg)i) \\
&= acg - adh + achi + adgi + bcgi - bdhi - bch - bdg
\end{align}
$$

$$
\begin{align}
(zw)v &= ((a+bi)(c+di))(g+hi) \\
&= (ac - bd + (ad + bc)i)(g + hi) \\
&= acg + achi - bdg - bdhi + adgi + bcgi - adh - bch
\end{align}
$$

The result is the same, and that means $z(wv) = (zw)v$

#### Exercise 2.1.2

> Let $z = a + bi$, $w = c +di \in \C$ and prove each of the following statements:

##### (i)

> $z + \conj z$ is real and $z - \conj z$ is imaginary.

Proof : 

$\bar z = a - bi$

$z + \conj z = 2a \in \R$, $z - \conj z = 2bi \in \C$

##### (ii)

> $\conj { z + w } = \conj z + \conj w$

Proof:

$z + w = (a+c) + (b+d)i$

$\conj {z+w} = (a+c) - (b+d)i$

$\conj w = c - di$

$\conj z + \conj w = (a + c) - (b + d)i$

and thus $\conj {z + w} = \conj z + \conj w$

##### (iii)

> $\conj {zw} = \conj z \ \conj w$

$zw = ac - bd + (ad + bc)i$

$\conj {zw} = ac - bd - (ad +bc)i$

$\conj z \ \conj w = ac - adi - bci - bd = ac - bd - (ad + bc)i$

and thus $\conj {zw} = \conj z \ \conj w$

#### Exercise 2.2.1

>Prove that if $\mathbb F$ is a field and $a, b \in \mathbb F$ with $ab = 0$, then either $a = 0$ or $b = 0$.

If $a = 0$, then $ab = 0$, and we are done. So, suppose $a \neq 0$. Then there exist its multiplicative inverse $a^{-1}$. According to **Proposition 2.2.2 (ii)**
$$
ab = 0\\
a^{-1}ab = a^{-1}0 = 0 \\
1 \cdot b = 0 \\
b = 0
$$
Thus, it's either $a = 0$ or $b = 0$, if $a, b \in \mathbb F$, where $\mathbb F$ is a field.

#### Exercise 2.2.2

> Prove that $\Q(\sqrt 2)$ is a field.

$\Q(\sqrt 2) = \{a  + b\sqrt 2 \in \R | a, b \in \R\}$

Thus, suppose $x = a + b\sqrtw, y = c+d\sqrtw, z = e+f\sqrt2 \in \Q(\sqrt2)$.

Since $\sqrt 2 \notin \Q$. define 

$x + y = (a+c) + (b+d)\sqrt 2$ and $x \cdot y = ac + 2bd + (ad + bc)\sqrt 2$

Note, below all use that $\sqrtw \notin \Q$, thus, the term $p\sqrtw$  is completely separate from $q$, $p, q \in \Q$

**Addition is commutive:**

 $y + x = (c + a) + (b + d)\sqrt 2 = (a + c) + (b +d)\sqrt 2 = x+y$

and $(x + y) + z = ((a+c) + (b+d)\sqrtw) + e + f\sqrtw = (a+c+e) + (b+d+f)\sqrtw$

**Addition is associative:**

$x + (y + z) = a + b\sqrtw + ((c + e) + (d+f)\sqrtw) = (a +c +e) + (b + d+f)\sqrt 2$

and $(x + y) + z = x + (y + z)$.

**Multiplication is commutive:**

$y\cdot x = ca + 2db + (cb + da)\sqrtw = ac + 2bd + (ad+ bc)\sqrtw = x \cdot y$

**Mutliplication is associative:**

$(x \cdot y) \cdot z = (ac + 2bd)e + 2(ad+bc)f + ((ac+2bd)f + e(ad+bc))\sqrtw$

$x \cdot (y \cdot z) = a(ce + 2df) + 2b(cf+de) + ((ce+2df)b + a(cf+de))\sqrtw$

and, simplify it, it's true that $(x \cdot y) \cdot z = x \cdot (y \cdot z)$

**Multiplication distributes over addition:**

$x(y + z) = a(c+e) + 2b(d+f) + (a(d+f) + b(c+e))\sqrt2$

$xy + xz = ac + 2bd + (ad + bc)\sqrtw + (ae + 2bf) + (af + be)\sqrtw = a(c+e) + 2b(d+f) + (ad+af + bc+be)\sqrtw$

and thus $x(y + z) = xy + xz$

**There exist an additive identity** denote $\bold 0 = 0 + 0\sqrt 2$

and thus $x + \bold 0 = (0 + a) + (0 + b)\sqrt2 = a + b\sqrtw = x$

**There exist an an additive inverse** $-a$ for all $a \in \Q(\sqrtw)$

with out loss of generosity, use as $x$ as example, $-x = -a - b\sqrt2$ since 

$x + (-x) = (a - a) + (b - b)\sqrt 2 = 0 + 0 \sqrt 2 = \bold 0$

**There exists a multiplicative identity** denote $\bold 1 = 1 + 0\sqrt2 \in \Q(\sqrtw)$ with $\bold 1 \neq 0$, and $\bold 1 a = a$ for all $a \in Q(\sqrt 2)$ since

$\bold 1 x = (1a) + 2(0b) + (0a + 1b)\sqrt2 = a + b\sqrt 2 = x$

There exists a multiplicative inverse for all $a$ in $a \in \Q(\sqrtw) - \{0\}$, called $a^{-1}$

suppose $u = a + b\sqrtw \neq \bold 0$. $u^{-1} = \frac{a}{a^2 - 2b^2} - \frac{b}{a^2 - 2b^2}\sqrtw$ exist since $a \neq 0$  and $b \neq 0$ and is the mulitplicative inverse of u since $u^{-1}u = \frac{(a - b\sqrt2)(a + b\sqrt2)}{a^2 - 2b^2} = \frac{a^2 - 2b^2}{a^2 - 2b^2} = 1$ 

Thus, with above proved, $Q(\sqrtw)$ is indeed a field.

#### Exercise 2.3.1

>Prove parts (iii) - (v) of Proposition 2.3.2:

Suppose $f \in \mathbb F[x]$,
$$
f = \poly{n}{k}{a}{x} \\
$$

##### (iii)

> $0 \in \mathbb F$ is an additive identity in $\mathbb F [x]$: $f + 0 = f$ for all $f \in \mathbb F[x]$

Notice $0 = \sum_{k}^{n}0x^k$
$$
f + 0 = \sum_{n}^{k} (a_k + 0)x^k = f
$$
$0$ is indeed additive identity.

##### (iv)

>Every $f \in \mathbb F[x]$ has an additive inverse given by $-f = (-1)f$ with $f + (-f) = 0$

So, the $-f = (-1)f = -1\sum_{k}^{n}a_kx^k$ and $f = \poly{n}{k}{a}{x}$ and it's trivial that $f + (-f) = 0$. So the additive inverse is indeed $-f$.

##### (v)

>$1 \in \mathbb F$ is the multiplicative identity in $\mathbb F[x]$: $1f = f$ for all $f \in \mathbb F[x]$

$1f = 1\cdot\sum_{k}^{n}a_kx^{k} = \sum_{k}^{n}1\cdot a_kx^{k} = \sum_{k}^{n}a_kx^{k} = f$. So, the $1 \in \mathbb F$ is indeed the multiplicative identity in $\mathbb F[x]$ 