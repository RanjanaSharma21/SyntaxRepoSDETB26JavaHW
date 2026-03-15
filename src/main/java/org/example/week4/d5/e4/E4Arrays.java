package org.example.week4.d5.e4;
/*
1. **Declare and Initialize the Array**
    - Create an array of strings and store the values "This", "is", "array", "of", "strings".

2. **Print the Array Values in One Line**
    - Use a loop to iterate through the array and print each value followed by a space.
*/
public class E4Arrays {
    public static void main(String[] args) {

        String[] words = {"This", "is", "array", "of", "strings"};
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }


    }
}
