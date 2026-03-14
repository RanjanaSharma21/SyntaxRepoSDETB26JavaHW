package org.example.week4.d4.e7;

import java.util.Scanner;

public class E7ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   // create Scanner

        System.out.print("In: ");   // ask user for input
        int x = scan.nextInt();    // store input

        for (int i = 0; i < x; i++) {   // loop from 0 to x-1
            System.out.print(i + " ");
        }

    }
}