package org.example.week4.d5.e1;

public class E1Array {
    public static void main(String[] args) {
    int [] numbers=new int[5];
    numbers[0]=45;
    numbers[1]=78;
    numbers[2]=12;
    numbers[3]=67;
    numbers[4]=55;

    for(int i=0;i<5;i++){
        System.out.print(numbers[i]+ " ");
    }

        // Declare and initialize the array
        int[] numbers = {45, 78, 12, 67, 55};

        // Loop to print the values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}