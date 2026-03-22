package org.example.week4.d4.e2;
/*
1. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to 1 and increments `i` by 1 each iteration.

2. **Use the For Loop to Print Customer Orders**
    - Ensure the loop continues as long as `i` is less than or equal to 5.
    - Inside the loop:
        - Print "Processing order #" followed by the value of `i`.

*/
public class E2ForLoop {
    public static void main(String[] args) {
       for (int i=1; i<=5; i++) {
            System.out.println("Processing order #"+i);
        }
    }
}