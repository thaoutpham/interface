package KeThua;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, Boolean filled) {
    }

    public void setRadius(Double radius){
       this.radius=radius ;
    }
    public Double getRadius(){
        return radius;
    }
    public double getArea(double radius){
        return 3.14*radius*radius;
    }
    public double getPerimeter(double radius){
        return radius*3.14;
    }
    public String toString(){
        return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy";
    }
}
