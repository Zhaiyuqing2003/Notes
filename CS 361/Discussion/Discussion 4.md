$$
{\def\p#1;{#1\%}}
$$

### Problems

#### 1

The probability is $50\%\cdot 60\% + 30\% \cdot 20\% + 20\% + 80\% = 52\%$

#### 2

So the risk of being infected when vaccinated is $2\% (1- 80\%) = 0.4\%$. Picking a person at random, the chance one get infected is $85\% \cdot 0.4 \% + 15\% \cdot 2\% = 0.64\%$

#### 3

|                        | Vaccinated          | Not vaccinated    | Percent by Infection                  |
| ---------------------- | ------------------- | ----------------- | ------------------------------------- |
| Infected               | $85\% \cdot 0.4\%$  | $15\% \cdot 2\%$  | $85\% \cdot 0.4\% + 15\% \cdot 2\%$   |
| Not Infected           | $85\% \cdot 99.6\%$ | $15\% \cdot 98\%$ | $85\% \cdot 99.6\% + 15\% \cdot 98\%$ |
| Percent by vaccination | $85\%$              | $15\%$            | $100\%$                               |

So, if we pick an infected person at random, the probability that they were vaccinated is
$$
\fac \p85; \cdot \p0.4;/{\p85;\cdot \p0.4; + \p15; \cdot \p 2;}; = 53.125\%
$$

#### 4

We know that the percent of people who have the protection (either by vaccination or previous infection) is
$$
P(V \cup P) = P(V) + P(P) - P(V \cap P) = P(V) + P(P) - P(V)P(P) = 85\% + 40\% - 85\% \cdot 40\% = 91\%
$$
So, the updated table is

|                       | Protection          | No Protection    | Percent by Infection                 |
| --------------------- | ------------------- | ---------------- | ------------------------------------ |
| Infected              | $91\% \cdot 0.4\%$  | $9\% \cdot 2\%$  | $91\% \cdot 0.4\% + 9\% \cdot 2\%$   |
| Not Infected          | $91\% \cdot 99.6\%$ | $9\% \cdot 98\%$ | $91\% \cdot 99.6\% + 9\% \cdot 98\%$ |
| Percent by Protection | $91\%$              | $9\%$            | $100\%$                              |

So, the chance of picking a infection person is
$$
P(I) = 91\% \cdot 0.4\% + 9\% \cdot 2\% = 0.544\% 
$$
and we see that
$$
P(V|I) = \fac P(I|V)P(V)/P(I); = \fac 0.4\% \cdot 85\%/0.544\%; = 62.5\%
$$


### Design

**Background:** Imagine you are working for a medical diagnostics company that has developed a new test for a rare disease, "Xylophonia." The disease affects 1% of the population. The test for Xylophonia is quite accurate but not perfect. When a person has Xylophonia, the test correctly identifies them as having the disease 98% of the time. However, when a person does not have Xylophonia, the test incorrectly identifies them as having the disease 3% of the time.

**Task:**

1. **Calculate the probability that a person has Xylophonia given that they have tested positive for the disease.** Use Bayes' Rule to perform your calculation. Show all your work.
2. **Interpret the result.** Based on the probability you calculated, discuss whether a positive test result should be considered conclusive evidence of having Xylophonia. Explain your reasoning.


$$

$$
