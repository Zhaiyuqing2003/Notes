# Acid Dissociation

## Single Type Strong Acid Dissociation

For a strong acid $\ce{HA}$, write down reaction equation first:
$$
\ce{
	\begin{array}
		HA(aq) & + & H2O(l) & -> & H3O+(aq)       & + & A-(aq) \\
		Acid   &   & Base   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
}
$$
The **Major Group** is $\ce{H+, A-, H2O}$

The **Conjugate Acid-Base Pair** is 

* $\ce{HA and A-}$ 
* $\ce{H2O and H3O+}$

Notice, the water's autoionization:
$$
\ce{H2O(l) <=> H+(aq) + OH-(aq)}
$$
If, the $\ce{[H+] from HA >> [H+] from H2O}$.

The **concentration** of $\ce{H+}$:
$$
\ce{x  = [H+] = [HA]}
$$
The $\ce{\bold{pH}}$:
$$
\ce{pH = -log[H+]}
$$

Else, the $\ce{HA}$ is considered have no effect, and $\ce{PH = 7.00}$

## Multiple Strong Acid Dissociation

For each $\ce{HA_i}$, identify **Major Group** and **Conjugate Acid-Base Pair** just as in the single strong acid situation.

The **concentration** of $\ce{H+}$:
$$
\ce{[H+] = \sum{\ce{x_i}}= \sum{\ce{[HA_i]}}}
$$
The $\ce{\bold{pH}}$:
$$
\ce{pH = -log[H+]}
$$

## Single Weak Acid Dissociation

For weak acid $\ce{HA}$, write down reaction equation first:
$$
\ce{
	\begin{array}
		HA(aq) & + & H2O(l) & <=> & H3O+(aq)       & + & A-(aq) \\
		Acid   &   & Base   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
}
$$
The **Major Group** is $\ce{HA, H2O}$

The **Conjugate Acid-Base Pair** is 

* $\ce{HA and A-}$ 
* $\ce{H2O and H3O+}$

Find corresponding $\ce{K_a}$ using table:
$$
\ce{K_a = \frac{[H+][A-]}{[HA]} = \frac{x^2}{[HA]0 - x}}
$$
Use approximation:
$$
\ce{K_a \approx \frac{x^2}{[HA]0}}
$$
So that:
$$
\ce{[A-] = [H+] = x = \sqrt{\ce{[HA]0 * K_a}}}
$$
Checking approximation validity:
$$
\ce{\frac{x}{[HA]0} ?< 5\%}
$$
If pass, approximation is valid. Else, solve quadratic equation.
$$
\ce{x^2 + K_a*x - K_a*[HA]0 = 0}
$$

$$
\ce{x = \frac{-K_a\pm \sqrt{\ce{K_a^2 + 4* K_a * [HA]0}}}{2}}
$$

So, $\ce{pH}$ is:
$$
\ce{pH = -log[H+] = -log(x)}
$$
and percent dissociation:
$$
\ce{[\%] = \frac{x}{[HA]0}}
$$
and other concentrations:
$$
\begin{align}
\ce{[A-] = [H+] = x} \\
\ce{[HA] = [HA]0 - x} \\
\end{align}
$$

## Single Weak and Single Strong Acid Dissociation

For strong acid $\ce{HA1}$ and weak acid $\ce{HA2}$, write down reaction equation first:
$$
\begin{align}
\ce{
	\begin{array}
		HA1(aq) & + & H2O(l) & -> & H3O+(aq)       & + & A1-(aq) \\
		Acid   &   & Base   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
} \\
\ce{
	\begin{array}
		HA2(aq) & + & H2O(l) & <=> & H3O+(aq)       & + & A2-(aq) \\
		Acid   &   & Base   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
}
\end{align}
$$
The **Major Group** is $\ce{A1-, H+, HA2, H2O}$

The **Conjugate Acid-Base Pair** is 

* $\ce{HA1 and A1-}$ 
* $\ce{HA2 and A2-}$ 
* $\ce{H2O and H3O+}$

According to first equation, the concentration of $\ce{H+}$:
$$
\ce{x  = [H+] = [HA1]0}
$$

$$
\ce{K_{a2} = \frac{[H+][A2-]}{[HA2]} = \frac{(x + y)*y}{[HA2]0 - y}}
$$

Use approximation:
$$
\ce{K_{a2} \approx \frac{x*y}{[HA2]0}}
$$

So that:
$$
\ce{[A2-] = y = \frac{[HA2]0 * K_a}{x} }
$$
Checking approximation validity:
$$
\ce{\frac{y}{[HA2]0} ?< 5\%}
$$
If pass, approximation is valid. Else, solve quadratic equation.
$$
\ce{y^2 + (K_{a2} + x)*y  - K_a*[HA2]0 = 0}
$$

$$
\ce{y = \frac{-(K_{a2} + x) \pm \sqrt{\ce{(K_{a2} + x)^2 + 4* K_a * [HA]0}}}{2}}
$$

So, $\ce{pH}$ is:
$$
\ce{pH = -log[H+] = -log(x + y)}
$$
and percent dissociation:
$$
\ce{[\%]2 = \frac{y}{[HA2]0}}
$$
and other concentrations:
$$
\begin{align}
\ce{[A1-] &= x} \\
\ce{[A2-] &= y} \\
\ce{[H+]  &= x + y} \\
\ce{[HA2] &= [HA2]0 - y} \\
\ce{[HA1] &= 0}
\end{align}
$$

## Double Weak Acids Dissociation

For weak acid $\ce{HA1}$ and $\ce{HA2}$, write down reaction equation first:
$$
\begin{align}
\ce{
	\begin{array}
		HA1(aq) & + & H2O(l) & <=> & H3O+(aq)       & + & A1-(aq) \\
		Acid   &   & Base   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
} \\
\ce{
	\begin{array}
		HA2(aq) & + & H2O(l) & <=> & H3O+(aq)       & + & A2-(aq) \\
		Acid   &   & Base   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
}
\end{align}
$$
**Major Group**: $\ce{HA1, HA2, H2O}$

The **Conjugate Acid-Base Pair** is 

* $\ce{HA1 and A1-}$ 
* $\ce{HA2 and A2-}$ 
* $\ce{H2O and H3O+}$

If the $\ce{K_{a1} >> K_{a2}}$ (100 times)

Calculate $\ce{[A1-] = x}$ first following the single weak acid method.

Then
$$
\ce{K_{a2} = \frac{[H+][A2-]}{[HA2]} = \frac{(x + y) * y}{[HA2]0  - y}}
$$
Calculate $\ce{y}$ by the step show in the single strong acid and single weak acid method.

The $\ce{y}$ could be ignored.
$$
\ce{pH = -log[H+] = -log(x)}
$$
and the percent dissociation: 
$$
\begin{align}
\ce{[\%_1] = \frac{x}{[HA1]0}} \\
\ce{[\%_2] = \frac{y}{[HA2]0}} \\
\end{align}
$$
and the concentrations:
$$
\ce{
	\begin{align}
		[A1-] &= [H+] = x \\
		[A2-] &= y \\
		[HA1] &= [HA1]0 - x \\
		[HA2] &= [HA2]0  - y
	\end{align}
}
$$
## Single Polyprotic Acid Dissociation

If it's a polyprotic acid with first step as strong acid. 

Calculate as if it's a strong acid and multiple weak acid.

If it's polyprotic acid with first step as weak acid. 

Calculate as if it's multiple weak acid.

## Single Strong Base Dissociation

For strong base $\ce{B(OH)_n}$
$$
\ce{
	B(OH)_n(s) -> B^{n+}(aq) + nOH-(aq)
}
$$
The **Major group** is $\ce{OH-, B^{n+}}$

The **concentration** of $\ce{OH-}$:
$$
\ce{x  = [OH-] = n[B(OH)_n]}
$$
The $\ce{\bold{pOH}}$:
$$
\ce{pOH = -log[OH-]}
$$

## Single Weak Base Dissociation

For weak acid $\ce{B}$, write down reaction equation first:
$$
\ce{
	\begin{array}
		B(aq) & + & H2O(l) & <=> & BH+(aq)       & + & OH-(aq) \\
		Base  &   & Acid   &     & Conjugate Acid &   & Conjugate Base
	\end{array}
}
$$
The **Major Group** is $\ce{B, H2O}$

The **Conjugate Acid-Base Pair** is 

* $\ce{B and BH+}$ 
* $\ce{H2O and OH-}$

Find corresponding $\ce{K_b}$ from $\ce{K_a}$ of conjugate acid:
$$
\ce{K_a = \frac{[BH+][OH-]}{[B]} = \frac{x^2}{[B]0 - x} = \frac{K_w}{K_b}}
$$
Use approximation:
$$
\ce{K_b \approx \frac{x^2}{[B]0}}
$$
So that:
$$
\ce{[A-] = [OH-] = x = \sqrt{\ce{[B]0 * K_b}}}
$$
Checking approximation validity:
$$
\ce{\frac{x}{[B]0} ?< 5\%}
$$
If pass, approximation is valid. Else, solve quadratic equation.
$$
\ce{x^2 + K_b*x - K_b*[B]0 = 0}
$$

$$
\ce{x = \frac{-K_b\pm \sqrt{\ce{K_b^2 + 4* K_b * [B]0}}}{2}}
$$

So, $\ce{pOH}$ is:
$$
\ce{pOH = -log[OH-] = -log(x)}
$$
and percent dissociation:
$$
\ce{[\%] = \frac{x}{[B]0}}
$$
and other concentrations:
$$
\begin{align}
\ce{[BH+] &= [OH-] = x} \\
\ce{[B] &= [B]0 - x} \\
\end{align}
$$

e