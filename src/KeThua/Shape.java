package KeThua;

class Shape {
    String color;
    Boolean filled;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){

    }

    public void phuongThuc() {
        String color = "reed";
        boolean filled = true;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + color + " and " + filled;
    }

    public static void main(String[] args) {
        Shape a=new Shape();
        System.out.println(a);
        Shape b=new Shape("red",true);
        System.out.println(b);
        Shape c=new Shape("blue",true);
        System.out.println(c.toString());
    }
}
