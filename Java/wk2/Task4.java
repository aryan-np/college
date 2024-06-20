package wk2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of first person");
        int age1=sc.nextInt();
        System.out.println("Enter age of Second person");
        int age2=sc.nextInt();
        if (age1>age2){
            System.out.println("First Person is Older");
        }
        else {
            System.out.println("Second Person is Older");
        }

    }
}
