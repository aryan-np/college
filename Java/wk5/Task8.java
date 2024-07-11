package wk5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        if (Pattern.matches("[a-zA-Z0-9]+.java",str)){
            System.out.println("VAlid");
        }
        else System.out.println("Not Valid");
    }
}
