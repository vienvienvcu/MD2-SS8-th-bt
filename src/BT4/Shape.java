package BT4;

public class Shape {
    public String color = "red";

    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "mau cua hinh la : " + color;
    }
}
