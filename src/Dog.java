public class Dog extends Animal {
    private String color;
    public Dog() {

    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String makeSound() {
        return "gau gau";
    }


}
