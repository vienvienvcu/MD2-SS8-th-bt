package TH6;

import TH2.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Vin Fast","VF6");
        System.out.println(TH6.Car.numberOfCars);
        Car car2 = new Car("Vin Fast","VF6");
        System.out.println(TH6.Car.numberOfCars);
    }
}
