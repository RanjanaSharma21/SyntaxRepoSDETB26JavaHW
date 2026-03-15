package org.example.week4.d4.e3;
/*
. **Initialize the Loop**
   - Use a `for` loop that starts with the variable `year` initialized to 2025.

2. **Use the For Loop to Print the String and Year**
   - Inside the loop, print "Hey, it is year:".
   - Print the value of `year`.
   - Ensure the loop continues as long as `year` is less than or equal to 2030.
   - Increment `year` by 1 each iteration.
 */
public class E3ForLoop {
    public static void main(String[] args) {

        for (int year=2025; year<=2030; year++) {
            System.out.println("Hey, it is year:");
            System.out.println(year); }
    }
}
