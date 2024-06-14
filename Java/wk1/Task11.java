package wk1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println("The equivalent distance in kilometers is: " + kilometers);
        scanner.close();
    }
}
