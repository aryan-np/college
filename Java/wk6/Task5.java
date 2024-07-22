package wk6;

import java.util.Stack;

public class Task5 {
    public static void main(String[] args) {
        Stack<String> task  = new Stack<>();
        task.push("Read");
        task.push("Write");
        task.push("Code");

        task.pop();
        task.push("Debug");
        task.push("Test");
        System.out.println(task.peek());
        System.out.println(task);

    }
}
