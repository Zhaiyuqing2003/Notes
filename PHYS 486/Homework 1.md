$$
{\def\intinfin{\int_{-\infin}^{\infin}}}
{\def\intneginfin{\int_{-\infin}^{0}}}
{\def\intposinfin{\int_{0}^\infin}}
{\def\d{\text{d}}}
{\def\expect#1;{{\left\langle #1 \right\rangle}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\deri#1/#2;{{\frac{\d #1}{\d #2}}}}
{\def\pderi#1/#2;{{\frac{\partial #1}{\partial #2}}}}
{\def\dpderi#1/#2,#3;{{\frac{\partial #1}{\partial #2 \partial #3} }}}
{\def\ppderi#1/#2;{{\frac{\partial^2 #1}{\partial {#2}^2 }}}}
{\def\pppderi#1/#2;{{\frac{\partial^3 #1}{\partial {#2}^3 }}}}
{\def\pnderi#1/#2^#3;{{\frac{\partial^{#3} #1}{\partial {#2}^{#3} }}}}
{\def\ipderi#1/#2;{{\partial #1}/{\partial #2}}}
{\def\iv#1;{{1 \over #1}}}
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
   >A^2 \intinfin { 1 \over ((\lambda x)^2 + 1)^2 } \, \d  x &= 1 \\
   >A^2 \intinfin { \sec^2 u \over \sec^4 u \cdot \lambda } \, \d u &= 1 \\
   >A^2 \int_{-\pi/2}^{\pi/2} { \cos^2 u \over \lambda } \, \d u &= 1 \\
   >A^2 {\pi \over 2\lambda} &= 1 \\
   >A &= \note \sqrt {2 \lambda \over \pi} !
   >\end{align}
   >$$
   >
   >It's trivial that $\note \expect x; = 0 !$, as $\psi^* \psi$ is even function. For $\expect x^2;$
   >$$
   >\begin{align}
   >
   >\expect x^2; &= \intinfin \psi^* x \psi \, \d x \\
   >&=  A^2 \intinfin {x^2 \over ((\lambda x)^2 + 1 )^2}\, \d x \\ &= A^2 \int_{-\pi/2}^{\pi/2} {\sin^2 u \over \lambda^3} \, \d u \\ &= \note {A^2 \pi \over 2\lambda^3} ! = \note {1\over \lambda^2} !
   >\end{align}
   >$$
   >

   **(b)** Find the standard deviation, $\sigma$, of $x$. Sketch $|\psi|^2$ as a function of $x$ and mark the 
         points $\expect x; - \sigma$ and $\expect x; + \sigma$ to illustrate how $\sigma$ represents the typical spread of 
         position.

>We know that
>$$
>\begin{align}
>\sigma^2 &= \expect x^2; - {\expect x;}^2 = {1 \over \lambda^2} \\
>\sigma &= \note {1 \over \lambda} !
>\end{align}
>$$
>
>Taking $\lambda = 1$, then $\expect x; - \sigma = -1$ and $\expect x; + \sigma = 1$, as are illustrated in graph.
>
><img id="fig_sol_1" src="./Homework 1.assets/13764408-4420-483b-a0c0-ccc513f5b0f5.png" alt="13764408-4420-483b-a0c0-ccc513f5b0f5" style="zoom: 25%;" />
>
><a name="center black block pad-bottom small">Figure Solution 1: $|\psi|^2$ (probability distribution of wave function) with respect to $x$ </a>

   **(c)** What is the probability of finding the particle outside the range of 
        $[\expect x; - \sigma, \expect x; + \sigma]$.

>$$
>\begin{align}
>\Pr(\text{inside}) 
>&= A^2 \int_{-1/\lambda}^{1/\lambda} {1 \over ((\lambda x)^2 + 1)^2 }\, \d x \\
>&= A^2 \int_{-\pi/4}^{\pi/4} {\cos^2 u \over \lambda}\, \d u = A^2 {\pi + 2 \over 4\lambda} \\
>&= {2\lambda \over \pi} {\pi + 2 \over 4\lambda} = {\pi + 2 \over 2\pi} \\
>\Pr(\text{outside}) 
>&= 1 - \Pr(\text{inside}) = \note {\pi - 2 \over 2\pi} !
>\end{align}
>$$
>

<div name="page-break"></div>

### 2   Ehrenfest Theorem

Use the Schrodinger equation to show, for a normalizable wave function, that:
$$
\deri \expect p; /t; = - \expect {\pderi V/x;};
$$

This is known as *Ehrenfest's theorem*, which is the quantum analog of Newton's second law.

> We start from the definition of $\expect p;$. We know that (limit omitted):
> $$
> \begin{align}
> \deri \expect p;/t; 
> &= -\deri /t; i\hbar \int \Psi^* \pderi \Psi/x;\, \d x \\
> &= -i\hbar \int \pderi /t; \left( \Psi^* \pderi \Psi/x; \right) \, \d x \\
> &= -i\hbar \int \pderi \Psi^*/t; \pderi \Psi/x; + \Psi^*\dpderi \Psi/x,t; \, \d x \\
> \end{align}
> $$
>
> From Schrodinger equation, we know
> $$
> \begin{align}
> i\hbar \pderi \Psi/t; &= -{\hbar ^2 \over 2m} \ppderi \Psi/x; + V\Psi \\
> i\hbar \pderi \Psi^*/t; &= +{\hbar ^2 \over 2m} \ppderi \Psi^*/x; - V\Psi^*
> \end{align}
> $$
>
> Therefore
> $$
> \begin{align}
> \deri \expect p;/t; 
> &= \int \pderi \Psi/x;\left(-{\hbar ^2 \over 2m} \ppderi \Psi^*/x; + V\Psi^*\right) + \Psi^* \pderi /x; \left({\hbar ^2 \over 2m} \ppderi \Psi/x; - V\Psi\right) \, \d x \\
> &= \int \pderi \Psi/x; V \Psi^* - {\hbar^2 \over 2m} \left(\pderi \Psi/x; \ppderi \Psi^*/x; - \Psi^*\pppderi \Psi/x;  \right) - \Psi^* \left( \pderi V/x;  \Psi  + V\pderi \Psi/x; \right) \, \d x \\
> \end{align}
> $$
>
> As noted in the book, there is a trick by integration by parts (Chapter 1, footnote 17):
> $$
> \intinfin f \deri g/x; \, \d x = fg\big|_{-\infin}^{\infin} - \intinfin \deri f/x; g \, \d x
> $$

> Since we assume that wave function and its derivative all goes to 0 when approaching infinity, we have
> $$
> \begin{align}
> \intinfin \pderi \Psi /x; \ppderi \Psi^*/x;\, \d x 
> &= \left. \pderi \Psi/x; \pderi \Psi^*/x; \right|_{-\infin}^\infin - \intinfin \ppderi \Psi/x; \pderi \Psi^*/x; \, \d x \\
> &= -\left. \ppderi \Psi/x; \Psi^* \right|_{-\infin}^\infin + \intinfin \pppderi \Psi/x; \Psi^* \, \d x \\
> &= \intinfin \pppderi \Psi/x; \Psi^* \, \d x
> \end{align}
> $$
> Note, as a general rule, we have
> $$
> \intinfin \pnderi \Psi/x^n; \pnderi \Psi^*/x^m;\, \d x = (-1)^s \intinfin \pnderi \Psi/x^(n+s); \pnderi \Psi^*/x^(m-s); \, \d x
> $$
> given that $s \in \mathbb Z$ and $\Psi$ and all its derivative goes to 0 as approaching infinity.
>
> Therefore
> $$
> \begin{align}
> \deri \expect p; /t; 
> &= \int \pderi \Psi/x; V \Psi^* - {\hbar^2 \over 2m} \left(\pppderi \Psi/x; \Psi^* - \Psi^*\pppderi \Psi/x;  \right) - \Psi^* \left( \pderi V/x;  \Psi  + V\pderi \Psi/x; \right) \, \d x \\
> &= \int \pderi \Psi/x; V \Psi^* -\Psi^* \left( \pderi V/x;  \Psi  + V\pderi \Psi/x; \right) \, \d x \\
> &= \int \Psi^* V \left(\pderi \Psi/x; - \pderi \Psi/x;\right) - \Psi^* \pderi V/x; \Psi \, \d x \\
> &= \int \Psi^* \left(-\pderi V/x;\right) \Psi \, \d x
> \end{align}
> $$
> By definition of expectation value, we see that indeed
> $$
> \note \deri \expect p;/t; = \expect {-\pderi V/x;};!
> $$

<div name="page-break"></div>
### 3   Only Energy Difference are Physical

In classical mechanics, we are taught that only differences in energy matter. We can add a constant $V_0$ to the potential energy without changing any physics since the force $\bold F = -\grad V$ remains the same. How does the wave function change if we modify the potential energy by a constant (i.e., take $V(x) \to V(x) + V_0$)? Does this modification of the wave function change any measurable quantities?

<a name="block small-skip"></a>

>The book actually provides a hint (Problem 1.8), that $\Psi(x, t) \to \Psi(x, t)\exp(-iV_0t/\hbar)$ is new solution to the Schrodinger equation given that $V(x) \to V(x) + V_0$. We just need to show this is true.
>
>So given $\Psi(x, t)$ is a solution to Schrodinger equation with $V(x)$,
>$$
>{\def\wiggle{\exp(-iV_0t/\hbar)}}
>{\def\cowiggle{\exp(iV_0t/\hbar)}}
>\begin{align}
>i\hbar \pderi/t; \left(\Psi\wiggle\right) 
>&= i\hbar \pderi \Psi/t; \wiggle + i\hbar \Psi \cdot (-iV_0/\hbar) \wiggle \\
>&= \left( -{\hbar^2 \over 2m} \ppderi \Psi/x; + V\Psi \right)\wiggle + \Psi V_0 \wiggle \\
>&= -{\hbar^2 \over 2m} \ppderi \Psi/x;\wiggle  + \Psi\wiggle(V+V_0) \\
>&= -{\hbar^2 \over 2m} \ppderi /x;(\Psi \wiggle) + (V + V_0)(\Psi \wiggle)
>\end{align}
>$$
>We see that $\Psi \wiggle$ indeed solves the new Schrodinger equation with $V(x) + V_0$. However, this doesn’t change any measurable quantities, $\wiggle$ is independent from $x$. so
>$$
>\begin{align}
>\expect Q'(x, p); 
>&= \int \Psi^*\cowiggle [Q(x, -i\hbar \ipderi /x;)](\Psi\wiggle) \, \d x \\
>&= \int \Psi^*\cowiggle \wiggle [Q(x, -i\hbar \ipderi/x;)]\Psi \, \d x \\
>&= \int \Psi^* [Q(x, -i\hbar \ipderi/x;)]\Psi \\
>\end{align}
>$$
>So, we see that
>$$
>\note \expect Q'(x, p); = \expect Q(x, p);!
>$$
>and there is no change on any measurable quantities.

<div name="page-break"></div>
### 4   Properties of wavefunctions (Example 2)

Consider the wave function
$$
\psi(x, t) = Ae^{-\lambda \cdot |x|} e^{-i\omega t}
$$
where: $A, \lambda, \omega \in \mathbb R$.

**(a)** Normalize $\psi$

>Note, technically $\lambda$ must be more than $0$ for this wave function to be normalizable.
>$$
>\begin{align}
>\int \psi^* \psi \, \d x  &= 1 \\
>A^2 \int e^{-2\lambda \cdot |x|} \, \d x &=1 \\
>-2A^2\left.{e^{-2\lambda x} \over 2\lambda}\right|^\infin_0  &= 1 \\
>A^2 /\lambda &= 1 \\
>A &= \note \sqrt \lambda!
>\end{align}
>$$

**(b)** Determine the expectation values of $x$ and $x^2$

>We see that $\psi^*\psi$ is an even function, so it’s trivial that $\expect x; = 0$. For $\expect x^2;$
>$$
>\begin{align}
>\expect x^2; &= \int \psi^* x^2 \psi \, \d x \\
>&= A^2 \int e^{-2\lambda \cdot |x|} \cdot x^2 \, \d x  = 2 A^2 \intposinfin e^{-2\lambda x} x^2 \, \d x \\
>&= 2A^2 \left( \left.-{e^{-2\lambda x} \over 2\lambda} x^2 \, \right|^\infin_0 - \left.{e^{-2\lambda x} \over 4\lambda^2} \cdot 2x \,\right|_0^\infin - \left.{e^{-2\lambda x} \over 8\lambda^3} 2 \, \right|_0^\infin \right) \\
>&= \note {4A^2 \over 8\lambda^3} ! = \note {1 \over 2\lambda^2} !
>\end{align}
>$$

**(c)** Find:

   (i) The standard deviation in $x$.
   (ii) Sketch the graph of $|\psi|^2$, as a function of $x$, and mark the points $\expect x; + \sigma$ and 
        $\expect x; - \sigma$ to show the spread in the distribution.
   (iii) Find the probability that the particle is found outside the range, $[\expect x; - \sigma, \expect x; + \sigma]$

>We know that
>$$
>\begin{align}
>\sigma^2 &= \expect x^2; - {\expect x;}^2 = {1 \over 2\lambda^2} \\
>\sigma &= \note {1 \over \sqrt 2\lambda} !
>\end{align}
>$$
>
>Assuming $\lambda = 1$, then the graph of $|\psi|^2$ is shown below with points $\expect x; + \sigma$ and $\expect x; - \sigma$ marked. 
>
><img src="./Homework 1.assets/86795a37-c77f-4d3a-afc9-f3de684db7bf.png" alt="86795a37-c77f-4d3a-afc9-f3de684db7bf" style="zoom:25%;" />
>
><a name="center black block pad-bottom small">Figure Solution 2: $|\psi|^2$ (probability distribution of wave function) with respect to $x$ </a>
>$$
>\begin{align}
>\Pr(\text{inside}) 
>&= -2A^2\left.{e^{-2\lambda x} \over 2\lambda} \right|^{1/\sqrt2\lambda}_0 \\
>&= {1\over\lambda}A^2(1 - e^{-\sqrt 2}) \\[4pt]
>&= 1 - e^{-\sqrt 2}\\[3pt]
>\Pr(\text{outside}) &= 1 - \Pr(\text{inside}) = \note e^{-\sqrt 2} !
>\end{align}
>$$



