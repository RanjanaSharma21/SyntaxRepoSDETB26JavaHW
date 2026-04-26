package org.example.week10.d5.e1;

import java.util.LinkedHashMap;

public class E1Map {

    public static void main(String[] args) {

        // Step 1: Create a `E2Map` class with the following:
        // Initialize a LinkedHashMap<String, Double> to store product names as keys and their corresponding prices as values.
        // Step 2: Add the following product details to the LinkedHashMap:
        // Add "Laptop" = 1200.99, "Smartphone" = 799.99, "Tablet" = 499.99, "Smartwatch" = 199.99, "Headphones" = 149.99.
        // Step 3: Use a for-each loop to iterate through the entries of the LinkedHashMap and print both the product name and price one by one.
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();

        map.put("Laptop", 1200.99);
        map.put("Smartphone", 799.99);
        map.put("Tablet", 499.99);
        map.put("Smartwatch", 199.99);
        map.put("Headphones", 149.99);

        System.out.println("Product Catalog:");

        for (String key : map.keySet()) {
            Double value = map.get(key);
            System.out.printf("%s: $%.2f%n", key, value);
        }

    }



}
