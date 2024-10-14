package Chapter_1_2;
import edu.princeton.cs.algs4.*;

public class Question1{
    public static void main(String[] args) {
        System.out.println("Please enter the number of points you want to generate");
        int N = StdIn.readInt();

        Point2D[] pointList = new Point2D[N];

        for (int i = 0; i < N; i ++){
            pointList[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
        }

        double min = Double.MAX_VALUE;

        for (int i = 0; i < N; i ++){
            for (int j = i + 1; j < N; j ++){
                double distance = pointList[i].distanceTo(pointList[j]);
                
                min = Math.min(distance, min);
            }
        }

        System.out.println("The points are:");

        for (int i = 0; i < N; i ++){
            System.out.printf("(%f, %f) \n", pointList[i].x(), pointList[i].y());
        }

        System.out.printf("The minimum value between %d randomly generated points are %f", N, min);
    }
}