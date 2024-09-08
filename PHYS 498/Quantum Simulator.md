$$
\newcommand\state[1]{|#1\rangle}
\newcommand\control[3]{\Gate{C}{#2}(\Gate{#1}{#3})}
\newcommand\Cx[2]{\control{X}{#1}{#2}}
\newcommand\Gate[2]{\text{#1}_{#2}}
\newcommand\Rz[2]{\Gate{R}{#1}(\text{Z}, #2)}
\newcommand\H[1]{\Gate{H}{#1}}
\newcommand\P[2]{\Gate{P}{#1}(#2)}
\newcommand\X[1]{\Gate{X}{#1}}
\newcommand\gate[1]{\Gate{#1}{}}
\newcommand\rz[1]{\gate{R}{}(\text{Z}, #1)}
\newcommand\h{\gate{H}{}}
\newcommand\p[1]{\gate{P}{}(#1)}
\newcommand\x{\gate{X}{}}
\newcommand\cx{\control{X}{}{}}
$$

## Quantum Simulator

### Quantum State

#### Vector-Based

One simplest Idea is to implement the state as vector. For $\text{wirelength = n}$, produce $2^n$ length vector. Example: suppose $\text{wirelength} = 1$, then $0.6\state{0} + 0.8\state{1}$ is $\left[\matrix{0.6 \\ 0.8} \right]$, and the code for that is

```ts
const vecOne = Vector.fromArray([0.6, 0.8]); // or
const vecTwo = Vector.zeros(2 ** 1);
vecTwo.set(0, ComplexNumber.fromReal(0.6));
vecTwo.set(0, ComplexNumber.fromReal(0.8));
```

#### String-State based

This is the structure explained in the **Simulator II**, however, instead of using structure `[string, ComplexNumber][]`, the `Map<string, ComplexNumber>`. The reason is that `Map` doesn't need to consider duplication problem and only save the space by not storing all the state configurations. (this lead to better performance). The code for generating a quantum state is

```tsx
const stateOne = QuantumState.create(2) // no state stored, wireLength = 2;
const stateTwo = QuantumState.zero(2) // |00>
const stateThree = QuantumState.unique(2, "10") // |10>
```

#### Number-State based

Instead of using structure like `Map<string, ComplexNumber>`, the `Map<number, ComplexNumber>` could be used where a decimal number represent the state. This lead to faster implementation of the quantum gate later.

```tsx
const stateOne = QuantumVectorState.create(2) //no state stored, wireLength = 2;
const stateTwo = QuantumVectorState.zero(2) // |00>
const stateThree = QuantumVectorState.unique(2, 2) // |10>
```

### Quantum Gate

There are three elementary gate we use:

1. **Hadamard**, denote as $\H{a}$
2. **Phase**, denote as $\P{a}{\theta}$
3. **Control-X** (or **Control Not**), denote as $\Cx{a}{b}$

While all the gates could be built upon those three gates, or be estimated in certain number of gates, some gates could be directly implemented to improve the speed.

#### Different Gate Implementations

##### Direct Matrix Method (Simulator Ia)

Express all the gates in the **Quantum Circuit** as `Matrix[]`, then multiply the matrix together, then use the resulted `Matrix` to multiply the state `Vector`, and get the final `Vector`.

The matrix multiplication has time complexity $O(m^3)$, where $m = 2^n$, So the overall complexity is $O(8^n)$

##### Matrix Method (Simulator Ib)

Express all the gates in the **Quantum Circuit** as `Matrix[]`, multiply the input `Vector` by each `Matrix`, and get the final `Vector`.

The vector multiplication has time complexity $O(m^2)$, where $m = 2^n$, So the overall complexity is $O(4^n)$ 

##### Sparse Matrix Method (Simulator Ic)

Express all the gates in the **Quantum Circuit** as `SparseMatrix[]`, multiply the input state `Vector` by each `SparseMatrix`, and get the final `Vector`.

Technically, the worse-case time complexity is still $O(4^n)$, but consider

1. Hadamard $\h$ only have $2m$ entries
2. Phase $\p\theta$ only have $m$ entries
3. Control-X $\cx$ only have $m$ entries

The entries in the sparse matrix $E = km$, where $k$ is a constant.

So, the vector multiplication, on average, only takes $O(m) = O(2^n)$

##### String-State-Based State Transformer Method (Simulator II variant)

Express all gates in the **Quantum Circuit** as `TransformFunction<QuantumState>[]`, transform the input `QuantumState` by each `TransformFunction<QuantumState>`, and get final `QuantumState`.

The `TransformFunction<QuantumState>` works by manipulate the string 

The theoretical worse-case time complexity is $O(2^n)$, since the transform will apply on each state configuration. However, consider

1. Hadamard $\h$ split $1$ state configuration into $2$.
2. Phase $\p\theta$ transform $1$ state configuration into $0$ or $1$ configurations.
3. Control-X $\cx$ negate $1$ state configuration into $1$ another configuration.

So, for a `QuantumState`, the size $m'$ of its `Map` is smaller than $2^n$, sometimes far smaller for certain list of gates (if there are less $\h$), and it generally yield far better speed. (See the speed benchmark in [Speed Comparison](#Speed Comparison) section).

As a rough estimation, the number of state usually depends on number of $\h$ in the circuit. For each $\h$ applied, there will be roughly $r$ times more state configurations. The $r$ should be within in $[1, 2]$ and depends on the number of $\h$ already added called $h$, the total `wireLength` $n$, and the specific input state $s$. So,
$$
r(h, n, s) \in [1, 2] \quad \lim_{h \to \infin}r(h, n, s) = 1 \\
r'(h, n, s) < 0 \quad \lim_{h \to \infin}r'(h, n, s) = 0 \\
$$

The total number of configuration $m'$ could thus be estimated as
$$
m' = \text{len}(s)\prod_{i = 1}^h r(i, n, s) \leq m
$$
Just as a pure assumption, the $r$ should like the red function below, where the purple function is the $n' = \log(m') \approx \log(\text{len}(s))\sum_{i}^{x}\log(r(h, n, s))$. The x-axis is the number of the $\h$.

<iframe src="https://www.desmos.com/calculator/1dajelsbfl?embed" width="500" height="250" style="border: 1px solid #ccc" frameborder=0></iframe>

So, suppose there are `h` number of $\h$, the number of state configuration is
$$
m' = 2^{n'(h, n)}
$$
and the total time complexity is $O(2^{n'(h, n)})$, an decrease of factor $2^{n - n'(h, n)}$.

##### Vector-Based State Transformer Method (Simulator III)

Express all gates in the **Quantum Circuit** as `TransformFunction<Vector>[]`, transform the input `Vector` by each `TransformFunction<Vector>`, and get final `Vector`. The difference of `TransformFunction<Vector>` is that it uses the same bitwise algorithm as the method below. Since `Vector` has length $2^n$, it has a time complexity $O(2^n)$

##### Number-State-Based State Transformer Method (Simulator IV)

Essentially the same process as the String-State-Based State Transformer, the only difference is that the `TransformFunction<QuantumVectorState>` uses **bitwise** calculation instead of **string manipulation** to find the next `QuantumVectorState`, this improve the speed by a constant factor `k`. 



#### Basis Gate

Basis Gate are defined as **un-inverted and uncontrolled** gates.

##### Single Wire Gate

The common single wire gate could be directly implemented with either `Matrix/SparseMatrix`, `QuantumVectorState/Vector`, `QuantumState`

there are 4 implemented in the code $\h$, $\x$, $\p\theta$, and $\rz\theta$

###### Matrix Implementation

1. **Hadamard** $\h = {1\over \sqrt2}\begin{bmatrix}
   	1 & 1 \\
   	1 & -1
   \end{bmatrix} $
2. **Pauli** $\x = \begin{bmatrix}
   	0 & 1 \\
   	1 & 0
   \end{bmatrix}$​
3. **Phase** $\p\theta = \begin{bmatrix}
   	1 & 0 \\
   	0 & e^{i\theta}
   \end{bmatrix}$​
4. **Rotation Z**, $\rz\theta = \begin{bmatrix}
   	e^{-i\frac{\theta}{2}} & 0 \\
   	0 & e^{i\frac{\theta}{2}}
   \end{bmatrix}$​

while these are the associated matrix when applied on single wire, any single-wire unitary matrix $\Gate{U}{a}$ (applied on $a$) for multiple wire could be achieved by using tensor product:
$$
\gate{U} = \Gate{I}{2^{a}}\otimes\Gate{U}{a}\otimes\Gate{I}{2^{n - a - 1}}
$$

###### String-State Based Implementation

Allthe implementation could be found in `src/lib/QuantumGate/ElementaryGate` folder. The `getStringStateFunction()` in corresponding gate file.

###### Number-State Based Implementation

All the implementation could be found in `src/lib/QuantumState/ElementaryGate` folder. The `getNumberStateFunction()` in corresponding gate file.

##### Multiple Wire Gate

These includes `Flip`, `Swap`, `Shor`, and `Fourier`

###### Matrix Implementation

No direct implementation for `Flip`, `Swap`, `Fourier` on multiple gates.

For `Shor(x, N)`, a matrix $A$ could be constructed where
$$
[A]_{ij} = \begin{cases}
	1 \quad (ix \equiv j) \mod N \\
	0 \quad \text{otherwise}
\end{cases}
$$

###### String-State Based Implementation

All the implementation could be found in `src/lib/QuantumGate/ExtendedGate` folder. The `getStringStateFunction()` in corresponding gate file.

###### Number-State Based Implementation

All the implementation could be found in `src/lib/QuantumState/ExtendedGate` folder. The `getNumberStateFunction()` in corresponding gate file.







---

#### Grading Information

##### Testing Quantum Circuits

###### Testing "rand.circuit"

>Implemented in `src/tests/TestingCircuit.ts --> testingRandCircuit()`

The following data is the executing result of `rand.circuit`, the same result could be retrieved by

1. Open the `./dist/TestingCircuit/index.html#testRandCiruit`
2. The information will be logged in the console. The graph below will also be shown on the page.

|             | $\bold{+0}$          | $\bold{+1}$          | $\bold{+2}$          | $\bold{+3}$          |
| ----------- | -------------------- | -------------------- | -------------------- | -------------------- |
| $\bold{0}$  | $+0.1457 + 0.1135i$  | $+0.0431 - 0.1218i$  | $-0.0002 + 0.0801i$  | $+0.0504 - 0.0073i$  |
| $\bold{4}$  | $+0.0723 - 0.0226i$  | $-0.0344 - 0.0422i $ | $+0.0539 + 0.0090i$  | $+0.0018 - 0.0268i $ |
| $\bold{8}$  | $+0.1346 - 0.1256i$  | $-0.1041 - 0.0676i$  | $+0.0107 + 0.0709i$  | $+0.0315 - 0.0354i $ |
| $\bold{12}$ | $+0.0079 + 0.2979i$  | $+0.1961 - 0.0584i$  | $+0.1131 - 0.0228i$  | $+0.0257 + 0.0756i$  |
| $\bold{16}$ | $+0.0015 - 0.0365i $ | $-0.0127 + 0.0055i$  | $-0.0821 + 0.0155i $ | $+0.0160 + 0.0226i$  |
| $\bold{20}$ | $-0.1717 + 0.3669i$  | $+0.2775 + 0.0423i$  | $ -0.1469 - 0.0436i$ | $+0.0074 + 0.1079i$  |
| $\bold{24}$ | $-0.4427 - 0.0892i$  | $+0.0343 + 0.3180i$  | $-0.0548 - 0.2147i $ | $-0.1210 + 0.0654i$  |
| $\bold{28}$ | $-0.1814 - 0.0780i$  | $-0.0059 + 0.1270i$  | $-0.0578 + 0.0101i$  | $-0.0118 + 0.0200i$  |

Visualization: the below is the visualization of the vector, the height is the $|c|^2$, and the color from red to blue is the $\arg(c)$.

<iframe frameborder = "0" src = "http://localhost:1234/TestingCircuit#testRandCircuit" height = "500"></iframe>

###### Testing "measure.circuit"

>Implemented in `src/tests/TestingCircuit.ts --> testingMeasureCircuit()`

The same result could be retrieved by

1. Open the `./dist/TestingCircuit/index.html#testMeasureCiruit`
2. The graph should be shown directly. Also, the data will be shown accordingly.

<iframe frameborder = "0" src = "http://localhost:1234/TestingCircuit#testMeasureCircuit" height = "500"></iframe>

The distribution is generated from $100000$ measures. Note the graph have almost exactly the same shape as the $|c|^2$, which validate the `measure` function is implemented correctly.

###### Testing "input.circuit"

>Implemented in `src/tests/TestingCircuit.ts --> testingInputCircuit()`

The following data is the executing result of `input.circuit`, the same result could be retrieved by

1. Open the `./dist/TestingCircuit/index.html#testInputCiruit`
2. The information will be logged in the console. The graph below will also be shown on the page.

|             | $\bold{+0}$          | $\bold{+1}$          | $\bold{+2}$          | $\bold{+3}$          |
| ----------- | -------------------- | -------------------- | -------------------- | -------------------- |
|$\bold{0}$|$+0.1541 - 0.0390i  $|$+0.0490 - 0.0300i  $|$ -0.0213 + 0.0877i  $|$ -0.1116 - 0.2333i  $|
|$\bold{4}$|$-0.0339 - 0.0097i  $|$ -0.0167 - 0.1303i  $|$ -0.1959 + 0.0099i  $|$ -0.0980 + 0.0135i  $|
|$\bold{8}$|$-0.1808 + 0.0144i  $|$+0.0538 - 0.0686i  $|$+0.0010 - 0.0035i  $|$ -0.0215 + 0.0174i  $|
|$\bold{12}$|$-0.0072 + 0.1596i  $|$ -0.2231 + 0.0746i  $|$ -0.0379 + 0.0059i  $|$+0.0739 - 0.0507i  $|
|$\bold{16}$|$-0.1480 + 0.0875i  $|$ -0.0633 + 0.2566i  $|$+0.1169 + 0.0138i  $|$ -0.0267 - 0.0041i  $|
|$\bold{20}$|$+0.2192 - 0.2130i  $|$ -0.0489 - 0.1164i  $|$ -0.1479 - 0.1048i  $|$+0.2232 + 0.0508i  $|
|$\bold{24}$|$-0.1396 - 0.2372i  $|$+0.1848 - 0.0051i  $|$ -0.2632 - 0.0656i  $|$+0.1752 - 0.0201i  $|
|$\bold{28}$|$+0.1122 + 0.0012i  $|$+0.0242 - 0.1245i  $|$ -0.2083 + 0.0770i  $|$+0.0548 + 0.3061i  $|

Visualization: the below is the visualization of the vector, the height is the $|c|^2$, and the color from red to blue is the $\arg(c)$.

<iframe frameborder = "0" src = "http://localhost:1234/TestingCircuit#testInputCircuit" height = "500"></iframe>

##### Speed Comparison

##### Non-Atomic Gate

###### Description for <u>Not / PauliX</u>

The `Not` is just the `PauliX`, its description in matrix is
$$
\begin{bmatrix}
	0 & 1 \\
	1 & 0 \\
\end{bmatrix}
$$
Suppose the `Not(wire)`, it could be expressed as

```pseudocode
define (`X {wire}` : string) is string {
    H {wire}
    P {wire, PI}
    H {wire}
}
```

We could verify this by multiply the matrix
$$
\begin{bmatrix}
	0 & 1 \\
	1 & 0 \\
\end{bmatrix} = \frac{1}{\sqrt{2}} \begin{bmatrix}
	1 & 1 \\
	1 & -1 \\
\end{bmatrix} \cdot \begin{bmatrix}
	1 & 0 \\
	0 & -1 \\
\end{bmatrix} \cdot 
\frac{1}{\sqrt{2}} \begin{bmatrix}
	1 & 1 \\
	1 & -1 \\
\end{bmatrix}
$$
which indicates some fundamental relation between $\text{Pauli Gates}$.
$$
\text{Z = HXH} \quad \text{and} \quad \text{X = HZH}
$$
where 
$$
\text{Z} = \text{P($\pi$)}
$$
in that sense, the $\text{H}$ is change-basis matrix between $x$ and $z$ axis in Bloch Sphere.

##### Description for <u>Rz</u>

The description for `Rz`, in two wires, is just
$$
\begin{bmatrix}
	e^{-i\frac{\theta}{2}} & 0 \\
	0 & e^{i\frac{\theta}{2}}
\end{bmatrix}
$$
Suppose `Rz(wire, phase)`, it could be expressed as

```pseudocode
define (`RZ {wire} {phase}` : string) is string {
	X {wire}
	P {wire, -phase / 2}
	X {wire}
	P {wire, phase / 2}
}
```

We could verify this by multiply the matrix
$$
\begin{bmatrix}
	e^{-i\frac{\theta}{2}} & 0 \\
	0 & e^{i\frac{\theta}{2}}
\end{bmatrix} = \begin{bmatrix}
	0 & 1 \\
	1 & 0 \\
\end{bmatrix} \cdot \begin{bmatrix}
	1 & 0 \\
	0 & e^{-i\frac{\theta}{2}} \\
\end{bmatrix} \cdot 
\begin{bmatrix}
	0 & 1 \\
	1 & 0 \\
\end{bmatrix}
\begin{bmatrix}
	1 & 0 \\
	0 & e^{i\frac{\theta}{2}} \\
\end{bmatrix}
$$
that is
$$
R_z(\theta) = \text{P}\left(\frac{\theta}{2}\right)\text{X}\text{P}\left(-\frac{\theta}{2}\right)\text{X}
$$

##### Description of <u>Control Rz</u>

The `CRz` takes similar form of $C_U$


$$
\begin{bmatrix}
	1 & 0 & 0 & 0 \\
	0 & 1 & 0 & 0 \\
	0 & 0 & e^{-i\frac{\theta}{2}} & 0 \\
	0 & 0 & 0 & e^{i\frac{\theta}{2}}
\end{bmatrix}
$$







