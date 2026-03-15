package org.example.week4.d3.e5;

import java.util.WeakHashMap;

/*
1. **Initialize the Loop Counter**
    - Declare an integer variable called `counter` and set it to 0.

2. **Use a Do-While Loop to Print "Hello World!"**
    - Create a `do-while` loop that continues as long as `counter` is less than 5.
    - Inside the loop:
        - Print "Hello World!".
        - Increment the value of `counter` by 1 after each iteration.
 */
public class E5DoWhileLoop {
    public static void main(String[] args) {

        int counter=0;
        do {
            System.out.println("Hello World!");
            counter++;
        } while(counter<5);
    }
}
