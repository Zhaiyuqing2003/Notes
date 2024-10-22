
$$
\newcommand\colvec[1]{\left(\matrix{#1}\right)}
\newcommand\hermi[1]{#1^\dagger}
\newcommand\zerovec{\colvec{1 \\ 0}}
\newcommand\onevec{\colvec{0 \\ 1}}
\newcommand\ketbra[2]{\ket{#1}\bra{#2}}
\begin{align}
\ket{0} = \zerovec \\
\ket{1} = \colvec{0 \\ 1} \\
\hermi{\ket\Psi} \\
\hermi{\ket 0} = \hermi{\zerovec} = (1^*, 0^*) =  (1, 0) = \bra{0} \\
A\ket{\Psi} = \ket{\phi} \\

\sigma_{0} = \ket{0}\bra{0} + \ket{1}\bra{1} = \colvec{1 & 0 \\ 0 & 1} \\
\sigma_{X} = \ket 0\bra 1 + \ket1 \bra0 = \colvec{0 & 1 \\ 1 & 0} \\
\sigma_{Y} = -i\ketbra{0}{1} + i\ketbra{1}{0} = \colvec{0 & -i \\ i & 0} \\
\sigma_{Z} = \ketbra{0}{0} - \ketbra{1}{1} = \colvec{1 & 0 \\ 0 & -1} \\
\end{align}
$$

$h\ket{a}\bra{b}$ from $\ket{b}$ to $h\ket{a}$, matrix $A$ with respect to a basis includes $\ket{a}$ and $\ket{b}$ has $A_{i_a, i_b} = h$, where $i_a$ and $i_b$ is the index of the $\ket{a}$ and $\ket{b}$ in that basis.

$(\ket{a}\bra{b})\ket{c} = \ket{a}\braket{b\vert c}$ simply because matrix multiplication is associative.

basis of $M_{2, 2}$ 
$$
\ketbra{0}{0} = \colvec{1 & 0 \\ 0 & 0} \\
\ketbra{0}{1} = \colvec{0 & 1 \\ 0 & 0} \\
\ketbra{1}{0} = \colvec{0 & 0 \\ 1 & 0} \\
\ketbra{1}{1} = \colvec{0 & 0 \\ 0 & 1} \\
$$
For every quantity that we can measure in the lab (Observable) there corresponds an operator (with special forms).

manipulation operator are represented by unitary matrix (you cannot change the probability to $\neq$ 1)

operator needs to be hermitian since

$A\ket{\psi} = \ket\phi$

$\bra{\psi}A = \bra\phi$

the operator always transfer $\psi$ to $\phi$, no matter it is bra or ket.
$$
\hermi{(A\ket{\psi})} = \hermi{\ket{\phi}} \\
\hermi{\ket{\psi}}\hermi{A} = \bra{\phi} \\
\bra{\psi}\hermi{A} = \bra{\phi}
$$
So
$$
A = \hermi{A}
$$
it's hermitian.

