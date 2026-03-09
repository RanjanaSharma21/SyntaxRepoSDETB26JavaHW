package org.example.week3.d5.e2;

/*
## Objective
Learn how to use the `switch` statement in Java to handle multiple conditions based on the user's input, using an integer data type.

## Instructions

**Meal Price Calculator**

In this project, you will write a small program that asks the user for a type of meal (breakfast, lunch, or dinner) and then calculates the price based on predefined rates using a `switch` statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Meal Type Input**
    - Print "Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)".
    - Capture the user's input for the meal type and store it in an integer variable called `mealType`.

3. **Calculate Price using Switch Statement**
    - Use a `switch` statement to calculate the price based on the meal type:
        - Case 1: Breakfast costs $5.00.
        - Case 2: Lunch costs $10.00.
        - Case 3: Dinner costs $15.00.
        - Default: Print "Invalid meal type entered".

4. **Print the Price**
    - Print "The price of your meal is $" followed by the calculated amount.
*/




import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {

        // 1. Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // 2. Capture Meal Type Input
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = scanner.nextInt();

        // 3. Calculate Price using Switch Statement
        double price;  // variable to store the price
        switch (mealType) {
            case 1:
                price = 5.0;
                System.out.println("The price of your meal is $" + price);
                break;
            case 2:
                price = 10.0;
                System.out.println("The price of your meal is $" + price);
                break;
            case 3:
                price = 15.0;
                System.out.println("The price of your meal is $" + price);
                break;
            default:
                System.out.println("Invalid meal type entered");
                break;
        }

        // Close the scanner
        scanner.close();

    }
}
