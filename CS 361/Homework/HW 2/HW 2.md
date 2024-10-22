$$
{\def\fac#1/#2;{\frac{#1}{#2}}}
{\def\dfac#1/#2;{\dfrac{#1}{#2}}}
{\def\hx{{\hat{x}}}}
{\def\(#1);{\left( {#1} \right)}}
{\def\sets#1{  \left\{  #1  \right\}   }}
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
$$

#### Problem 1

>Suppose you have a dataset $\set x = \set {x_1, x_2, x_3, x_4}$ consisting of 4 items. You know that $x_1 = 5$ and $x_2 = 10$ and that after standardization $\hat x_1 = 0$ and $\hat x_2 = 0.5$

##### (a)

>Find $\mean x$ and $\std x$

We know that $\hx_i = \fac x_i - \mean x/\std x;$, therefore, we could get two equation
$$
\begin{cases}
\hx_1 = \dfac x_1 - \mean x/\std x; \\
\hx_2 = \dfac x_2 - \mean x/\std x;
\end{cases} \quad \Rightarrow \quad 
\begin{cases}
0   &= \dfac 5 - \mean x/\std x; \\
0.5 &= \dfac 10 - \mean x/\std x;
\end{cases} \quad \Rightarrow \quad
\left\{ \
\begin{align}
\mean x &= 5  \\
\std  x &= 10 
\end{align}
\right.
$$

##### (b)

>Find $x_3$ and $x_4$ given that $x_3 \le x_4$

We now know that
$$
\alignbr[[[
\hx_1 + \hx_2 + \hx_3 + \hx_4 &= 4\cdot \mean \hx \\
\hx_1^2 + \hx_2^2 + \hx_3^2 + \hx_4^2 &= 4\cdot \stdsq \hx
]]]
$$
therefore
$$
\alignbr[[[
0.5 + \hx_3 + \hx_4 &= 0 \\
0.25 + \hx_3^2 + \hx_4^2 &= 4
]]]
$$
we get solution (another solution is discarded because $x_3 \le x_4$)
$$
\alignbr[[[
\hx_3 = \quarter (-1-\sqt29]) \\
\hx_4 = \quarter (-1+\sqt29])
]]]
$$
therefore
$$
\alignbr[[[
	x_3 = \fac 5/2; (1 -\sqt 29]) \\
	x_4 = \fac 5/2; (1 +\sqt 29])
]]]
$$

#### Problem 2

> In a population, the correlation coefficient between weight and adiposity is 0.9. The mean weight is 150lb. The standard
> deviation in weight is 30lb. Adiposity is measured on a scale such that the mean is 0.8, and the standard deviation is 0.1.

Let $(\text{weight}, \text{adiposity})$ dataset be $\sets {(x, y)}$ respectively.

##### (a)

> Using this information, predict the expected adiposity of a subject whose weight is 170lb.

We see that for the $x_i = 170$, we have its standardized data
$$
\hat x_i = \fac x_i - \mean x/\std x; = \fac 170-150/30; = \fac 2/3;
$$
From $\text{Procedure 2.1}$, we know that
$$
\align[[
y_i^p &= \std y r\hat x_i + \mean y \\
&= 0.1 \cdot 0.9 \cdot \fac 2/3; + 0.8 \\
&= 0.86
]]
$$
The expected adiposity of this subject is $0.16$​.



##### (b)

> Using this information, predict the expected weight of a subject whose adiposity is 0.75

Following the same procedure, we see that
$$
\hat y_i = \fac y_i - \mean y/ \std y; = \fac 0.75 - 0.8/0.1; = -0.5
$$
From $\text{Procedure 2.1}$, we know that
$$
\align[[
x_i^p &= \std x r\hat y_i + \mean x \\
&= 30 \cdot 0.9 \cdot (-0.5) + 150 \\
&= 136.5
]]
$$
The expected weight of the subject is $136.5 \ \text{lb}$



##### (c)

> How reliable do you expect this prediction to be? Why? (your answer should be a property of correlation, not an opinion
> about adiposity or weight)

We see that $r = 0.9$ and that
$$
\std u = \sqt \var u] = \sqt \mean {u^2}] = \sqt 1 - r^2] \approx 0.436
$$
which is relatively small. Since the $r = 0.9$ is close to 1, "then predictions could have very small root mean square error, and so might be very accurate." (p. 44)



#### Problem 3

> In a population, the correlation coefficient between family income and child IQ is 0.30. The mean family income was
> \$60,000. The standard deviation in income is \$20,000. IQ is measured on a scale such that the mean is 100, and the standard
> deviation is 15.

Let $(\text{income}, \text{IQ})$ dataset be $\sets {(x, y)}$ respectively.



##### (a)

>Using this information, predict the expected IQ of a child whose family income is $70,000

Then we see that for the $x_i = 70000$​, we have its standardized data
$$
\hat x_i = \fac x_i - \mean x/\std x; = \fac 70000-60000/20000; = 0.5
$$
From $\text{Procedure 2.1}$, we know that
$$
\align[[
y_i^p &= \std y r\hat x_i + \mean y \\
&= 15 \cdot 0.3 \cdot 0.5 + 100 \\
&= 102.25
]]
$$
The expected IQ of the child is 102.25.



##### (b)

>How reliable do you expect this prediction to be? Why? (your answer should be a property of correlation, not an opinion
>about IQ)

We see that $r = 0.3$ and that
$$
\std u = \sqt \var u] = \sqt \mean {u^2}] = \sqt 1 - r^2] \approx 0.9539
$$
which is big. Since the $r = 0.3$ is close to 0, "If they have correlation close to zero, then the root mean square error in a prediction might be as large as the root mean square error in $\hat y$ —which means the prediction is nearly a pure guess" (p. 44). That means the predication is unreliable.



##### (c)

> The family income now rises—does the correlation predict that the child will have a higher IQ? Why?

No. Correlation doesn't mean causation. We cannot use correlation to predict the child's IQ due to a change in family income.



#### Problem 4

> At http://lib.stat.cmu.edu/DASL/Datafiles/cigcancerdat.html, you will find a dataset recording per capita cigarette sales
> and cancer deaths per 100 K population for a variety of cancers, recorded for 43 states and the District of Columbia in
> 1960.



##### (a)

> Plot a scatter plot of lung cancer deaths against cigarette sales, using the two letter abbreviation for each state as a
> marker. You should see two fairly obvious outliers. The backstory at http://lib.stat.cmu.edu/DASL/Stories/cigcancer.html suggests that the unusual sales in Nevada are generated by tourism (tourists go home, and die there) and the unusual
> sales in DC are generated by commuting workers (who also die at home).

Scatter plot (standardized)

<img src="./HW 2.assets/image-20240201200433658.png" alt="image-20240201200433658" style="zoom:55.8%;" />

Scatterplot (unstandardized)

<img src="./HW 2.assets/image-20240201200235277.png" alt="image-20240201200235277" style="zoom:67%;" />

##### (b)

> What is the correlation coefficient between per capita cigarette sales and lung cancer deaths per 100 K population?
> Compute this with, and without the outliers. What effect did the outliers have? Why?

With outliers, we have $r\tsub with; \approx 0.6974$. Without outlier, we have $r\tsub without; \approx 0.7145$​​. The outlier reduce the correlation coefficient. This is because that outliers doesn't follow the general trends/correlation between the cigarette sales and lung cancer deaths. (If we imagine a trend line that passes the origin in the standardized plot in (a), we could see that the outlier significantly deviates from the trend line), so it will reduce the correlation coefficient (in a sense reduce the strength of the correlation between these two variables). 

For reference, the green trend line is without the outlier, the red trend line is with the outlier. The difference the outlier makes in this case is not big.

<img src="./HW 2.assets/image-20240201212237626.png" alt="image-20240201212237626" style="zoom:50%;" />

##### (c)

> What is the correlation coefficient between per capita cigarette sales and bladder cancer deaths per 100 K population?
> Compute this with, and without the outliers. What effect did the outliers have? Why?

With outliers, we have $r\tsub with; \approx 0.7036$. Without outlier, we have $r\tsub without; \approx 0.6076$. The outliers increase the correlation coefficient. This is because the outlier follows the general trend/correlation between the two variables. (If we remove the outlier, the data looks more like a "random cloud of dots" rather than a clear linear relationship when we have the outliers). The outlier follows the general trend/correlation, so it increases the correlation coefficient (in a sense increase the strength of the correlation between these two variables). 

For reference, the green trend line is without the outlier, the red trend line is with the outlier.

<img src="./HW 2.assets/image-20240201213023551.png" alt="image-20240201213023551" style="zoom:50%;" />

##### (d)

> What is the correlation coefficient between per capita cigarette sales and kidney cancer deaths per 100 K population?
> Compute this with, and without the outliers. What effect did the outliers have? Why?

With outliers, we have $r\tsub with; \approx 0.4874$. Without outlier, we have $r\tsub without; \approx 0.5791$. The outlier reduce the correlation coefficient. This is because that outliers doesn't follow the general trends/correlation between two variables. (If we see the red trend line (outlier included), we could see that the outlier significantly deviates from the trend line), so it will reduce the correlation coefficient (in a sense reduce the strength of the correlation between these two variables). 



For reference, the green trend line is without the outlier, the red trend line is with the outlier.

<img src="./HW 2.assets/image-20240201213425849.png" alt="image-20240201213425849" style="zoom:50%;" />

##### (e)

> What is the correlation coefficient between per capita cigarette sales and leukemia deaths per 100 K population? Compute
> this with, and without the outliers. What effect did the outliers have? Why?

With outliers, we have $r\tsub with; \approx -0.0685$. Without outlier, we have $r\tsub without; \approx -0.1010$. The outlier increase the correlation coefficient, but it decreases the magnitude (absolute value) of the correlation coefficient. This is because that outliers doesn't follow the general trends/correlation between two variables. (If we see the red trend line (outlier included), we could see that the outlier significantly deviates from the trend line, the trend line is slightly going down, but the outliers keep a horizontal (i.e. no correlation) trend), so it will reduce the magnitude of the correlation coefficient (in a sense reduce the strength of the correlation between these two variables). This influence is very small though, in this case.



For reference, the green trend line is without the outlier, the red trend line is with the outlier. The difference the outlier makes in this case is not big.

<img src="./HW 2.assets/image-20240201213724420.png" alt="image-20240201213724420" style="zoom:50%;" />

##### (f)

> You should have computed a positive correlation between cigarette sales and lung cancer deaths. Does this mean that
> smoking causes lung cancer? Why?

No. Correlation doesn't mean causation. This might be a pure accident / coincidence (but since $r$ is not small it might be other reasons). It might also due to that there is some *latent variable* that affects both variables and makes them have the correlation. Or, it might be that there is a causal relationship. All three cases are possible, so there is no evidence to definitively say that smoking causes lung cancer.



##### (g)

> You should have computed a negative correlation between cigarette sales and leukemia deaths. Does this mean that
> smoking cures leukemia? Why?

No. Correlation doesn't mean causation. This might be a pure accident / coincidence (since $r$ is small, it might actually be the case).  It might also due to that there is some *latent variable* that affects both variables and makes them have the correlation. Or, it might be that there is a causal relationship (but since $r$ is small, this is unlikely to be the case). All three cases are possible, so there is no evidence to definitively say that smoking cures leukemia.



#### Problem 5

The correlation coefficient $r \approx 0.3521$, and the plot is below:

<img src="./HW 2.assets/image-20240201223615495.png" alt="image-20240201223615495" style="zoom:67%;" />

for reference, a standardized plot is also down below:

<img src="./HW 2.assets/image-20240201224124118.png" alt="image-20240201224124118" style="zoom: 67%;" />



#### Question 6

>Let $\sets {\hat x_i}$ be the standardized data set that is derived from $\sets {x_i}$ and it has $N$ items, prove the vector $\left\langle \fac \hat x_1/\sqt N];, \dots , \fac \hat x_2/\sqt N];\right\rangle$ has unit length.

Call this vector $\bold {\hat x}$, since $\mean \hx = 0$
$$
|\bold \hx|^2 = \bold \hx \cdot \bold \hx = \sum_{i}^{N} \fac \hat x_i^2/N; = \sum_{i}^{N} \fac (\hat x_i - 0)^2/N;= \sum_{i}^{N} \fac (\hat x_i - \mean \hx)^2/N; = \stdsq \hx = (1)^2 = 1
$$
Therefore, we see that $|\bold \hx| = 1$, so it indeed has unit length.





#### Appendix

##### Question 4 Code

```python

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# read the data
data = pd.read_csv('cig_cancer_data.txt', sep=' ')


# %%
def plot_data(original_data, x, y, m):
    standardized_data = original_data.copy()
    standardized_data[x] = (original_data[x] - original_data[x].mean()) / original_data[x].std()
    standardized_data[y] = (original_data[y] - original_data[y].mean()) / original_data[y].std()

    plt.scatter(standardized_data[x], standardized_data[y])
    for i, txt in enumerate(standardized_data[m]):
        plt.annotate(txt, (standardized_data[x][i], standardized_data[y][i]))

    plt.xlabel(x)
    plt.ylabel(y)
    plt.title(f'{x} vs {y}')

    # trend line, y = rx
    r = np.corrcoef(standardized_data[x], standardized_data[y])[0, 1]
    x_range = np.array([min(standardized_data[x]), max(standardized_data[x])])
    plt.plot(x_range, r * x_range, color='red')

    # exclude DC and NE
    filtered_data = standardized_data[~standardized_data['STATE'].isin(['DC', 'NE'])]
    r = np.corrcoef(filtered_data[x], filtered_data[y])[0, 1]
    x_range = np.array([min(filtered_data[x]), max(filtered_data[x])])
    plt.plot(x_range, r * x_range, color='green')

    plt.show()

plot_data(data, 'CIG', 'BLAD', 'STATE')
plot_data(data, 'CIG', 'LUNG', 'STATE')
plot_data(data, 'CIG', 'KID', 'STATE')
plot_data(data, 'CIG', 'LEUK', 'STATE')

def correlation(data, x, y, exclude=[]):
    filtered_data = data[np.isin(data['STATE'], exclude, invert=True)]
    return filtered_data[x].corr(filtered_data[y])

print(correlation(data, 'CIG', 'BLAD'))
print(correlation(data, 'CIG', 'BLAD', ['DC', 'NE']))
print(correlation(data, 'CIG', 'LUNG'))
print(correlation(data, 'CIG', 'LUNG', ['DC', 'NE']))
print(correlation(data, 'CIG', 'KID'))
print(correlation(data, 'CIG', 'KID', ['DC', 'NE']))
print(correlation(data, 'CIG', 'LEUK'))
print(correlation(data, 'CIG', 'LEUK', ['DC', 'NE']))

# %%
plt.figure(figsize=(35/3, 18/3))


plt.scatter(data['CIG'], data['LUNG'])
plt.xlabel('CIG (per capita cigarette sales)')
plt.ylabel('LUNG (cancer death rate per 100,000 population)')
plt.title('Correlation between cigarette sales and lung cancer in the US states')


# draw scatter plot, label them using the 'STATE' column
for i in range(len(data)):
    plt.annotate(data['STATE'][i], (data['CIG'][i], data['LUNG'][i]))

plt.xlim(10, 45)
plt.ylim(10, 28)

# set x axis resolution to 0.5
plt.xticks(np.arange(10, 45, 3))
plt.yticks(np.arange(10, 28, 3))

plt.grid(True)
plt.show()

# %%
# standardize the columns
data['CIG'] = (data['CIG'] - data['CIG'].mean()) / data['CIG'].std()
data['LUNG'] = (data['LUNG'] - data['LUNG'].mean()) / data['LUNG'].std()

plt.figure(figsize=(14, 8))

plt.scatter(data['CIG'], data['LUNG'])
plt.xlabel('CIG (standardized)')
plt.ylabel('LUNG (standardized)')
plt.title('Correlation between cigarette sales and lung cancer in the US states (standardized)')


# draw scatter plot, label them using the 'STATE' column
for i in range(len(data)):
    plt.annotate(data['STATE'][i], (data['CIG'][i], data['LUNG'][i]))
    
# draw the trend line
z = np.polyfit(data['CIG'], data['LUNG'], 1)
p = np.poly1d(z)
plt.plot(data['CIG'], p(data['CIG']), "r--")

# print the formula
print("y=%.6fx+(%.6f)"%(z[0],z[1]))

plt.xlim(-3, 4)
plt.ylim(-2, 2)

# set x axis resolution to 0.5
plt.xticks(np.arange(-3, 4, 0.5))

plt.grid(True)
plt.show()
```

##### Question 5 Code

```python
ko = pd.read_csv('KO.csv')
pep = pd.read_csv('PEP.csv')

# find the 'close' column of KO and PEP
ko_close = ko['Close']
pep_close = pep['Close']

# only get last three months
today = pd.to_datetime('today')
three_months_ago = today - pd.DateOffset(months=3)

# convert the 'Date' column to datetime
ko['Date'] = pd.to_datetime(ko['Date'])
pep['Date'] = pd.to_datetime(pep['Date'])

# filter the data
ko_close = ko_close[ko['Date'] >= three_months_ago]
pep_close = pep_close[pep['Date'] >= three_months_ago]


corr = ko_close.corr(pep_close)

# find the correlation
print(corr)

# standard deviation
pep_std = pep_close.std()
pep_mean = pep_close.mean()

# trend line
z = np.polyfit(ko_close, pep_close, 1)
p = np.poly1d(z)

# draw the scatter plot
plt.scatter(ko_close, pep_close)
plt.xlabel('KO (Coca Cola) stock price ($)')
plt.ylabel('PEP (Pepsi) stock price ($)')


hat_ko_close = (ko_close - ko_close.mean()) / ko_close.std()

plt.plot(ko_close, hat_ko_close * pep_std * corr + pep_mean, color='red')

# put the line equation on the plot
plt.text(60, 170, f'y = {z[0]:.2f}x + {z[1]:.2f}', color='red')


plt.title('Correlation between Coca Cola and Pepsi stock prices in the last three months')
plt.show()


# also draw one for the standardized data
hat_ko_close_standard = (hat_ko_close - hat_ko_close.mean()) / hat_ko_close.std()
hat_pep_close_standard = (pep_close - pep_close.mean()) / pep_close.std()

plt.scatter(hat_ko_close_standard, hat_pep_close_standard)
plt.xlabel('KO (Coca Cola) stock price (standardized)')
plt.ylabel('PEP (Pepsi) stock price (standardized)')
plt.plot(hat_ko_close_standard, corr * hat_ko_close_standard, color='red')
plt.title('Correlation between Coca Cola and Pepsi stock prices in the last three months (standardized)')

plt.text(1.6, 0.8, f'y = {corr:.2f}x', color='red')

plt.show()
```

