package wk6;

import java.util.ArrayList;
import java.util.Collections;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Mango");
        strings.add("Banana");
        System.out.println("Original " + strings);
        Collections.sort(strings);
        System.out.println("Sorted " + strings);
        Collections.sort(strings, Collections.reverseOrder());
        System.out.println("reverse order: " + strings);
    }
}



