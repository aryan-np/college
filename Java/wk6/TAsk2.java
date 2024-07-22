package wk6;

import java.util.LinkedList;

public class TAsk2 {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        System.out.println("Empty "+number.isEmpty());
        number.addFirst(1);
        number.addLast(901);
        System.out.println("Empty "+number.isEmpty());
        System.out.println(number);
    }
}
