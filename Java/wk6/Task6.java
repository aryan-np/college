package wk6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        String str = "Hello World";
        List<String> words= Arrays.asList(str.split(" "));
        Stack<String> word = new Stack<>();
        word.addAll(words);
        Collections.reverse(word);
        System.out.println(word);
    }
}
