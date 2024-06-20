package wk2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have any medical complication?(y/n)");
        String ans=sc.next();
        if (ans.equals("y")){
            System.out.println("you will not be able to sit in exam");
        }
        else {
            System.out.println("You will be able to sit in exam");
        }

    }
}
