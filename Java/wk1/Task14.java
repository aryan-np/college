package wk1;

import java.util.Scanner;

public class Task14 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the amount in U.S. dollars: ");
            double amount = scanner.nextDouble();

            System.out.println("Enter the exchange rate: ");
            double exchangeRate = scanner.nextDouble();

            double convertedAmount = amount* exchangeRate;

            System.out.println("The converted amount is: " + convertedAmount);

            scanner.close();
        }
    }
