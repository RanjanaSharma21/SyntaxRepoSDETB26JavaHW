package org.example.week3.d3.e4;

import java.util.Scanner;

public class E4NestedIfAndScanner {
    public static void main(String[] args) {

        /*
        n this exercise, you will write a simple program that asks the user for:
- Their coffee budget (as a double), for example, 5.00
- Their taste preference (as a String), which could be "strong" or any other input

The program should follow these steps:

1. **Create a Scanner Object**
    - Set up a Scanner to read input from the console.

2. **Capture Input Information**
    - Ask the user: "Please enter your coffee budget:" and store the answer in a variable called `budget`.
    - Ask the user: "Do you prefer your coffee strong?" and store the answer in a variable called `preference`.

3. **Recommend a Coffee Drink**
    - First, use an `if-else` statement to check if `budget` is greater than or equal to 5.00.
        - **If** `budget` is 5.00 or more:
            - Use a nested `if-else` statement to check if `preference` equals "strong".
                - **If** `preference` is "strong", print:
                  `"You should try an Espresso!"`
                - **Else**, print:
                  `"You should try a Latte!"`
        - **Else** (if the `budget` is less than 5.00):
            - Print:
              `"You might enjoy a simple cup of Instant Coffee!"`
         */


        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Capture input information
        System.out.println("Please enter your coffee budget:");
        double budget = input.nextDouble();
        input.nextLine(); // clear the newline left in the buffer

        System.out.println("Do you prefer your coffee strong?");
        String preference = input.nextLine();

        // Step 3: Recommend a coffee drink
        if (budget >= 5.00) {
            if (preference.equalsIgnoreCase("strong")) {
                System.out.println("You should try an Espresso!");
            } else {
                System.out.println("You should try a Latte!");
            }
        } else {
            System.out.println("You might enjoy a simple cup of Instant Coffee!");
        }

        input.close();

    }
}
