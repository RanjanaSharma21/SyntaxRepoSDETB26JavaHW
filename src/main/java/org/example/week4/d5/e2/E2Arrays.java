package org.example.week4.d5.e2;

public class E2Arrays {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        // Print values at even indices
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }

    }
}