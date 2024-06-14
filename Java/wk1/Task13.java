package wk1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Price of item");
        double price=sc.nextDouble();
        System.out.println("Enter Quantity of item");
        int quantity=sc.nextInt();
        double totalCost=price*quantity;
        System.out.println("Total cost is :"+totalCost);
    }
}
