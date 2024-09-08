$$
\newcommand\defbox[1]{\fbox{$\hphantom{\,}\vphantom{\sum}#1\hphantom{\,}$}}
\newcommand\defbigbox[1]{\fbox{$\hphantom{\,}\vphantom{\frac{\sum^{}_{}}{\sum^{}_{}}}#1\hphantom{\,}$}}
\newcommand\d{\text{d}}
\newcommand\dd{\delta}
\newcommand\partderires[3]{\left(\partialderivative{#1}{#2}\right)_{#3}}
\newcommand\derires[3]{\left(\derivative{#1}{#2}\right)_{#3}}
\newcommand\res[2]{\left({#1}\right)_{#2}}
\newcommand\nn{\mathcal{N}}
\newcommand\hh{\mathcal{H}}
\newcommand\hf{h\!f}
\newcommand\angle[1]{\langle#1\rangle}
\newcommand\molheatv{\hat{c}_{V}}
\newcommand\paren[1]{\left(#1\right)}
$$

## Thermal Physics

### Notation

### State function

### Internal Energy

**Internal Energy**: the microscopic energies of the particles, which includes the potential energy of the fields between particles, and the kinetic energy of the irregular motions of particles within objects.

### First Law of Thermodynamics

The energy is categorized as either **internal energy**  or **mechanical energy**. 

From **Energy Conservation**, a system **without composition change** is:
$$
\Delta{E_{\text{system}}} = {E_{\text{to sytem}}}
$$
where
$$
\Delta{E_{\text{system}}} = \Delta{U} + \Delta{M} \\
{E}_{\text{to system}} = Q + W
$$


|                          | From Internal Energy $\bold{U}$ | From Mechanical Energy $\bold{M}$ |
| ------------------------ | ------------------------------- | --------------------------------- |
| **To Internal Energy**   | $Q \text{ (heat)}$              | $W \text{ (work)}$                |
| **To Mechanical Energy** | $Q \text{ (heat)}$              | $W \text{ (work)}$                |

Thus, we have:
$$
\defbox{\Delta{M} + \Delta{U} = W + Q}
$$

Taking derivative on both side, we get
$$
\d M + \d U = \dd W + \dd Q
$$

where $M$ and $U$ is a **state function**[^Path Independent], but $W$ and $Q$ is a **path function**, which depend on it path taken. So, the different notation $\d$ and $\dd$ is used to distinguish them.

When the mechanical energy doesn't change, the **first law of thermodynamics** could be re-write as:
$$
\defbox {\d U = \dd W + \dd Q}
$$



### Second Law of Thermodynamics

Use $\nn_i$ denote the number of possible arrangement of the particles for the certain state $i$ of the system.

Suppose
$$
\nn_0 \leq \nn_1
$$
And probability for certain state is defined as
$$
P(i) = \frac{\nn_i}{\sum_{j = 0}^{n}\nn_j}
$$
where the denominator denote the sum of all number of possible arrangement of different state.

So, 
$$
P(0) \leq P(1)
$$
This means that the state which there are more arrangement of particles are more preferred to exist.



More specifically, the $\nn$ could be expressed as
$$
\defbigbox{\nn = \prod^{m}_{i = 0}\mathcal{N^{n_i}_{\text{particle}_i}}}
$$
where the $n_i$ denote the number certain particles in the system.

The change of probability of one state with respect to $\mathcal{N_{\text{particle}_i}}$ is,
$$
\partialderivative{P(i)}{\mathcal{N_{\text{particle}_i}}} = \frac{\left(\prod^{m}_{k = 0, k \neq i} \mathcal{N^{n_k}_{\text{particle}_k}}\right) \cdot n_i \nn^{n_i - 1}_{\text{particle}_i} }{\sum_{j = 0}^{n}\nn_j}
$$
where the denominator is a constant.

Since in the real world, the $n_i$ is usually extremely large. Taking the limitation of above equation, 
$$
\lim_{\mathcal{N_{\text{particle}_i} \to\ \infin} } = \partialderivative{P(i)}{\mathcal{N_{\text{particle}_i}}} = \infin
$$
That means for two state $S_i$ and $S_j$, even if the different between the $\nn$ is small (say $\nn_{S_i} > \nn_{S_j}$), the difference in $P(S)$ is significant.
$$
\Delta{P(i)} \approx  \partialderivative{P(i)}{\mathcal{N_{\text{particle}_i}}}\cdot\Delta{\nn}
$$
given the $n_i$ is extremely large, taking the limitation.
$$
\Delta{P(i)} \approx  \partialderivative{P(i)}{\mathcal{N_{\text{particle}_i}}}\cdot\Delta{\nn} \approx \infin
$$
the probability between two state are almost extreme large, and the state with higher $\nn$ are always going to exist.

So, the state of the system always tend to increase its $\nn$.

So, as a general rule
$$
\defbox{\Delta{\nn} \geq 0 \ (\text{macroscopic})}
$$




### Entropy

Since the $\nn$ is usually defined as
$$
\nn = \prod^{m}_{i = 0}\mathcal{N^{n_i}_{\text{particle}_i}}
$$
taking the logarithm could simply the computation, and thus define **entropy** as
$$
S= k\ln\nn
$$
where $k$ is called **Boltzmann constant** that balance the conversion of the unit.

Thus, original $\nn$ could be expressed as
$$
\begin{align}
S &= k\ln(\prod^{m}_{i = 0}\mathcal{N^{n_i}_{\text{particle}_i}}) \\
  &= k\sum_{i = 0}^{m}\ln(\mathcal{N^{n_i}_{\text{particle}_i}}) \\
  &= \sum_{i = 0}^{m}n_i\cdot k\ln(\nn_{\text{particle}_i}) \\
  &= \sum_{i = 0}^{m}n_iS_{\text{{particle}}_i}
\end{align}
$$
So
$$
\defbigbox{S = \sum_{i = 0}^{m}n_iS_{\text{particle}_{i}}}
$$
which turns multiplication into additions.

**The Second Law of Thermodynamics** could thus be re-expressed.

So, 
$$
\begin{align}
\Delta{\nn} &\geq 0 \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \\

\mathcal{N_f} / \mathcal{N_i} &\geq 1 \ \ \ \ \ \ \\


k\ln{\mathcal{N_f}} - k\ln{\mathcal{N_i}} &\geq 0 \ \ \ \ \ \ \\
S_{f} - S_{i} &\geq 0 \ \ \ \ \ \ \\
\Delta{S} &\geq 0 \ \ \ \ \ \ \\
\end{align}
$$
Thus, it's re-expressed as
$$
\fbox{$\Delta{S} \geq 0 \ $ (macroscopic)}
$$



### Reversibility and Equilibrium

From second law of thermodynamics:

**Reversibility** means that $\Delta{\nn} = 0$, in this case there is possibility for a **macroscopic** system to return to the initial state. **Irreversibility** means $\Delta{\nn} > 0$.

From entropy:

**Reversibility** means that $\Delta{S} = 0$​. **Irreversibility** means $\Delta{S} > 0$. Reasons are the same as the above.

 

**Equilibrium** means $\max\  \nn$ is reached. This indicates that the $\nn$ and $S$ no longer changed
$$
\Delta{\nn} = \Delta{S} = 0
$$
Or in its differential form
$$
\d \nn = \d S = 0
$$
It could also be understand with respect to other variable, that is
$$
\derivative{\nn}{x} = \derivative{S}{x} =0
$$
for arbitrary variable $x$.



### Reversibility and State function

$\NeedToFillIn$

### Work - Pressure Relation

Suppose in an system that **pressure** $p$ is always defined through a process, and the **external work** $W$ only cause the change in the **volume** $V$ and **pressure**  $P$. Then, the **work** $W$ could be expressed as
$$
\defbox{\dd W = -p\dd A\dd x}
$$
which could be derived from the $\dd F = p \dd A$.
$$
\begin{align}
\dd W &= \dd F_\text{external}\dd x \\
			&= -\dd F_\text{internal}\dd x \text{ (newton's third law)} \\
			&= -p\dd A\dd x \\
\end{align}
$$
If $\d V = 0$, it must result in $\dd A \dd x = 0$, then the $\dd W$ always equal to $0$.
$$
\defbox{(\dd W)_{V} = 0}
$$
Else, when the reaction is reversible, the $\dd A$ and $\dd x$ is path independent, then they could be re-rewrite as $\dd A \dd x = \d V$, and thus
$$
\defbox{\dd W = -p\d V \text{ (reversible)}}
$$



### Temperature

Temperature should have following properties:

* Become same as systems obtains $\max \, S$
* Higher temperature means higher internal energy $U$ (more heat $Q$ obtained)

Define temperature $T$ in an reversible process
$$
\defbigbox{T \equiv \frac{\dd Q}{\d S} \text{ (reversible)}}
$$


Suppose the $V$ and $N$ don't change, which indicates that the **external work** is 
$$
\res{\dd W}{V} = 0
$$
Thus, the internal energy $U$ could be re-expressed as
$$
\d U = \dd Q + \dd W = \res{\dd Q}{V}
$$
Which means that the process is reversible when $V$ and $N$ doesn't change.
$$
\oint \res{\dd Q}{V} = \oint \d U  = 0
$$
Thus, the temperature $T$ could be re-write as
$$
\defbigbox{T = \res{\frac{\dd Q}{\d S}}{V, N} = \derires{U}{S}{V, N}}
$$



### Extension of Second law of thermodynamics

From the definition of temperature $T$, we know that
$$
\d S = \frac{\dd Q}{T} \text{ (reversible)}
$$
It's always true that
$$
\oint \d S = 0
$$
and according to the formula, it indicates that
$$
\defbigbox{\oint \frac{\dd Q}{T} = 0 \text{ (reversible)}}
$$



### Extension of First Law of Thermodynamics

According to the **work-pressure** relation and the relation between entropy and work. The internal energy could be expressed as
$$
\defbox{\d U = \dd Q + \dd W = T\d S - p \d V \text{ (reversible)}}
$$
If the $T$ and $p$ is constant, the formula will remain in irreversible process. Suppose a process constitute a reversible part and irreversible part, it's always true that
$$
\oint \d U = \int_\text{rev} \d U + \int_\text{irrev} \d U = 0
$$
We know the formula in reversible part, thus
$$
\int_\text{irrev} \d U = -\int_\text{rev} \d U = -T\int_\text{rev}\d S + p\int_\text{rev}\d V
$$
Since it's a circular process, the starting point and the ending point of the forward process and the backward process are corresponded. Also, that entropy $S$ and volume $V$ is a state function, thus
$$
\int_\text{rev} \d S = - \int_\text{irrev} \d S
$$
and the same is for volume $V$. Thus
$$
\int_\text{irrev}\d U = T \int_\text{irrev}\d S - p\int_\text{irrev}\d V
$$
which thus indicates
$$
\defbox{\res{\d U}{T,\ p} = T\d S - p\d V \text{ (irreversible)}}
$$



### Fundamental Identity

Note, before this part, the previous part are based on the fact that $N$ is fixed.

The previous formula only dealt when the number of particles isn't changed. There will be a formula regarding the change in $N$.

First the **chemical potential** will be introduced regarding certain particle type $i$
$$
\defbigbox{\mu_{i} = \partderires{U}{N_i}{S, V, N_{j \neq i}}}
$$
Thus, when the $S$ and $V$ is fixed,
$$
\res{\d U}{S, V} = \sum_{i = 1}^{n}\res{\d U}{S, V, N_{j\neq i}} = \sum_{i = 1}^{n}\mu_i\d N_i
$$
Thus, the original formula could be generalized as
$$
\d U = \res{\d U}{N} + \res{\d U}{S, V}
$$
expand the formula, if the reaction is reversible
$$
\defbox{\d U = T\d S - p\d V + \mu_i \d N_i \text{ (reversible)}}
$$
if the reaction isn't reversible, then $T$ and $p$ must stay constant. Thus
$$
\res{\d U}{T, \, p} = \res{\d U}{N, T,\, p} + \res{\d U}{S, V, T, p}
$$
expand the formula, we get
$$
\defbox{\res{\d U}{T,\, p} = \text{T}\d S - \text{p}\d V + \res{\mu_i}{T, p}\d N_i \text{ (irreversible)}}
$$


### Ideal Gas

The Ideal gas obeys following properties:

* particles are free to move through entire space
* particles occupies no space
* no interactions between particles



**Internal Energy**

Thus, there is no internal potential energy, and the internal energy $U$ is thus
$$
U = \sum_{i = 1}^{N} E_\text{kinetics, i}
$$


**Entropy**

Suppose the number of state $\nn$ is based on $E_\text{kinetic}$, and $V$. 

For the ideal gas, the number of state is linearly proportional to $V$ since the particle itself doesn't taken any space.
$$
\nn_{i} = hVf(E_{i})
$$
where $h$ is a constant factor, and $f$ is a unknown function define the relationship between.

So, the entropy for each particle is
$$
S_i = k\ln(hVf(E_i))
$$
and the total entropy is
$$
S =\sum_{i = 1}^{N}k\ln(hVf(E_i)) = kN\ln V + \sum_{i}^{N}\ln(\hf(E_i))
$$
Using a $g(N, U)$ to denote the later part, the entropy could be rewrite as
$$
S = kN\ln V + g(N, U)
$$


**Ideal gas law**

Consider a contained $\d N = 0$ system which reaches its equilibrium and doesn't transfer heat ($\dd Q = 0$) at that instant.

So, according to the **first law of thermodynamics**:
$$
\d U = \dd Q + \dd W = \dd W
$$
which means that the $\dd W$ is path independent at that instant. Thus
$$
\d U = \dd W = -p\d V
$$
since the process reach equilibrium
$$
\d S = \partderires{S}{V}{U, N}\d V + \partderires{S}{U}{V,N}\d U = 0
$$
According to the formula of the entropy of ideal gas, we get
$$
\partderires{S}{V}{U, N} = kN\frac{1}{V}
$$
And the definition of the temperature that
$$
T = \derires{U}{S}{V, N}
$$
So, the original equation is
$$
kN\frac{1}{V} \d V + \frac{1}{T}(-p)\d V = 0
$$
since $\d V$ is not necessarily zero, remove it. Rearrange the formula, we get the ideal gas law
$$
\defbox{pV = NkT}
$$



### Quantum Harmonic Oscillator

Suppose there are $n$ quantum harmonic oscillator each with energy level $\hf$, $2\hf$, $3\hf$, $4\hf$ and so forth.

Suppose their total energy (internal energy) $U$ adds up to $q\hf$.



**Counting state**

To count the number of possible arrangement, this is a problem that divides $q$ objects into $n$ parts, where the parts with no object is allowed. The corresponding formula is
$$
\defbigbox{\nn = \pmatrix{q + n -1 \\ n-1}}
$$
If there are only $2$ oscillators, the formula simplified to
$$
\nn_{n = 2} = \pmatrix{q + 1 \\ 1} = q+1
$$



**Entropy**

The entropy is thus
$$
\defbox{S = k\ln{\nn} = k\ln\frac{(q + n - 1)!}{q!(n-1)!}}
$$
The difference $\Delta{S}$ could be calculated as
$$
S(q + 1) - S(q) = k\ln\frac{(q + n)!}{(q + 1)!(n-1)!}\frac{q!(n-1)!}{(q + n - 1)!}
$$
Simplified it
$$
\defbox{\Delta{S} = k\ln \frac{q + n}{q + 1}}
$$

$\Temperature$





### Quantum Harmonic Oscillator In Environment

**Boltzmann factor**

Suppose one quantum oscillator is placed in a macroscopic environment that the interaction between oscillator and the environment will not change the macroscopic state of the environment except entropy $S$. Also assume all energy transferred as heat $Q$. 

There is two state, 

* state $i$ when oscillator has low energy $E_{i}$, 
* state $f$ when oscillator has high energy $E_{f}$.

Suppose the oscillator goes from the $i$ to $f$

The entropy change of the environment $\Delta{S}_\text{env}$ is ($V$ and $N$ is not changed, so the formula apply)
$$
\Delta{S}_\text{env} = \int\frac{\dd Q_\text{env}}{T_\text{env}} = \frac{-(E_{f} - E_{i})}{T_\text{env}}
$$
since the temperature $T_\text{env}$ doesn't change.

Also, according to the definition of entropy
$$
\Delta{S}_\text{env} = k(\ln \nn_f - \ln \nn_i)= k\ln \frac{ \nn_f}{ \nn_i}
$$
Combining the formula
$$
\frac{-(E_{f} - E_{i})}{kT_\text{env}}=\ln \frac{ \nn_f}{ \nn_i}
$$
which means
$$
\defbigbox{\nn_f = \nn_i\exp{(-\frac{\Delta E}{kT_\text{env}})}}
$$
Assume a based state $\nn_0$ and its corresponding base energy $E_0$, The part $\exp{(-\frac{\Delta E}{kT_\text{env}})} = \exp{(-\frac{E_i - E_0}{kT_\text{env}})}$ is called Boltzmann factor $\hh_0$.





**Probability**

The probability for certain state is thus
$$
P(i) = \frac{\nn_i}{\sum_{j = 0}^{n}\nn_j}
$$
According to the formula of $\nn$.
$$
\defbigbox{P(i)  = \frac{\hh_i}{\sum_{j = 0}^{n}\hh_j}}
$$



### Infinite state system in environment

**probability**

Suppose that in a quantum harmonic oscillator $E_0 = 0$, and the $E_i = i\hf$. 

Denote a shorthand form $x \equiv \exp (\dfrac{\hf}{kT})$. The Boltzmann factor $\hh_i = x^i$, and the formula could be rewritten as
$$
\defbigbox{P(i) = x^i\frac{1}{\sum_{j = 0}^{n}x^j} = (1-x)x^i}
$$
using the formula for the sum of geometric series.

Or it could be written as
$$
\defbigbox{P(i) = (1 - \exp(\frac{\hf}{kT}))\exp^n(\frac{\hf}{kT})}
$$


$\ExtremeCases$



**Expected Energy**
$$
\begin{align}
\angle{U} &= \sum_{i = 0}^{\infin}P(i)E(i) \\
					&= \sum_{i = 0}^{\infin}i\hf(1-x)x^i
\end{align}
$$
For $(1-x)\sum_{i = 0}^{\infin}ix^i$, it could be simplified as
$$
\begin{align}
(1-x)\sum_{i = 1}^{\infin}ix^i 
&= \sum_{i = 1}^{\infin}ix^i - \sum_{i = 1}^{\infin}ix^{i+1} \\
&= x + \sum_{i = 2}^{\infin}ix^i - \sum_{i = 1}^{\infin}ix^{i+1} \\
&= x + \sum_{i = 1}^{\infin}(i + 1)x^{i + 1} - \sum_{i = 1}^{\infin}ix^{i+1} \\
&= x + \sum_{i = 1}^{\infin}x^{i+1} = x(1 + \sum_{i = 1}^{\infin}x^i) \\
&= x(\sum_{i = 0}^{\infin}x^i) = \frac{x}{1-x}
\end{align}
$$
So, the internal energy is
$$
\defbigbox{\angle{U} = \hf\frac{x}{1 - x} = \frac{\hf}{e^{\hf/kT} - 1}}
$$
$\theLimitToClassicalAssumption$



**Heat Capacity**

As assumed, the energy only pass by heat $Q$, so the heat capacity could be calculated using
$$
\molheatv = \derires{U}{T}{V, N}
$$
and the result is
$$
\defbigbox{\molheatv = k\paren{\frac{\hf}{kT}}^2\frac{e^{\hf/kT}}{(e^{\hf/kT} - 1)^2}}
$$
Taking limit as $\hf/kT \to 0$. Denote $u = \hf/kT$. Thus
$$
{k\lim_{u \to 0} (\frac{u}{e^u - 1})^2e^u = k}
$$

So, the heat capacity $\molheatv$ is
$$
\defbox{\lim_{kT \gg \hf}\molheatv = k}
$$
Specially, for a solid, each particle has 3 oscillators on average, so, the heat capacity for solid is
$$
\defbigbox{\molheatv = 3k\paren{\frac{\hf}{kT}}^2\frac{e^{\hf/kT}}{(e^{\hf/kT} - 1)^2}}
$$
and when $kT \gg \hf$
$$
\defbox{\lim_{kT \gg \hf}\molheatv = 3k}
$$
which is consistent with the classical equipartition result. 

**Entropy**

$\FillIn$



### Two state system in environment

Suppose there is a special quantum harmonic system that only allows 2 states $0$ and $\Delta$ in the system. $\hh_{\Delta} = e^{-\Delta/kT}$

**Probability**

Then the probability for both state is
$$
P(0) = \frac{1}{1 + e^{-\Delta/kT}} \\
P(\Delta) = \frac{e^{-\Delta/kT}}{1 + e^{-\Delta/kT}} \\
$$

<iframe src="https://www.desmos.com/calculator/nzkztaavwf?embed" width="500" height="300" style="border: 1px solid #ccc" frameborder=0></iframe>

**Expected Energy**

Thus the expected energy is
$$
\angle{U} = P(0)\cdot0+P(\Delta)\cdot\Delta
$$
and it is
$$
\defbigbox{\angle{U} = \Delta\frac{e^{-\Delta/kT}}{1 + e^{-\Delta/kT}} = \Delta\frac{1}{e^{\Delta/kT} + 1}}
$$
As $kT \gg \Delta$, that is $kT/\Delta \to \infin$
$$
\angle{U} = \frac{1}{2}\Delta
$$

**Heat Capacity**

As assumed, the energy only pass by heat $Q$, so the heat capacity could be calculated using
$$
\molheatv = \derires{U}{T}{V, N}
$$
and the result is
$$
\molheatv = {1\over k}\paren{\frac{\Delta}{T}}^2 \! \frac{e^{\Delta/kT}}{(1 + e^{\Delta/kT})^2}
$$
It look like this

![image-20211207150458953](Thermal physics (copy).assets/image-20211207150458953.png)



**Entropy**

If $\Delta \gg kT$, $P(0) = 1$ and $P(\Delta) = 0$. There is only one possible state. 
$$
\defbox{S = k\ln 1 = 0}
$$
If $\Delta\ll kT$, $P(0) = 0.5$ and $P(\Delta) = 0.5$. There is two equally possible state. 
$$
\defbox{S = k\ln 2}
$$
For general cases
$$
S = \int_{0}^{T_f}\frac{\molheatv}{T}\d T
$$
and it roughly looks like this

$\Plot$

ZZXASSZCCCCCCCCDDDDAAAAQQQZ
