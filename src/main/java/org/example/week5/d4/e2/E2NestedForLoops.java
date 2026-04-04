package org.example.week5.d4.e2;
/*
1. **Set Up the Outer Loop**
    - The outer loop should control the repetition of the entire pattern. It runs 2 times.

2. **Print "SDLC"**
    - Inside the outer loop, first print the string "SDLC" and then move to a new line.

3. **Set Up the Inner Loop to Print "Java"**
    - Within the outer loop, add an inner loop that runs 3 times.
    - For each iteration of the inner loop, print the word "Java" on a new line.
*/
public class E2NestedForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("SDLC");
            System.out.println("SDLC");
            for (int j = 0; j < 3; j++) {
                System.out.println("Java");
            }
        }
    }
}
