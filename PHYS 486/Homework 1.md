$$
{\def\intinfin{\int_{-\infin}^{\infin}}}
{\def\d{\text{d}}}
{\def\expect#1;{{\left\langle #1 \right\rangle}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\deri#1/#2;{{\frac{\d #1}{\d #2}}}}
{\def\pderi#1/#2;{{\frac{\partial #1}{\partial #2}}}}
$$

### 1   Properties of Wavefunctions (Example 1)

Consider a wavefunction
$$
\psi(x, t) = {A \over (\lambda x)^2 + 1}e^{-i\omega t}
$$
where $A$, $\lambda$, and $\omega$ are positive, real constants.

**(a)** Normalize $\psi$ and then determine the expectation values of $x$ and $x^2$.

>$$
>\begin{align}
>
>\intinfin |\psi(x, t)|^2 \, \d x &= 1 \\
>A^2 \intinfin { 1 \over ((\lambda x)^2 + 1)^2 } \, \d x &= 1 \\
>A^2 \intinfin { \sec^2 u \over \sec^4 u \cdot \lambda } \, \d u &= 1 \\
>A^2 \int_{-\pi/2}^{\pi/2} { \cos^2 u \over \lambda } \, \d u &= 1 \\
>A^2 {\pi \over 2\lambda} &= 1 \\
>\end{align}
>$$
>
>$$
>\note A = \sqrt {2 \lambda \over \pi} !
>$$
>It's trivial that $\note \expect x; = 0 !$, as $\psi^* \psi$ is even function. For $\expect x^2;$
>$$
>\begin{align}
>
>\expect x^2; &= \intinfin \psi^* x \psi \, \d x \\
>&=  A^2 \intinfin {x^2 \over ((\lambda x)^2 + 1 )^2}\, \d x \\ &= A^2 \int_{-\pi/2}^{\pi/2} {\sin^2 u \over \lambda^3} \, \d u \\ &= \note {A^2 \pi \over 2\lambda^3} ! = \note {1\over \lambda^2} !
>\end{align}
>$$
>

**(b)** Find the standard deviation, $\sigma$, of $x$. Sketch $|\psi|^2$ as a function of $x$ and mark the points $\expect x; - \sigma$ and $\expect x; + \sigma$ to illustrate how $\sigma$ represents the typical spread of position.

>$$
>\begin{align}
>\sigma^2 &= \expect x^2; - {\expect x;}^2 = {1 \over \lambda^2} \\
>\sigma &= \note {1 \over \lambda} !
>\end{align}
>$$
>
>Taking $\lambda = 1$ and $A = 1$, then $\expect x; - \sigma = -1$ and $\expect x; + \sigma = 1$, as are illustrated in graph.
>
><img src="./Homework 1.assets/image-20240907223037052.png" alt="image-20240907223037052" style="zoom:25%;" />

**(c)** What is the probability of finding the particle outside the range of $[\expect x; - \sigma, \expect x; + \sigma]$.

>$$
>\Pr(\text{inside}) = A^2 \int_{-1/\lambda}^{1/\lambda} {1 \over ((\lambda x)^2 + 1)^2 }\, \d x = A^2 \int_{-\pi/4}^{\pi/4} {\cos^2 u \over \lambda}\, \d u = A^2 {\pi + 2 \over 4\lambda} = {2\lambda \over \pi} {\pi + 2 \over 4\lambda} = {\pi + 2 \over 2\pi} 
>$$
>
>$$
>\Pr(\text{outside}) = 1 - \Pr(\text{inside}) = {\pi - 2 \over 2\pi}
>$$

### 2   Ehrenfest Theorem

Use the Schrodinger equation to show, for a normalizable wave function, that:
$$
\deri \expect p; /t; = - \expect {\pderi V/x;};
$$

This is known as *Ehrenfest's theorem*, which is the quantum analog of Newton's second law.

