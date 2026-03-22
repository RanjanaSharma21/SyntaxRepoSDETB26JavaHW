package org.example.week4.d4.e1;
/*
1. **Create a for loop**
    - Initialize the loop variable to start at 2.
    - Set the condition to continue the loop while the variable is less than or equal to 14.
    - Increment the loop variable by 1 in each iteration.

2. **Add an if condition inside the loop**
    - Check if the current number is even using the modulus operator (%).
    - If the number is even, print it to the console.

3. **Ensure 14 is included**
    - Make sure your loop condition includes 14 in the range.
 */
public class E1ForLoop {
    public static void main(String[] args) {
        for (int i = 2; i <= 14; i++) {   // start at 2, stop at 14
            if (i % 2 == 0) {             // check if even
                System.out.println(i);
            }
        }
    }
}
