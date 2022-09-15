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
$$

#### 1

Say we have two vectors written in the computational basis:
$$
\ket a  = 3 \kz + 2i\ko, \ket b = -\kz + 2\ko
$$

##### a)

$$
\bra a = 3\bz - 2i\bo \\
\bra b = -\bz + 2\bo
$$

##### b)

$$
\braket{a | b} = -3 - 4i \\
\braket{b | a} = -3 + 4i \\
$$

##### c)

$$
\ket c = \ket a + 2 \ket b = \kz + (4 + 2i)\ko \\
\braket{c | a} = 3 + (4 - 2i)2i = 3 + 8i +4 = 7 + 8i
$$

##### d)

$$
\norm {\ket a } = \sqrt {9 + 4} = \sqrt {13} \\
\norm {\ket b } = \sqrt {1 + 4} = \sqrt {5}
$$

$$
\ket {\tilde a} = {3 \over \sqrt {13}}\kz + {2i \over \sqrt {13}} \ko \\
\ket {\tilde b} = -{1 \over \sqrt 5}\kz + {2 \over \sqrt 5}\ko
$$

##### e)

No, since $\braket{a | b}$ is not zero.

#### 2

Photon horizontal and vertical polarization states are written as $\ket h$ and $\ket v$. Suppose
$$
\begin{align}
\ket {\psi_1} &= \half\ket h + \frac{\sqrt 3}{2}\ket v\\
\ket {\psi_2} &= \half\ket h - \frac{\sqrt 3}{2}\ket v \\
\ket {\psi_3} &= \ket h
\end{align}
$$
Find
$$
\norm {\braket {\psi_1 | \psi_2}}^2, \norm {\braket {\psi_1 | \psi_3}}^2, \norm {\braket {\psi_3 | \psi_2}}^2
$$

$$
\norm {\braket {\psi_1 | \psi_2}}^2 = \left({1\over4} - {3\over4}\right)^2 = \frac{1}{4} \\
\norm {\braket {\psi_1 | \psi_3}}^2 = \left(\half\right)^2 = \frac{1}{4} \\
\norm {\braket {\psi_3 | \psi_2}}^2 =  \left(\half\right)^2 = \frac{1}{4}
$$

#### 3

$$
\ket {q_1} = \ket {\tilde{u}_1} = \colvec{\half \\ \half \\ \half \\ \half} \\
\ket {u_2'} = \ket {u_2} - \braket{q_1 | u_2} \ket{q_1 } = \colvec{1 \\ 2 \\ 4 \\ 5} - 6\colvec{\half \\ \half \\ \half \\ \half} = \colvec{-2 \\ -1 \\ 1 \\ 2} \\
\ket {q_2} = \ket {\tilde{u}_2} = \colvec{-{2\over\sqrt{10}} \\ -{1\over\sqrt{10}} \\ {1\over\sqrt{10}} \\ {2\over\sqrt{10}}} \\
\ket {u_3'} = \ket{u_3} - \braket{q_1 | u_3} \ket{q_1 } - \braket{q_2 | u_3} \ket{q_2} \\ = \colvec{1 \\ -3\\-4\\-2} - (-4)\colvec{\half \\ \half \\ \half \\ \half} - (-{7\over\sqrt{10}}) \colvec{-{2\over\sqrt{10}} \\ -{1\over\sqrt{10}} \\ {1\over\sqrt{10}} \\ {2\over\sqrt{10}}} \\
= \colvec{1 \\ -3\\-4\\-2} + \colvec{2 \\ 2 \\ 2 \\ 2} + \colvec{-{7\over5} \\ -{7\over10} \\ {7\over10} \\ {7\over5} } \\
= \colvec{{8\over5} \\ -{17\over10} \\ -{13\over10} \\ {7\over5} }\\
\ket {q_3} = \ket {\tilde{u}_3} = \colvec{{8\sqrt{910}\over455} \\ -{17\sqrt{910}\over910} \\ -{\sqrt{910} \over 70} \\ {\sqrt{910}\over 65} }
$$

