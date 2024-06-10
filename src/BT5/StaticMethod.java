package BT5;

public class StaticMethod {
    static  double pi = 3.14;
    static double R = 3.5;
    static double width = 2.6 ;
    static double height = 6 ;
    static double a = 3 ;
    static double b = 4 ;
    static double c = 5 ;



    public void calCircleArea(){
        System.out.println(pi*R*R);
    }
    public void calRectangleArea(){
        System.out.println(width*height);
    }
    public void calTriangleArea(){
        System.out.println(((a+b+c)/2)*Math.sqrt((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }
}
