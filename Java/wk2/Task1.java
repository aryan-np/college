package wk2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:");
        int length=sc.nextInt();
        System.out.print("Enter Breadth:");
        int breadth=sc.nextInt();
        if (length==breadth){
            System.out.println("It is a square");
        }
        else {
            System.out.println("It is not a square");
        }
        sc.close();
    }
}
