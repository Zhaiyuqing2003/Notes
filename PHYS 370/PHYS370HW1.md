$$
\newcommand\conj[1]{#1^*}
\newcommand\colvec[1]{\left(\matrix{#1}\right)}
\newcommand\hermi[1]{#1^\dagger}
\newcommand\zerovec{\colvec{1 \\ 0}}
\newcommand\onevec{\colvec{0 \\ 1}}
\newcommand\ketbra[2]{\ket{#1}\bra{#2}}
$$

#### 1

If $z_1 = x_1 + iy_1$ and $z_2 = x_2 + iy_2$ are two different complex numbers, then prove algebraically that
$$
|z_1 + z_2|^2 = |z_1|^2 + |z_2|^2 + 2Re(z_1z_2^*)
$$
 and that
$$
|z_1z_2| = |z_1||z_2|
$$
Proof:
$$
z_1 + z_2 = (x_1 + x_2) + i(y_1 + y_2) \\
$$

$$
\begin{align}
|z_1 + z_2|^2 &= (z_1 +z_2)(z_1 + z_2)^*
 \\ &= z_1\conj z_1 + z_2\conj z_2 + \conj z_1z_2 + z_1 \conj z_2 \\ &= |z_1|^2 + |z_2|^2 + \conj{(z_1\conj z_2)} + (z_1z_2^*) \\
\end{align}
$$

Suppose $z = x +iy$
$$
z+\conj z = x+iy + x - iy = 2x= 2Re(z) \\
$$
So
$$
|z_1 + z_2|^2 = |z_1|^2 + |z_2|^2 + \conj{(z_1\conj z_2)} + (z_1z_2^*) = |z_1|^2 + |z_2|^2 + 2Re(z_1z_2^*)
$$
Also, because commutativity of complex number multiplication.
$$
|z_1z_2|^2 = z_1z_2\conj z_1\conj z_2 = z_1\conj z_1 z_2\conj z_2 = |z_1|^2|z_2|^2 \\
|z_1z_2| = |z_1||z_2|
$$

#### 2

For the following pair of complex numbers, find:

1. Their polar form
2. Their moduli
3. The product of the two
4. The quotient (i.e. $z_1 / z_2$)

$$
z_1 = {1 + i \over \sqrt 2} \ \ \  z_2 = {3 + 4i \over 3 - 4i}
$$

$$
|z_1|^2 = z_1 \conj z_1 = {(1+i)(1-i) \over \sqrt 2 \cdot \sqrt 2} = 1 \\
\fbox{$|z_1| = \sqrt{ |z_1|^2 } = 1$} \\
\theta_{z_1} = \arctan({{1\over\sqrt 2} \over {1\over\sqrt 2}}) = \arctan(1) = {\pi \over 4} \\
\fbox{$z_1 = e^{{\pi \over 4}i}$}
$$

$$
z_2  = \frac{(3+4i)(3+4i)}{(3-4i)(3+4i)} = \frac{-7 + 24i}{25} \\
|z_2|^2 = z_2 \conj z_2 = \frac{-7 + 24i}{25}\frac{-7 - 24i}{25} = \frac{49 + 576}{625} = 1 \\
\fbox{$|z_2| = \sqrt{|z_2|^2} = 1$} \\
\theta_{z_2} = \arctan({{24\over25}\over-{7\over25}}) = \arctan({-24\over7}) \approx 1.8546 \\
\fbox{$z_2 = e^{1.8546i}$}
$$

$$
\fbox{$z_1 \cdot z_2 = {1 + i \over \sqrt 2} \cdot \frac{-7 + 24i}{25} = \frac{-31 + 17i}{25\sqrt2}$}
$$

$$
\fbox{$\frac{z_1}{z_2} = \frac{1 + i \over \sqrt 2}{3+4i \over 3-4i} = \frac{(1+i)(3-4i)}{\sqrt 2 (3+4i)} = \frac{(7-i)(3-4i)}{\sqrt2{(3+4i)}(3-4i)} = \frac{17-31i}{25\sqrt2}$}
$$



#### 3

Two quantum states are given by
$$
\ket a = \colvec {-4i \\ 2}, \ \ \ \ket{b} = \colvec{1 \\ -1 + i}
$$

##### a) Find $\ket{a + b}$

$\ket{a} + \ket{b} = \colvec{1 - 4i \\ 1 + i}$

##### b) Calculate $3\ket{a} - 2\ket{b}$

$3\ket{a} - 2\ket{b} = \colvec{-12i - 2 \\ 8 - 2i}$

##### c) Normalize $\ket{a}$, $\ket{b}$

$$
\ket{e_a} = {\ket{a} \over |\ket{a}|^2 } = \colvec{{-4i \over \sqrt{20}} \\ {2 \over \sqrt{20}}} \\
\ket{e_b} = {\ket{b} \over |\ket{b}|^2 } = \colvec{{1 \over \sqrt 3 } \\ {-1 + i \over \sqrt 3}}
$$

##### d) $\braket{a|b}$ and verify that $\braket{a|b} = \braket{b|a}^*$

$$
(4i,\ 2)\colvec{1 \\ -1+i} = 4i -2 + 2i = 6i - 2
$$

$$
\left((1, -1-i)\colvec{-4i \\ 2}\right)^* = (-4i-2-2i)^* = (-6i-2)^* = 6i - 2
$$

It's indeed that $\braket{a|b} = \braket{b|a}^*$

#### 4.

A quantum system is in the state
$$
\ket{\psi} = \frac{3i\ket{0} + 4\ket 1}{5}
$$

##### a) Is the state normalized?

$$
\braket{\psi | \psi} = \frac{-3i\bra 0 + 4 \bra 1}{5} \cdot \frac{3i \ket 0 + 4\ket 1}{5} = 1
$$

Yes, it is.

##### b) Express the state in the $\ket{+}$, $\ket{-}$ basis

$$
\begin{align}
\ket{\psi} &= \frac{3i\ket{0} + 4\ket 1}{5} \\ &= \frac{1}{5}(3i \cdot {1\over\sqrt2} (\ket{+} + \ket{-}) + 4\cdot {1\over\sqrt 2}(\ket+-\ket-)) \\ &= \frac{(3i+4)\ket+ + (3i-4)\ket-}{5\sqrt2}
\end{align}
$$





