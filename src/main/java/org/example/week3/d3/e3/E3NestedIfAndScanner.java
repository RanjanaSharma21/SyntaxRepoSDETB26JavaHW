package org.example.week3.d3.e3;

import java.util.Scanner;

public class E3NestedIfAndScanner {
    public static void main(String[] args) {

        /*
        In this exercise, you will write a simple Java program that does the following:
        - Imports the Scanner class so your program can read user input.
        - Creates a Scanner object to "listen" to what the user types.
        - Prompts the user with a friendly message asking for a number.
        - Reads the number entered by the user.
        - Prints out the number with a message confirming what was entered.

        For example, if a user enters `42`, your program should display:
        You entered: 42
         */



        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Please enter a number: ");

        // Read the number entered by the user
        int number = input.nextInt();

        // Display the number back to the user
        System.out.println("You entered: " + number);

        // Close the scanner
        input.close();
    }
}
