$$
{\def\fac#1/#2;{\frac{#1}{#2}}}
{\def\dfac#1/#2;{\dfrac{#1}{#2}}}
{\def\hx{{\hat{x}}}}
{\def\(#1);{\left( {#1} \right)}}
{\def\sets#1{  \left\{  \matrix{#1}  \right\}   }}
{\def\mean#1{\text{mean} \( \sets{#1} ); }}
{\def\std#1{\text{std}   \( {\sets{#1}} ); }}
{\def\var#1{\text{var}   \( {\sets{#1}} ); }}
{\def\stdsq#1{\text{std}^{2} \( {\sets{#1}} ); }}
{\def\align[[#1]]{   {\begin{align*}#1\end{align*}}   }  }
{\def\alignbr[[[#1]]]{\left\{ \ \begin{align*}#1\end{align*} \right. }}
{\def\inv#1{\frac{1}{#1}}}
{\def\iv#1;{\frac{1}{#1}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\|#1|;{\left| #1 \right|}}
{\def\median#1{\text{median}  \( \sets {#1} ); }}
{\def\half{\frac{1}{2}}}
{\def\quarter{\frac{1}{4}}}
{\def\sqt#1]{\sqrt{#1}}}
{\def\tsub#1;{_{\text{#1}}}}
{\def\tsup#1;{^{\text{#1}}}}
{\def\comb#1in#2;{
\left(\matrix{#2\\#1}\right)
}}
{\def\rfac#1//#2;;{\frac{#1}{#2}}}
{\def\rdfac#1//#2;;{\dfrac{#1}{#2}}}
{\def\rrfac#1///#2;;;{\frac{#1}{#2}}}
{\def\rrdfac#1///#2;;;{\dfrac{#1}{#2}}}
$$

#### Problem 1

> Suppose that among the 232 students registered in CS 361, there are 180 students that have taken both a calculus and a linear algebra class in the past, and there are 4 students that have taken neither.

Use $\#_{both}$ to denote the number of students who have taken both course before, $\#\tsub cal;$ for students who have only taken calculus before, $\#\tsub alg;$ for students who have only taken linear algebra before, and $\#\tsub none;$ for students who have taken neither of them.

##### (a)

> How many students have taken at least one of those two math classes in the past?

$$
\align[[
\#\tsub cal; + \#\tsub alg;+ \#\tsub none; + \#\tsub both; &= 232 \\
\#\tsub cal; + \#\tsub alg; &= 232 - 184 \\
\#\tsub cal; + \#\tsub alg; &= 48
]]
$$

and
$$
\#\tsub cal; + \#\tsub alg; + \# \tsub both; = 228
$$
There are 228 students who have taken at least one of those two math classes in the past.

##### (b)

>Now suppose furthermore that the number of students that have **not** taken linear algebra is 3 times the number of students that have **not** taken calculus. How many students have taken a linear algebra class in the past?

$$
\align[[
\#\tsub cal; + \#\tsub none; &= 3(\#\tsub alg; + \#\tsub none;) \\
\#\tsub cal; &= 3\#\tsub alg; + 2\#\tsub none; \\
\#\tsub cal; &= 3\#\tsub alg; + 8 \\
]]
$$

Together with equation from $(a)$
$$
\alignbr[[[
\#\tsub alg; = 10 \\
\#\tsub cal; = 38
]]]
$$

and
$$
\#\tsub alg; + \#\tsub both; = 10 + 180 = 190
$$
so, there are 190 who have taken a linear algebra class before.



#### Problem 2

>You shuffle a standard deck of cards, then draw four cards.

The number of ways to draw 4 cards out of a deck is $\comb 4 in 52; = \dfac 52!/(52-4)!4!;$.

##### (a)

>What is the probability all four are the same suit?

We could pick one out of 4 decks, and then pick 4 cards out of 13 cards. (choosing the deck, and picking the cards within the deck are independent, so use multiplication rule). So, the number of ways of drawing the four cards in same unit is
$$
4 \cdot \comb 4 in 13;
$$
and the probability is that
$$
P = \rfac 4 \cdot \comb 4 in 13; // \comb 4 in 52; ;; = \rfac 4 \cdot  \fac 13!/(13 - 4)!4!; // \fac 52! /(52-4)!4!; ;; = 4 \cdot \fac 13!/52!; \fac 48!/9!;
$$

##### (b)

>What is the probability all four are red?

That is draw 4 cards from 26 red cards.
$$
P = \rfac \comb 4 in 26; // \comb 4 in 52; ;; = \rfac \fac 26!/(26 - 4)!4!; // \fac 52! /(52-4)!4!; ;; =\fac 26!/52!; \fac 48!/22!;
$$

##### (c)

>What is the probability each has a different suit?

That is just pick each one card from one deck (these picks are independent, so we could use multiplication rule)
$$
P = \rfac 13^4 // \comb 4 in 52; ;; = \rfac 13^4 // \fac 52! /(52-4)!4!; ;; = 4! \cdot 13^4 \cdot \fac 48!/52!;
$$



#### Problem 3

> Magic the Gathering is a popular card game. Cards can be land cards, or other cards. We consider a game with two players. Each player has a deck of 40 cards. Each player shuffles their deck, then deals seven cards, called their hand.

The event player one picking his card are independent from player two picking his card.

Number of ways to draw 7 cards from 40 cards is $\comb 7 in 40;$



##### (a)

> Assume that player one has 10 land cards in their deck and player two has 20. With what probability will each player have four lands in their hand?

That is, player one could pick 4 cards from 10 land cards, and 3 cards from remaining 30 cards. (Picking the land cards from all the land cards and picking the non-land card from all the land cards are independent, so we could use multiplication rule). Player two could pick 4 cards from 20 land cards, and 3 cards from remaining 20 cards. So using multiplication rule
$$
P = \rfac \comb 4 in 10; \comb 3 in 30; // \comb 7 in 40; ;; \rfac \comb 4 in 20; \comb 3 in 20; // \comb 7 in 40; ;;
$$

##### (b)

> Assume that player one has 10 land cards in their deck and player two has 20. With what probability will player one have two lands and player two have three lands in hand?

This follows similar step:
$$
P = \rfac \comb 2 in 10; \comb 5 in 30; // \comb 7 in 40; ;; \rfac \comb 3 in 20; \comb 4 in 20; // \comb 7 in 40; ;;
$$


##### (c)

> Assume that player one has 10 land cards in their deck and player two has 20. With what probability will player two have more lands in hand than player one?

We write the $P(m, n)$ to denote the case where player one has draw $m$ land cards and player two has draw $n$ land cards. (These $P(m, n)$ are trivially independent).
$$
P(m, n) = \rfac \comb m in 10; \comb 7-m in 30; // \comb 7 in 40; ;; \rfac \comb n in 20; \comb 7-n in 20; // \comb 7 in 40; ;;
$$
We see that we want the case $P(m, n)$ where $m < n$ and $0 \le m \le 7$ and $0 \le n \le 7$. So, the total probability is (using addition rule)
$$
P = \sum_{m = 0}^{7} \sum_{n = m + 1}^{7} P(m, n) = \sum_{m = 0}^{7} \sum_{n = m + 1}^{7} \rfac \comb m in 10; \comb 7-m in 30; // \comb 7 in 40; ;; \rfac \comb n in 20; \comb 7-n in 20; // \comb 7 in 40; ;;
$$



#### Problem 4

>Suppose Sarah a student likes a local restaurant, she always orders from there one dish on both Fri and Sat. On Fri, the restaurant offers 7 different dishes on the menu among which the first five are \$10 each and the next two are \$15 each.  On Sat, the restaurant also offers 7 dishes where the first  $10 item from Friday item is replaced with a \$20 item,  and the remaining six dishes are the same as those on Fri. Suppose Sarah orders independently each time regardless of the day and she doesn't order on other days.



##### (a)

> Write down the sample space of unique pair of orders if Sarah orders one dish both on Fri and Sat.

Lets label the $N\tsup th;$ dish order at Fri and Sat $F_N$ and $S_{N}$ respectively. Then the sample space is
$$
\Omega = \sets{
(F_1, S_1),(F_1, S_2),(F_1, S_3),(F_1, S_4),(F_1, S_5),(F_1, S_6),(F_1, S_7), \\
(F_2, S_1),(F_2, S_2),(F_2, S_3),(F_2, S_4),(F_2, S_5),(F_2, S_6),(F_2, S_7), \\
(F_3, S_1),(F_3, S_2),(F_3, S_3),(F_3, S_4),(F_3, S_5),(F_3, S_6),(F_3, S_7), \\
(F_4, S_1),(F_4, S_2),(F_4, S_3),(F_4, S_4),(F_4, S_5),(F_4, S_6),(F_4, S_7), \\
(F_5, S_1),(F_5, S_2),(F_5, S_3),(F_5, S_4),(F_5, S_5),(F_5, S_6),(F_5, S_7), \\
(F_6, S_1),(F_6, S_2),(F_6, S_3),(F_6, S_4),(F_6, S_5),(F_6, S_6),(F_6, S_7), \\
(F_7, S_1),(F_7, S_2),(F_7, S_3),(F_7, S_4),(F_7, S_5),(F_7, S_6),(F_7, S_7)
}
$$
There are $7 \cross 7 = 49$ outcomes, since for both days there are 1 out of 7 dishes to order, and the orders are independent.



##### (b)

>Now let $E_1$ be the event that Sarah orders a \$10 dish in the week, $E_2$ be the event that Sarah orders a \$15 dish in the week, and $E_3$​​ be the event that Sarah orders a \$20 dish in the week.

$$
{\def\Pfoz{P(F_{10})}}
{\def\Pfof{P(F_{15})}}
{\def\Psoz{P(S_{10})}}
{\def\Psof{P(S_{15})}}
{\def\Pstz{P(S_{20})}}
{\def\foz{F_{10}}}
{\def\fof{F_{15}}}
{\def\soz{S_{10}}}
{\def\sof{S_{15}}}
{\def\stz{S_{20}}}
$$

Define few events

* $\Pfoz$  Sarah orders \$10 dish on Friday
* $\Pfof$  Sarah orders \$15 dish on Friday
* $\Psoz$  Sarah orders \$10 dish on Saturday
* $\Psof$  Sarah orders \$15 dish on Saturday
* $\Pstz$  Sarah orders \$20 dish on Saturday

We see that $P(F*)$ is independent from $P(S*)$, $P(\foz)$ and $P(\fof)$ are disjoint, $\Psoz$, $\Psof$, $\Pstz$ are disjoint.

###### (i)

> Are $E_1$ and $E_2$ independent? Justify your answer with calculations.

We see that
$$
\align[[
P(E_1) &= P(\foz \cup \soz) \\
&= \Pfoz + \Psoz - P(\foz \cap \soz) \\
&= \Pfoz + \Psoz - P(\foz)P(\soz) \\
&= \fac 5/7; + \fac 4/7; -\fac 5/7;\cdot \fac 4/7; \\
&= \fac 43/49;
]]
$$
and
$$
\align[[
P(E_2) &= P(\fof \cup \sof) \\
&= P(\fof) + P(\sof) - P(\fof \cap \sof) \\
&= P(\fof) + P(\sof) - P(\fof)P(\sof) \\
&= \fac 2/7; + \fac 2/7; -\fac 2/7;\cdot \fac2/7; \\
&= \fac 24/49;
]]
$$

and
$$
\align [[
P(E_1 \cap E_2) &= P((\foz \cup \soz) \cap (\fof \cup \sof)) \\
&= P((\foz \cap \fof) \cup (\foz \cap \sof) \cup (\fof \cap \soz) \cup (\fof \cap \sof)) \\
&= P((\foz \cap \sof) \cup (\fof \cap \soz))\\
&= P(\foz \cap \sof) + P(\fof \cap \soz) \\
&= P(\foz)P(\sof) + P(\fof)P(\soz) \\
&= \fac 5/7;\cdot \fac 2/7; + \fac 2/7; \cdot \fac 4/7; \\
&= \fac 18/49;
]]
$$
We see that $P(E_1)P(E_2) \neq P(E_1 \cap E_2)$, so $E_1$ and $E_2$ are not independent. 

###### (ii)

>Are $E_1$ and $E_3$ independent? Justify your answer with calculations.

$$
\align[[
P(E_3) &= P(\stz) = \fac 1/7;
]]
$$

$$
\align [[
P(E_1 \cap E_3) &= P((\foz \cup \soz) \cap \stz) \\
&= P((\foz \cap \stz) \cup (\soz \cap \stz)) \\
&= P(\foz \cap \stz) \\
&= P(\foz)P(\stz)\\
&= \fac 5/7;\cdot \fac 1/7;\\
&= \fac 5/49;
]]
$$

We see that $P(E_1)P(E_3) \neq P(E_1 \cap E_3)$, so $E_1$ and $E_3$ are not independent. 



#### Problem 5

> A student takes a multiple choice test. Each question has N answers. If the student knows the answer to a question, the student gives the right answer, and otherwise guesses uniformly and at random. The student knows the answer to 70% of the questions. Write $\mathcal K$ for the event a student knows the answer to a question and R for the event the student answers the question correctly.

##### (a)

>What is $P(\mathcal K)$?

$P(\mathcal K) = 0.7$ since student knows answer to the 70% of the question

##### (b)

>What is $P(\mathcal R|\mathcal K)$?

$P(\mathcal R|\mathcal K) = 1$, since students will answer correctly if it knows the answer

##### (c)

>What is $P(\mathcal R|\mathcal K)$, as a function of $N$?

We first want to know $P(\mathcal R)$, it's
$$
P(\mathcal R) = P(\mathcal R|\mathcal K) P(\mathcal K) + P(\mathcal R|\mathcal K^\mathcal C)P(\mathcal K^\mathcal C) \\
= 1\cdot 0.7 + \fac 1/N; \cdot 0.3 = 0.7 + 0.3\inv N
$$
Use Bayes' Rule, we have
$$
P(\mathcal K | \mathcal R) = \fac P(\mathcal R|\mathcal K) P(\mathcal K)/P(\mathcal R); = \fac 1\cdot 0.7/0.7 + 0.3\inv N; = \fac 7N/7N+3;
$$

##### (d)

>What values of N will ensure that $P(\mathcal K|\mathcal R) > 99\%$

So
$$
\fac 7N/7N+3; \gt 0.99 \\
7N\cdot 0.01 > 0.99\cdot 3 \\
N > \fac 0.99 \cdot 3/0.01 \cdot 7; \approx 42.43
$$
So $N \ge 43$ will ensure that $P(\mathcal K | \mathcal R) \gt 99\%$. (N must be an integer)



#### Problem 6

>Let A, B, and C be events in a sample space while A and B are disjoint event. We know that $P(A) = 2P(B), P(C|A) = 2/7, P(C|B) = 4/7$. What is $P(C|(A\cup B))$?

$$
P(C|(A\cup B)) = \fac P(C\cap(A\cup B))/P(A\cup B); = \fac P((C\cap A) \cup (C\cap B))/P(A) + P(B) -P(A\cap B);
$$

We know that A and B are disjoint event. Since $C \cap A \sube A$ and that $C \cap B \sube B$, that means $C\cap A$ and $C \cap B$ are disjoint. Since $A$ and $B$ is disjoint, that means $P(A\cap B) = 0$. Similarly, $P((C\cap A) \cup (C\cap B)) = P(C\cap A) + P(C\cap B) - P((C \cap A) \cap (C\cap B)) = P(C\cap A) + P(C\cap B)$
$$
\align[[
\fac P(C\cap A) + P(C\cap B)/P(A) + P(B); &= \fac 2P(C\cap A)/3P(A); + \fac P(C\cap B)/3P(B); \\
&= \fac 2/3;P(C|A) + \inv 3 P(C|B) \\ 
&= \fac 2/3;\cdot \fac 2/7; + \fac 1/3; \cdot \fac 4/7; \\
&= \note\fac 8/21;!
]]
$$



