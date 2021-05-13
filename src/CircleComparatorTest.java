import KeThua.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest extends Circle {
    public CircleComparatorTest(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle("blue",true,5);
        circles[1] = new Circle("while",true,8);
        circles[2] = new Circle("red", true, 5);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator("red",true,10);
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
