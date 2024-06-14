package wk1;

import java.util.Scanner;

public class Task7 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Temperature in celcius:");
        double tempInCelcius=sc.nextInt();
        double tempInFarenheit=tempInCelcius*(9/5)+32;
        System.out.println("Farenheit:"+tempInFarenheit);
        sc.close();
    }
}
