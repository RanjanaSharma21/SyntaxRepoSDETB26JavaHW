package org.example.week10.d1.e2;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args){

        // Step 1: Create a `E2ArrayList` class with the following:
        // Initialize an ArrayList<Integer> to store product IDs.
        // Add the following product IDs to the list: 1011, 1022, 1033, 1044, 1055, 1066.
        // Retrieve the 1st, 3rd, and 5th product IDs from the list and print them to verify the products during the inventory check.
        // Step 2: Print the values of the 1st, 3rd, and 5th products from the inventory list.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1011);
        list.add(1022);
        list.add(1033);
        list.add(1044);
        list.add(1055);
        list.add(1066);
        //System.out.println(list.get(0) + " " + list.get(2) + " " + list.get(4));
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        //System.out.println(list);
    }

}
