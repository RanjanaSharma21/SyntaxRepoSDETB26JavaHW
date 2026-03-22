package org.example.week4.d4.e7;

import java.util.Scanner;
/*
1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Prompt the User for Input**
    - Print "In: " to prompt the user to enter a value for `x`.
    - Read the user input and store it in an integer variable `x`.

3. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to 0 and increments `i` by 1 each iteration.

4. **Use the For Loop to Print the Series**
    - Ensure the loop continues as long as `i` is less than `x`.
    - Inside the loop:
        - Print the value of `i` followed by a space.
 */
public class E7ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("In: ");
        int x = scanner.nextInt();
        for (int i=0; i<x; i++) {
            System.out.print(i+" ");
        }
    }
}

