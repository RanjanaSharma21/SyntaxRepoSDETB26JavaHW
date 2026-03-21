package org.example.week5.d4.e1;
/*
1. **Declare and Initialize the 2D Array**
   - Create a 2D array of integers with 3 rows and 3 columns.
   - Initialize the array with the following values:
     ```
     1 2 3
     4 5 6
     7 8 9
     ```

2. **Print the 2D Array Elements**
   - Use direct index access to print each element in the array.
   - Ensure that the output displays the array in matrix form, matching the expected output.

*/
public class E1TwoDArrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
