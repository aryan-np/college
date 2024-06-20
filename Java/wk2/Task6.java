package wk2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num%2==0)
            System.out.println("It is even");
        else
            System.out.println("It is odd");
    }
}
