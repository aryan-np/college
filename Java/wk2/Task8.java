package wk2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks in Physics:");
        double mark1=sc.nextDouble();
        System.out.print("Enter your Marks in Chemistry:");
        double mark2=sc.nextDouble();
        System.out.print("Enter your Marks in Biology:");
        double mark3=sc.nextDouble();
        System.out.print("Enter your Marks in Math:");
        double mark4=sc.nextDouble();
        System.out.print("Enter your Marks in Computer:");
        double mark5=sc.nextDouble();

        double totalSecuredMarks= mark1+mark2+mark3+mark4+mark5;
        int totalMarks=500;
        double percentage=(totalSecuredMarks/totalMarks)*100;
        System.out.println("You secured"+percentage);
        if (percentage>=90){
            System.out.println("A");
        }
        else if (percentage>=80){
            System.out.println("B");

        }
        else if (percentage>=70){
            System.out.println("C");

        }
        else if (percentage>=60){
            System.out.println("D");
        }
        else if (percentage>=40){
            System.out.println("E");
        }
        else {
            System.out.println("Fail");
        }

    }
}
