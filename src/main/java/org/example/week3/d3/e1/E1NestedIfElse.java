package org.example.week3.d3.e1;

public class E1NestedIfElse {
    /*    int age = 14;`
                - `int height = 125;`

        The program should follow these steps:

                1. **Check Age Eligibility**
                - Use an `if else` statement to check if `age` is **greater than or equal to 12**.
                - **If** `age` is less than 12, print:
                `"You are not old enough to ride the roller coaster."`
                - if it is greater than or equal to 12, proceed to the next step.

                2. **Nested Height Check**
                - If the person is old enough (i.e., `age` is at least 12),
                  use a nested `if` statement to check if `height` is **greater than or equal to 120**.
                - **If** `height` is greater than or equal to 120, print:
                `"You are eligible to ride the roller coaster."`
                - **Else**, print:
                `"You are old enough, but not tall enough to ride the roller coaster."`

                ## Expected Output
                With the given values (`age = 14` and `height = 125`), the expected output is:
                ```
                You are eligible to ride the roller coaster.
    */
    public static void main(String[] args) {

        int age = 14;
        int height = 125;

        // Checking the age eligibility
        if (age >= 12) {
            // Checking the height eligibility
            if (height >= 120) {
                System.out.println("You are eligible to ride the roller coaster.");
            } else {
                System.out.println("You are not old enough to ride the roller coaster.");
            }
        }
        else {
                System.out.println("You are not old enough to ride the roller coaster.");
            }

    }

}
