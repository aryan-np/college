package wk1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length=sc.nextInt();
        System.out.println("Enter Length:");
        int breadth=sc.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter is "+perimeter);
        sc.close();
    }
}
