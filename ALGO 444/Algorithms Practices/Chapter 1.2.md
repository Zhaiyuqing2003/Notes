# 1.2 Practices

## 1.2.1

>Write a `Point2D` client that takes an integer value `N` from the command line, generates `N` random points in the unit square, and computes the distance separating the closest pair of points.

```java
public class PointDistance {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] pointList = new Point2D[N];

        StdDraw.setPenRadius(0.008);

        for (int i = 0; i < pointList.length; i ++){
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            pointList[i] = new Point2D(x, y);
        }

        for (int i = 0; i < pointList.length; i ++){
            pointList[i].draw();
        }

        double min = Double.POSITIVE_INFINITY;
        int[] minIndex = {0, 1};

        for (int i = 0; i < pointList.length - 1; i ++){
            for (int j = i + 1; j < pointList.length; j ++){
                Point2D pointA = pointList[i];
                Point2D pointB = pointList[j];
                double distance = pointA.distanceTo(pointB);
                if (distance < min){
                    min = distance;
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }

        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(StdDraw.RED);

        pointList[minIndex[0]].drawTo(pointList[minIndex[1]]);
        
        StdOut.printf("The minimum distance is %.3f", min);
    }
}
```

## 1.2.2

Write an `Interval1D` client that takes an int value `N` as command-line argument, reads `N` intervals (each defined by a pair of `double` values) from standard input, and prints all pairs that intersect.

```java
public class IntervalIntersect {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        In in = new In();

        double[] intervalData = in.readAllDoubles();
        Interval1D[] intervalList = new Interval1D[N];

        if (intervalData.length / 2 < N){
            throw new IllegalArgumentException("Must provide sufficient pairs of double values");
        }

        for (int i = 0; i < intervalList.length; i ++){
            double min = intervalData[i * 2];
            double max = intervalData[i * 2 + 1];
            intervalList[i] = new Interval1D(min, max);
        }

        for (int i = 0; i < intervalList.length - 1; i ++){
            for (int j = i + 1; j < intervalList.length; j ++){
                Interval1D intervalA = intervalList[i];
                Interval1D intervalB = intervalList[j];

                if (intervalA.intersects(intervalB)){
                    StdOut.println("These two intervals intersect: " + intervalA + " " + intervalB);
                }
            }
        }
    }
}
```

 ## 1.2.3

>Write an `Interval2D` client that takes command-line arguments `N`, `min`, and `max` and generates `N` random `2D` intervals whose `width` and `height` are uniformly distributed between `min` and `max` in the unit square. Draw them on `StdDraw` and print the number of pairs of intervals that intersect and the number of intervals that are contained in one another.

```java
public class Interval2DIntersect{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        Interval2D[] intervalList = new Interval2D[N];
        Interval1D[] intervalXList = new Interval1D[N];
        Interval1D[] intervalYList = new Interval1D[N];

        for (int i = 0; i < intervalList.length; i ++){
            double width = StdRandom.uniform(min, max);
            double height = StdRandom.uniform(min, max);
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);

            Interval1D xInterval = new Interval1D(x, x + width);
            Interval1D yInterval = new Interval1D(y, y + height);

            intervalXList[i] = xInterval;
            intervalYList[i] = yInterval;

            intervalList[i] = new Interval2D(xInterval, yInterval);
        }

        for (int i = 0; i < intervalList.length; i ++){
            intervalList[i].draw();
        }

        int intersectCount = 0;
        int containCount = 0;

        for (int i = 0; i < intervalList.length - 1; i ++){
            for (int j = i + 1; j < intervalList.length; j ++){
                Interval2D intervalA = intervalList[i];
                Interval2D intervalB = intervalList[j];

                if (intervalA.intersects(intervalB)){
                    intersectCount += 1;
                }
            }
        }

        for (int i = 0; i < intervalList.length; i ++){
            for (int j = 0; j < intervalList.length; j ++){
                if (i == j){ continue; }

                Interval1D intervalAX = intervalXList[i];
                Interval1D intervalAY = intervalYList[i];

                Interval1D intervalBX = intervalXList[j];
                Interval1D intervalBY = intervalYList[j];

                if (intervalAX.min() <= intervalBX.min() &&
                    intervalAX.max() >= intervalBX.max() &&
                    intervalAY.min() <= intervalBY.min() &&
                    intervalAY.max() >= intervalBY.max()){
                    containCount += 1;
                }
            }
        }

        StdOut.printf("There are %d interval2D intersect \n", intersectCount);
        StdOut.printf("There are %d interval2D being contained \n", containCount);
    }
}
```

## 1.2.4

>What does the following code fragment print?
>
>```java
>String string1 = "hello"; 
>String string2 = string1; 
>string1 = "world"; 
>StdOut.println(string1); 
>StdOut.println(string2);
>```

```java
"world"
"hello"
```

## 1.2.5

>What does the following code fragment print?
>
>```java
>String s = "Hello World";
>s.toUpperCase();
>s.substring(6, 11);
>StdOut.println(s);
>```

```java
"Hello World"
```

## 1.2.6

>A `String s` is a circular rotation of a  `String t` if it matches when the characters are circularly shifted by any number of positions; for example, `"ACTGACG"` is a circular shift of `"TGACGAC"`, and vice versa. Detecting this condition is important in the study of genomic sequences. Write a program that checks whether two given `s` and `t` are circular shifts of one another. Hint : The solution is a one-liner with `indexOf()`, `length()`, and string concatenation.

```java
public class CircularRotation {
    public static void main(String[] args) {
        String a = "ACTGACG";
        String b = "TGACGAC";

        StdOut.println(CircularRotation.isCircularShift(a, b));
    }
    public static boolean isCircularShift(String a, String b) {
        if (a.length() == b.length()){
            return ((b + b).indexOf(a) != -1);
        } else {
            return false;
        }
    }
}
```

## 1.2.7

>What does the following recursive function return?
>
>```java
>public static String mystery(String s) {
>	int N = s.length(); 
>    if (N <= 1) return s;
>	String a = s.substring(0, N/2); 
>    String b = s.substring(N/2, N); 
>    return mystery(b) + mystery(a);
>}
>```

## 1.2.8

>Suppose that `a[]` and `b[]` are each integer arrays consisting of millions of integers. What does the follow code do? Is it reasonably efficient? 
>
>```java
>int[] t = a; a = b; b = t;
>```

Yes, it's. Because it swaps the **reference** of two list.

## 1.2.9

>Instrument `BinarySearch` (page 47) to use a `Counter` to count the total number of keys examined during all searches and then print the total after all searches are complete. Hint : Create a `Counter` in `main()` and pass it as an argument to `rank()`.

Just add a `Counter` in the `indexOf()` (previously `rank()`) function. 

```java
public static int indexOf(int[] a, int key, Counter counter) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
        // Key is in a[lo..hi] or not present.
        int mid = lo + (hi - lo) / 2;
        counter.increment();
        if      (key < a[mid]) hi = mid - 1;
        else if (key > a[mid]) lo = mid + 1;
        else return mid;
    }
    return -1;
}

// The java BinarySearch largeW.txt < largeT.txt 
// result in 185 079 715 key examined.
```

## 1.2.10

>Develop a class `VisualCounter` that allows both increment and decrement operations. Take two arguments `N` and `max` in the constructor, where `N` specifies the maximum number of operations and `max` specifies the maximum absolute value for the counter. As a side effect, create a plot showing the value of the counter each time its tally changes.

```java
public class VisualCounter {
    private final int MAX_OPERATIONS;
    private final double MAX_VALUE;
    private final double MIN_VALUE;
    private final Draw draw;

    private int currentOperation;
    private double currentValue;

    public VisualCounter(int N, double min, double max){
        this.MAX_OPERATIONS = N;
        this.MAX_VALUE = max;
        this.MIN_VALUE = min;
        this.draw = new Draw();

        this.draw.setXscale(0.0, this.MAX_OPERATIONS);
        this.draw.setYscale(this.MIN_VALUE, this.MAX_VALUE);

        this.draw.setPenColor(Draw.BLUE);
        this.draw.point(0.0, 0.0);

        this.currentOperation = 0;
        this.currentValue = 0.0;
    }

    public void increment(){
        this.changeValue(1.0);
    }

    public void decrement(){
        this.changeValue(-1.0);
    }

    public void changeValue(double delta){
        if (this.currentValue + delta > this.MAX_VALUE ||
            this.currentValue + delta < this.MIN_VALUE){
            throw new IllegalArgumentException("Value out of bound");
        } else if (this.currentOperation == this.MAX_OPERATIONS){
            throw new IllegalStateException("Number of operations exceed maximum operations");
        } else {
            this.currentValue += delta;
            this.currentOperation += 1;

            this.draw.setPenColor(Draw.BLUE);
            this.draw.point((double) this.currentOperation, this.currentValue);

            this.draw.setPenColor(Draw.GREEN);
            this.draw.point((double) this.currentOperation, delta);

            this.draw.setPenColor(Draw.RED);
            this.draw.point((double) this.currentOperation, this.currentValue / (double) this.currentOperation);
        }
    }

    public static void main(String[] args) {
        VisualCounter test = new VisualCounter(1000, -1000.0, 1000.0);
        VisualCounter testB = new VisualCounter(200, 0.0, 1000.0);

        for (int i = 0; i < 1000; i ++){
            double randomDelta = StdRandom.uniform(-10.0, 10.0);
            test.changeValue(randomDelta);
        }

        for (int i = 0; i < 100; i ++){
            testB.increment();
        }
        for (int i = 0; i < 100; i ++){
            if (i % 5 == 0){
                testB.decrement();
            } else {
                testB.increment();
            }
        }
    }
}
```

## 1.2.11
