package org.example.week4.d3.e3;

/*

1. **Initialize the Loop Counter**
    - Declare an integer variable called `counter` and set it to 1.

2. **Use a While Loop to Print Even Numbers**
    - Create a `while` loop that continues as long as `counter` is less than or equal to 13.
    - Inside the loop, use an `if` statement to check if `counter` is even.
    - If `counter` is even, print the value of `counter`.
    - Increment the value of `counter` by 1 after each iteration.

*/
public class E3WhileLoop {
    public static void main(String[] args) {


        int counter = 1;
        while (counter<=13) {
            if (counter%2==0) {
                System.out.println(counter);
            }
            counter++;

        }



    }
}
