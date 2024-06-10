package BT4;

public class Triangle extends Shape{
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double  getArea() {
        return
                (getPerimeter()/2)*Math.sqrt((getPerimeter()/2)*((getPerimeter()/2)-side1)*((getPerimeter()/2)-side2)*((getPerimeter()/2)-side3));
    }
    public double getPerimeter() {
        return (side1+side2+side3);
    }

    public String toString(){
        return "mau cua hinh la : "+ super.toString() + " " +"dien tich hinh tam giac: " + getArea() +"chu vi hinh tam giac: "+ getPerimeter();
    }

}
