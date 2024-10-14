# Chapter 1.2

## New Libraries

```java
public class Point2D{
    public Point2D(double x, double y);
   	public double x();
    public double y();
    public double r();
    public double theta();
    public double distanceTo(Point2D that);
    public void draw();
    public void drawTo(Point2D that);
}
```

```java
public class In{
    public In();
    public In(String dir);
}
```

```java
public class StdDraw{
    public void SetPenRadius(double r);
    public void SetPenColor(Color color);
    public static RED = Color.RED;
    //...
}
```

```java
public class Interval1D{
    public Interval1D(double min, double max);
}
```

```java
public class Exceptions{
    public Exceptions(String errorInfo);
}
```

