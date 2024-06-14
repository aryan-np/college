package wk1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String name, age, studentNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextLine();
        System.out.println("Enter Student Number");
        studentNum = sc.nextLine();
        System.out.println("Name: " + name + "\n Age:" + age + "\n Student Number:" + studentNum);
        sc.close();
    }
}