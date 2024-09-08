#### Problem 1

The mean is the green dot, the blue arrow is first principle value, the cyan arrow is second principle value.

<img src="./HW 9.assets/image-20240412213623539.png" alt="image-20240412213623539" style="zoom:33%;" />



#### Problem 2

Left: eigenvalues in log scale. Right: eigenvalues in normal scale.

<img src="./HW 9.assets/image-20240412214217669.png" alt="image-20240412214217669" style="zoom: 50%;" /><img src="./HW 9.assets/image-20240412214227514.png" alt="image-20240412214227514" style="zoom:50%;" />

```python
[9.92017895e+04 1.72535266e+02 9.43811370e+00 4.99117861e+00
 1.22884523e+00 8.41063869e-01 2.78973523e-01 1.51381266e-01
 1.12096765e-01 7.17026032e-02 3.75759789e-02 2.10723661e-02
 8.20370314e-03]
```

So we see that if we want to get a coarse approximation, first two principle component should be enough. If we want to get better accuracy, first five should be enough. This is because other principle component is too small compare to these leading principle values, so the approximation error (according to the formula), is negligible.

The scatterplot

<img src="./HW 9.assets/image-20240412222019184.png" alt="image-20240412222019184" style="zoom:50%;" />



#### Problem 3

<img src="./HW 9.assets/image-20240412222511159.png" alt="image-20240412222511159" style="zoom:50%;" />

The scatter plot shows a clear clustering pattern, with data points  grouped into three distinct regions along the Principal Component 1  axis. Each cluster corresponds to a different class, as indicated by the color gradient in the legend. This suggests that the dataset has an  inherent structure where observations can be grouped into three separate categories, and these categories are well-separated along the first  principal component.





<img src="./HW 9.assets/image-20240412222340592.png" alt="image-20240412222340592" style="zoom: 50%;" />

We only needs the first two as they are the biggest. This is because other principle component is too small compare to these leading principle values, so the approximation error (according to the formula), is negligible.



#### Problem 4

##### (a)

$$
\Sigma = \left[\matrix {
	9 & 6 \\
	6 & 4
}\right]
$$

##### (b)

Eigenvalues are 13 and 0 (calculated by code)

##### (c)

The eigenvalues of a covariance matrix represent the variance explained by its corresponding eigenvectors. In this case, one of the eigenvalues  is 13, which indicates that there is a significant amount of variance in the  direction of the corresponding eigenvector. The other eigenvalue is 0, which indicates that there is no variance in the direction of its  corresponding eigenvector. This means the data points lie perfectly  along a line in 2-dimensional space, and there is no spread in the  direction perpendicular to that line, suggesting that the data is perfectly correlated linear. (i.e. correlation = 1, as we could see that correlation = $\frac{cov({\bold x; 0, 1})}{\sqrt{var(0)} \cdot \sqrt{var(1)}} = 6/\sqrt{4 \cdot 9} = 1$



#### Problem 5

The coordinate is $(7.0, -1.0)$. This means when $X_1$ is projected onto the new space formed by the first two principal components, its coordinates on the principal component axes are 7.0 along the direction of $u_1$ and --1.0 along the direction of $u_2$. (Calculation is done by code. basically $m = x - \text{mean}(x)$ and that $r = (u_1 \cdot X_1, u_2 \cdot X_1, 0 , 0)$  as we only need the first two principal component).



#### Problem 6

##### (a)

A more intuitive "proof" will based on the understanding of the covariance matrix, since only one term is non-zero, that actually means that covariance matrix has only signal principal term, and all other value is all zero. This means that the data actually lies on a line in the n dimensional data (this is exact, since all other covariance matrix entries is zero). Therefore, we could express the data via a line equation exactly (and since $x_1$ and $x_2$ are not the same, that means the formula proposed is a value line formula), and for specific data $x_i$, the $t_i$ is just $(x_i - x_1)\cdot(x_2 - x_1)/|x_2 - x_1|$



##### (b)

$$
\text{mean}(x_i) = x_1+ \text{mean}(t_i)(x_2 - x_1)
$$

so
$$
\text{cov}(x; j, k) 
= \frac{1}{N} \sum_i (x_i^{(j)} - \text{mean}(x^{(j)}))(x_i^{(k)} - \text{mean}(x^{(k)}))\\
= \frac{1}{N} \sum_i (x_1^{(j)} + t_i(x_2^{(j)} - x_1^{(j)}) - x_1^{(j)} - \text{mean}(t_i)(x_2^{(j)} - x_1^{(j)}))\\
(x_1^{(k)} + t_i(x_2^{(k)} - x_1^{(k)}) - x_1^{(k)} - \text{mean}(t_i)(x_2^{(k)} - x_1^{(k)})))\\
= \frac{1}{N} \sum_i (t_i(x_2^{(j)} - x_1^{(j)}) - \text{mean}(t_i)(x_2^{(j)} - x_1^{(j)}))\\
(t_i(x_2^{(k)} - x_1^{(k)}) - \text{mean}(t_i)(x_2^{(k)} - x_1^{(k)})))
\\= \frac{1}{N}(x_2^{(j)} - x_1^{(j)})(x_2^{(k)} - x_1^{(k)})  \sum_i (t_i - \text{mean}(t))^2 \\
= (x_2^{(j)} - x_1^{(j)})(x_2^{(k)} - x_1^{(k)})\text{std}^2(t_i)
$$




#### Code

```python
from ucimlrepo import fetch_ucirepo 
  
# fetch dataset 
wine = fetch_ucirepo(id=109) 
  
# data (as pandas dataframes) 
X = wine.data.features 
y = wine.data.targets 
  
# metadata 
print(wine.metadata) 
  
# variable information 
print(wine.variables) 
```

```python
# construct covariance matrix
import numpy as np
cov_mat = np.cov(X.T)


import matplotlib.pyplot as plt

# find eigenvalues and eigenvectors
eigenvalues, eigenvectors = np.linalg.eig(cov_mat)

# sort the eigenvalues, and the corresponding eigenvectors
idx = eigenvalues.argsort()[::-1]

eigenvalues = eigenvalues[idx]
eigenvectors = eigenvectors[:,idx]

# print the eigenvalues
print(eigenvalues)

# plot the eigenvalues with a log scale
plt.plot(eigenvalues)
plt.yscale('log')
plt.show()

# and without a log scale
plt.plot(eigenvalues)
plt.show()
```

```python
# with the eigenvectors, we can transform the data
# pick the first two eigenvectors

from sklearn.decomposition import PCA

# # find the mean of the data first
# mean = np.mean(X.T, axis=1)

# # subtract the mean from the data
# X_centered = X - mean

# # project the data onto the eigenvectors
# projected_data = X_centered.dot(eigenvectors)

# # plot the data on the first two principal components
# plt.scatter(projected_data[0], projected_data[1])

pca = PCA(n_components=2)
projected_data = pca.fit_transform(X)

# convert the projected data to a pandas dataframe
import pandas as pd
projected_data = pd.DataFrame(projected_data, columns=['PC1', 'PC2'])

# associate the data with the original class labels
projected_data['class'] = y

plt.figure(figsize=(8, 6))
scatter = plt.scatter(projected_data['PC1'], projected_data['PC2'], c=projected_data['class'], cmap='viridis', marker='o', alpha=0.6)
plt.title('Scatter Plot of the Wine Dataset Projected onto the First Two Principal Components')
plt.xlabel('Principal Component 1')
plt.ylabel('Principal Component 2')
plt.grid(True)
plt.colorbar(scatter, label='Class')
plt.show()
```

```python
# read the wheat data from the seeds_dataset.txt file
import pandas as pd
data = pd.read_csv('seeds_dataset.txt', delim_whitespace=True, header=None)

# last column is the class label, remove it from the data
X = data.iloc[:,:-1].values

# project on two the first two principal components
pca = PCA(n_components=2)
projected_data = pca.fit_transform(X)

projected_data = pd.DataFrame(projected_data, columns=['PC1', 'PC2'])

# associate the data with the original class labels
projected_data['class'] = y

plt.figure(figsize=(8, 6))
scatter = plt.scatter(projected_data['PC1'], projected_data['PC2'], c=projected_data['class'], cmap='viridis', marker='o', alpha=0.6)
plt.title('Scatter Plot of the Seeds Dataset Projected onto the First Two Principal Components')
plt.xlabel('Principal Component 1')
plt.ylabel('Principal Component 2')
plt.grid(True)
plt.colorbar(scatter, label='Class')
plt.show()

# calculate eigenvalues and eigenvectors
cov_mat = np.cov(X.T)
eigenvalues, eigenvectors = np.linalg.eig(cov_mat)

# sort the eigenvalues, and the corresponding eigenvectors
idx = eigenvalues.argsort()[::-1]
eigenvalues = eigenvalues[idx]
eigenvectors = eigenvectors[:,idx]

print(eigenvalues)

# plot the eigenvalues without a log scale
plt.plot(eigenvalues)
plt.show()
```

```python
matrix = [[9, 6], [6, 4]]

# find eigenvalues and eigenvectors
eigenvalues, eigenvectors = np.linalg.eig(matrix)
print(eigenvalues)
```

```python
mean_X = np.array([1, 1, 1, 1])
u1 = np.array([0.5, 0.5, 0.5, 0.5])
u2 = np.array([0.5, -0.5, 0.5, -0.5])
X1 = np.array([3, 3, 5, 7])

# Center the data by subtracting the mean
X1_centered = X1 - mean_X

# Project the centered data onto the first two eigenvectors
projection_u1 = np.dot(X1_centered, u1)
projection_u2 = np.dot(X1_centered, u2)

# The coordinates of the projection are the scalars from the dot product with each eigenvector
projection_coordinates = (projection_u1, projection_u2)

print(projection_coordinates)
```

