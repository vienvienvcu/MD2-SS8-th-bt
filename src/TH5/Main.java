package TH5;

public class Main {
    public static void main(String[] args) {
//        truy cap thuoc tinh,phuong thuc ko can khoi tao doi tuong
        System.out.println("ten: " + StaticMethod.name);
        System.out.println("age: " + StaticMethod.age);
        StaticMethod.showInfo();
//        khoi tao doi tuong
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("ten: " + staticMethod.name);
        System.out.println("age: " + staticMethod.age);
        staticMethod.showInfo();
    }
}
