package org.example.week4.d4.e8;
/*
1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Prompt the User for Input**
    - Print "In: " to prompt the user to enter a value for `x`.
    - Read the user input and store it in an integer variable `x`.

3. **Initialize the Loop**
    - Use a `for` loop that starts with `i` equal to `x - 1` and decrements `i` by 1 each iteration.

4. **Use the For Loop to Print the Series in Reverse**
    - Ensure the loop continues as long as `i` is greater than or equal to 0.
    - Inside the loop:
        - Print the value of `i` followed by a space.

 */
import java.util.Scanner;

public class E8ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("In: ");
        int x = scanner.nextInt();
        for(int i=x-1; i>=0; i--) {
            System.out.print(i+" ");
        }
    }
}
