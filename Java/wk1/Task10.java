package wk1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division =  num1 / num2 ;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        scanner.close();
    }
}
