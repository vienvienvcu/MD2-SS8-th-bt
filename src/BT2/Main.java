package BT2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Viết mã triển khai và mã kiểm thử cho lớp Point2D");
        Point2D point1 = new Point2D();
        point1 = new Point2D(2 ,2);
        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println("Viết mã triển khai và mã kiểm thử cho lớp Point3D");
        Point3D point2 = new Point3D();
        point2 = new Point3D(2.8f,2.6f,3f);
        System.out.println(Arrays.toString(point2.getXYZ()));

    }
}
