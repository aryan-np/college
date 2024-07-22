package wk6;

import java.util.HashSet;
import java.util.Set;

public class TAsk9 {
    public static void main(String[] args) {
            Set<String> set1 = new HashSet<>();
            set1.add("Dog");
            set1.add("Cat");
            set1.add("Elephant");
            set1.add("Lion");

            Set<String> set2 = new HashSet<>();
            set2.add("Cat");
            set2.add("Giraffe");
            set2.add("Dog");
            set2.add("Monkey");

            // Print original sets
            System.out.println("Set 1: " + set1);
            System.out.println("Set 2: " + set2);

            // Perform Union
            Set<String> union = new HashSet<>(set1);
            union.addAll(set2);
            System.out.println("Union: " + union);

            // Perform Intersection
            Set<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);
            System.out.println("Intersection: " + intersection);

            // Perform Difference (Set1 - Set2)
            Set<String> difference = new HashSet<>(set1);
            difference.removeAll(set2);
            System.out.println("Difference (Set1 - Set2): " + difference);
        }
    }
