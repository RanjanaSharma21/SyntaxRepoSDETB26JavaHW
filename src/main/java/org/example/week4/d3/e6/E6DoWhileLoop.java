package org.example.week4.d3.e6;
/*
1. **Initialize the Loop Counter**
    - Declare an integer variable called `counter` and set it to 20.

2. **Use a Do-While Loop to Print Even Numbers**
    - Create a `do-while` loop that continues as long as `counter` is greater than or equal to 2.
    - Inside the loop:
        - Print the value of `counter` if it is even.
        - Decrement the value of `counter` by 2 after each iteration.
*/
public class E6DoWhileLoop {
    public static void main(String[] args) {

        int counter=20;
        do {
            if(counter%2==0){
                System.out.println(counter); }
            counter--;
        } while(counter>=2);

    }
}
