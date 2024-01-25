#### Exercise 6.2

##### (A)

1. | Assume P = 1000   | Having Prostate Cancer (6) | Not having Prostate Cancer (994) |
   | ----------------- | -------------------------- | -------------------------------- |
   | PSA test positive | 6 x .58 = 3.48             | 994 x .235 = 233.59              |
   | PSA test negative | 6 x .42                    | 994 x .765                       |

   We see that P(cancer | positive) = (3.48) / (3.48 +  233.59) is approximately 1.468%

2. |            | D (3%)         | Not D (97%) |
   | ---------- | -------------- | ----------- |
   | T Positive | 3% x 99.5%     | No idea     |
   | T Negative | 1 - 3% x 99.5% | No idea     |

   We need the specificity of T.

3. |             | Pulmonary embolisms (3.4%) | Not Pulmonary embolisms (96.6%) |
   | ----------- | -------------------------- | ------------------------------- |
   | CT positive | 3.4% x 90%                 | 96.6% x 5%                      |
   | CT negative | 3.4% x 10%                 | 96.6% x 95%                     |

   It's P(disease | positive) = (3.4% x 90%) / (3.4% x 90% + 96.6% x 5%) = 38.78%

4. It's P(no disease | negative) = (96.6% x 95%) / (96.6% x 95% + 3.4% x 10%) = 99.63%

5. We need the base rate.

6. P(Spoke and Word) = P(Spoke and Word | Bike Shops) x P(Bike Shops | Town) x P(Town) = 90% x 50% x 80% = 36%

7. P(Tube) = (P(Tube | Spoke and Word) x P(Spoke and Word | Bike Shops) + P(Tube | Toms) x P(Toms | Bike Shops)) x P(Bike Shops) = (90% x 40% + 10% x 70%) x 50% = 21.5%

#### Exercise 6.3

##### (A)

1. P(not-p) = 1 - P(p) = 1 - .4 = .6 (Rule 7)
2. P(p & q) = P(q | p) x P(p) = .4 x .2 = .08 (Rule 5)
3. Not enough information.
4. P(p or q) = P(p) + P(q) - P(p & q) = .3 + .3 - .0 = .6 (Rule 4)
5. P(p or q) = P(p) + P(q) - P(p & q) = .6 + .6 - .3 = .9 (Rule 4)
6. Not enough information.
7. P(p & q) = P(p) x P(q) = .5 (Rule 6)
8. P(p & q) = P(p) x P(q) = 0 (Rule 6)
9. P(not-p and not-q) = 1 - P(p or q) = 1 - .7 = .3 (De Morgan + Rule 7)
10. P(p & q) = P(p | q) x P(q) = 0 x .6 = .0 (Rule 5)

##### (B)

1. 1/6

2. 1/6

3. 1/6

4. (1/6) ^ 3 = 1/216

5. (1/6) ^ 3 = 1/216

6. (5/6) ^ 3 = 125/216

7. |      | Comb                                           | Prob |
   | ---- | ---------------------------------------------- | ---- |
   | 2    | (1, 1)                                         | 1/36 |
   | 3    | (1, 2), (2, 1)                                 | 2/36 |
   | 4    | (1, 3), (2, 2), (3, 1)                         | 3/36 |
   | 5    | (1, 4), (2, 3), (3, 2), (4, 1)                 | 4/36 |
   | 6    | (1, 5), (2, 4), (3, 3), (4, 2), (5, 1)         | 5/36 |
   | 7    | (1, 6), (2, 5), (3, 4), (4, 3), (5, 2), (6, 1) | 6/36 |
   | 8    | (2, 6), (3, 5), (4, 4), (5, 3), (6, 2)         | 5/36 |
   | 9    | (3, 6), (4, 5), (5, 4), (6, 3)                 | 4/36 |
   | 10   | (4, 6), (5, 5), (6, 4)                         | 3/36 |
   | 11   | (5, 6), (6, 5)                                 | 2/36 |
   | 12   | (6, 6)                                         | 1/36 |

   There sum is just 1, you could get and only get value from 2-12 (inclusive).

8. Assume no jokers. Drawing Face on first try is 3/13. Drawing Face also for second try is 11/51 (only 11 face card left for remaining 51 cards). So P(two faces) = 3/13 x 11/51 = 11/221

9. Assume no jokers. Not drawing face first time is 10/13. Not Drawing Face also for second time is 39/51 (only 39 non face card left for remaining 51 cards). So P(no faces) = 10/13 x 39/51 = 130/221

10. P(at least once) = 1 - P(no rain), P(no rain) = (80%)^7 = 20.97152%, P(at least once) = 79.02748%

#### Exercise 6.5.1

1. Invalid. Suppose 100 people earn 100\$ five years ago. Now one people earn 10000000000\$ and others earn nothing. The mean increase but most people have lower income.
2. Invalid. It depends on how much income is considered "poverty", suppose there is a huge inflation and one meal costs \$100000000 now, then the argument is probably incorrect.
3. Invalid. "Average" doesn't necessarily means "mean".
4. Invalid. "Typical" doesn't necessarily means "mean".
5. Invalid. "Typical" doesn't necessarily means "mean".
6. Valid. Mode is what most of the students doing. So if you are lower than that, you are indeed not doing as well as most of the students.
7. Invalid. Few cases doesn't provide a meaningful statistics to compare. When we say life expectancy, we typically means the "mean life expectancy", giving the length of life for few people doesn't give us the "mean life expectancy"
8. Invalid. Typically, your score are more likely to be the mode. However, it also depends on what kinds of students you are. (Are you always getting score around median, or around the mode?). If you always getting score around median, then maybe probably X's class is better. If you always getting score around mode, then maybe probably Y's class is better. Or, if you are really good at calculus, then it actually doesn't matter, you will ace it no matter whose class.
9. Invalid. It might be the case that X's class has almost everybody performs around B (mode) and few students performs around F, and Y's class has few students perform at A+ and others all D (mode). Your performance is probably more likely to be reflected by the mode than mean in this case, in this case you might actually want to take X's class.
10. Invalid. It's a hasty generalization. It might not always be the case, I spent almost 0 seconds in becoming excellence at breath normally.
11. Invalid. It depends on how we view smart. It might be doing calculus better, or it might something else.
12. Invalid. It depends on how we consider one person as better artist. This might be having a better final project for sculpture class, but it might also be other aspects (did better in painting / music, etc.)

#### Exercise 6.5.2

1. We need more information about whether the car will be more likely to be damaged by fire or collision based on your usage. Typically, it's reasonable to consider the car will be more likely to be damaged by collision. In this case our expected utility from the insurance (b) will be higher (since their costs and p and payback money is the same).

2. Expected utility for (a) : (chance of damage by fire) x \$10000 - \$100. Expected utility for (b) : \$0. So if your cars chance of damage by fire is more than 1%, you should by the insurance.

3. Expected utility for (a): \$240. Expected utility for (b): \$1000 x 25% = \$250. Choose (b)

4. Expected utility for (a): -\$700. Expected utility for (b): -\$1000 x 75% = -\$750. Choose (a)

5. Suppose each ticket costs \$a, and the probability of winning (suppose you could only win once, that is, suppose there N possible combination, and only 1 of them will make you win, if you have multiple ticket with same winning combination, you will only get prize once. In this case surely you will buy multiple ticket with different combination) P(win). Then the expected utility for (a): P(win) x \$100,000,000 - \$a. Expected utility for (b): Income/\$a x (P(win) x \$100,000,000 - \$a). Expected utility for (c) \$0. So, based on our assumption on how this lottery works, Expected utility for (b) is actually Income/\$a x Expected utility for (a). So, from just *financial* point of view. Go all in (b) if Expected utility is bigger than 0 for (a), or don't play it (c) if the expected utility for (a) is smaller than 0. (Of course, your living cost, your happiness, and other things are not considered here).

6. Buy a ticket. If you could afford it. Because it seems like that in this case you think Expected utility for (a): Good feeling + P(win) x \$100,000,000 - \$a is bigger than (b) nothing.

   