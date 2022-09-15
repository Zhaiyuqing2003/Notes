$$
\newcommand\F{\mathbb F}
\newcommand\u{\bold u}
\newcommand\v{\bold v}
\newcommand\nil{\bold 0}
\newcommand\bmatrix[1]{\begin{bmatrix}#1\end{bmatrix}}
$$

#### Exercise 3.1.4

>Prove that a nonempty set $G$ with an associative operation $\ast$ is a group if and only if the equations $g \ast x = h$ and $x \ast g = h$ have solutions in $G$ for all $g, h \in G$. *Hint: Prove that if $e \ast g = g$ for some $g$, then $e \ast h = h$ for all $h \in G$. Now appeal to Exercise 3.1.3*
>
>Note: you should *not* assume that the same $x$ solves both equations simultaneously. In other words, prove that $G$ is a group if and only if $\ast$ is an associative operation such that 
>
>​	for all $g, h \in G$, there exist $x, y \in G$ such that $g \ast x =h$ and $y \ast g = h$

First, suppose $G$ is a group, $x, y \in G$ then for all $g, h \in G$,  $g \ast x = h$ is $g^{-1} \ast g \ast x = g^{-1} \ast h \to x = g^{-1} \ast h \in G$.

Also, $y \ast g = h$ is $y \ast g \ast g^{-1} = h \ast g^{-1} \to y = h \ast g^{-1} \in G$

Conversely, Suppose $\ast$ is an associative operation such that for all $g, h \in G$, there exist $x, y \in G$ such that $g \ast x = h$ and $y \ast g = h$. Consider special case with specific $g_1 = h_1 \in G$. Then $y_g \ast g_1 = g_1$. Call this $y_g = e \in G$.  Then $e \ast g_1 = g_1$, for all $h \in G$ then, since there is always $x$ such that $g \ast x = h$, so there exist $x \in G$ that $g_1 \ast x = h$. Thus, $e \ast g_1 \ast x = g_1 \ast x \to e\ast h = h$. **That means $e \in G$, $e \ast h = h$ for all $h \in G$**

**Also, for all $g \in G$, there exist an $x$ such that $g \ast x = e$. Call that $x = g^{-1}$.**

Using the result from **Exercise 3.1.3** (which we prove in last homework), since in above we already prove the two properties need (they are **bolded**). We conclude that $(G, \ast)$ is indeed a group.

#### Exercise 3.2.1

>Suppose $n \geq 2$ is an integer and $d, d' > 0$ are two divisors of $n$. Prove that $\langle[d]\rangle <  \langle[d']\rangle$ if and only if  $d' | d$



1 2 3

4 5 6

7 8 9

​                                                                                                                                                                                                                                                                                         
