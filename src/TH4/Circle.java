package TH4;

public class Circle extends Shape {
    private double radius =1.0;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
//        dien tich
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
//        chu vi
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "a circle with radius " + getRadius()
                +", which is a subclass of "
                +super.toString();

    }
}
