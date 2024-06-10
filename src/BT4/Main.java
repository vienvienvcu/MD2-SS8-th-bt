package BT4;

import TH4.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        shape = new Shape("yellow");
        System.out.println(shape);
        System.out.println(shape.toString());
        System.out.println("Viết mã triển khai và mã kiểm thử cho lớp Triangle ");
        Triangle triangle = new Triangle();
        System.out.println("nhap vao canh ben trai");
        String side1 = scanner.nextLine();
        System.out.println("nhap vao canh ben phai");
        String side2 = scanner.nextLine();
        System.out.println("nhap vao canh day");
        String side3 = scanner.nextLine();
        System.out.println(triangle.toString());

    }
}
