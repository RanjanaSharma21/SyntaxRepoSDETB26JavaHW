package org.example.week4.d3.e2;
/*
1. **Initialize the Loop Counter**
        - Declare an integer variable called `counter` and set it to 15.

        2. **Use a While Loop to Print Numbers in Reverse**
        - Create a `while` loop that continues as long as `counter` is greater than or equal to 0.
        - Inside the loop, print the value of `counter`.
        - Decrement the value of `counter` by 1 after each iteration.
*/

public class E2WhileLoop {

    public static void main(String[] args) {

        int counter=15;
        while(counter>=0) {
            System.out.println(counter--);
        }
    }
}