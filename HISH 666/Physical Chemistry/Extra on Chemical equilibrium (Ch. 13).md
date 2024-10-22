# Chemical Equilibrium

## Concentration to Time Graph

![image-20210307205853555](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307205853555.png)

1. **The ratio of $\bold{\Delta}$ of each concentration** are determined by chemical equation. They are indicated on the graph. This also applied to the ratio of $\bold{instant \; \Delta}$**. (derivatives)** 
2. **The rate of reaction is decreasing.** Because $r = k[A]^m[B]^n$, and the reactant is decreasing. 
3. **The concentration will never reach the asymptote.** **The asymptote couldn't be y = 0.** (The $K = \frac{[C]^l[D]^m}{[A]^j[B]^k}$ in reaction could not be infinity, so the concentration of reactant could be 0 as $t \rightarrow \infin$, which means that they are not approaching y = 0).



## Rate to Time Graph

![image-20210305141939896](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210305141939896.png)

1. **The rate of reaction is decreasing.** Because $r = k[A]^m[B]^n$, and the reactant is decreasing. 
2. **The rate of forward reaction and reverse reaction** will be equal at last (chemical equilibrium)
3. **The rate is the derivative of concentration (or times of reaction), the area under the curve is the times forward / reverse reaction**, the difference in the green and red area is the appeared times of forward or reaction (In this graph, the overall is forward reaction, and the equilibrium position goes to right)

### With Le Châtelier's Principle

#### Change Product / Reactant

With reaction $\ce{jA + kB <=> lC + mD}$:
$$
Q_{at \; equilibrium} = K = \frac{[C]^l[D]^m}{[A]^j[B]^k}
$$

$$
\begin{array}{lcl} 
	v_{f} &=& k_f[A]^j[B]^k \\ 
	v_r &=& k_r[C]^l[D]^m
\end{array}
$$

**The Le Châtelier's Principle could negate some changes, but it couldn't negate all the changes, and the concentration at new equilibrium is different from that of old equilibrium.**

##### Increase of Reactants

$$
[A] \uparrow, \quad Q = \frac{[C]^l[D]^m}{[A]^j[B]^k} < K, \text{To right}
$$

![image-20210306220907235](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210306220907235.png)

| Original (0) | $\bold{\Delta}$ | First Equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3) | Relative to (1) |
| -------- | --------------- | ----------------- | ------ | --------------------------- | -------------------- | -------------------- |
| $A$      | $ -j\Delta$     | $A - j\Delta$ | $A - j\Delta + I$ | $-j\delta$ | $A + I - j(\Delta + \delta)$ | $>$                  |
| $B$      | $-k\Delta$      | $B - k\Delta$ | $B - k\Delta$     | $-k\delta$ | $B - k(\Delta + \delta)$  | $<$                  |
| $C$      | $+l\Delta$      | $C + l\Delta$ | $C + l\Delta$     | $+l\delta$ | $C + l(\Delta+ \delta)$   | $>$                  |
| $D$      | $+m\Delta$      | $D + m\Delta$ | $D + m\Delta$     | $+m\delta$ | $D + m(\Delta + \delta)$ | $>$ |

$$
\text{Relative to First Equilibrium(1):} \quad [B]_{3} \downarrow, [C]_{3}[D]_{3}\uparrow, K = \frac{[C]_{3}^l[D]_{3}^m}{[A]_{3}^j[B]_{3}^k} = constant, [A]_{3} \uparrow
$$

![image-20210307132154715](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307132154715.png)

Relative to First Equilibrium (1):
$$
\begin{array}{lfl}
[A]_{2} \uparrow, & v_{f(2)} =  k_{f}[A]^j[B]^k \uparrow \\
[C]_{2}[D]_{2}=constant, & v_{r(2)} =  k_{r}[C]^l[D]^m \; constant
\end{array}
$$


Relative to Second Initial(2):
$$
\begin{array}{lfl}
[C]_{3}[D]_{3} \uparrow, & v_{r(3)} = k_{r}[C]^l[D]^m \uparrow \\
K = \dfrac{v_{f(3)}}{v_{r(3)}}=constant, & v_{f(3)} \uparrow \\
&\Delta{Area} = \text{to right}
\end{array}
$$

##### Decrease of Reactants

$$
[A] \downarrow, \quad Q = \frac{[C]^l[D]^m}{[A]^j[B]^k} > K, \text{To left}
$$

![image-20210307135642192](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307135642192.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3) | Relative to (1) |
| -------- | --------------- | ----------------- | ------ | --------------------------- | -------------------- | -------------------- |
| $A$      | $ -j\Delta$     | $A - j\Delta$ | $A - j\Delta - I$ | $+j\delta$ | $A + I - j(\Delta - \delta)$ | $<$                 |
| $B$      | $-k\Delta$      | $B - k\Delta$ | $B - k\Delta$     | $+k\delta$ | $B - k(\Delta - \delta)$ | $>$                 |
| $C$      | $+l\Delta$      | $C + l\Delta$ | $C + l\Delta$     | $-l\delta$ | $C + l(\Delta- \delta)$   | $<$                 |
| $D$      | $+m\Delta$      | $D + m\Delta$ | $D + m\Delta$     | $-m\delta$ | $D + m(\Delta -\delta)$ | $<$ |

$$
\text{Relative to First Equilibrium(1):} \quad [B]_{3} \uparrow, [C]_{3}[D]_{3}\downarrow, K = \frac{[C]_{3}^l[D]_{3}^m}{[A]_{3}^j[B]_{3}^k} = constant, [A]_{3} \downarrow
$$

![image-20210307141210726](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307141210726.png)

Relative to First Equilibrium (1):
$$
\begin{array}{lfl}
[A]_{2} \downarrow, & v_{f(2)} =  k_{f}[A]^j[B]^k \downarrow \\
[C]_{2}[D]_{2}=constant, & v_{r(2)} =  k_{r}[C]^l[D]^m \; constant
\end{array}
$$


Relative to Second Initial(2):
$$
\begin{array}{lfl}
[C]_{3}[D]_{3} \downarrow, & v_{r(3)} = k_{r}[C]^l[D]^m \downarrow \\
K = \dfrac{v_{f(3)}}{v_{r(3)}}=constant, & v_{f(3)} \downarrow \\
&\Delta{Area} = \text{to left}
\end{array}
$$

##### Increase of Products

$$
[C] \uparrow, \quad Q = \frac{[C]^l[D]^m}{[A]^j[B]^k} > K, \text{To left}
$$

![image-20210307141654758](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307141654758.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3) | Relative to (1) |
| -------- | --------------- | ----------------- | ------ | --------------------------- | -------------------- | -------------------- |
| $A$      | $ -j\Delta$     | $A - j\Delta$ | $A - j\Delta$ | $+j\delta$ | $A + I - j(\Delta - \delta)$ | $>$                |
| $B$      | $-k\Delta$      | $B - k\Delta$ | $B - k\Delta$     | $+k\delta$ | $B - k(\Delta - \delta)$ | $>$                 |
| $C$      | $+l\Delta$      | $C + l\Delta$ | $C + l\Delta + I$ | $-l\delta$ | $C + l(\Delta- \delta)$   | $>$                |
| $D$      | $+m\Delta$      | $D + m\Delta$ | $D + m\Delta$  | $-m\delta$ | $D + m(\Delta -\delta)$ | $<$ |

$$
\text{Relative to First Equilibrium(1):} \quad [D]_{3} \downarrow, [A]_{3}[B]_{3}\uparrow, K = \frac{[C]_{3}^l[D]_{3}^m}{[A]_{3}^j[B]_{3}^k} = constant, [C]_{3} \uparrow
$$

![image-20210307142529448](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307142529448.png)

Relative to First Equilibrium (1):
$$
\begin{array}{lfl}
[C]_{2} \uparrow, & v_{r(2)} =  k_{r}[C]^l[D]^m \uparrow \\
[A]_{2}[B]_{2}=constant, & v_{f(2)} =  k_{f}[A]^j[B]^k \; constant
\end{array}
$$


Relative to Second Initial(2):
$$
\begin{array}{lfl}
[A]_{3}[B]_{3} \uparrow, & v_{f(3)} = k_{f}[A]^j[B]^l \uparrow \\
K = \dfrac{v_{f(3)}}{v_{r(3)}}=constant, & v_{r(3)} \uparrow \\
&\Delta{Area} = \text{to left}
\end{array}
$$

##### Decrease of Products

$$
[C] \downarrow, \quad Q = \frac{[C]^l[D]^m}{[A]^j[B]^k} < K, \text{To right}
$$

![image-20210307143427870](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307143427870.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3) | Relative to (1) |
| -------- | --------------- | ----------------- | ------ | --------------------------- | -------------------- | -------------------- |
| $A$      | $ -j\Delta$     | $A - j\Delta$ | $A - j\Delta$ | $ -j\delta$ | $A + I - j(\Delta + \delta)$ | $<$               |
| $B$      | $-k\Delta$      | $B - k\Delta$ | $B - k\Delta$     | $ -k\delta$ | $B - k(\Delta + \delta)$ | $<$                |
| $C$      | $+l\Delta$      | $C + l\Delta$ | $C + l\Delta - I$ | $ +l\delta$ | $C + l(\Delta+ \delta)$  | $<$               |
| $D$      | $+m\Delta$      | $D + m\Delta$ | $D + m\Delta$  | $ +m\delta$ | $D + m(\Delta +\delta)$ | $>$ |

$$
\text{Relative to First Equilibrium(1):} \quad [D]_{3} \uparrow, [A]_{3}[B]_{3}\downarrow, K = \frac{[C]_{3}^l[D]_{3}^m}{[A]_{3}^j[B]_{3}^k} = constant, [C]_{3} \downarrow
$$

![image-20210307144325973](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307144325973.png)

Relative to First Equilibrium (1):
$$
\begin{array}{lfl}
[C]_{2} \downarrow, & v_{r(2)} =  k_{r}[C]^l[D]^m \downarrow \\
[A]_{2}[B]_{2}=constant, & v_{f(2)} =  k_{f}[A]^j[B]^k \; constant
\end{array}
$$


Relative to Second Initial(2):
$$
\begin{array}{lfl}
[A]_{3}[B]_{3} \downarrow, & v_{f(3)} = k_{f}[A]^j[B]^l \downarrow \\
K = \dfrac{v_{f(3)}}{v_{r(3)}}=constant, & v_{r(3)} \downarrow \\
&\Delta{Area} = \text{to right}
\end{array}
$$

#### Change Pressure / Volume (Only work for gases)

For the reaction, $\ce{jA + kB <=> lC + mD}$, at assumption $nRT = constant$:
$$
K = \frac{[C]^l[D]^m}{[A]^j[B]^k}
$$

$$
\begin{array}{lcl} n & = & CV \\ 
P_{a} & = & P_{total}\chi_{a} \\
\chi_{a} & = & \dfrac{n_{a}}{n_{total}} \\ 
PV & = & nRT \\ 
\Delta{n} & = & (l + m) - (j + k)\end{array}
$$

$$
\begin{align} 
Q_{at \; equilibrium} = K & = \frac{[C]^l[D]^m}{[A]^j[B]^k} \\ 
&= \frac{1}{V^{(l + m - j - k)}_{total}} \frac{(n_C)^l(n_D)^m}{(n_A)^j(n_B)^k} \\ 
&= \frac{1}{V^{\Delta{n}}_{total}} \frac{(n_C)^l(n_D)^m}{(n_A)^j(n_B)^k} \\ 
&= \left(\frac{P_{total}}{n_{total}RT}\right)^{\Delta{n}}\frac{(n_C)^l(n_D)^m}{(n_A)^j(n_B)^k} \\ 
&=  \left(\frac{P_{total}}{RT}\right)^{\Delta{n}}\frac{(\chi_C)^l(\chi_D)^m}{(\chi_A)^j(\chi_B)^k} 
\end{align}
$$

$$
\begin{align}
v_f &= k_f[A]^j[B]^k \\ 
&= \frac{k_f}{V_{total}^{(j+k)}}(n_A)^j(n_B)^k \\
&= k_f\left(\frac{P_{total}}{RT}\right)^{j+k}(\chi_{A})^j(\chi_{B})^k
\end{align}
$$

$$
\begin{align}
v_r &= k_r[C]^l[D]^m \\ 
&= \frac{k_r}{V_{total}^{(l+m)}}(n_C)^l(n_D)^m \\
&= k_r\left(\frac{P_{total}}{RT}\right)^{l+m}(\chi_{C})^l(\chi_{D})^m
\end{align}
$$

##### Increase Pressure, Decrease Volume

$$
P_{total} \uparrow, V_{total} \downarrow \quad
\begin{cases}
	\Delta{n} = 0, & Q = K, & \text{at equilibrium}\\
	\Delta{n} > 0, & Q > K, & \text{to left} \\
	\Delta{n} < 0, & Q < K, & \text{to right}
\end{cases}
\\
$$

Always favor direction that yield less molecules.

Note that in this case all the concentration will increase proportionally. ($I > 1$)

Note that the total amount of concentration is decreased. 

![image-20210307155709553](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307155709553.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3) |
| -------- | --------------- | ----------------- | ------ | --------------------------- | -------------------- |
| $A$      | $ -j\Delta$     | $A - j\Delta$ | $I(A - j\Delta)$ | $ -j\delta$ | $IA - j(I\Delta +\delta)$ |
| $B$      | $-k\Delta$      | $B - k\Delta$ | $I(B - k\Delta)$     | $ -k\delta$ | $IB - k(I\Delta +\delta)$ |
| $C$      | $+l\Delta$      | $C + l\Delta$ | $I(C + l\Delta)$ | $ +l\delta$ | $IC + l(I\Delta+ \delta)$ |
| $D$      | $+m\Delta$      | $D + m\Delta$ | $I(D + m\Delta)$  | $ +m\delta$ | $ID + m(I\Delta +\delta)$ |

$$
\Delta{n} < 0 \rightarrow \Delta{mol} = \Delta{n}\delta < 0
$$

$$
\text{Relative to First Equilibrium(1):} \quad \chi_{C_{3}} \chi_{D_{3}}\uparrow, \chi_{A_{3}} \chi_{B_{3}}\downarrow \Delta{n} < 0, P_{total} \uparrow
$$

![image-20210307155727381](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307155727381.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3) |
| -------- | --------------- | ----------------- | ------ | --------------------------- | -------------------- |
| $A$      | $ -j\Delta$     | $A - j\Delta$ | $I(A - j\Delta)$ | $ +j\delta$ | $IA - j(I\Delta -\delta)$ |
| $B$      | $-k\Delta$      | $B - k\Delta$ | $I(B - k\Delta)$     | $ +k\delta$ | $IB - k(I\Delta -\delta)$ |
| $C$      | $+l\Delta$      | $C + l\Delta$ | $I(C + l\Delta)$ | $ -l\delta$ | $IC + l(I\Delta - \delta)$ |
| $D$      | $+m\Delta$      | $D + m\Delta$ | $I(D + m\Delta)$  | $ -m\delta$ | $ID + m(I\Delta - \delta)$ |

$$
\Delta{n} > 0 \rightarrow \Delta{mol} = -\Delta{n}\delta < 0
$$

$$
\text{Relative to First Equilibrium(1):} \quad \chi_{C_{3}} \chi_{D_{3}}\downarrow, \chi_{A_{3}} \chi_{B_{3}}\uparrow \Delta{n} > 0, P_{total} \uparrow
$$



![image-20210307162427399](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307162427399.png)

Relative to First Equilibrium (1):
$$
\begin{array}{lfl}
P_{total} \uparrow, V_{total} \downarrow & v_{\text{to less molecules}(2)} \uparrow & v_{\text{to more molecules}(2)} \uparrow \\
Index_{\text{to less molecules}} > Index_{\text{to more molecules}} & v_{\text{to less molecules}(2)} > & v_{\text{to more molecules}(2)}
\end{array}
$$


Relative to Second Initial(2):
$$
\begin{array}{lfl}
[\text{to less moleclues]} \downarrow, & v_{\text{to less molecules}}  \downarrow \\
[\text{to more moleclues]} \uparrow, & v_{\text{to more molecules}} \uparrow \\
&\Delta{Area} = \text{to less molecules}
\end{array}
$$

##### Decrease Pressure, Increase Volume

$$
P_{total} \downarrow, V_{total} \uparrow \quad
\begin{cases}
	\Delta{n} = 0, & Q = K, & \text{at equilibrium}\\
	\Delta{n} > 0, & Q < K, & \text{to right} \\
	\Delta{n} < 0, & Q > K, & \text{to left}
\end{cases}
\\
$$

Always favor direction that yield more molecules.

Note that in this case all the concentration will decreased proportionally. ($I < 1$)

Note that the total amount of concentration is increased. 

![image-20210307163707139](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307163707139.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3)    |
| ------------ | --------------- | --------------------- | ----------------- | --------------- | ------------------------- |
| $A$          | $ -j\Delta$     | $A - j\Delta$         | $I(A - j\Delta)$  | $ -j\delta$     | $IA - j(I\Delta +\delta)$ |
| $B$          | $-k\Delta$      | $B - k\Delta$         | $I(B - k\Delta)$  | $ -k\delta$     | $IB - k(I\Delta +\delta)$ |
| $C$          | $+l\Delta$      | $C + l\Delta$         | $I(C + l\Delta)$  | $ +l\delta$     | $IC + l(I\Delta+ \delta)$ |
| $D$          | $+m\Delta$      | $D + m\Delta$         | $I(D + m\Delta)$  | $ +m\delta$     | $ID + m(I\Delta +\delta)$ |

$$
\Delta{n} > 0 \rightarrow \Delta{mol} = \Delta{n}\delta > 0
$$

$$
\text{Relative to First Equilibrium(1):} \quad \chi_{C_{3}} \chi_{D_{3}}\uparrow, \chi_{A_{3}} \chi_{B_{3}}\downarrow \Delta{n} > 0, P_{total} \downarrow
$$

![image-20210307163655245](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307163655245.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial(2) | $\bold{\delta}$ | Second Equilibrium (3)     |
| ------------ | --------------- | --------------------- | ----------------- | --------------- | -------------------------- |
| $A$          | $ -j\Delta$     | $A - j\Delta$         | $I(A - j\Delta)$  | $ +j\delta$     | $IA - j(I\Delta -\delta)$  |
| $B$          | $-k\Delta$      | $B - k\Delta$         | $I(B - k\Delta)$  | $ +k\delta$     | $IB - k(I\Delta -\delta)$  |
| $C$          | $+l\Delta$      | $C + l\Delta$         | $I(C + l\Delta)$  | $ -l\delta$     | $IC + l(I\Delta - \delta)$ |
| $D$          | $+m\Delta$      | $D + m\Delta$         | $I(D + m\Delta)$  | $ -m\delta$     | $ID + m(I\Delta - \delta)$ |

$$
\Delta{n} < 0 \rightarrow \Delta{mol} = -\Delta{n}\delta > 0
$$

$$
\text{Relative to First Equilibrium(1):} \quad \chi_{C_{3}} \chi_{D_{3}}\downarrow, \chi_{A_{3}} \chi_{B_{3}}\uparrow \Delta{n} < 0, P_{total} \downarro
$$

![image-20210307163637683](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307163637683.png)

Relative to First Equilibrium (1):
$$
\begin{array}{lfl}
P_{total} \downarrow, V_{total} \uparrow & v_{\text{to less molecules}(2)} \downarrow & v_{\text{to more molecules}(2)} \downarrow \\
Index_{\text{to less molecules}} > Index_{\text{to more molecules}} & v_{\text{to less molecules}(2)} < & v_{\text{to more molecules}(2)}
\end{array}
$$


Relative to Second Initial(2):
$$
\begin{array}{lfl}
[\text{to more moleclues]} \downarrow, & v_{\text{to more molecules}}  \downarrow \\
[\text{to less moleclues]} \uparrow, & v_{\text{to less molecules}} \uparrow \\
&\Delta{Area} = \text{to more molecules}
\end{array}
$$

#### Change Temperature 

$$
\begin{align} 
K & = \frac{k_f}{k_r} \\ 
&= \dfrac{A_fe^{-\frac{E_{af}}{RT}}}{A_re^{-\frac{E_{ar}}{RT}}} \\
&= \dfrac{A_f}{A_r}e^{-\frac{1}{RT}(E_{af} - E_{ar})} \\
&= \dfrac{A_f}{A_r}e^{-\dfrac{\Delta{H}}{RT}}
\end{align}
$$

$$
k_f = A_fe^{-\frac{E_{af}}{RT}}
$$

$$
k_r = A_re^{-\frac{E_{ar}}{RT}}
$$

##### Increase Temperature

$$
T \uparrow \quad
\begin{cases}
	\Delta{H} = 0, & K = Q, & \text{at equilibrium}\\
	\Delta{H} > 0, & K > Q, & \text{to right} \\
	\Delta{H} < 0, & K < Q, & \text{to left}
\end{cases}
\\
$$

Always favor endothermic side.

Note that the reaction speed increased because of increase of temperature.

Note that the difference in area indicate the decrease of temperature. 

![image-20210307164123305](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307164123305.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial (2) | $\bold{\delta}$ | Second Equilibrium (3)   |
| ------------ | --------------- | --------------------- | --------------- | ------------------------- | ------------------------- |
| $A$          | $ -j\Delta$     | $A - j\Delta$         |    $A - j\Delta$      | $ -j\delta$     | $A - j(\Delta +\delta)$ |
| $B$          | $-k\Delta$      | $B - k\Delta$         |       $B - k\Delta$    | $ -k\delta$     | $B - k(\Delta +\delta)$ |
| $C$          | $+l\Delta$      | $C + l\Delta$         |      $C + l\Delta$      | $ +l\delta$     | $C + l(\Delta+ \delta)$ |
| $D$          | $+m\Delta$      | $D + m\Delta$         |    $D + m\Delta$      | $ +m\delta$     | $D + m(\Delta +\delta)$ |

$$
\begin{array}{lfl}
\text{With respect to (1):} \quad 
	& [A]_3[B]_3 \downarrow, [C]_3[D]_3 \uparrow, 
	& K_3 = \frac{[A]_3^j[B]_3^k}{[C]_3^l[D]_3^m} \downarrow \\
& \Delta{H} < 0,& T \uparrow
\end{array}
$$

![image-20210307164137794](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307164137794.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial (2) | $\bold{\delta}$ | Second Equilibrium (3)   |
| ------------ | --------------- | --------------------- | --------------- | ------------------------- | ------------------------- |
| $A$          | $ -j\Delta$     | $A - j\Delta$         |    $A - j\Delta$      | $ +j\delta$     | $A - j(\Delta - \delta)$ |
| $B$          | $-k\Delta$      | $B - k\Delta$         |       $B - k\Delta$    | $ +k\delta$     | $B - k(\Delta - \delta)$ |
| $C$          | $+l\Delta$      | $C + l\Delta$         |      $C + l\Delta$      | $ -l\delta$     | $C + l(\Delta - \delta)$ |
| $D$          | $+m\Delta$      | $D + m\Delta$         |    $D + m\Delta$      | $ -m\delta$     | $D + m(\Delta - \delta)$ |

$$
\begin{array}{lfl}
\text{With respect to (1):} \quad 
	& [A]_3[B]_3 \uparrow, [C]_3[D]_3 \downarrow, 
	& K_3 = \frac{[A]_3^j[B]_3^k}{[C]_3^l[D]_3^m} \uparrow \\
& \Delta{H} > 0,& T \uparrow
\end{array}
$$

![image-20210307190143653](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307190143653.png)

Relative to First Equilibrium(1):
$$
K_2 = \frac{A_f}{A_r}e^{-\frac{\Delta{H}}{RT}} 
	= \frac{k_{f(2)}}{k_{r(2)}} \\
\qquad\begin{cases}\begin{array}{lfl}
	\Delta{H} = 0,  & K_2 = constant, & k_{endothermic(2)} = k_{exothermic(2)} \\
	\Delta{H} > 0,  & K_2 \uparrow, 
		& k_{f(2)} = k_{endothermic(2)} > k_{r(2)} = k_{exothermic(2)} \\
	\Delta{H} < 0,  & K_2 \downarrow, 
		& k_{r(2)} = k_{endothermic(2)} > k_{f(2)} = k_{exothermic(2)}
\end{array}\end{cases} \\
$$

$$
T\uparrow, v_{endothermic(2)} \uparrow, v_{exothermic(2)} \uparrow \\
v_{endothermic(2)} > v_{exothermic(2)}
$$

Relative to second Initial(2):
$$
T_{3} \downarrow \begin{array}{lfl} 
	[endothermic] \downarrow,  & v_{endothermic(3)} \downarrow\\ 
	[exothermic] \uparrow,  & v_{exothermic(3)} \uparrow \\
\end{array}
$$

##### Decrease Temperature

$$
T \downarrow \quad
\begin{cases}
	\Delta{H} = 0, & K = Q, & \text{at equilibrium}\\
	\Delta{H} > 0, & K < Q, & \text{to left} \\
	\Delta{H} < 0, & K > Q, & \text{to right}
\end{cases}
\\
$$

Always favor exothermic side.

Note that the reaction speed decreased because of decrease of temperature.

Note that the difference in area indicate the increase of temperature. 

![image-20210307195658907](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307195658907.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial (2) | $\bold{\delta}$ | Second Equilibrium (3)   |
| ------------ | --------------- | --------------------- | --------------- | ------------------------- | ------------------------- |
| $A$          | $ -j\Delta$     | $A - j\Delta$         |    $A - j\Delta$      | $ -j\delta$     | $A - j(\Delta +\delta)$ |
| $B$          | $-k\Delta$      | $B - k\Delta$         |       $B - k\Delta$    | $ -k\delta$     | $B - k(\Delta +\delta)$ |
| $C$          | $+l\Delta$      | $C + l\Delta$         |      $C + l\Delta$      | $ +l\delta$     | $C + l(\Delta+ \delta)$ |
| $D$          | $+m\Delta$      | $D + m\Delta$         |    $D + m\Delta$      | $ +m\delta$     | $D + m(\Delta +\delta)$ |

$$
\begin{array}{lfl}
\text{With respect to (1):} \quad 
	& [A]_3[B]_3 \downarrow, [C]_3[D]_3 \uparrow, 
	& K_3 = \frac{[A]_3^j[B]_3^k}{[C]_3^l[D]_3^m} \downarrow \\
& \Delta{H} > 0,& T \downarrow
\end{array}
$$

![image-20210307204835894](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307204835894.png)

| Original (0) | $\bold{\Delta}$ | First equilibrium (1) | Second Initial (2) | $\bold{\delta}$ | Second Equilibrium (3)   |
| ------------ | --------------- | --------------------- | --------------- | ------------------------- | ------------------------- |
| $A$          | $ -j\Delta$     | $A - j\Delta$         |    $A - j\Delta$      | $ +j\delta$     | $A - j(\Delta - \delta)$ |
| $B$          | $-k\Delta$      | $B - k\Delta$         |       $B - k\Delta$    | $ +k\delta$     | $B - k(\Delta - \delta)$ |
| $C$          | $+l\Delta$      | $C + l\Delta$         |      $C + l\Delta$      | $ -l\delta$     | $C + l(\Delta - \delta)$ |
| $D$          | $+m\Delta$      | $D + m\Delta$         |    $D + m\Delta$      | $ -m\delta$     | $D + m(\Delta - \delta)$ |

$$
\begin{array}{lfl}
\text{With respect to (1):} \quad 
	& [A]_3[B]_3 \uparrow, [C]_3[D]_3 \downarrow, 
	& K_3 = \frac{[A]_3^j[B]_3^k}{[C]_3^l[D]_3^m} \uparrow \\
& \Delta{H} < 0,& T \downarrow
\end{array}
$$

![image-20210307195858537](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307195858537.png)

Relative to First Equilibrium(1):
$$
K_2 = \frac{A_f}{A_r}e^{-\frac{\Delta{H}}{RT}} 
	= \frac{k_{f(2)}}{k_{r(2)}} \\
\qquad\begin{cases}\begin{array}{lfl}
	\Delta{H} = 0,  & K_2 = constant, & k_{endothermic(2)} = k_{exothermic(2)} \\
	\Delta{H} > 0,  & K_2 \downarrow, 
		& k_{f(2)} = k_{endothermic(2)} < k_{r(2)} = k_{exothermic(2)} \\
	\Delta{H} < 0,  & K_2 \uparrow, 
		& k_{r(2)} = k_{endothermic(2)} < k_{f(2)} = k_{exothermic(2)}
\end{array}\end{cases} \\
$$

$$
T\uparrow, v_{endothermic(2)} \uparrow, v_{exothermic(2)} \uparrow \\
v_{endothermic(2)} < v_{exothermic(2)}
$$

Relative to second Initial(2):
$$
T_{3} \uparrow \begin{array}{lfl} 
	[endothermic] \uparrow,  & v_{endothermic(3)} \uparrow\\ 
	[exothermic] \downarrow,  & v_{exothermic(3)} \downarrow \\
\end{array}
$$

#### Add catalyst

$$
\Delta{H} = constant, \quad
K = \dfrac{A_f}{A_r}e^{-\dfrac{\Delta{H}}{RT}} = constant
$$

![image-20210307205833815](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307205833815.png)
$$
\begin{array}{lfl}
T \uparrow, k_r \uparrow, k_f \uparrow \\
k_f = Kk_r \\
v_f = Kv_r \\
K = constant \\
v_r \uparrow = v_f \uparrow 
\end{array}
$$
![image-20210307205922718](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307205922718.png)

#### Add Inert Gas

$$
V_{total} = constant, K = constant, Q = constant
$$

![image-20210307205833815](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307205833815-1618123206132.png)

![image-20210307212303880](Extra%20on%20Chemical%20equilibrium%20(Ch.%2013).assets/image-20210307212303880.png)