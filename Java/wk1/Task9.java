package wk1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double timePeriod = scanner.nextDouble();
        double interest = (principal * rateOfInterest * timePeriod) / 100;
        System.out.println("The simple interest amount is: " + interest);
        scanner.close();
    }
}
