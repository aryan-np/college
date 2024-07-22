package wk6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num);
        System.out.println("Enter number of shift");
        int shift = sc.nextInt();
        System.out.println();
        Collections.rotate(num,shift);
        System.out.println(num);


    }
}
