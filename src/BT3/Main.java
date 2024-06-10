package BT3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(2.3f,2.5f);
        System.out.println(point);
        System.out.println("Viết mã triển khai và kiểm thử cho lớp MovablePoint");
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint = new MoveablePoint(2.4f,2.5f,-1,2);
        System.out.println(moveablePoint);
        System.out.println("Before: " + moveablePoint);
        moveablePoint.move();
        System.out.println("after: " + moveablePoint);
    }
}
