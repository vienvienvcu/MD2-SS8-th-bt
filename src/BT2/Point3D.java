package BT2;

public class Point3D {
    public float x;
    public float y;
    public float z;
    public Point3D() {

    }
    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void getXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float [] getXYZ(){
        float [] array = new float[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public String toString() {
        return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
