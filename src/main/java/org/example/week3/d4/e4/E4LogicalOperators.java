package org.example.week3.d4.e4;

import java.util.Scanner;

/*
## Instructions

**Weekend Subject Planner**

In this project, you will write a small program that asks the user if it is the weekend and if they are available, and then assigns a subject to study based on their responses.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Boolean Inputs**
   - Print "Is it weekend? (true/false)".
   - Capture the user's input for whether it is the weekend and store it in a variable called `isWeekend`.
   - Print "Are you available? (true/false)".
   - Capture the user's input for whether they are available and store it in a variable called `isAvailable`.

3. **Determine the Subject**
   - If it is the weekend and the user is available, set `subject` to "Java".
   - If it is not the weekend and the user is available, set `subject` to "manual testing".
   - If the user is not available, set `subject` to "no subject".

4. **Print the Subject**
   - Print "Today you will be learning ____" with the appropriate subject.
*/



public class E4LogicalOperators {
    public static void main(String[] args) {


        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Capture Boolean inputs
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = input.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = input.nextBoolean();

        // Step 3: Determine the subject
        String subject;

        if (isWeekend && isAvailable) {
            subject = "Java";
        }
        else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        }
        else {
            subject = "no subject";
        }

        // Step 4: Print the subject
        System.out.println("Today you will be learning " + subject);

        // close scanner
        input.close();

    }
}
