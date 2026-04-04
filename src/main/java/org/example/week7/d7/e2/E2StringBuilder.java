package org.example.week7.d7.e2;
/*
1. Declare a `String` variable named `time` and assign it the value `"1200"`.
2. Create a `StringBuilder` object initialized with the time string declared in above instruction.
3. **Conversion Examples:**
   - **String to StringBuilder Conversion Example:**
     ~~~~java
     String time = "1200";
     StringBuilder sb = new StringBuilder(str);
     ~~~~
4. Use the `insert()` method to add a colon (`':'`) between the hours and minutes at index 2.
5. Print the original time string and its formatted version in the following format.

### Sample Output (for `String time = "1200"`):
~~~~text
Original: 1200, Formatted: 12:00
~~~~
*/

public class E2StringBuilder {
    public static void main(String[] strings) {

        // TODO: Step 1 - Declare and initialize the original time string.
        // Here, we choose "1200" as the sample input to practice using the insert() method.
        String time="1200";

        // TODO: Step 2 - Create a StringBuilder object initialized with the time string.
        // Using StringBuilder allows us to easily modify the string content.
        StringBuilder  sb=new StringBuilder(time);

        // TODO: Step 3 - Use the insert() method to add a colon at index 2 in the StringBuilder.
        // This action splits the hours and minutes in the time string.
        sb.insert(2,":");

        // TODO: Step 4 - Print both the original and formatted time strings.
        // The output should follow the format: "Original: 1200, Formatted: 12:00"
        System.out.println("Original: "+time+", Formatted: "+sb);

    }
}