package wk1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a");
        int a = sc.nextInt();
        System.out.println("Enter side b");
        int b = sc.nextInt();
        System.out.println("Enter side c");
        int c = sc.nextInt();
        float s = (a + b + c) / 2;
        float area = (float) Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        System.out.println(area);
        sc.close();
    }
}
