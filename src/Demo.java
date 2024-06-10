public class Demo {
    public static void main(String[] args) {
//        tao cac doi tuong tu cac lop
        Animal animal1 = new Animal();
        Dog dog1 = new Dog("becgie","black");
        Dog dog2 = new Dog("pug","white");
        Cat cat = new Cat("Dora");
//        dung cac phuong thuc get/set truy cap va thay doi cac thuoc tinh
        System.out.println("Animal1 is name: " + animal1.getName());
        animal1.setName("bird");
        System.out.println("Animal1 is name: " + animal1.getName());

//truy cap phuong thuc ke thuw tu lop cha
        dog1.setName("corgi");
        System.out.println("name:" + dog1.getName());
        System.out.println("sound:" +dog1.makeSound());
        System.out.println("color:" + dog2.getColor());
        System.out.println("sound:" + dog2.makeSound());
        System.out.println("name:" + cat.getName());
        System.out.println("sound:" + cat.makeSound());
    }
}
