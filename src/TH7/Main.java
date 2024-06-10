package TH7;

public class Main {
    public static void main(String[] args) {
        Student.change();
//        creating objects
        Student s1 = new Student(111,"chinh");
        Student s2 = new Student(222,"Toan");
        Student s3 = new Student(333,"Dung");
        s1.display();
        s2.display();
        s3.display();
    }
}
