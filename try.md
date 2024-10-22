To do reduction $A \le_m B$, we could use a mapping $\sigma(a) = 0a$. We see that if $a \in A$, then $0a \in \{ 0w \bigm| w \in A \}$ and therefore $0a \in B$. if $a \notin A$, then $0a \notin \{ 1w \bigm | w \in \overline A \}$ and also $0a \notin \{ 0w \bigm| w \in A \}$, therefore $0a \notin B$. Therefore, the reduction is complete and that it is indeed $A \le_m B$.

To do reduction $A \le_m B$, we could use a mapping $\sigma(a) = 1a$. We see that if $a \in \overline A$, then $1a \in \{ 1w \bigm| w \in \overline A \}$ and therefore $0a \in B$. if $a \notin \overline A$, then $1a \notin \{ 0w \bigm | w \in A \}$ and also $1a \notin \{ 1w \bigm| w \in \overline A \}$, therefore $1a \notin B$. Therefore, the reduction is complete and that it is indeed $\overline A \le_m B$.









First, we know that $\overline \K= \{  \encode M  \bigm | \encode M \notin \L(M) \}$ and $\text{Inf} = \overline{\Fin} = \{ \encode M \bigm| \L(M) \text{ is an infinite set} \}$. To use reduction, we want construct a mapping, such that

* $\encode M \in \overline{\K} \Longrightarrow \encode M \notin \L(M) \Longrightarrow \L(N) = \Sigma^* \Longrightarrow \encode N \in \overline\Fin$ 
* $\encode M \notin \overline{\K} \Longrightarrow \encode M \in \L(M) \Longrightarrow \L(N) \text{ is a finite language} \Longrightarrow \encode N \notin \overline\Fin$

The $\sigma$ is actually similar to the one in `6.8 Reduction III` in Warm Up.

```pseudocode
Input x
	Run M on <M> for |x| steps
	If M does not accept
		Accept x
	Else
		Reject x
```

where `x` is the input string for $N$. It is obvious that such $\sigma$ is computable, as it only generates a piece of code of finite size.

We see that if $\encode M \notin \overline \K$, then $M$ must accept $\encode M$ in exactly $K$ steps. In this case, all the $x$ whose length is less than $K$ will make $M$ reach an intermediate state when run $|x|$ steps, and these $x$ will be accepted. Otherwise, if $x$ has length longer than or equal to $K$, $M$ will go to accept state in $|x|$ steps, and these $x$ will not be accepted. Therefore, $\L(N)$ in this case is $\{ \Sigma^n \bigm | n < K \}$, which is a finite language and therefore this $\encode N \notin \overline \Fin$.

On the other hand, if $\encode M \in \K$, then $M$ either loops on $\encode M$ or $M$ rejects $\encode M$. In this case, all $x$ will be accepted, and the $\L(N) = \Sigma^*$, which is a infinite language and therefore $\encode N \in \overline \Fin$.

Therefore, the reduction is complete, and $\overline \K \le_m \overline \Fin$ (i.e. $\overline \K \le_m \text{Inf}$). Since we know that $\overline \K$ is not recursively enumerable, so does $\overline\Fin$ (i.e. $\text{Inf}$)



