package org.example.week4.d5.e2;
/*
1. **Declare and Initialize the Array**
    - Create an array of integers and store the values 45, 78, 12, 67, 55, 89, 23, 77, and 88.

2. **Print the Array Values at Even Indices**
    - print the values at even indices followed by a space.
*/
public class E2Arrays {
    public static void main(String[] args) {

        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
