package wk1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        double length = sc.nextDouble();
        double area = length * length;
        System.out.println("Area is" + area);
        sc.close();
    }
}
