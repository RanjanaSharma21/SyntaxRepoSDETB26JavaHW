package org.example.week3.d4.e5;

/*
## Instructions

**Grading System**

In this project, you will write a small program that asks the user for their marks and then determines and prints the corresponding grade based on the school's grading system.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Marks Input**
   - Print "Please enter your marks".
   - Capture the user's input for the marks and store it in a variable called `marks`.

3. **Determine and Print the Grade**
   - Use conditional statements to determine and print the grade directly inside each conditional block:
      - If marks are between 1 and 25 (inclusive), print `Your grade is F`.
      - If marks are between 26 and 45 (inclusive), print `Your grade is E`.
      - If marks are between 46 and 50 (inclusive), print `Your grade is D`.
      - If marks are between 51 and 60 (inclusive), print `Your grade is C`.
      - If marks are between 61 and 80 (inclusive), print `Your grade is B`.
      - If marks are above 80, print `Your grade is A`.
      - If marks are not within the valid range (0-100), print `Please enter valid mark`.
*/



import java.util.Scanner;

public class E5LogicalOperators {
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Capture marks input
        System.out.println("Please enter your mark");
        int marks = input.nextInt();

        // Step 3: Determine and print the grade
        if (marks < 0 || marks > 100) {
            System.out.println("Please enter a valid mark");
        }
        else if (marks >= 1 && marks <= 25) {
            System.out.println("Your grade is F");
        }
        else if (marks >= 26 && marks <= 45) {
            System.out.println("Your grade is E");
        }
        else if (marks >= 46 && marks <= 50) {
            System.out.println("Your grade is D");
        }
        else if (marks >= 51 && marks <= 60) {
            System.out.println("Your grade is C");
        }
        else if (marks >= 61 && marks <= 80) {
            System.out.println("Your grade is B");
        }
        else if (marks > 80) {
            System.out.println("Your grade is A");
        }
        else {
            System.out.println("Please enter a valid mark");
        }

        //close scanner
        input.close();




    }
}
