package org.example.week5.d4.e1;

public class E1TwoDArrays {
    public static void main(String[] args) {
    int[][]numbers={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
    for(int r=0;r<numbers.length;r++)
    {
        for(int c=0;c <numbers[r].length;c++){

            System.out.print(numbers[r][c] + " ");
        }
        System.out.println();



    }

    }
}
