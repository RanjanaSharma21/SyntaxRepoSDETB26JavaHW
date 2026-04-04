package org.example.week5.d5.e1;
/*
1. **Declare and Initialize the 2D Array**
    - Create a 2D array of integers with the following values:
      ```
      1  2  3  4
      5  6  7  8
      9 10 11 12
      ```

2. **Traverse and Print the Array**
    - Use an outer loop to iterate over each row of the array.
    - Use an inner loop to iterate over each element in the current row.
    - Print each element followed by a space.
    - After finishing each row, print a newline to start the next row.

*/
public class E1NestedForLoops {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };
/*
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
*/
        // 2. Traverse and print the array
        for (int i = 0; i < matrix.length; i++) { // outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // inner loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
/*
        for (int row = 0; row < matrix.length; row++) {           // Outer loop (rows)
            for (int col = 0; col < matrix[row].length; col++) {  // Inner loop (columns)
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
*/
    }
}
