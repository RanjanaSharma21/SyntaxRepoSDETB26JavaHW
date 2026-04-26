package org.example.week10.d5.e4;

import java.util.HashMap;
import java.util.Map;

public class E4Map {
    public static void main(String[] args) {


        // Initialize a `HashMap<Integer, String>` where the key represents the student ID, and the value represents the student name.
        // Step 2: Add the following student records to the HashMap:
        // Add `101 = "John"`, `102 = "Emily"`, `103 = "Michael"`, `104 = "Sarah"`, `105 = "David"`.
        // Step 3: Use the `keySet()` method to retrieve all the keys (student IDs) from the HashMap.
        // Use a loop to iterate through the keys of the HashMap and print each student ID in the format:"Student ID: [key]".
        // Step 4: Use the `values()` method to retrieve all the values (student names) from the HashMap.
        // Use a loop to iterate through the values of the HashMap and print each student name in the format:"Student Name: [value]".
        // Step 5: Use the `entrySet()` method** to retrieve both keys and values as `Map.Entry` objects from the HashMap.
        // Use a loop to iterate through both keys and values of the HashMap and print each student ID and name in the format:"Student ID: [key], Student Name: [value]".

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "John");
        map.put(102, "Emily");
        map.put(103, "Michael");
        map.put(104, "Sarah");
        map.put(105, "David");

        //for (HashMap.Entry<String, String> entry : map.entrySet()) {
        //    System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
        //}
        System.out.println("Student IDs:");
        for(Integer key : map.keySet()){
            //String value = map.get(key);
            System.out.println("Student ID: "+key);
        }

        System.out.println();
        System.out.println("Student Names:");
        for(String value : map.values()){
            System.out.println("Student Name: "+ value);
        }


        System.out.println();
        System.out.println("Student Records:");
        //for(Integer key : map.keySet()){
        //    String value = map.get(key);
        //    System.out.println("Student ID: "+key+", Student Name: " + value);
        //}

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }
      }
    }