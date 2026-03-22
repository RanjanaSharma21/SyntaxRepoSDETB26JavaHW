package org.example.week4.d4.e5;
/*
. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to 1 and increments `i` by 1 each iteration.

2. **Use the For Loop to Print the Multiplication Table**
    - Ensure the loop continues as long as `i` is less than or equal to 10.
    - Inside the loop:
        - Print the multiplication of 3 and `i` in the format "3*i=result".

 */
public class E5ForLoop {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            System.out.println("3*"+i+"="+3*i);
        }
    }
}