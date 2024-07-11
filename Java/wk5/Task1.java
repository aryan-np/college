package wk5;

import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Quadrilateral extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    void calculateArea() {
        System.out.println("Enter Base");
        int base = sc.nextInt();
        System.out.println("Enter Height");
        int heigth = sc.nextInt();
        System.out.println("Area: "+base*heigth);
    }
    @Override
    void calculatePerimeter(){
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Enter d");
        int d = sc.nextInt();
        System.out.println("Perimeter:"+(a+b+c+d));
    }

}
public class Task1 {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral();
        quadrilateral.calculateArea();
        quadrilateral.calculatePerimeter();
    }
}
