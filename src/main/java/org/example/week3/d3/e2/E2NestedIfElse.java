package org.example.week3.d3.e2;


/*

In this exercise, you will write a Java program that checks if a person qualifies for a discount on a movie ticket.
The program will use two variables with different data types:
- `int age = 16;` (an integer representing the person's age)
- `boolean isStudent = true;` (a boolean indicating if the person is a student)

The program should follow these steps:

1. **Check Age Eligibility for Discount**
    - Use an `if else` statement to check if `age` is **less than 18**.
        - **If** `age` is less than 18, print:
          `"You qualify for an age-based discount."`
        - **Else**, proceed to the next step.

2. **Nested Student Status Check**
    - If the person is not under 18, use a nested `if` statement to check if `isStudent` is **true**.
        - **If** `isStudent` is true, print:
          `"You qualify for a student discount."`
        - **Else**, print:
          `"You do not qualify for a discount."`

## Expected Output
With the given values (`age = 16`, `isStudent = true`), the expected output is:
```
You qualify for an age-based discount.

*/

public class E2NestedIfElse {
    public static void main(String[] args) {
        int age = 16;
        boolean isStudent = true;

        // Step 1: Check Age Eligibility
        if (age < 18) {
            System.out.println("You qualify for an age-based discount.");
        }
        else {
            // Step 2: Nested Student Status Check
            if (isStudent) {
                System.out.println("You qualify for a student discount.");
            }
            else {
                System.out.println("You do not qualify for a discount.");
            }
        }

    }
}
