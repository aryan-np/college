package wk6;

import java.util.Arrays;
import java.util.Collections;

public class Task12 {
        public static void main(String[] args) {
            Integer[] numbers = {5, 3, 8, 1, 2, 7, 4, 6};
            Arrays.sort(numbers);
            System.out.println("ascending  " + Arrays.toString(numbers));
            Arrays.sort(numbers, Collections.reverseOrder());
            System.out.println("reverse  " + Arrays.toString(numbers));
        }

}
