### Problem 1

>Let's define a function $T$ as follows (powers of 3 only)
>
>- $T(9) = 7$
>- $T(n) = 4 T(n/3) + n$
>
>Answer the following questions about the recursion tree for this function:
>
>1. How many nodes are in the fifth level of the tree? (Assuming that n is large enough that the tree has a fifth level.)
>2. What is the sum of the values of all nodes in the fifth level?
>3. What is the height of the tree?
>4. How many leaves does the tree have?

1. Zero Level: $1$. First Level: $4$. ... Fifth level: $4 \cdot 4 \cdot 4 \cdot 4 \cdot 4= 1024$ nodes.
2. $\frac{1024}{243}n$
3. The tree could be expressed as $4^{k-1}(4T(n/3^k) + n/3^{k-1})$, where $k$ represent the $\text{height} > 0$. Let $n/3^k = 9$. So, $k = \log_{3}{n/9} = (\log_{3}n) - 2$. So, the height is $(\log_{3}n)-2$
4. $4^{k} = 4^{(\log_3{n}) - 2} = {1\over16}n^{\log_{3}4}$

### Problem 2

>Let's define a function T as follows:
>
>- $T(1) = c$
>- $T(n) = nT(n-1) + 1$
>
>Answer the following questions about the recursion tree for this function:
>
>1. How many nodes are in the third level of the tree?
>2. What is the height of the tree?
>3. What is the sum of the values in the leaf nodes of the tree?
>4. Is the closed form for this function $O(2^n)$?

1. Zero level: $1$. First level: $n$. Second level: $n(n-1)$. Third level: $n(n-1)(n-2)$.
2. The nodes reaching $k$ level is $T(n-k)$. The leaf level is when $n-k = 1$. which means $k = n-1$. The leaf's level is the height of the tree in this case. So, the height is $n-1$.
3. There is $n!$ leaves with each leaf has value $c$, so the sum of the values in the leaf nodes is $n!c$

4. No, from 3, the value of the function at least will $n!c$, that is $f(n) > n!c$. Also, $n! \gg 2^n$. So, $f(n) \gg 2^n$., and the closed form for this function **is not** $O(2^n)$

