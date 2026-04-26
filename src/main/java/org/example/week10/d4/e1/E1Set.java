package org.example.week10.d4.e1;

import java.util.HashSet;

public class E1Set {
    public static void main(String[] args) {

        // Step 1: Create a `E1Set` class with the following:
        // Initialize an HashSet<Integer> to store customer IDs for a retail order system.
        // Step 2: Customers with the following IDs have placed orders: 1001, 1002, 1001, 1003, 1002, 1004.
        // Step 3: Print Each Unique Customer ID.Iterate through the HashSet using a for-each loop and print each unique ID.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1004);
        hashSet.add(1002);
        hashSet.add(1001);
        hashSet.add(1003);
        hashSet.add(1002);
        hashSet.add(1001);
        for (Integer id : hashSet) {
            System.out.println(id);
        }
    }
}

