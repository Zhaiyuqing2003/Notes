$$
\newcommand\conj[1]{#1^*}
\newcommand\colvec[1]{\left(\matrix{#1}\right)}
\newcommand\hermi[1]{#1^\dagger}
\newcommand\zerovec{\colvec{1 \\ 0}}
\newcommand\onevec{\colvec{0 \\ 1}}
\newcommand\ketbra[2]{\ket{#1}\bra{#2}}
\newcommand\kz{\ket 0}
\newcommand\ko{\ket 1}
\newcommand\bz{\bra 0}
\newcommand\bo{\bra 1}
\newcommand\norm[1]{|#1|}
\newcommand\half{\frac{1}{2}}
\newcommand\sqhalf{\frac{1}{\sqrt 2}}
\newcommand\paren[1]{\left(#1\right)}
\newcommand\kzz{\ket{00}}
\newcommand\kzo{\ket{01}}
\newcommand\koz{\ket{10}}
\newcommand\koo{\ket{11}}
\newcommand\ohalf[1]{\frac{#1}{2}}
\newcommand\oihalf[1]{\frac{#1}{2i}}
\newcommand\kzzz{\ket{000}}
\newcommand\kzzo{\ket{001}}
\newcommand\kzoz{\ket{010}}
\newcommand\kzoo{\ket{011}}
\newcommand\kozz{\ket{100}}
\newcommand\kozo{\ket{101}}
\newcommand\kooz{\ket{110}}
\newcommand\kooo{\ket{111}}
$$

#### Question 1

>Find the eigenvalues of the $X$ operator. Show that the $X$, $Y$, $Z$ operators (the Pauli matrices) are traceless.

Since $X = \colvec{0 & 1 \\ 1 & 0}$, $Y = \colvec{0 & i \\ -i & 0}$, $Z = \colvec{1 & 0 \\ 0 & -1}$
$$
\det (X - \lambda I) = \det\colvec{-\lambda & 1 \\ 1 & -\lambda} = \lambda^2 - 1 = 0 \\
$$
Thus $\lambda = \pm 1$
$$
\tr X = 0 + 0 = 0 \\
\tr Y = 0 + 0 = 0 \\
\tr Z = 1 + (-1) = 0
$$
Indeed, all their traces are zero (traceless)

#### Question 2

>Find the eigenvalues of $B = \colvec{1 & 0 & 2 \\ 0 & 3 & 4 \\ 1 & 0 & 2}$

$$
\det(B - \lambda I) = \det \colvec{1 - \lambda & 0 & 2 \\ 0 & 3 - \lambda & 4 \\ 1 & 0 & 2 - \lambda} = (1-\lambda)(3 - \lambda)(2 - \lambda) - 2(3 - \lambda) = -\lambda(\lambda - 3)^2 = 0 \\
$$

So, $\lambda = 0, 3$

#### Question 3

>Using the matrix representation of the Hadamard gate
>$$
>H = \frac{1}{\sqrt 2}\colvec{1 & 1 \\ 1 & -1}
>$$
>write down the matrix $H \otimes H$ and find $(H \otimes H)(\kz \otimes \ko)$. Show that this is equivalent to
>$$
>\ket \phi = \paren{\kz + \ko \over \sqrt 2} \paren{\kz - \ko \over \sqrt 2}
>$$

$$
H \otimes H = \half\colvec{1 & 1 & 1 & 1 \\ 1 & -1 & 1 & -1 \\ 1 & 1 & -1 & -1 \\ 1 & -1 & -1 & 1} \quad \kz \otimes \ko = \colvec{0 \\ 1 \\ 0 \\ 0}
$$

and thus
$$
(H \otimes H)(\kz \otimes \ko) = \half\colvec{1 \\ -1 \\ 1 \\ -1}
$$
which is equal to
$$
\ket \phi = \paren{\kz + \ko \over \sqrt 2} \paren{\kz - \ko \over \sqrt 2} = \half(\kz \otimes \kz  -\kz \otimes \ko + \ko \otimes \kz - \ko \otimes \ko) = \half\colvec{1 \\ -1 \\ 1 \\ -1}
$$

#### Question 4

>The beam splitter gate has a matrix representation given by
>$$
>B = {1 \over \sqrt 2}\colvec{i & 1 \\ 1 & i}
>$$
>Show that $B$ generates superposition states out of the computational basis states $\kz$ and $\ko$. In particular,show that
>$$
>B \otimes B\kzz = \paren{i \kz + \ko \over \sqrt 2} \paren{i \kz + \ko \over \sqrt 2}
>$$
>Show that two applications of the beam splitter gate on the same state, namely that $B(B\ket\psi)$ act analogously to the $NOT$ gate, giving the same probabilities of finding $\kz$ and $\ko$

$B$ indeed generates superposition states out of $\kz$ and $\ko$
$$
B\kz = \sqhalf (i\kz + \ko) \\
B\ko = \sqhalf (\kz + i\ko)
$$
with $\ket 0$ and $\ko$ share equal probability ($|1|^2 = |i|^2$)

and
$$
B \otimes B = \half\colvec{-1 & i & i & 1 \\ i & -1 & 1 & i \\ i & 1 & -1 & i \\ 1 & i & i & -1}
$$

$$
(B \otimes B)\kzz = \half(-\kzz + i\kzo + i\koz + \koo) =  \paren{i \kz + \ko \over \sqrt 2} \paren{i \kz + \ko \over \sqrt 2}
$$

and
$$
\begin{align}
B(B\ket \phi) &= B(B (\alpha \kz + \beta \ko)) \\ 
&= B(\sqhalf((\alpha i + \beta)\kz + (\alpha + \beta i)\ko)) \\ 
&= \half ((\alpha i + \beta)(i \kz  + \ko) + (\alpha + \beta i)(\kz + i\ko)) \\
&= \half (-\alpha \kz + \alpha i\ko + \beta i \kz + \beta \ko + \alpha \kz +\beta i \kz + \alpha i\ko - \beta \ko) \\
&= \half (2\beta i \kz + 2\alpha i \ket 1) \\
&= \beta i \kz + \alpha i \ko
\end{align}
$$
That is, $B^2$ acting quite similar to $X$, flip the $\kz$ and $\ko$. Except that it add a global phase of $i = e^{i\pi / 4}$

#### Question 5

##### (a)

>Show that the matrix representation of $HP(\theta)HP(\phi)$ is given by
>$$
>HP(\theta)HP(\phi) = e^{i\theta / 2}\colvec{\cos{\theta \over 2} & -ie^{i\phi}\sin{\theta \over 2} \\ 
>-i\sin{\theta \over 2} & e^{i\phi}\cos{\theta \over 2}}
>$$

$$
\begin{align}
HP(\theta)HP(\phi) &= \half\colvec{1 & 1 \\ 1  & - 1}\colvec{1 & 0 \\ 0 & e^{i\theta}}\colvec{1 & 1 \\ 1  & - 1}\colvec{1 & 0 \\ 0 & e^{i\phi}} \\ 
&= \half \colvec{1 & e^{i\theta} \\ 1 & -e^{i\theta}}\colvec{1 & e^{i\phi} \\ 1 & -e^{i\phi}} \\
&= \half\colvec{1 + e^{i\theta} & e^{i\phi} - e^{i \theta}e^{i \phi} \\ 1 -e^{i\theta} & e^{i\phi} + e^{i\theta}e^{i\phi}} \\
&= e^{i\theta / 2} \colvec{ \ohalf{e^{-i\theta / 2} + e^{i\theta / 2} } & -ie^{i\phi}\oihalf{e^{i\theta/2}-e^{-i\theta /2}} \\ -i\oihalf{e^{i\theta / 2} - e^{-i\theta / 2}} & e^{i\phi}\ohalf{e^{-i\theta / 2} + e^{i\theta / 2}}} \\
&= e^{i\theta / 2}\colvec{\cos{\theta \over 2} & -ie^{i\phi}\sin{\theta \over 2} \\ 
-i\sin{\theta \over 2} & e^{i\phi}\cos{\theta \over 2}}
\end{align}
$$

##### (b)

>Write down the Hadamard transform of three Hadamard gates acting on the product state $\ko\ko\kz$

That is basically
$$
(H\ko)(H\ko)(H\kz) = \frac{1}{\sqrt[3]2}(\kz - \ko) (\kz - \ko)(\kz + \ko) \\ = \frac{1}{\sqrt[3]2}(\kzzz + \kzzo - \kzoz -\kzoo - \kozz - \kozo + \kooz + \kooo)
$$

