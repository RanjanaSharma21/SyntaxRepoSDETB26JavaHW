package org.example.week4.d3.e3;

public class E3WhileLoop {
    public static void main(String[] args) {

        int counter = 1;   // Step 1: start from 1

        while (counter <= 13) {   // Step 2: loop until 13

            if (counter % 2 == 0) {   // check if number is even
                System.out.println(counter);
            }

            counter++;   // increase by 1
        }

    }
}
