package org.example.week7.d4.e3;
/*
1. **Declare and Assign a String Variable**
    - Declare a `String` variable named `productCode` and assign it a value, `"KX125"`.

2. **Use the `charAt()` Method to Analyze the Product Code**
    - Extract the first character of `productCode` using the `charAt()` method and store it in a variable named `firstChar`.
    - Check if the first character is the letter `'K'`.
    - Extract the last character of `productCode` and store it in a variable named `lastChar`.
    - Check if the last character is a digit `'5'`.

3. **Print the Results**
    - Print the results of your checks in the format:
        - `Product code starts with 'K': [true/false]`
        - `Product code ends with '5': [true/false]`

## Example

Assuming the `productCode` is `"KX125"`.

The output would be:

```
Product code starts with 'K': true
Product code ends with '5': true
 */
public class E3StringManipulationsP3 {
    public static void main(String[] args) {
        // Step 1: Declare and Assign a String Variable
        String productCode="KX125";

// Step 2: Use the `charAt()` Method to Analyze the Product Code

// Extract the first character of `productCode`
        Character firstChar=productCode.charAt(0);

// Check if the first character is the letter 'K'
        Boolean startChar=(firstChar=='K');
        System.out.println("Product code starts with 'K': "+startChar);

// Extract the last character of `productCode`
        Character lastChar=productCode.charAt(productCode.length()-1);

// Check if the last character is a digit '5'
        Boolean endChar=lastChar=='5';
        System.out.println("Product code ends with '5': "+endChar);

    }
}
