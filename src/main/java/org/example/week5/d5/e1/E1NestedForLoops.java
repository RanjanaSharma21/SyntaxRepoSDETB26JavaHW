package org.example.week5.d5.e1;

public class E1NestedForLoops {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // 2. Traverse and print the array
        for (int i = 0; i < matrix.length; i++) { // outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // inner loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

    }
}
