package TH3;

import TH2.Car;
import TH2.Motorcycle;

public class Main {
    public static void main(String[] args) {
//        khoi tao cac doi tuong lop con
        TH2.Car car1 = new TH2.Car("toyota", "black");
        TH2.Car car2 = new Car("ford", "white");
//        truy cap cac phuong thuc cua lop cha get set
        System.out.println("car1 is brand: " + car1.getBrand());
        car1.setColor("yellow");//thiet lap gia tri cho thuoc tinh color
//        hien thi thong tin cua xe oto
        System.out.println(car1.toString());
        System.out.println(car2.toString());
//
        TH2.Motorcycle motorcycle1 = new TH2.Motorcycle("honda", "red-black");
        TH2.Motorcycle motorcycle2 = new Motorcycle("vinfast", "blue");
//hien thi thong tin xe may
        System.out.println(motorcycle1.toString());
        System.out.println(motorcycle2.toString());
    }

    }
