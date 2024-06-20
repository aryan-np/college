package wk2;

import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.SortedMap;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade");
        double grade = sc.nextDouble();
        if (grade>90){
            System.out.println("A+");
        }
       else if (grade>80){
            System.out.println("A");

        }
       else if (grade>70){
            System.out.println("B+");

        }
       else if (grade>60){
            System.out.println("B");
        }
       else if (grade>50){
            System.out.println("C+");
        }
       else if (grade>40){
            System.out.println("C");
        }
       else {
            System.out.println("Fail");
        }
    }
}
