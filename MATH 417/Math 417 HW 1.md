$$
\newcommand\bind[2]{#1\circ#2}
\newcommand\norm[1]{||#1||}
\newcommand\part[1]{#1/\!\!\sim\,}
\newcommand\pmatrix[1]{\left(\matrix{#1}\right)}
\newcommand\cycle[1]{\pmatrix{#1}}
$$

#### Exercise 1.1.1

Suppose for $a_1, a_2 \in A$, $\sigma(a_1) = \sigma(a_2)$. Then since $\tau$ is well defined $\bind{\tau}{\sigma}(a_1) = \bind{\tau}{\sigma}(a_2)$. Then since $\bind{\tau}{\sigma}$ is injective, then $a_1 = a_2$.

So, $\sigma$ is injective.

#### Exercise 1.1.2

##### (i)

No, it's not transitive. Consider $x = 1, y = 4, z = 7$. $x \sim y$ because $\norm{x - y} = 3$. $y \sim z$ since $\norm{y-z} = 3$. However, $x \nsim z$ since $\norm{x - z} = 6 > 3$

##### (ii)

No, it's not reflective, Consider $x = 1$, $x \nsim x$ because $\norm{x - x} = 0 < 3$

##### (iii)

Yes, it's reflective, for $x \in \N$, $x \sim x$ since itself have same digit in the 1's place. It's symmetric, for $x, y \in \N$, $x \sim y$ means $x$ and $y$ (i.e. $y$ and $x$) have same digit in the 1's place, so $y \sim x$. It's also transitive, for $x, y, z \in \N$, if $x \sim y$ and $y \sim z$, that means that $x$ and $y$ have the same digit in the 1's place, and $y$ and $z$ have the same digit in the 1's place. So, $x$ and $z$ have the same digit in the 1's place. So, $x \sim z$

##### (iv)

No, it's not symmetric, consider $x = 2, y = 1$. $x \sim y$ since $x \geq y$. but $y \nsim x$ since $y < x$.

#### Exercise 1.2.3

Reflective: $x \sim_f x $ since $f(x) = f(x)$

f(z)=f(x) and thus z∈[x]. So f−1(f(x))⊂[x].

Thus, [x]=f−1(f(x))Symmetrical: if $x \sim_f y$ then $f(x) = f(y)$, then $f(y) = f(x)$, and so that $y \sim_f x$.

Transitive: if $x \sim_{f} y$ and $y \sim_f z$, then $f(x) = f(y)$ and $f(y) = f(z)$, and then $f(x) = f(z)$ and so $x \sim_f z$

So the $\sim_f$ is an equivalence relation.

We will first show for any $x \in X$ that $[x] \sub f^{-1}(f(x))$

According to definition, the $f^{-1}(f(x)) = f^{-1}(\{f(x)\})= \{a \in X | f(a) \in \{ f(x) \} \}$. It's obvious that $x \in f^{-1}(f(x))$. Also, for any $y \in [x]$, $f(y) = f(x)$ and $f(y) \in \{f(x)\}$ so that $y \in f^{-1}(f(x))$. So $[x] \sub f^{-1}(f(x))$

Conversely, for any $z \in f^{-1}(f(x))$, $f(z) \in \{f(x)\}$ which means $f(z) = f(x)$ and thus $z \in [x]$. So $f^{-1}(f(x)) \sub [x]$.

Thus, $[x] = f^{-1}(f(x))$

#### Exercise 1.2.3

Because the definition $\part X = \{ [x] | x \in X \}$, that means for any $S \in \part X$, we could find $x \in X$ that $[x] = S$. Thus, since $\pi(x) = [x]$ for all $x \in X$, for any $S \in \part X$, we could find $x \in X$ so that $[x] = S$, thus there exist $x \in X$ that $\pi(x) = [x] = S$, thus $\pi$ is surjective.

If $x, y \in X$, and $x \sim y$. Then for $z \in [x]$, $x \sim z$, since the relation is transitive, $y \sim z$, so $z \in [y]$, that means $[x] \sub [y]$. Converse is also true, and that means $[x] = [y]$. Therefore, $\pi(x) = [x] = [y] = \pi(y)$, and thus $x \sim_\pi y$

Conversely, if $x, y \in X$ and $x \sim_\pi y$, then $\pi(x) = \pi(y)$ and since $\pi(x) = [x]$ and $\pi(y) = [y]$, $[x] = [y]$. That means $y \in [y]$ and thus $y \in [x]$, and thus $x \sim y$.

Thus, for $x, y \in X$, $x \sim y$ if and only if $x \sim_\pi y$, which means the $\sim_\pi$  is exactly $\sim$

#### Exercise 1.3.1

$\sigma = \pmatrix{1 & 4 & 2}\pmatrix{5 & 7 & 8}$  

$\sigma^{-1} = \pmatrix{2 & 4 & 1}\pmatrix{8 & 7 & 5}$ (Same as example 1.3.8)

*These followed the quick method used in Example 1.3.7*

$\sigma^2 = \sigma \circ \sigma = \pmatrix{1 & 4 & 2}\pmatrix{5 & 7 & 8}\pmatrix{1 & 4 & 2}\pmatrix{5 & 7 & 8} = \pmatrix{1 & 2 & 4}\pmatrix{5 & 8 & 7}$

$\sigma^3 = \sigma^2 \circ \sigma = \pmatrix{1 & 2 & 4}\pmatrix{5 & 8 & 7}\pmatrix{1 & 4 & 2}\pmatrix{5 & 7 & 8} = \text{id}$ 

#### Exercise 1.3.2

*These followed the quick method used in Example 1.3.7*

$\sigma \circ \tau = \cycle{3 & 4 & 8}\cycle{5 & 7 & 6 & 9}\cycle{1 & 9 & 3 & 5}\cycle{2 & 7 & 4} = \cycle{1 & 5}\cycle{2 & 6 & 9 & 4}\cycle{3 & 7 & 8}$ 

$\tau \circ \sigma = \cycle{1 & 9 & 3 & 5}\cycle{2 & 7 & 4}\cycle{3 & 4 & 8}\cycle{5 & 7 & 6 & 9} = \cycle{1 & 9}\cycle{2 & 7 & 6 & 3}\cycle{4 & 8 & 5 }$

