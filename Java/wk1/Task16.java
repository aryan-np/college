package wk1;

public class Task16 {
    public static void main(String[] args) {
        boolean expr1=(5>3);
        boolean expr2=8>5;
        System.out.println(expr1&&expr2);
        boolean expr3=(5>3);
        boolean expr4=2>5;
        System.out.println(expr3||expr4);
        boolean expr5=(!(5==10));
        System.out.println(expr5);
    }
}
