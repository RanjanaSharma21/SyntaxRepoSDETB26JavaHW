package org.example.week10.d5.e5;


//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Arrays;
import java.util.*;

public class E5Map {

    public static void main(String[] args) {

        // Heads Up This is a little bit tricky
        // Initialize a HashMap<String, List> where the key represents the Subject and the value List of Students.
        // Add the following Students Grouped by Subject into HashMap:
        // Add "Mathematics" = ["Alice", "Bob"], "Science" = ["Charlie", "David"], "History" = ["Eve", "Frank"].
        // Print the contents of each map using a loop, and observe how the data is organized into lists for each key.
        // Use a for-each loop to iterate through the entries of the TreeMap and print each key-value pair in the format:Subject: [key] Students: [value].


        /*
        // Using Arrays.asList (Compatible with older Java versions)
        map.put("Mathematics", Arrays.asList("Alice", "Bob"));

        // Using List.of (Java 9+, creates an unmodifiable list)
        map.put("Mathematics", List.of("Alice", "Bob"));

        Arrays.asList(): Returns a fixed-size list (you can change elements, but not add/remove them).
        List.of(): Returns a completely immutable list (cannot change elements at all).
        new ArrayList<>(): If you need to add more names later, use:

        map.put("Mathematics", new ArrayList<>(Arrays.asList("Alice", "Bob")));

        */

        //HashMap<String, List<String>> map = new HashMap<>();

        // Using above code to create a new object of type HashMap, the order of the output scrambled.
        // To get the same output as it entered, use LinkedHashMap type, like below.


        Map<String, List<String>> map = new LinkedHashMap<>();

        map.put("Mathematics", List.of("Alice", "Bob"));

        //OR
        map.put("Science", Arrays.asList("Charlie", "David"));
        map.put("History", Arrays.asList("Eve", "Frank"));

        System.out.println("From Map (Students by Subject):");

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + " Students: " + entry.getValue());
        }
    }
    }
