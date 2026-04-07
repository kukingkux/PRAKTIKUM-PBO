package Modul3;



public class Circle {
    public static final double PI = 3.14;

    public double r;

    public double area() {
        return PI * r * r;
    }

    void getR() {
        System.out.println(r);
    }
}
