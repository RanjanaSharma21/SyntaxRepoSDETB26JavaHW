package org.example.week10.d4.e2;

import java.util.TreeSet;

public class E2Set {

    public static void main(String[] args) {

        // Step 1: Create a `E2Set` class with the following:
        // Initialize a `TreeSet<String>` to store country names, which will automatically sort the names in ascending order.
        // Step 2: Add the following country names to the TreeSet:
        // Add `"India"`, `"Australia"`, `"South Africa"`, `"India"`, `"America"`, and `"America"`.
        // Step 3: Print the country names in the `TreeSet`. Verify that the set is automatically sorted and duplicates are removed.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Australia");
        treeSet.add("India");
        treeSet.add("South Africa");
        treeSet.add("America");
        treeSet.add("India");
        treeSet.add("America");
        System.out.println(treeSet);
    }

}
