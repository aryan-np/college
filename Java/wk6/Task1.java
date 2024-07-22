package wk6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> examinee = new ArrayList<>();
        examinee.add("Rojan");
        examinee.add("Aryan");
        examinee.add("Sansar");
        examinee.add("Suril");
        examinee.add("Arjun");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student who withdrew:");
        String name = sc.nextLine();
        examinee.remove(name);
        System.out.println(examinee);
    }
}
