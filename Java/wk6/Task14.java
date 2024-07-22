package wk6;

import java.util.ArrayList;
import java.util.Collections;
public class Task14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);
        Collections.sort(numbers);
        int toSearch = 7;
        int left = 0;
        int right = numbers.size() - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers.get(mid) == toSearch) {
                index = mid;
                break;
            }
            if (numbers.get(mid) < toSearch) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index != -1) {
            System.out.println("Element " + toSearch + " found at index " + index);
        } else {
            System.out.println("Element " + toSearch + " not found in the list");
        }
    }
}
