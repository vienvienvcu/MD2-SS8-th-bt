package BT1;

public class Main {
    public static void main(String[] args) {
        System.out.println("test Circle");
        Circle circle = new Circle();
         circle = new Circle(3.2, "red");
        System.out.println(circle);
        System.out.println("dien tich hinh tron: " + circle.getAcreage());
        System.out.println("test Cylinder");
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3.2,"White",2);
        System.out.println("the tich hin tron: " + cylinder.getAcreage());
        cylinder.getVolume();
        System.out.println(cylinder);
    }
}
