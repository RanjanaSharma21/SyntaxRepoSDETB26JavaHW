package org.example.week10.d5.e2;


import java.util.HashMap;

public class E2Map {

    public static void main(String[] args) {

        // Step 1: Create a `E2Map` class with the following:
        // Initialize a `HashMap<Integer, String>` where the key represents the unique book ID and the value represents the book title.
        // Step 2: Add the following books as key-value pairs to the HashMap:
        // Add `101 = "The Catcher in the Rye"`, `102 = "To Kill a Mockingbird"`, `103 = "1984"`, `104 = "The Great Gatsby"`, `105 = "Moby Dick"`.
        // Step 3: Use the following methods** to manage and query the library catalog:
        // `size()`: Print the number of books currently in the catalog.
        // `isEmpty()`: Check if the catalog is empty and print the result.
        // `containsKey(102)`: Check if the book with ID `102` (To Kill a Mockingbird) is available in the catalog.
        // `containsValue("1984")`: Check if the book titled `"1984"` is available in the catalog.
        // `remove(105)`: Remove the book with ID `105` (Moby Dick) from the catalog and print the updated catalog.
        // `clear()`: Clear the entire catalog and check if it’s empty using `isEmpty()`.

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "The Catcher in the Rye");
        map.put(102, "To Kill a Mockingbird");
        map.put(103, "1984");
        map.put(104, "The Great Gatsby");
        map.put(105, "Moby Dick");

        System.out.println("Initial number of books in catalog: " + map.size());
        System.out.println("Is the catalog empty? " + map.isEmpty());
        System.out.println("Is book with ID 102 available? " + map.containsKey(102));
        System.out.println("Is the book \"1984\" available? " + map.containsValue("1984"));
        map.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        //System.out.println(map.keySet());
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
        map.clear();
        System.out.println("Is the catalog empty after clearing? " + map.isEmpty());


        /*
        1. **Use the following methods** to manage and query the library catalog:

    - `size()`: Print the number of books currently in the catalog.
    - `isEmpty()`: Check if the catalog is empty and print the result.
    - `containsKey(102)`: Check if the book with ID `102` (To Kill a Mockingbird) is available in the catalog.
    - `containsValue("1984")`: Check if the book titled `"1984"` is available in the catalog.
    - `remove(105)`: Remove the book with ID `105` (Moby Dick) from the catalog and print the updated catalog.
    - `clear()`: Clear the entire catalog and check if it’s empty using `isEmpty()`.

## Example Output:

**Output:**

```plaintext
Initial number of books in catalog: 5
Is the catalog empty? false
Is book with ID 102 available? true
Is the book "1984" available? true
Updated catalog after removing ID 105:
101: The Catcher in the Rye
102: To Kill a Mockingbird
103: 1984
104: The Great Gatsby
Is the catalog empty after clearing? true
         */


    }

}
