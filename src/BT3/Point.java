package BT3;

public class Point {
    private float x;
    private float y;
    public Point(){

    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
        float [] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
