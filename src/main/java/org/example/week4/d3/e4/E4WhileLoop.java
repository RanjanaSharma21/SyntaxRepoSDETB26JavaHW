package org.example.week4.d3.e4;
/*
1. **Initialize the Loop Counter**
    - Declare an integer variable called `i` and set it to 7.

2. **Use a While Loop to Print the Sequence**
    - Create a `while` loop that continues as long as `i` is less than or equal to 98.
    - Inside the loop, print the value of `i`.
    - Increment the value of `i` by 7 after each iteration.
 */

public class E4WhileLoop {
    public static void main(String[] args) {

        int i = 7;
        while (i <= 98) {
            System.out.println(i);
            i += 7;
        }

    }
}
