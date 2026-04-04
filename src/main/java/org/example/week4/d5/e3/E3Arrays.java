package org.example.week4.d5.e3;
/*
1. **Declare and Initialize the Array**
    - Create an array of characters and store the values 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'.

2. **Print the Selected Characters**
    - Print the characters at the indices that form the word "syntax".
*/
public class E3Arrays {
    public static void main(String[] args) {

        char[] chars = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
        int[] indices = {0, 2, 4, 6, 8, 10};
        for (int i : indices) {
            System.out.print(chars[i]);
        }
    }
}
