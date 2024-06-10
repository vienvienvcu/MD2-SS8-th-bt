package BT1;

public class Circle {
    private double radius;
    private String color;


    public Circle(){

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAcreage(){
           return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "radius: " + radius + ", color: " + color;
    }

}
