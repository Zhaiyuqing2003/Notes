# Algorithms Study Problems

## Problem 1

>Consider the following procedure Gnarly, which returns true or false. Notice the indenting on lines 04-05: they execute only when the test on line 03 succeeds. You can assume that $n \geq 1$ and that extracting a subarray (e.g. in the recursive calls in line 06) requires only constant time.
>
>```pseudocode
> Gnarly (a[1],..., a[n]:  array of integers) 
>       if (n = 1) return true
>       else if (n = 2)
>         if (a[1] = a[2]) return true
>         else return false 
>       else if (Gnarly(a[1],...,a[n-1]) and Gnarly(a[2],...,a[n])) return true 
>       else return false 
> ```
>
>1. If Gnarly returns true, what must be true of the values in the input array? Briefly justify your answer.
>2. Give a recursive definition for $T(n)$, the running time of Gnarly on an input of length n. Be sure to include a base case.
>3. Give a big-theta bound on the running time of Gnarly. For full credit, you must show work or briefly explain your answer.

1. All the elements in the array is the same if Gnarly return true.

   Prove by induction on the size of array $n$.

   Base: for $n = 1$ and $n = 2$, it will return true if all elements are the same, as shown in code.

   Induction: Inductive Hypothesis: Suppose that all elements is the same if Gnarly return true for $n = k$, where $k \in \Z^+$ and $k \geq 2$. 

   Suppose $n = k + 1$, if Gnarly returns true, it indicates that Gnarly return true for both two $k$ arrays. (As shown in the code). According to inductive hypothesis, that means both $k$ arrays has all same elements. Thus, the $n = k+1$ array must have same elements.

   That means it's true that all elements is the same if Gnarly return true also when $n = k+1$.

   Q. E. D. 

2. 
   
   $$
   \begin{align}
   T(1) &= c \\
   T(2) &= d \\
   T(n) &= 2T(n-1) + e
   \end{align}
   $$
   where $c$, $d$ and $e$ are constant in $R$.
   
3. For $n > 2$, 
   $$
   \begin{align}
   T(n) &= 2T(n - 1) + e \\
   		 &= 2(2T(n - 2) + e) + e \\
   		 &= 4T(n - 2) + e(2 + 1) \\
   		 &= 2^kT(n - k) + e(\sum_{i = 0}^{k - 1}2^i) \\
   		 &= 2^kT(n - k) + e\cdot(2^k - 1)
   \end{align}
   $$
   Let $n - k = 2$. So, $k = n - 2$.
   $$
   T(n) = 2^{n - 2}d + e\cdot(2^{n - 2} - 1) = 2^{n - 2}(d+e) - e
   $$
   $T(n)$ takes $\Theta(2^n)$ time.

## Problem 2

>Here is pseudocode for functions find_closest and find_closest_sorted. Each function takes as input an array of n numbers and a target number and outputs the closest value in the input that is at least as large as the target (or NULL if no such number exists). The function find_closest_sorted assumes that the input array is sorted in ascending order.
>
>```pseudocode
>function find_closest(input_array, target)}
>  sorted_array = cocktailsort(input_array)   
>  return find_closest_sorted(sorted_array, target)
>
>
>function find_closest_sorted(sorted_array, target)
>  length = get_length(sorted_array)   
>  if length = 0 
>    return NULL
>  else if length = 1 
>    if sorted_array[0] >= target 
>      return sorted_array[0]
>    else return NULL
>  else
>    mid = floor(length/2)
>    if (sorted_array[mid-1] < target)
>      half_array = sorted_array(mid,...,length-1)    
>    else 
>      half_array = sorted_array(0,...,mid-1)         
>    return find_closest_sorted(half_array, target) 
>```
>
>Answer the questions below using worst-case analysis (e.g., the target value is equal to the largest number in the input array). Assume that the input length n is a power of $2$ and that cocktail sort takes $\Theta(n^2)$ time.
>
>1. Suppose $R(n)$ is the running time of `find_closest_sorted`. Give a recursive definition of $R(n)$. Assume that it takes constant time to extract the first or second half of the array in lines 15 and 17.
>2. What is the height of the recursion tree for $R(n)$?
>3. How many leaves are in the recursion tree for $R(n)$?
>4. What is the big-Theta running time of find_closest_sorted? Make your answer as simple as possible.
>5. What is the big-Theta running time of `find_closest`. Make your answer as simple as possible.

1. 
   $$
   \begin{align}
   R(0) &= c \\
   R(1) &= d \\
   R(n) &= R(n/2) + e \\
   \end{align}
   $$
   where $c$, $d$, and $e$ are constant in $\R$ 

2. 
   $$
   R(n) = R(n/2^k) + ke
   $$
   Let $n/2^k = 1$, and $k = \log_2{n}$.

   The height is equal to $k$, so the height is $\log_2{n}$.

3. Only one $1$ leaf.

4. $\Theta(\log n)$

5. $\Theta(n^2)$

