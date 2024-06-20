package wk2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        int i=0;
        int sum=0;
        while (i<=n){
            if (i%2==0) {
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum is "+ sum);
    }
}
