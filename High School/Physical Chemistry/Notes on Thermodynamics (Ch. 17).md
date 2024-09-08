# Thermodynamics

## Basic Concepts

**First Law of the Thermodynamics:** The energy of the universe is constant.

**Spontaneity**: A process is said to be *spontaneous* if it occurs without outside intervention. (The speed could either be fast or slow)

**Entropy**: entropy can be viewed as a measure of molecular randomness or disorder. 

Larger positional probability means higher entropy.
$$
\ce{S_{solid} < S_{liquid} << S_{gas} (Larger Positional Probability) }
$$

**Second Law of Thermodynamics:** In any spontaneous process there is always an increase in the entropy of the universe.
$$
\ce{\DSU = \DSSU + \DSS}
$$

The $\ce{\Delta{S_{surr}}}$ largely depends on **heat flow** and the **Temperature**
$$
\ce{\DSSU = \frac{Q}{T} = \frac{-\Delta{H}}{T}}
$$
Explanation: The impact of the transfer of a given quantity of energy as heat to or from the surroundings will be greater at lower temperatures.

| $\DSS$ | $\DSSU$ | $\DSU$ | $\text{Spontaneity}$         |
| ------ | ------- | ------ | ---------------------------- |
| $+$    | $+$     | $+$    | $\text{Yes}$                 |
| $-$    | $-$     | $-$    | $\text{No}$                  |
| $+$    | $-$     | $?$    | $\text{At High Temperature}$ |
| $-$    | $+$     | $?$    | $\text{At Low Temperature}$  |

## Free Energy

$$
\text{Prerequisite: Constant $P$ and $T$}
$$

$$
\ce{
	\DSU = \DSSU + \DSS
}
$$

$$
\DSU = \ce{\frac{-\DH}{T} + \DSS }
$$

$$
\ce{T\DSU = -\DH + T\DSS}
$$

$$
\ce{\DG \equiv \DH - T\DSS = -T\DSU}
$$

$$
\def\DS_#1{\ce{\Delta{S_{#1}}}}
\def\DSU{\DS_{univ}}
\def\DSS{\DS_{sys}}
\def\DSSU{\DS_{surr}}
\def\DH{\ce{\Delta{H}}}
\def\DG{\ce{\Delta{G}}}


\def\Ss_#1{\ce{S^{\circ}_{#1}}}
\def\Ssp{\Ss_{}}
\def\DSs_#1{\ce{\Delta{S^{\circ}_{#1}}}}
\def\DSsr{\DSs_{rxn}}
\def\DGs_#1{\ce{\Delta{G^{\circ}_{#1}}}}
\def\DGsp{\DGs_{}}
\def\Gs_#1{\ce{G^{\circ}_{#1}}}
\def\Gsp{\Gs_{}}
$$

A process (prerequisite fulfilled), is spontaneous if $\DG < 0$.

Hint: Both $\DSU = 0$ and $\DG = 0$ if the reaction is at equilibrium.

| $\DSS$ | $\DH$ | $\text{Spontaneity}$         |
| ------ | ----- | ---------------------------- |
| $+$    | $+$   | $\text{At High Temperature}$ |
| $-$    | $-$   | $\text{At Low Temperature}$  |
| $+$    | $-$   | $\text{Yes}$                 |
| $-$    | $+$   | $\text{No}$                  |

## Entropy Changes in Chemical Reactions

In general, when a reaction involves gaseous molecules, **the change in positional entropy is dominated by the relative numbers of molecules of gaseous reactants and products**. *the more complex the molecule, the higher the standard entropy value*

**Third law of thermodynamics:** the entropy of a perfect crystal at $0K$ is zero.

Standard state: **298 K and 1 atm**
$$
\DSsr = \sum n_p \Ssp_{products} - \sum n_r \Ssp_{reactants}
$$

**Standard free energy change**: *the change in free energy at standard state*

**Standard free energy of formation**: the standard free energy change of formation of 1 mole of certain substance. *the standard free energy of formation of an element in standard state defined to be 0*
$$
\DGsp = \sum n_p\DGs_{f(products)} - \sum n_p\DGs_{f(reactants)}
$$

$$
\ce{G = \Gsp + RT\ln(P)}
$$

$$
\ce{\DG = \DGsp + RT\ln(Q_{P})}
$$

$$
\text{Since $\DG = 0$ when reaction reaches equilibrium}
$$

$$
\ce{\DGsp = -RT\ln(K_P)}
$$

$$
\begin{align}
	&\DGsp > 0, \ce{K_p < 1, favor reverse} \\
	&\DGsp < 0, \ce{K_p > 1, favor forward} \\
	&\DGsp < 0, \ce{K_p > 1, favor neither}
\end{align}
$$

