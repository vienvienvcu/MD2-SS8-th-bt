package TH3;



public class Motorcycle extends Vehicle{
    public Motorcycle() {
    }

    public Motorcycle(String brand, String color) {
        super(brand, color);
    }
    @Override
    public String toString() {
        return "Motorcycle{" + "Brand=" + getBrand() + ", Color=" + getColor() + '}';
    }
}
