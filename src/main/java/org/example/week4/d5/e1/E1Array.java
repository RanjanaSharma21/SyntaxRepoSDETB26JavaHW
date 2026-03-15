package org.example.week4.d5.e1;
/*
1. **Declare and Initialize the Array**
   - Create an array of integers and store the values 45, 78, 12, 67, and 55.

2. **Print the Array Values**
   - Use a loop to iterate through the array and print each value followed by a space.
*/
public class E1Array {
    public static void main(String[] args) {

        int[] numbers = {45, 78, 12, 67, 55};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
