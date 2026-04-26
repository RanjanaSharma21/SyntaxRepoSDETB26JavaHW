package org.example.week10.d1.e4;

import java.util.ArrayList;
import java.util.Scanner;

public class E4ArrayList {
    public static void main(String[] args){

        // Step 1: Create a `E5ArrayList` class with the following:
        // Initialize an ArrayList<String> to store chat messages entered by the user.
        // Use the Scanner class to input 5 chat messages from the user.
        // Simulate removing unwanted messages by removing the 1st, 3rd, and 5th elements (index 0, 2, and 4).
        // Print the remaining chat messages in a single line, separated by spaces.
        // Step 2: Input messages from the user, remove specific ones, and print the remaining messages in one line.
        /*
        1. **Create the `E5ArrayList.java` class** with the following:
    - **ArrayList Initialization:**
        - Initialize an `ArrayList<String>` to store chat messages entered by the user.
    - **Input Chat Messages:**
        - Use the `Scanner` class to input 5 chat messages from the user.
    - **Remove Specific Messages:**
        - Simulate removing unwanted messages by removing the 1st, 3rd, and 5th elements (index 0, 2, and 4).
    - **Print Remaining Messages:**
        - Print the remaining chat messages in a single line, separated by spaces.

**Step 2: Print the Results**

1. **Print the following values from ArrayList:**
    - Input messages from the user, remove specific ones, and print the remaining messages in one line.

## Example InputOutput:

**Input:**

```plaintext
Hi
How are you?
Great to see you!
Thanks!
Goodbye!
```

**Output:**

```plaintext
Remaining messages:
How are you? Thanks!
```
*/
    ArrayList<String>  list = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    String str;

        System.out.println("Enter 5 chat messages:");
        for (int i=0;i<5;i++){
            str=input.nextLine();
            list.add(str);
        }

        //for (int i=0;i<list.size();i++){
        //    System.out.println(list.get(i));
        //}

        list.remove(0);
        list.remove(1);
        list.remove(2);

        //System.out.println(list);
        //System.out.println(list.size());

        System.out.println("Remaining messages:");

        for (int i=0;i<list.size();i++){
        System.out.print(list.get(i) +" ");
        }
    }
}