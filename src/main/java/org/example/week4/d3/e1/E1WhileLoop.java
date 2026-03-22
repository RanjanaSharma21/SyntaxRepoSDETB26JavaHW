package org.example.week4.d3.e1;
/*
1. **Initialize the Loop Counter**
    - Declare an integer variable called `counter` and set it to 0.

2. **Use a While Loop to Print Numbers**
    - Create a `while` loop that continues as long as `counter` is less than or equal to 8.
    - Inside the loop, print the value of `counter`.
    - Increment the value of `counter` by 1 after each iteration.
*/
public class E1WhileLoop {
    public static void main(String[] args) {
        int counter=0;
        while (counter<=8) {
            System.out.println(counter++);
        }

    }
}