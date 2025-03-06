$$
\def\U{\bold{U}}
\def\D{\bold{\Sigma}}
\def\V{\bold{V}}
$$

### (A)

We know that $A = \U\D\V^T$, so the
$$
\begin{align}
\norm{\bold A}_F^2 &= \tr(\bold A^T \bold A) \\
&= \tr(\V\D^T\U^T\U\D\V^T) \\
&= \tr(\V\D^T\D\V^T) \\
&= \tr(\D^T\D \V^T\V) \\
&= \tr(\D^T\D) \\
&= \sum_{i} \bold d_i^2 \\
&= \norm{\bold d}_2^2
\end{align}
$$

Where
$$
\begin{align}
\tr(\bold A^T \bold A) 
&= \sum_{i} ({\bold A^T \bold A})_{ii} \\
&= \sum_{i, k} \bold A_{ik}^2 \\
&= \sum_{i, j} a_{ij}^2 = \norm{\bold A}_F^2
\end{align}
$$

So that $\norm{\bold A}_F = \norm{\bold d}_2$

### (B)

#### (a)

$$
\norm{\D}_2 = \max_i \sigma_i = \max_i \bold d_i = \norm{\bold d}_\infin
$$

#### (b)

$$
\begin{align}
\norm{\bold Q}_2^2 
&= (\max_{\norm {y} = 1} \norm{\bold Q y}_2)^2 
\\&= \max_{\norm {y} = 1} \norm{\bold Q y}_2^2 
\\&= \max_{\norm {y} = 1}  y^T\bold Q^T \bold Q y
\\&= \max_{\norm {y} = 1} y^Ty
\\&= 1
\end{align}
$$

Since $\norm {\bold Q}_2$ is nonnegative real number, so $\norm{\bold Q}_2 = 1$.

#### (c)

$$
\begin{align}
\norm{\bold Q_1\bold M}_2 &= \max_{\norm {y} = 1} \norm{\bold Q_1\bold M y}_2
\\&\le \max_{\norm {y} = 1} \norm{\bold Q_1}_2 \norm{\bold M y}_2
\\&= \max_{\norm {y} = 1} \norm{\bold M y}_2
\\&= \norm{\bold M}_2
\end{align}
$$

$$
\begin{align}
\norm{\bold M}_2 &= \norm{\bold Q_1^T \bold Q_1 \bold M}_2
\\&= \norm{\bold Q_1^T (\bold Q_1\bold M)}_2
\\&\le \norm{\bold Q_1^T}_2 \norm{\bold{Q_1M}}_2
\\&= \norm{\bold{Q_1M}}_2
\end{align}
$$

So, $\norm{\bold M}_2 \le \norm{\bold {Q_1M}}_2 \le \norm{\bold M}_2$, therefore $\norm{\bold Q_1 \bold M}_2 = \norm {\bold M}_2$

Set $\bold{Q_1} = \bold Q_2^T$ and $\bold {M} = \bold N^T$, we get
$$
\norm{\bold Q_2^T \bold N^T} = \norm{\bold N^T} \\
\norm{\bold (\bold N \bold Q_2)^T} = \norm{\bold N^T} \\
\norm{\bold N \bold Q_2} = \norm{\bold N} \\
$$
This is the formula we need (except to rename $\bold N$ to $\bold M$), so $\norm{\bold M \bold {Q_2}}_2 = \norm {\bold M}_2$

#### (d)

This is to simply apply (c) twice and then apply (a).
$$
\norm{\bold A}_2 = \norm{\bold U (\bold D \bold V^T)}_2 = \norm{\bold D\bold V^T}_2 = \norm{\bold D}_2 = \norm{\bold d}_\infin
$$
