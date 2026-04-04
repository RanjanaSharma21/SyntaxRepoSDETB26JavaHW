package org.example.week7.d4.e4;

public class E4StringManipulationsP3 {
    public static void main(String[] args) {

// Heads up! This is a tricky one.
// Hint 1: Think about a string containing all these words - what's a famous sentence with 'fox' and 'dog'?

// Hint 2: Remember indexOf() finds single characters using '' quotes, not ""

// Hint 3: For finding words like "jumps", use "" quotes with indexOf()

// Hint 4: To start searching from a specific position, indexOf() can take two arguments

// Hint 5: When searching for something that doesn't exist, what special value should you expect?
/*
        1. Declare a String variable named `word` and assign it the value: "hello".

        2. Use the indexOf() method to find the position of the first occurrence of the letter 'o' in the word and store it in an int variable.

        3. Use the indexOf() method to try to find the letter 'j' in the word and store the result in an int variable.

        4. Print the results in the format:
        - Position of first 'o': [index]
        - Position of 'j': [index]
*/
//
        String word = "hello";
        int index = word.indexOf('o');
        System.out.println("Position of first 'o': "+index);
        index = word.indexOf('j');
        System.out.println("Position of 'j': "+index);

        /*
        if (index != -1) {
            System.out.println("- Position of first 'o': ["+index+"]");
        }
        index = word.indexOf('j');
        if (index != -1) {System.out.println("- Position of first 'o': ["+index+"]");}
        */

    }
}
