package wk1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of Sphere");
        int height=sc.nextInt();
        System.out.println("Enter radius of Sphere");
        int radius=sc.nextInt();
        float pi=22f/7;
        float volume= pi*radius*radius*height;
        System.out.println("Volume is:"+volume);

    }
}
