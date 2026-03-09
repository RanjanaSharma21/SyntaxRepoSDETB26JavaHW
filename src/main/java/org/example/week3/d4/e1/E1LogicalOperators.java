package org.example.week3.d4.e1;

/*
## Instructions

Assume you have two variables:
- `boolean needsLoan` (true if the person needs a loan, false otherwise)
- `int creditScore` (the person's credit score)

Your program should do the following:

1. **Set Up the Variables**
   - For example:
     ```java
     boolean needsLoan = true;
     int creditScore = 750;
     ```

2. **Determine Loan Eligibility**
   - Use a single if-else statement with the && operator to check:
      - **If** `needsLoan` is true **and** `creditScore` is 700 or higher, print:
        ```
        The eligibility is Eligible
        ```
      - **Else**, print:
        ```
        The eligibility is Not eligible
        ```
*/




public class E1LogicalOperators {
    public static void main(String[] args) {

        // Step 1: Set up the variables
        boolean needsLoan = true;
        int creditScore = 750;

        // Step 2: Determine loan eligibility
        if (needsLoan && creditScore >= 700) {
            System.out.println("The eligibility is Eligible");
        } else {
            System.out.println("The eligibility is Not eligible");
        }

    }
}
