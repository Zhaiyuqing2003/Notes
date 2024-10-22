$$
\def\cil#1{\lceil#1\rceil}
$$



##### Problem 1

###### (a)

$$
3/8 + 3/13 + 6/20 + 4/30 = 1.0391 > 1
$$

Won't pass UB Test. Not Schedulable. 

###### (b)

$$
2/10 + 4/16 + 7/30 + 8/50 = 0.8433 > 0.756
$$

Fail to check using UB Test.

Task 1 (pass)
$$
r_0 = 2 < 10
$$
Task 2 (pass)
$$
r_0 = 4 + 2 = 6 \\
r_1 = 4 + \cil{6/10}2 = 6 < 16\\
$$
Task 3 (pass)
$$
r_0 = 2 + 4 + 7 = 13\\
r_1 = \cil{13/10}2 + \cil{13/16}4 + 7 = 15 \\
r_2 = \cil{15/10}2 + \cil{15/16}4 + 7 = 15 < 30
$$
Task 4 (pass)
$$
r_0 = 2 + 4 + 7 + 8 = 21\\
r_1 = \cil{21/10}2 + \cil{21/16}4 + \cil{21/30}7 + 8 = 29 \\
r_1 = \cil{29/10}2 + \cil{29/16}4 + \cil{29/30}7 + 8 = 29 < 30
$$
So it's schdulable under EST.



###### (c)

$$
2.5/12 + 4/16 + 5.5/37+9/52 = 0.7801 > 0.756
$$

Fail to check using UB

Task 3 (pass)
$$
r_0 = 2.5 + 4 + 5.5 = 12\\
r_1 = \cil{12/12}2.5 + \cil{13/16}4 + 5.5 = 12 < 37 \\
$$
Task 4 (pass)
$$
r_0 = 2.5 + 4 + 5.5 + 9 = 21\\
r_1 = \cil{21/12}2.5 + \cil{21/16}4 + \cil{21/37}5.5 + 9 = 27.5 \\
r_2 = \cil{27.5/12}2.5 + \cil{27.5/16}4 + \cil{27.5/37}5.5 + 9 = 30 \\
r_3 = \cil{30/12}2.5 + \cil{30/16}4 + \cil{30/37}5.5 + 9 = 30 < 52
$$
So it's schdulable under EST.





###### (d)

$$
2/6+10/24+9/36 = 1> 0.779
$$

Won't pass UB Test

Task 1 (pass)
$$
r_0 = 2 < 6
$$
Task 2 (pass)
$$
r_0 = 2 + 10 = 12\\
r_1 = \cil{12/6}2 + 10 = 14\\
r_2 = \cil{14/6}2 + 10 = 16 \\
r_3 = \cil{16/6}2 + 10 = 16 < 24
$$
Task 3 (won't pass)
$$
r_0 = 2 + 10 + 9 = 21\\
r_1 =  \cil{21/6}2 + \cil{21/24}10 + 9 = 27 \\
r_2 =  \cil{27/6}2 + \cil{27/24}10 + 9 = 39 > 36
$$
Not schdulable under EST.

###### (e)

We could try to increase the period of $\tau_3$ to 48 so that it's multiple of T_1 and T_2.

Task 3
$$
r_0 = 2 + 10 + 9 = 21\\
r_1 =  \cil{21/6}2 + \cil{21/24}10 + 9 = 27 \\
r_2 =  \cil{27/6}2 + \cil{27/24}10 + 9 = 39 \\
r_3 = \cil{39/6}2 + \cil{39/24}10 + 9 = 43 \\
r_4 = \cil{43/6}2 + \cil{43/24}10 + 9 = 45 \\
r_5 = \cil{45/6}2 + \cil{45/24}10 + 9 = 45 < 48 \\
$$
Test 3 now passes.





##### Problem 2

UB Test:
$$
(5+2)/50 < 1.0 \\
(5+2)/50 + (11+2)/60 < 0.828 \\
(5+2)/50 + (11+2)/60 + (18+2)/75 = 0.623 < 0.779 \\
(5+2)/50 + (11+2)/60 + (18+2)/75 + (16+2+10)/110 = 0.878 > 0.756
$$
Failed to check using UB Test

EST Test:

Task 1 (pass)
$$
r_0 = 5 < 50
$$






