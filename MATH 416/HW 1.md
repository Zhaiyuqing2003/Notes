$$
\newcommand\defbox[1]{\fbox{$\hphantom{\,}\vphantom{\sum}#1\hphantom{\,}$}}
\newcommand\defbigbox[1]{\fbox{$\hphantom{\,}\vphantom{\frac{\sum^{}_{}}{\sum^{}_{}}}#1\hphantom{\,}$}}
$$

### 1.1.8

1. $$
   \begin{align}
   a + b &= -1 \\
   a + c &= 2 \\
   a - b &= 3
   \end{align}
   $$

2. the augmented matrix is
   $$
   \left[\begin{array}{ccc:c}
   	1 & 1 & 0 & -1 \\
   	1 & 0 & 1 & 2 \\
   	1 & -1 & 0 & 3 \\
   \end{array}\right]
   $$
   and its RREF is
   $$
   \left[\begin{array}{ccc:c}
   	1 & 0 & 0 & 1 \\
   	0 & 1 & 0 & -2 \\
   	0 & 0 & 1 & 1 \\
   \end{array}\right]
   $$
   which means $a = 1$, $b = -2$, and $c = 1$. Thus, the original function is 
   $$
   \defbox{f(x) = 1 - 2\cos x + \sin x}
   $$

### 1.1.10

From the pg.5 of book, the linear system is such that for $i \in [1, m]$
$$
\sum^{n}_{j = 1}{a_{ij}x_j} = b_i
$$
where $x_j, j \in [1, n]$ are the variables.

According to the problem, $c_j, j \in [1, n]$ and $d_j, j \in [1, n]$ is the answers to the problem, which means
$$
\sum^{n}_{j = 1}{a_{ij}c_j} = b_i \quad \text{and} \quad  \sum^{n}_{j = 1}{a_{ij}d_j} = b_i
$$
is true. If the $x_j = c_j + d_j, j \in [1, n]$ that means
$$
\sum^{n}_{j = 1}{a_{ij}(c_j + d_j)} =
\sum^{n}_{j = 1}{a_{ij}c_j} + \sum^{n}_{j = 1}{a_{ij}d_j} = 2b_i
$$
If $x_j, j \in [1, n]$ is a solution, that means 
$$
\sum^{n}_{j = 1}{a_{ij}(c_j + d_j)} = b_i \\
2b_i = b_i
$$
which means that $b_i, i \in [1, m]$ is all $0$. 

### 1.1.11

According to the problem, $c_j, j \in [1, n]$ and $d_j, j \in [1, n]$ is the answers to the problem, which means for $i \in [1, m]$
$$
\sum^{n}_{j = 1}{a_{ij}c_j} = b_i \quad \text{and} \quad  \sum^{n}_{j = 1}{a_{ij}d_j} = b_i
$$
So, if the $x_j = c_j + d_j, j \in [1, n]$ , that means
$$
\sum^{n}_{j = 1}{a_{ij}(tc_j + (1 - t)d_j)} =
\sum^{n}_{j = 1}{a_{ij}tc_j} + \sum^{n}_{j = 1}{a_{ij}(1 - t)d_j} = tb_i+ (1 - t)b_i = b_i
$$
In order to be a solution for the linear system, $x_j, j \in [1, n]$ must satisfy for $i \in [1, m]$
$$
\sum^{n}_{j = 1}{a_{ij}x_j} = b_i
$$
which $x_j = tc_j + (1 - t)d_j, j \in [1, n]$ satisfied. So, $x_j = tc_j + (1 - t)d_j, j \in [1, n]$ is indeed a solution, and that's what we need to show.

### 1.2.4

1. 

$$
\left[\begin{array}{ccc}
	1 & 0 & 2/3 \\
	0 & 1 & -1/12 \\
\end{array}\right]
$$

2. $$
   \left[\begin{array}{cccc|c}
   	1 & 0 & 2 & 0 & 1 \\
   	0 & 1 & -1 & 0 & -2 \\
   	0 & 0 & 0 & 1 & 0
   \end{array}\right]
   $$

3. $$
   \left[\begin{array}{ccc}
   	1 & 0 \\
   	0 & 1 \\
   	0 & 0 
   \end{array}\right]
   $$

### 1.2.6

1. the augmented matrix for this linear system is
   $$
   \left[\begin{array}{ccc|c}
   	1 & 3 & 5 & 7 \\
   	2 & 4 & 6 & 8 \\
   \end{array}\right]
   $$
   and the RREF of it is
   $$
   \left[\begin{array}{ccc|c}
   	1 & 0 & -1 & -2 \\
   	0 & 1 & 2 & 3 \\
   \end{array}\right]
   $$
   So
   $$
   \begin{cases}
   	x = -2 + z \\
   	y = 3 - 2z \\
   	z \in R
   \end{cases}
   $$

2. the augmented matrix for this linear system is
   $$
   \left[\begin{array}{ccc|c}
   	1 & 0 & 1 & 2 \\
   	1 & -1 & 2 & -1 \\
   	1 & 1 & 0 & 5
   \end{array}\right]
   $$
   and the RREF of it is
   $$
   \left[\begin{array}{ccc|c}
   	1 & 0 & 1 & 2 \\
   	0 & 1 & -1 & 3 \\
   	0 & 0 & 0 & 0
   \end{array}\right]
   $$
   So
   $$
   \begin{cases}
   	x = 2 - z \\
   	y = 3 + z \\
   	z \in R
   \end{cases}
   $$

3. the augmented matrix for this linear system is
   $$
   \left[\begin{array}{ccc|c}
   	3 & 1 & -2 & -3 \\
   	1 & 0 & 2 & -4 \\
   	-1 & 2 & 3 & 1 \\
   	2 & -1 & 1 & -6 \\
   \end{array}\right]
   $$
   and the RREF of it is
   $$
   \left[\begin{array}{ccc|c}
   	1 & 0 & 0 & -2 \\
   	0 & 1 & 0 & 1 \\
   	0 & 0 & 1 & -1 \\
   	0 & 0 & 0 & 0 \\
   \end{array}\right]
   $$
   So
   $$
   \begin{cases}
   	x = -2 \\
   	y = 1 \\
   	z = -1
   \end{cases}
   $$

### 1.2.10

the augmented matrix for the linear system
$$
\left[\begin{array}{cc|c}
	a & b & e \\
	c & d & f \\
\end{array}\right]
$$
doing the Gauss-Jordan elimination.

If $a \neq 0$, 
$$
\left[\begin{array}{cc|c}
	a & b & e \\
	c & d & f \\
\end{array}\right] \to 
\left[\begin{array}{cc|c}
	1 & b/a & e/a \\
	c & d & f \\
\end{array}\right] \to
\left[\begin{array}{cc|c}
	1 & b/a & e/a \\
	0 & (ad - bc)/a & (af - ce)/a \\
\end{array}\right]
$$
Since $ad - bc \neq 0$, we could divide the second row by $ad - bc$. After some elimination process, the matrix become
$$
\left[\begin{array}{cc|c}
	1 & 0 & e/a - b/a * (af - ce)/(ad - bc) \\
	0 & 1 & (af - ce)/(ad - bc)\\
\end{array}\right]
$$
and the 
$$
\begin{cases}
x = (de - bf)/(ad - bc) \\
y = (af - ce)/(ad - bc)
\end{cases}
$$
which means that is indeed a unique solution.

If $a = 0$, the matrix become
$$
\left[\begin{array}{cc|c}
	0 & b & e \\
	c & d & f \\
\end{array}\right] \to 
\left[\begin{array}{cc|c}
	c & d & f \\
	0 & b & e \\
\end{array}\right]
$$
Since $a = 0$ and $ad - bc \neq 0$, that means $bc \neq 0$, which further indicates that $b \neq 0$ and $c \neq 0$. So
$$
\left[\begin{array}{cc|c}
	c & d & f \\
	0 & b & e \\
\end{array}\right] \to
\left[\begin{array}{cc|c}
	1 & d/c & f/c\\
	0 & 1 & e/b \\
\end{array}\right] \to
\left[\begin{array}{cc|c}
	1 & 0 & f/c - de/bc\\
	0 & 1 & e/b \\
\end{array}\right]
$$
and the
$$
\begin{cases}
x = f/c - de/bc \\
y = e/b
\end{cases}
$$
which means that is indeed a unique solution.

So, in both cases, the system has unique solution, and that's what we need to show.

### 1.2.14

the augmented matrix of the linear system is
$$
\left[\begin{array}{ccc|c}
	2 & 1 & 0 & b_1 \\
	1 & -1 & 3 & b_2 \\
	1 & -2 & 5 & b_3 
\end{array}\right]
$$
and the RREF of it is
$$
\left[\begin{array}{ccc|c}
	1 & 0 & 1 & b_1/2 + (2b_2 - b_1)/6 \\
	0 & 1 & -2 & -(2b_2 - b_1)/3 \\
	0 & 0 & 0 & 2b_3 - b_1 - 5/3(2b_2 - b_1) 
\end{array}\right]
$$
In order for the linear system to be consistent, there shouldn't be ant pivot on the last column, which means the term $2b_3 - b_1 - 5/3(2b_2 - b_1)$ must be zero. So,
$$
b_1 =  5b_2 - 3b_3
$$ {m}
must be satisfied.