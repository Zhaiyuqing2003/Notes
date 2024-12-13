$$
\def\NP{\text{NP}}
\def\NPh{\text{NP}_h}
\def\Ph{\text{P}_h}
\def\coNP{\text{coNP}}
$$

Both proof is done with help from two academic papers: http://bulletin.eatcs.org/index.php/beatcs/article/view/316, and https://link.springer.com/content/pdf/10.1007/BFb0017134.pdf

We first want to show that $\NP \sube \NPh$, this should be trivial, as a nondeterministic Turing machine $M$ is also a robust nondeterministic oracle machine, as we could simply ignore any oracle $B$ given to us, and the runtime will still be polynomial (nondeterministically).

Then we want to show that $\NPh \sube \NP$. For a robust nondeterministic oracle machine $M$, let's suppose that it will halt in $n^c$ steps if there is the help from an oracle $B$. ($n$ is the input length). Then we see could define a nondeterministic Turing machine $N$ such that

```pseudocode
def N(x):
	Run M on input x at most n**c steps; 
	when M asks query "is y in B?"
		answer
			"y is in B" and
			"y is not in B"
	when one M accepts
		accept x
	when one M rejects
		reject x
```

`answer "y is in B" and "y is not in B"` means that we give either answer nondeterministically. `when one M accepts` means that when the $M$ accepts the input `x` in one path (since we are running nondeterministically). **First it should be obvious that $N$ still runs in polynomial time, as the $M$ inside it runs at most $n^c$ steps and every oracle query have a constant time.** Then $N$ still have the same behavior as $M$. $N$ essentially just guess the answer of the oracle. If we are lucky, and our guess is exactly the same as an oracle $B$ which could help the machine $M$, then the $M$ will be helped by our guesses, and could finish in $n^c$ time (our time upper bound). But it is more likely that our guess is not the same as any oracle $B$ that could help the machine $M$, in that case the $M$ might not be able to finish it in $n^c$ time. But since **for every query, we will explore all possibility nondeterministically**, **there will at least be one path where all our guessed queries are exactly the same as given by an oracle $B$**. Therefore, there will be one path where $M$ will finished within the time upper bound $n^c$, and therefore every input will be correctly accepted or rejected according to $M$. For all other path where our guess is not correct, since $M$ is robust, we could still follow its accepts and rejects and it will be correct. **Therefore, we guaranteed that all inputs will be accepted or rejected correctly in either case.**



Both proof is done with help from two academic papers: http://bulletin.eatcs.org/index.php/beatcs/article/view/316, and https://link.springer.com/content/pdf/10.1007/BFb0017134.pdf. They basically give a draft of the proof. The proof below is adapted from their draft.

We first want to show that $\Ph \sube \NP \cap \coNP$. This is proof is similar to $\NPh \sube \NP$, so I will just leave the constructed Turing machine here:

For $\NP$

```pseudocode
def N(x):
	Run M on input x at most n**c steps; 
	when M asks query "is y in B?"
		answer
			"y is in B" and
			"y is not in B"
	if M accepts
		accept x
	else
		reject x
```

For $\coNP$

```pseudocode
def Nbar(x):
	Run M on input x at most n**c steps; 
	when M asks query "is y in B?"
		answer
			"y is in B" and
			"y is not in B"
	if M accepts
		reject x
	else
		accept x
```

Then we want to show that $\NP \cap \coNP \sube \Ph$. Suppose $L \in \NP \cap \coNP$, then let $N$ be the Turing machine for $L$ and $\overline N$ be the Turing machine for $\overline L$. 

We design an oracle
$$
A = \left\{(x, y) 
\left| 
\begin{array}{}
\text{ if $x \in L$ then $y$ is a prefix of an accepting path of $N(x)$} \\
\text{ if $x \notin L$ then $y$ is a prefix of an accepting path of $\overline N(x)$}
\end{array} 
\right. 
\right\}
$$
suppose that for $N$ and $\overline N$, that there are at most $p$ nondeterministic choices at each step. Suppose for $N$ and $\overline N$, their longest accepting path is $n^c$, where $n = |x|$. Then we know that $y \in \set{0, 1, ..., p-1}^{[0, n^c]}$. (i.e. length from $0$ to $n^c$ (inclusive) of the character set of $\set{0, 1, ..., p-1}$) 

Since $L \in \NP \cap \coNP$, there is a exponential-time deterministic machine $M_L$ that $\bold{L}(M_L) = L$. 

The oracle machine $M$

```pseudocode
def M(x) with oracle B:
	// find the accepting path using oracle
	w = ""
	loop n**c times:
		for i in {"0", "1", ..., "p - 1"}
			is (x, w + i) in B? then
				w = w + i;
				break
			
    Run N on input x with path w
    if N accepts
    	accept x
    Run N-bar on input x with path w
    if N-bar accepts
        reject x
	
	// when oracle is not helpful
	Run M_L on input x;
```

When the oracle is $A$, then if $x \in L$, we could find the accepting path of $N(x)$, and therefore when we run $N$ on input $x$ with that path, $N$ will accept $x$ and $M$ will correctly accepts $x$. If $x \notin L$, then we could find the accepting path of $\overline N(x)$, and therefore when we run $\overline N$ on input $x$ with that path, $\overline N$ will accept $x$ and $M$ will correctly rejects $x$, and the machine $M$ will ends here in either case before running $M_L$. We see that the `loop` and `for` takes $O(n^c)$, and that running $N$ or $\overline N$ on specific path, in this case, should be obvious that only takes polynomial time. Therefore, in this case our machine correctly decides the language $L$ in polynomial time with the help from $A$.

If the oracle is not $A$. Then depends on the behavior of that oracle, we might not be able to get accepting path for $N$ if $x \in L$ or accepting path for $\overline N$ if $x \notin L$. Yet, since we accept only when $N$ accepts, and we reject only when $\overline N$ accepts, the machine $M$ behavior is still correct in this case. Then, we probably will run $M_L$ on input $x$ in this case. This will take exponential time, but its behavior will be correct as $\bold{L}(M_L) = L$.

In other case, we see that the behavior of the machine $M$ is correct, regardless of the oracle used, and that $M$ will be in polynomial time, if we choose the helpful oracle $A$. (and it might be exponential if we choose other oracles). Therefore, we see that machine $M$ is a robust deterministic oracle machine, and that when helped, it could achieve polynomial time. Therefore, $L \in \Ph$ and we are done.
