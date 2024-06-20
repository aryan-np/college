package wk2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("It is even");
            if (num%4==0)
                System.out.println("Number is also Divisible by 4");
            else
                System.out.println("But is not divisible by 4");
        }
        else {
            System.out.println("It is odd");
            if (num%7==0)
                System.out.println("Number is also Divisible by 7");
            else  System.out.println("But is not divisible by 7");

        }
    }
}
