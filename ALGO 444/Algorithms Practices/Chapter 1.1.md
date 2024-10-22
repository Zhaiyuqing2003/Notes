# 1.1 Practices

[TOC]

## 1.1.1 

> Give the value of each of the following expressions:
>
> ```java
> (0 + 15) / 2
> (2.0e-6 * 100000000.1) 
> true && false || true && true
> ```

```java
7
200.0000002
true
```

## 1.1.2

> Give the type and value of each of the following expressions:
>
> ```java
> (1 + 2.236) / 2
> 1 + 2 + 3 + 4.0
> 4.1 >= 4
> 1 + 2 + "3"
> ```

```java
1.618
10.0
true
"33" // note that 1 + 2 = 3 first, then 3 + "3" = "33"
```

## 1.1.3

> Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise. 

```java
class Main{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
```

## 1.1.4

> What (if anything) is wrong with each of the following statements?
>
> ```java
> if (a > b) then c = 0;
> if a > b { c = 0; }
> if (a > b) c = 0;
> if (a > b) c = 0 else b = 0;
> ```

```java
// wrong. No key words "then";
// wrong. "(a > b)" instead of "a > b";
// okay.
// wrong. there should be a ";" after "c = 0".
```

## 1.1.5

> Write a code fragment that prints true if the double variables `x` and `y` are both strictly between 0 and 1 and false otherwise. 

```java
class Main{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        if (0.0 < x && x < 1.0 && 
            0.0 < y && y < 1.0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    } 
}
```

## 1.1.6

> What does the following program print?
>
> ```java
> int f = 0; 
> int g = 1; 
> for (int i = 0; i <= 15; i++) {   
>         StdOut.println(f);   
>         f = f + g;   
>         g = f - g; 
> }
> ```

```java
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
// Fibonacci Series
```

## 1.1.7

> Give the value printed by each of the following code fragments:
>
> ```java
> double t = 9.0; 
> while (Math.abs(t - 9.0/t) > .001)       
>     	t = (9.0/t + t) / 2.0;    
> StdOut.printf("%.5f\n", t);
> 
> /* ------------ */
> 
> int sum = 0;    
> for (int i = 1; i < 1000; i++)
>    	for (int j = 0; j < i; j++)       
>      		sum++;
> StdOut.println(sum);
> 
> /* ------------ */
> 
> int sum = 0;    
> for (int i = 1; i < 1000; i *= 2)       
>    	for (int j = 0; j < N; j++)           
>    		sum++;    
> StdOut.println(sum);
> ```

```java
3.00009
499500
// Error (because N is undefined);
```

first one tries to find sqrt(9) by using newton method. The newton method finds the root of $f(x)$. It comes from linearization:
$$
f(x + \Delta{x}) \approx f(x) + \Delta{x}f'(x)
$$
where $f(x + \Delta{x})$ is set to $0$. Thus, 
$$
\Delta{x} = -f(x)/f'(x)
$$
and 
$$
x_{next} = x + \Delta{x}
$$
The newton method will eventually find a $x$ where $f(x) = 0.$

In the case of 1.1.7, $f(x) = x^2 + 9$, so $x_{next} = (\frac{9.0}{x} + x) / 2$, that explains the code.

For the second one, the code actually is:
$$
\sum_{i = 1}^{999}\sum_{j = 0}^{i - 1}{1}
$$
which is:
$$
\sum_{i = 1}^{1000}{i}
$$
and it is:
$$
\frac{999*(999 + 1)}{2} = 499500
$$

## 1.1.8

> What do each of the following print?
>
> ```java
> System.out.println('b'); 
> System.out.println('b' + 'c'); 
> System.out.println((char) ('a' + 4)); 
> ```

```java
'b' 
    // because it a char, so it got printed.
197 
    // because the numeric value of 'b' + 'c' is not a proper char value, 
    // it will get elevated to int, and two int is 98 and 99, 
    // so the result is 197 
'e' 
    // ‘a’ + 4 will get elevated into 97 + 4 = 101
    // and 101 then converted to 'e'
```

## 1.1.9

> Write a code fragment that puts the binary representation of a positive `integer N` into a `String s`.

```java
String s = ""; 
for (int n = N; n > 0; n /= 2)   
    s = (n % 2) + s;
// the remainder is the current digit, while the quotient (n /= 2)
// is the next number that need to be processed.
```

## 1.1.10

> What is wrong with the following code fragment?
>
> ```java
> int[] a;
> for (int i = 0; i < 10; i ++){
>        a[i] = i * i
> }
> ```

variable `a` are not initialized (assigned with a value) , so it will cause a compile-time error.

## 1.1.11

>Write a code fragment that prints the contents of a **two-dimensional Boolean array**, using `*` to represent `true` and a `space` to represent `false`. Include row and column numbers. 

```java
class Main{
    public static void main(String[] args){
        boolean[][] booleanArray = new boolean[10][10];
		
        // make such array
        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < 10; j ++){
                booleanArray[i][j] = Math.floor(Math.random() * 2) == 0;
            }
        }

        // actual implementation
        for (int i = 0; i < booleanArray.length; i ++){
            for (int j = 0; j < booleanArray[i].length; j ++){
                String printValue = booleanArray[i][j] ? "*" : "";
                System.out.println("(" + i + ", " + j + ") " + printValue);
            }
        }
    }
}
```

## 1.1.12

> What does the following code fragment print?
>
> ```java
> int[] a = new int[10]; 
> for (int i = 0; i < 10; i++)   
>         a[i] = 9 - i; 
> for (int i = 0; i < 10; i++)   
>         a[i] = a[a[i]];
> for (int i = 0; i < 10; i++) 
> 	System.out.println(i); 
> ```

```java
0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// because a[i] = 9 - i, a[a[i]] = a[9 - i] = 9 - (9 - i) = i
// so it will print 1 to 9 accordingly.
```

## 1.1.13

> Write a code fragment to print the **transposition** (rows and columns changed) of a two-dimensional array with `M` rows and `N` columns. 

```java
class Main{
    public static void main(String[] args){

        // generate the intArray
        int M = (int) Math.floor(Math.random() * 5 + 1);
        int N = (int) Math.floor(Math.random() * 5 + 1);
        int[][] intArray = new int[M][N];

        for (int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                intArray[i][j] = (int) Math.floor(Math.random() * 10);
            }
        }

        // actual transposing.
        for (int j = 0; j < N; j ++){
            for (int i = 0; i < M; i ++){
                System.out.print(intArray[i][j]);
            }
            System.out.println("");
        }
    }
}
```

## 1.1.14

> Write a static method `lg()` that takes an int value `N` as argument and returns the largest int not larger than the base-2 logarithm of `N`. Do not use `Math`. 

```java
public static int lg(int N){
    int lg = -1;
    while (N > 0){
        N /= 2;
        lg ++;
    }
    return lg;
}
```

## 1.1.15

> Write a static method histogram() that takes an ` array a[] `of int values and an `integer M` as arguments and returns an array of length M whose `i`th entry is the number of times the `integer i` appeared in the argument array. If the values in ` a[]` are all between `0` and `M–1`, the sum of the values in the returned array should be equal to `a.length`. 

```java
public static int[] histogram(int[] a, int M){
    int[] histogram = new int[M];

    for (int i = 0; i < a.length; i ++){
        int currentValue = a[i];
        // make sure when we insert the number, it isn't out of boundary;
        if (currentValue >= 0 && currentValue < M){
            histogram[currentValue] += 1;
        }
    }

    return histogram;
}
```

## 1.1.16

> Give the value of `exR1(6)`:
>
> ```java
> public static String exR1(int n) {   
>         if (n <= 0) return "";   
>         return exR1(n-3) + n + exR1(n-2) + n; 
> }
> ```

```javascript
// exR1(6) -> exR1(3) + 6 + exR1(4) + 6;
// exR1(4) -> exR1(1) + 4 + exR1(2) + 4;
// exR1(3) -> exR1(0) + 3 + exR1(1) + 3;
// exR1(2) -> exR1(-1) + 2 + exR1(0) + 2;
// exR1(1) -> exR1(-2) + 1 + exR1(-1) + 1;    
// exR1(0) -> "";
// exR1(-1) -> "";
// exR1(-2) -> "";
// exR1(1) -> "" + 1 + "" + 1 -> "11";
// exR1(2) -> "" + 2 + "" + 2 -> "22";
// exR1(3) -> "" + 3 + "11" + 3 -> "3113";
// exR1(4) -> "11" + 4 + "22" + 4 -> "114224";
// exR1(6) -> "3113" + 6 + "114224" + 6 -> "311361142246";
```

## 1.1.17

> Criticize the following recursive function:
>
> ```java
> public static String exR2(int n) {   
>         String s = exR2(n-3) + n + exR2(n-2) + n;   
>         if (n <= 0) return "";   
>         return s; 
> }
> ```

Suppose we call `exR2(2)`, it will call `exR2(-1)`, and then `exR2(-4)` and so on. (It will never stop until a `StackOverflowError` occurs.

## 1.1.18

> Consider the following recursive function:
>
> ```java
> public static int mystery(int a, int b) {   
>         if (b == 0)     return 0;
>         if (b % 2 == 0) return mystery(a+a, b/2);   
>         return mystery(a+a, b/2) + a; 
> }
> ```
>
> What are the values of  `mystery(2, 25)` and `mystery(3, 11)`? Given positive integers `a` and `b`, describe what value `mystery(a, b)` computes. Answer the same question, but replace `+` with `*` and replace return `0` with return `1`.

First, 
$$
mystery(a, 0) = 0
$$

$$
mystery(a, b) = mystery(2a, b/2) + a * (b\%2)
$$

Then, for every $mystery(a, b)$, it is:
$$
mystery(2^n*a, \frac{b}{2^n}) + 2^{n-1}{a}*{(b\%2^{n})} + \dots + a * (b\%2)
$$
since  $\frac{b}{2^n} = 0$  and $mystery(2^n*a, \frac{b}{2^n}) = 0$
$$
mystery(2^n*a, \frac{b}{2^n}) + 2^{n-1}{a}*{(b\%2^{n})} = 2^{n}a*\frac{b}{2^n} + 2^{n-1}{a}*{(b\%2^{n})}
$$
which is:
$$
2^{n-1}a(\frac{b}{2^n}*2 + b\%2^{n}) = 2^{n-1}a*\frac{b}{2^{n-1}}
$$
and it goes on:
$$
2^{n-1}a*\frac{b}{2^{n-1}} + 2^{n-2}{a}*{(b\%2^{n-1})} = 2^{n-2}a*(\frac{b}{2^{n-1}}*2+b\%2^{n-1})
$$
eventually:
$$
2a*\frac{b}{2} + a * (b \%2) = a*b
$$

```java
mystery(2, 25) == 2 * 25 == 50
mystery(3, 11) == 3 * 11 == 33
```
Second, 
$$
mystery(a, 0) = 1
$$

$$
mystery(a, b) = mystery(a^2, b/2) * a ^{b\%2}
$$

Then, for every $mystery(a, b)$, it is:
$$
mystery(a^{2^n}, \frac{b}{2^n}) * a^{2^{n-1}(b\%2^{n})} * \dots * a ^ {b\%2}
$$
since  $\frac{b}{2^n} = 0$  and $mystery(a^{2^n}, \frac{b}{2^n}) = 1$
$$
mystery(a^{2^n}, \frac{b}{2^n}) * a^{2^{n-1}(b\%2^{n})} = a^{2^n\frac{b}{2^n}} * a^{2^{n-1}(b\%2^{n})}
$$
which is:
$$
a^{2^{n - 1}(2*\frac{b}{2^n} + b\%2^{n})} = a^{2^{n - 1}\frac{b}{2^{n-1}}}
$$
and it goes on:
$$
a^{2^{n-1}*\frac{b}{2^{n-1}}} * {a}^{2^{n-2}(b\%2^{n-1})} = 2^{2^{n-2}(\frac{b}{2^{n-1}}*2+b\%2^{n-1})}
$$
eventually:
$$
a^{2*\frac{b}{2}} * a ^ {b\%2} = a^b
$$
```java
mystery(2, 25) == 2 ** 25 == 33554432
mystery(3, 11) == 3 ** 11 == 177147
```

## 1.1.19

>  Run the following program on your computer:
>
> ```java
> public class Fibonacci {   
>         public static long F(int N) {
>             if (N == 0) return 0;      
>             if (N == 1) return 1;      
>             return F(N-1) + F(N-2);   
>         }   
>         public static void main(String[] args) {
>             for (int N = 0; N < 100; N++)         
>                 StdOut.println(N + " " + F(N));   
>         } 
> }
> ```
> 
>What is the largest value of `N` for which this program takes less 1 hour to compute the value of `F(N)`? Develop a better implementation of `F(N)` that saves computed values in an array.

I don't know. But when the program runs to `F(49)`, it almost feels like it stops. The computational speed required for `F` increase exponentially. 

```java
// F(0) -> 1 times;
// F(1) -> 1 times;
// F(2) -> F(1) + F(0) = 2 times;
// F(3) -> F(2) + F(1) = 2 + 1 = 3 times;
// F(4) -> F(3) + F(2) = 5 times;
// F(5) -> F(4) + F(3) = 5 + 3 = 8 times;
```

So the time complexity actually follow the Fibonacci sequence. Better Solutions:

```java
class Main{
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        for (int N = 0; N < 100; N++){
            a = a + b;
            System.out.println(a);
            b = b + a;
            System.out.println(b);
        }
    }
}
```

## 1.1.20

> Write a recursive static method that computes the value of `ln (N!) `

```java
class happy{
    public static void main(String[] args){
        StdOut.print(logFactorial(10));
    }
    public static double logFactorial(int N){
        if (N == 1){ return 0; }
        return Math.log(N) + logFactorial(N - 1);
    }
}
```

## 1.1.21

> Write a program that reads in lines from standard input with each line containing a name and two integers and then uses `printf()` to print a table with a column of the names, the integers, and the result of dividing the ﬁrst by the second, accurate to three decimal places. You could use a program like this to tabulate batting averages for baseball players or grades for students. 

```java
class happy{
    public static void main(String[] args){
        String[] input = StdIn.readAllStrings();
        StdOut.println("--------------------");
        for (int i = 0; i < input.length / 3; i ++){
            String name = input[i * 3];
            int firstNumber = Integer.parseInt(input[i * 3 + 1]);
            int secondNumber = Integer.parseInt(input[i * 3 + 2]);
            double result = (double) firstNumber / (double) secondNumber;
            StdOut.printf("| %s | %d | %d | %.3f |\n", name, firstNumber, secondNumber, result);
        }
        StdOut.println("--------------------");
    }
}
```

## 1.1.22

>  Write a version of `BinarySearch `that uses the recursive `rank()` given on page `25` and traces the method calls. Each time the recursive method is called, print the argument values `lo` and `hi`, indented by the depth of the recursion. Hint: Add an argument to the recursive method that keeps track of the depth. 

```java
import java.util.Arrays;
public class BinarySearch{
    public static int rank(int number, int[] a){
        int initialDepth = 1;
        int min = 0;
        int max = a.length - 1;
        StdOut.println("Binary Search Start:");
        return rank(number, a, min, max, initialDepth);
    }
    public static int rank(int number, int[] a, int min, int max, int depth){
        String printString = String.format("%" + depth * 4 + "s", "");
        StdOut.printf("%s lowKey = %d, maxKey = %d \n", printString, min, max);
        if (min <= max){
            int middle = min + (max - min) / 2;
            if (number < a[middle]){
                return rank(number, a, min, middle - 1, depth + 1);
            } else if (number > a[middle]){
                return rank(number, a, middle + 1, max, depth + 1);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
    public static void main(String[] args){
        int[] whitelist = { 1, 3, 5, 7, 9 };
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0){
                StdOut.println(key);
            }
        }
    }
}
```

## 1.1.23

> Add to the `BinarySearch `test client the ability to respond to a second argument: `+` to print numbers from standard input that are not in the whitelist, `-` to print numbers that are in the whitelist. 

```java
public static void main(String[] args){
    int[] whitelist = new In(args[0]).readAllInts();
    int[] testList = new In(args[1]).readAllInts();
    boolean isWhite = args[2].equals("+") ? true : false;
    Arrays.sort(whitelist);
    for (int i = 0; i < testList.length; i ++){
        int key = testList[i];
        int result = rank(key, whitelist);
        if (isWhite && result >= 0){
            StdOut.println(key);
        } else if (!isWhite && result < 0){
            StdOut.println(key);
        }
    }
}
// This is the only difference from the code of 1.1.22
```

## 1.1.24

>  Give the sequence of values of `p` and `q` that are computed when `Euclid’s algorithm` is used to compute the greatest common divisor of `105` and `24`. Extend the code given on page 4 to develop a program `Euclid` that takes two integers from the command line and computes their greatest common divisor, printing out the two arguments for each call on the recursive method. Use your program to compute the greatest common divisor or `1111111 `and `1234567`. 

```java
public class Euclid {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        StdOut.print("Start gcd algorithm\n");
        StdOut.print("Result = " + gcd(p, q, 1));
    }
    public static int gcd(int p, int q, int depth){
        StdOut.printf("%" + depth * 2 + "s" + "p = %d, q = %d\n", "", p, q);
        if (q == 0){ return p; }
        int r = p % q;
        return gcd(q, r, depth + 1);
    }
}
```

## 1.1.25

>  Use mathematical induction to prove that `Euclid’s algorithm` computes the greatest common divisor of any pair of nonnegative integers $p$ and $q$

It's based on a theorem that $gcd(a, b) = gcd(a, a\%b)$;

Base case: $gcd(a, 0) = a$ 

Iteration: Suppose the greatest common devisor of $a$ and $b$ is $d$, then $d | a$ and $d|b$, suppose $a > b$, so $a = kb + r$ where $r > 0$, so $r = a - kb$, divide both side by $d$, so $r/d = a/d - kb/d = m$ where $m$ is an integer because $d | a$ and $d|b$, so that $d | r$. suppose $a = k_1d$, $b = k_2d$, then $r = (k_1 - kk_2)d$ since $k_1 - kk_2$ and $k_2$ are relatively prime. (Suppose $k_1 - kk_2 = md_1$ and $k_2 = nd_1$, then $k_1 = (kn + m)d_1$ and $k2 = nd1$, which is contradicted to the assumption that $k1$ and $k2$ are relatively prime). So, $gcd(b,r)$ is also $d$.

Also, notice each time, the number which is could possible be 0 (the remainder) are put into second parameter, so that the program could avoid %0 error. 

## 1.1.26

> Sorting three numbers. Suppose that the variables `a`, `b`, `c`, and `t` are all of the same numeric primitive type. Show that the following code puts `a`, `b`, and `c` in ascending order:
>
> ```java
> if (a > b) { t = a; a = b; b = t; } 
> if (a > c) { t = a; a = c; c = t; } 
> if (b > c) { t = b; b = c; c = t; }
> ```

First line sort `a` and `b`. (Swaps them if `a` > `b`) `t` is just `temp`. This line makes sure that `a` < `b`.

Same for other lines. 

So, at last, `a` < `b`, `a` < `c`, `b` < `c`, which is in ascending order that `a` < `b` < `c`.

## 1.1.27

> Binomial distribution. Estimate the number of recursive calls that would be used by the code
>
> ```java
> public static double binomial(int N, int k, double p) {
>         double result;
>         if (k < 0 || k > N) {
>             result = 0.0;
>         } else if (N == 0) {
>             result = 1.0;
>         } else {
>             result = (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
>         }
>         return result;
> }
> ```
>
>  to compute binomial(100, 50). Develop a better implementation that is based on saving computed values in an array.

```javascript
//	binomial(100, 50) 
//		-> binomial(99, 50)
//    		-> binomial(98, 50)
//				-> binomial(97, 50)
//    			-> binomial(97, 49)
//    		-> binomial(98, 49)
//    			-> binomial(97, 49)
//    			-> binomial(97, 48)
//    	-> binomial(99, 49)
//    		-> binomial(98, 49)
//    			-> binomial(97, 49)
//    			-> binomial(97, 48)
//    		-> binomial(98, 48)
//    			-> binomial(97, 48)
//    			-> binomial(97, 47)

// it will end either 
// because binomial(0, a) or binomial(a, -1)
// The number of calls is between 2^50 ~ 2^100
// approx. smaller than (2^50 + 2^100) / 2
// 896152530963540776091569828566 to be exact
```

```java
import java.math.BigInteger;
import java.util.ArrayList;
public class Binomial {
    public static ArrayList<String> cache = new ArrayList<>();
    public static BigInteger callTimes = new BigInteger("0");
    public static void main(String[] args) {
        StdOut.println(binomial(100, 50, 0.5));
        StdOut.println(callTimes.toString());
    }
    public static double binomial(int N, int k, double p) {
        double result;
        int index = cache.indexOf("" + N + "-" + k);
        if (index == -1){
            // that means this one is not in cache
            BigInteger beforeCallTimes = callTimes.add(BigInteger.ZERO);
            if (k < 0 || k > N) {
                result = 0.0;
                callTimes = callTimes.add(BigInteger.ONE);
            } else if (N == 0) {
                result = 1.0;
                callTimes = callTimes.add(BigInteger.ONE);
            } else {
                result = (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
                callTimes = callTimes.add(BigInteger.TWO);
            }
            BigInteger afterCallTimes = callTimes.add(BigInteger.ZERO);
            cache.add("" + N + "-" + k);
            cache.add(Double.toString(result));
            cache.add(afterCallTimes.subtract(beforeCallTimes).toString());
        } else {
            result = Double.parseDouble(cache.get(index + 1));
            callTimes = callTimes.add(new BigInteger(cache.get(index + 2)));
        }
        return result;
    }
}
// this use cache to store values, and use BigIntegers
// to calculate the times for the algorithms in the question.
```

## 1.1.28

> Remove duplicates. Modify the test client in `BinarySearch `to remove any duplicate keys in the whitelist after the sort. 

```java
public static int[] removeReplicate(int[] a){
    if (a.length <= 1){
        return a.clone();
    } else {
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        resultArrayList.add(a[0]);
        for (int i = 1; i < a.length; i ++){
            int currentNumber = a[i];
            int previousNumber = a[i - 1];
            if (currentNumber != previousNumber){
                resultArrayList.add(a[i]);
            }
        }
        Integer[] b = new Integer[resultArrayList.size()];
        resultArrayList.toArray(b);
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i ++){
            c[i] = b[i];
        }
        return c;
    }
}
```

## 1.1.29

> Equal keys. Add to `BinarySearch `a static method `rank()` that takes a `key `and a sorted `array `of `int` values (some of which may be equal) as arguments and returns the number of elements that are smaller than the key and a similar method `count()`that returns the number of elements equal to the key. Note : If `i` and `j` are the values returned by `rank(key, a)` and `count(key, a)` respectively, then `a[i..i+j-1]` are the values in the array that are equal to key. 

```java
public static int count(int number, int[] a){
    int position = pos(number, a);
    if (position < 0){
        return 0;
    }
    if (position >= a.length){
        return 0;
    }
    int count = 0;
    for (int i = position - 1; i >= 0; i --){
        if (a[i] < number){
            break;
        }
        if (a[i] == number){
            count += 1;
        }
    }
    for (int i = position; i < a.length; i ++){
        if (a[i] > number){
            break;
        }
        if (a[i] == number){
            count += 1;
        }
    }
    return count;
}
public static int rank(int number, int[] a){
    int position = pos(number, a);
    if (position < 0){
        return 0;
    }
    if (position >= a.length){
        return a.length;
    }
    // within the array
    // find possible
    for (int i = position - 1; i >= 0; i --){
        if (a[i] < number){
            return i + 1;
        }
    }
    return position;
}
public static int pos(int number, int[] a){
    int min = 0;
    int max = a.length - 1;
    while (min <= max){
        int middle = min + (max - min) / 2;
        if (number < a[middle]){
            max = middle - 1;
        } else if (number > a[middle]){
            min = middle + 1;
        } else {
            return middle;
        }
    }
    return min;
}
```

## 1.1.30

> Array exercise. Write a code fragment that creates an `N-by-N boolean array` a[][] such that `a[i][j]` is `true` if `i` and `j` are relatively prime (have no common factors), and `false` otherwise. 

```java
import java.util.Arrays;
public class RPrimeTable {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[size][size];

        for (int i = 0; i < a.length; i ++){
            for (int j = 0; j <= i; j ++){
                a[i][j] = gcd(i, j) == 1 ? true : false;
            }
        }
        for (int i = 0; i < a.length; i ++){
            for (int j = a[0].length - 1; j > i; j --){
                a[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < a.length; i ++){
            StdOut.println(Arrays.toString(a[i]));
        }
    }
    public static int gcd(int p, int q){
        if (q == 0){ return p; }
        int r = p % q;
        return gcd(q, r);
    }
}
```

## 1.1.31

> Random connections. Write a program that takes as command-line arguments an integer `N` and a double value p (between `0` and `1`), plots `N` equally spaced dots of size `.05` on the circumference of a circle, and then, with probability `p` for each pair of points, draws a gray line connecting them. 

```java
public class Draw {
    public static void main(String[] args) {
        int numbers = Integer.parseInt(args[0]);
        double probability = Double.parseDouble(args[1]);

        StdDraw.setXscale(-2.0, 2.0);
        StdDraw.setYscale(-2.0, 2.0);
        StdDraw.circle(0, 0, 1);

        for (int i = 0; i < numbers; i ++){
            double angles = (double) i / (double) numbers * 2 * Math.PI;
            StdDraw.filledCircle(Math.cos(angles), Math.sin(angles), 0.05);
        }
        for (int i = 0; i < numbers - 1; i ++){
            for (int j = i + 1; j < numbers; j ++){
                if (StdRandom.bernoulli(probability)){
                    double startAngle = (double) i / (double) numbers * 2 * Math.PI;
                    double endAngle = (double) j / (double) numbers * 2 * Math.PI;
                    StdDraw.line(Math.cos(startAngle), Math.sin(startAngle),
                                 Math.cos(endAngle), Math.sin(endAngle));
                }
            }
        }
    }
}
```

## 1.1.32

> Histogram. Suppose that the standard input stream is a sequence of double values. Write a program that takes an integer `N `and two double values `l` and `r` from the command line and uses `StdDraw `to plot a histogram of the count of the numbers in the standard input stream that fall in each of the `N `intervals deﬁned by dividing `(l , r)` into `N` equal-sized intervals. 

```java
import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        double[] dataList = new In(args[0]).readAllDoubles();
        int division = Integer.parseInt(args[1]);
        double lowest = Double.parseDouble(args[2]);
        double highest = Double.parseDouble(args[3]);
        int[] count = new int[division];

        double length = (highest - lowest) / division;

        for (int i = 0; i < dataList.length; i ++){
            if (dataList[i] >= highest || dataList[i] < lowest){
                continue;
            }
            int index = (int) Math.floor((dataList[i] - lowest) / length);
            count[index] += 1;
        }

        double max = Double.MIN_VALUE;
        for (int i = 0; i < count.length; i ++){
            max = Math.max(count[i], max);
        }

        StdDraw.setXscale(0, 1.2 * count.length);
        StdDraw.setYscale(0, 1.2 * max);

        for (int i = 0; i < count.length; i ++){
            double centerX = i + 0.5 + 0.1 * count.length;
            double centerY = count[i] / 2.0 + 0.1 * max;
            double halfWidth = 0.5;
            double halfHeight = count[i] / 2.0;
            StdDraw.rectangle(centerX, centerY, halfWidth, halfHeight);
        }

        for (int i = 0; i < division + 1; i ++){
            String currentValue = String.format("%.3f", i * length + lowest);
            double x = i + 0.1 * count.length;
            double y = 0.05 * max;
            StdDraw.text(x, y, currentValue);
        }

        for (int i = 0; i < division; i ++){
            String currentValue = Integer.toString(count[i]);
            double x = i + 0.5 + 0.1 * count.length;
            double y = count[i] + 0.125 * max;
            StdDraw.text(x, y, currentValue);
        }

        StdOut.println(Arrays.toString(count));
    }
}
```

## 1.1.33

> `Matrix `library. Write a library `Matrix ` that implements the following API:
>
> ```java
> interface Matrix{
>         public static double dot(double[] x, double[] y) // vector dot product
>         public static double[][] mult(double[][] a, double[][] b) // matrix-matrix product
>         public static double[][] transpose(double[][] a) // transpose
>         public static double[] mult(double[][] a, double[] x) // matrix-vector product
>         public static double[] mult(double[] y, double[][] a)// vector-matrix product
> }
> ```
>
> Develop a test client that reads values from standard input and tests all the methods.

```java
import java.util.Arrays;

public class Matrix{
    public static void main(String[] args) {
        double[] x = {2.0, 3.0};
        double[] y = {1.0, -4.0};
        double[][] a = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        double[][] b = {
            {0.0, -4.0},
            {7.0, 2.0}
        };
        double[][] c = {
            {0.0, 1.0, 2.0},
            {3.0, 4.0, 5.0}
        };
        StdOut.println(dot(x, y));
        StdOut.println(Arrays.deepToString(mult(a, b)));
        StdOut.println(Arrays.toString(mult(a, x)));
        StdOut.println(Arrays.toString(mult(y, a)));
        StdOut.println(Arrays.deepToString(transpose(c)));
    }
    public static double dot(double[] x, double[] y){
        double sum = 0.0;
        for (int i = 0; i < x.length; i ++){
            sum += x[i] * y[i];
        }
        return sum;
    }
    public static double[] mult(double[][] a, double[] x){
        int M = a.length;
        int N = a[0].length;
        double[] vector = new double[M];
        for (int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                vector[i] += x[j] * a[i][j];
            }
        }
        return vector;
    }
    public static double[][] mult(double[][] a, double[][] b){
        int M = a.length;
        int N = a[0].length;
        int P = b.length;
        int Q = b[0].length;

        // N should equal to P.

        double[][] matrix = new double[M][Q];
        for (int i = 0; i < Q; i ++){
            for (int j = 0; j < M; j ++){
                for (int k = 0; k < P; k ++){
                    matrix[j][i] += a[j][k] * b[k][i];
                }
            }
        }
        return matrix;
    }
    public static double[] mult(double[] x, double[][] a){
        int M = a.length;
        double[] vector = new double[M];
        for (int i = 0; i < M; i ++){
            vector[i] += a[0][i] * x[i];
        }
        return vector;
    }
    public static double[][] transpose(double[][] a){
        int M = a.length;
        int N = a[0].length;
        double[][] b = new double[N][M];

        for (int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}
```

## 1.1.34

> Filtering. Which of the following require saving all the values from standard input (in an `array`, say), and which could be implemented as a filter using only a fixed number of variables and arrays of fixed size (not dependent on `N`)? For each, the input comes from standard input and consists of `N` real numbers between `0` and `1`.

* [x] Print the `maximum` and `minimum` numbers. 
* [ ] Print the `median` of the numbers. 
* [x] Print the `kth` smallest value, for `k` less than `100`. 
* [x] Print the `sum` of the squares of the numbers. 
* [x] Print the average of the `N` numbers. 
* [ ] Print the percentage of numbers greater than the `average`. 
* [ ] Print the `N` numbers in increasing order. 
* [ ] Print the `N` numbers in random order.

## 1.1.35

>  Dice simulation. The following code computes the exact probability distribution for the `sum` of two dice:
>
> ```java
> int SIDES = 6;
> double[] dist = new double[2*SIDES + 1]
>     
> for (int i = 1; i <= SIDES; i ++){
>         for (int j = 1; j <= SIDES; j ++){
>             dist[i + j] += 1.0;
>         }
> }
> 
> for (int k = 2; k <= 2 * SIDES; k ++){
>     	dist[k] /= 36.0;
> }
> ```
> 
>The value `dist[i]` is the probability that the dice sum to `k`. Run experiments to validate this calculation simulating `N` dice throws, keeping track of the frequencies of occurrence of each value when you compute the sum of two random integers between `1` and `6`. How large does `N` have to be before your empirical results match the exact results to three decimal places?

```javascript
let supposedList = {
    0 : 0,
    1 : 0,
    2 : 1/36,
    3 : 2/36,
    4 : 3/36,
    5 : 4/36,
    6 : 5/36,
    7 : 6/36,
    8 : 5/36,
    9 : 4/36,
    10 : 3/36,
    11 : 2/36,
    12 : 1/36,
}
let total = 36/36;
```

Approximately after `1552000` pairs of dice tries (at `5000` confidence assertion). 

```java
public class Dice {
    public static void main(String[] args) {
        int SIDES = 6;
        int SIMULATION_TIMES = 1550000;
        int STEP = 1000;
        int CONFIDENCE_TIMES = 5000;

        int CURRENT_SUCCESS_TIMES = 0;

        double[] expectedDist = {
            0.0, 0.0,
            1.0/36.0, 2.0/36.0,
            3.0/36.0, 4.0/36.0,
            5.0/36.0, 6.0/36.0,
            5.0/36.0, 4.0/36.0,
            3.0/36.0, 2.0/36.0,
            1.0/36.0
        };

        while (true){
            double[] dist = new double[2 * SIDES + 1];

            for (int i = 0; i < SIMULATION_TIMES; i ++){
                int diceA = StdRandom.uniform(1, SIDES + 1);
                int diceB = StdRandom.uniform(1, SIDES + 1);

                dist[diceA + diceB] += 1.0;
            }

            for (int i = 0; i < dist.length; i ++){
                dist[i] /= SIMULATION_TIMES;
            }

            boolean isAccurate = true;
            double[] diff = new double[2 * SIDES + 1];

            for (int i = 0; i < dist.length; i ++){
                double currentDiff = Math.abs(expectedDist[i] - dist[i]);
                diff[i] = currentDiff;
                if (currentDiff >= 0.001){
                    // NOT OK
                    isAccurate = false;
                }
            }


            StdOut.println(SIMULATION_TIMES + " " + CURRENT_SUCCESS_TIMES);

            if (isAccurate){
                CURRENT_SUCCESS_TIMES += 1;

                if (CURRENT_SUCCESS_TIMES == CONFIDENCE_TIMES){
                    StdOut.println("SUITABLE TIMES FOUND: " + SIMULATION_TIMES);
                    break;
                }
            } else {
                CURRENT_SUCCESS_TIMES = 0;
                SIMULATION_TIMES += STEP;
            }
        }
    }
}
```

## 1.1.36

> Empirical shuffle check. Run computational experiments to check that our shuffling code on page `32` works as advertised. Write a program `ShuffleTest` that takes command-line arguments `M` and `N`, does `N` shuffles of an array of size `M` that is initialized with `a[i] = i` before each shuffle, and prints an `M-by-M` table such that row `i` gives the number of times `i` wound up in position `j` for all `j`. All entries in the array should be close to `N/M`.

```java
import java.util.Arrays;

public class ShuffleTest{
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[][] shuffleMatrix = new int[M][M];


        for (int i = 0; i < N; i ++){
            int[] list = initiate(M);
            shuffle(list);

            for (int j = 0; j < M; j ++){
                int originalPosition = list[j];
                int afterPosition = j;

                shuffleMatrix[originalPosition][afterPosition] += 1;
            }
        }

        for (int i = 0; i < shuffleMatrix.length; i ++){
            StdOut.println(Arrays.toString(shuffleMatrix[i]));
        }
    }
    public static int[] initiate(int size){
        int[] a = new int[size];
        for (int i = 0; i < a.length; i ++){
             a[i] =  i;
        }
        return a;
    }
    public static void shuffle(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + StdRandom.uniform(N-i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
```

## 1.1.37

> Bad shuffling. Suppose that you choose a random integer between `0` and `N-1` in our shuffling code instead of one between i and `N-1`. Show that the resulting order is not equally likely to be one of the `N!` possibilities. Run the test of the previous exercise for this version.

```java
// Example
// Suppose int[] a = {1, 2, 3};
// Original algorithms will yield:
// {1, 2, 3}
// -> {1, 2, 3}
//		-> {1, 3, 2}
//		-> {1, 2, 3}
// -> {2, 1, 3}
//		-> {2, 3, 1}
//		-> {2, 1, 3}
// -> {3, 2, 1}
//		-> {3, 1, 2}
//		-> {3, 2, 1}
// Third step doesn't matter.
// The N! = 6 have equally occurance
// For the new algorithm.
// {1, 2, 3}
// -> {2, 1, 3}
//		-> {1, 2, 3}
//			-> {1, 2, 3} 1/27
//			-> {3, 2, 1} 1/27
//			-> {1, 3, 2} 1/27
//		-> {2, 3, 1}
//			-> {2, 1, 3} 1/27
//			-> {2, 3, 1} 1/27
//			-> {1, 3, 2} 1/27
//		-> {2, 1, 3}
//			-> {2, 1, 3} 1/27
//			-> {2, 3, 1} 1/27
//			-> {3, 1, 2} 1/27
// -> {1, 2, 3}
//		-> {2, 1, 3}
//			-> {2, 1, 3} 1/27
//			-> {2, 3, 1} 1/27
//			-> {3, 1, 2} 1/27
//		-> {1, 3, 2}
//			-> {1, 2, 3} 1/27
//			-> {1, 3, 2} 1/27
//			-> {2, 3, 1} 1/27
//		-> {1, 2, 3}
//			-> {1, 2, 3} 1/27
//			-> {3, 2, 1} 1/27
//			-> {1, 3, 2} 1/27
// -> {3, 2, 1}
//		-> {3, 2, 1}
//			-> {3, 1, 2} 1/27
//			-> {1, 2, 3} 1/27
//			-> {3, 2, 1} 1/27
//		-> {2, 3, 1}
//			-> {2, 1, 3} 1/27
//			-> {2, 3, 1} 1/27
//			-> {1, 3, 2} 1/27
//		-> {3, 1, 2}
//			-> {3, 1, 2} 1/27
//			-> {3, 2, 1} 1/27
//			-> {2, 1, 3} 1/27

// {1, 2, 3} 4/27
// {1, 3, 2} 5/27
// {2, 1, 3} 5/27
// {2, 3, 1} 5/27
// {3, 1, 2} 4/27
// {3, 2, 1} 4/27

// it's not equally likely !!!

// In the original result, all entries tends to close
// to N/M. However, in the modified version
// the result cannot converge to N/M, because of the 
// unequal distribution of the shuffle() function.
```

## 1.1.38

> Binary search versus brute-force search. Write a program `BruteForceSearch` that uses the brute-force search method given on page 48 and compare its running time on your computer with that of `BinarySearch` for `largeW.txt` and `largeT.txt`.

```java
import java.util.Arrays;
import java.util.Date;

public class BruteForceSearch {
    public static int indexOf(int[] whitelist, int key){
        for (int i = 0; i < whitelist.length; i ++){
            if (whitelist[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        // read the integers from a file
        long date = new Date().getTime();

        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        // sort the array
        Arrays.sort(allowlist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BruteForceSearch.indexOf(allowlist, key) == -1){
                //StdOut.println(key);
            }
        }
        long dateAfter = new Date().getTime();
        StdOut.print(dateAfter - date);
    }
}
```

It takes `10418 ms` for `BinarySearch`, but `1614778 ms` for `BruteForceSearch`. The difference is significant. (`1 : 155`)

## 1.1.39

> Random matches. Write a `BinarySearch` client that takes an int value `T` as command-line argument and runs `T` trials of the following experiment for `N = 103, 104, 105,` and `106`: generate two arrays of `N` randomly generated positive six-digit `int` values, and find the number of values that appear in both arrays. Print a table giving the average value of this quantity over the `T` trials for each value of `N`.

```java
import java.util.Arrays;
public class BinarySearchTest {
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static int[] generate(int size){
        int[] list = new int[size];

        for (int i = 0; i < list.length; i ++){
            list[i] = StdRandom.uniform(100000, 1000000);
        }
        
        return list;
    }
    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);

        int[] NList = {1000, 10000, 100000, 1000000};
        double[] averageList = new double[4];

        for (int i = 0; i < NList.length; i ++){
            int sum = 0;
            for (int j = 0; j < T; j ++){
                int[] whiteList = generate(NList[i]);

                Arrays.sort(whiteList);

                int[] testList = generate(NList[i]);

                for (int k = 0; k < testList.length; k ++){
                    if (indexOf(whiteList, testList[k]) != -1){
                        sum += 1;
                    }
                }
            }

            averageList[i] = (double) sum / (double) T;
        }

        for (int i = 0; i < averageList.length; i ++){
            StdOut.printf("N: %d, average: %.4f \n", NList[i], averageList[i]);
        }
    }
}
```

```javascript
// N: 1000, average: 1.2580
// N: 10000, average: 110.4960
// N: 100000, average: 10511.6380
// N: 1000000, average: 670760.0660
```





