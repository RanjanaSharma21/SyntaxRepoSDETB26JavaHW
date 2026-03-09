package org.example.week3.d3.e5;

/*
In this exercise, you will write a simple program that asks the user for:
- Their age (as an integer)
- Whether they have a valid driver's license (as a String, e.g., "yes" or "no")

The program should follow these steps:

1. **Create a Scanner Object**
   - Set up a Scanner to read input from the console.

2. **Capture Input Information**
   - Ask the user: "Please enter your age:" and store the answer in a variable called `age`.
   - Ask the user: "Do you have a valid driver's license? (yes/no):" and store the answer in a variable called `licenseStatus`.

3. **Check Car Rental Eligibility**
   - Use an `if-else` statement to check if `age` is greater than or equal to 21.
      - **If** `age` is 21 or older:
         - Use a nested `if-else` statement to check if `licenseStatus` equals "yes".
            - **If** it is "yes", print:
              `"You are eligible to rent a car."`
            - **Else**, print:
              `"You are not eligible to rent a car because you don't have a valid driver's license."`
      - **Else** (if the `age` is less than 21):
         - Print:
           `"You are not eligible to rent a car because you are too young."`
 */


import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Capture input information
        System.out.println("Please enter your age:");
        int age = input.nextInt();

        input.nextLine(); // clear the leftover newline

        System.out.println("Do you have a valid driver's license? (yes/no):");
        String licenseStatus = input.nextLine();

        // Step 3: Check car rental eligibility
        if (age >= 21) {

            // Nested condition to check license
            if (licenseStatus.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to rent a car.");
            } else {
                System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");
            }

        } else {
            System.out.println("You are not eligible to rent a car because you are too young.");
        }

        // Close scanner
        input.close();

    }
}
