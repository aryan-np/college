package wk6;

import java.util.Collections;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<>();
        color.add("Blue");
        color.add("Red");
        color.add("Purple");
        color.add("Green");
        color.add("White");

        System.out.println(color);

        if(color.contains("Red")){
            System.out.println("color exists");

        }

        Collections.shuffle(color);
        System.out.println(color);
        Collections.sort(color);
        System.out.println(color);
    }
}
