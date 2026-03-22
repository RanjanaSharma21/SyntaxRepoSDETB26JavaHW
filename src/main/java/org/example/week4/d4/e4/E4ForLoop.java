package org.example.week4.d4.e4;
/*
1. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to 10 and decrements `i` by 1 each iteration.

2. **Use the For Loop to Print the Countdown**
    - Ensure the loop continues as long as `i` is greater than or equal to 1.
    - Inside the loop:
        - Print the value of `i`.

3. **Print Happy New Year Message**
    - After the loop, print "Happy New Year!".
 */
public class E4ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {   // start at 10 and decrease
            System.out.println(i);
        }
        System.out.println("Happy New Year!");


    }
}
