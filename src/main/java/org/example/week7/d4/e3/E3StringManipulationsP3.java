package org.example.week7.d4.e3;

public class E3StringManipulationsP3 {
    public static void main(String[] args) {
        // Step 1: Declare and Assign a String Variable

// Step 2: Use the `charAt()` Method to Analyze the Product Code

// Extract the first character of `productCode`
// Check if the first character is the letter 'K'
// Extract the last character of `productCode`
// Check if the last character is a digit '5'

        String str="KX125";
        int length=str.length();
        char first=str.charAt(0);
        char last=str.charAt(length-1);

        if(first=='K'){
            System.out.println("Product code starts with 'K': true");
        }else
            System.out.println("Product code starts with 'K': false");

        if(last=='5'){
            System.out.println("Product code ends with '5': true");
        }else
            System.out.println("Product code ends with '5': false");



    }
}
