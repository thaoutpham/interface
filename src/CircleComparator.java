import KeThua.Circle;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {

    public CircleComparator(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
