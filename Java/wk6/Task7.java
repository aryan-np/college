package wk6;

import java.util.LinkedList;
import java.util.Queue;

public class Task7 {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");
        System.out.println("Current print queue: " + printQueue);
        String removedJob = printQueue.poll();
        System.out.println("Dequeued print job: " + removedJob);
        printQueue.add("Document4");
        printQueue.add("Document5");
        String nextJob = printQueue.peek();
        System.out.println("Next print job: " + nextJob);
        System.out.println("Updated print queue: " + printQueue);
    }
}
