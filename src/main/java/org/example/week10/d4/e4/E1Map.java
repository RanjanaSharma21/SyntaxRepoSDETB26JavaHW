package org.example.week10.d4.e4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class E1Map {
    public static void main(String[] args) {

        /*
         * 1. Initialize a LinkedHashMap<String, String> called addressMap.
         *
         * 2. Add the following entries using put():
         *    - "Street" -> "Patrick ST"
         *    - "Suite" -> "265"
         *    - "City" -> "Vienna"
         *    - "Zip" -> "22180"
         *    - "Country" -> "United States"
         *
         * 3. Print the size of the map using addressMap.size().
         *
         * 4. Check if the map is empty using addressMap.isEmpty() and print the result.
         *
         * 5. Retrieve the value for the key "City" using addressMap.get("City") and print it.
         *
         * 6. Clear the map using addressMap.clear().
         *
         * 7. Check if the map is empty after clearing and print the result.
         *
         * Expected output:
         * Size: 5
         * Is map empty? false
         * City: Vienna
         * After clearing, is map empty? true
         */
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United States");

        System.out.println("Size: "+map.size());
        //System.out.println("Key: "+map.get("Street"));
        //System.out.println("Value: "+map.get("Suite"));
        //System.out.println("Key: "+map.get("City"));
        //System.out.println("Value: "+map.get("Zip"));
        //System.out.println("Key: "+map.get("Country"));

        System.out.println("Is map empty? " + map.isEmpty());
        System.out.println("City: " + map.get("City"));
        map.clear();
        System.out.println("After clearing, is map empty? " + map.isEmpty());
        }
    }
