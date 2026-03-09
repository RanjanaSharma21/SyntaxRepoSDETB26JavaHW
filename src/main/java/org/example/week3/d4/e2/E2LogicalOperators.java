package org.example.week3.d4.e2;

import java.util.Scanner;

/*
## Instructions

In this exercise, you will write a small program that helps a user manage their personal budget by comparing two sets of monthly expenses.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Monthly Expenses**
   - Print "Please enter your monthly rent expense".
   - Capture the user's input for the rent expense and store it in a variable called `rentExpense`.
   - Print "Please enter your monthly food expense".
   - Capture the user's input for the food expense and store it in a variable called `foodExpense`.
   - Print "Please enter your monthly transportation expense".
   - Capture the user's input for the transportation expense and store it in a variable called `transportationExpense`.
   - Print "Please enter your monthly entertainment expense".
   - Capture the user's input for the entertainment expense and store it in a variable called `entertainmentExpense`.

3. **Analyze Expenses Using the && Operator**
   - Use a simple if-else statement with the && operator to compare expenses:
      - **If** `rentExpense` is greater than `foodExpense` **and** `transportationExpense` is greater than `entertainmentExpense`, output:
        ```
        You are prioritizing essentials well.
        ```
      - **Else**, output:
        ```
        You need to rethink your spending priorities.
        ```
*/


public class E2LogicalOperators {
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Capture monthly expenses
        System.out.println("Please enter your monthly rent expense");
        double rentExpense = input.nextDouble();

        System.out.println("Please enter your monthly food expense");
        double foodExpense = input.nextDouble();

        System.out.println("Please enter your monthly transportation expense");
        double transportationExpense = input.nextDouble();

        System.out.println("Please enter your monthly entertainment expense");
        double entertainmentExpense = input.nextDouble();

        // Step 3: Analyze expenses using && operator
        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else {
            System.out.println("You need to rethink your spending priorities.");
        }

        // Close scanner
        input.close();

    }
}
