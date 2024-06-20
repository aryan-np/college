package wk2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num if rows");
        int tn=sc.nextInt();
        for (int i = 0; i <tn ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
