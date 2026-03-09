package org.example.week3.d5.e1;

/*
## Instructions

**Instructor Responsibility**

In this project, you will write a small program that asks the user for the name of an instructor and then determines their responsibility based on the input using a switch statement.

**For you to do:**

1. **Create a Scanner Object**
    - Create a `Scanner` object to read input from the console.

2. **Capture Instructor Name**
    - Print "Enter name of the instructor".
    - Capture the user's input for the instructor's name and store it in a variable called `instructorName`.

3. **Determine Responsibility**
    - Use a switch statement to determine the responsibility based on the instructor's name:
        - If the name is "Asghar", set `responsibility` to "Will take care of Java Assignment".
        - If the name is "Sohail", set `responsibility` to "Will take care of SDLC Assignment".
        - If the name is "Moazzam", set `responsibility` to "Will take care of Selenium Assignment".
        - If the name is "Asel", set `responsibility` to "Will take care of every Assignment".
        - For any other name, set `responsibility` to "Invalid instructor selected".

        - Note: its intentional that you are asked to assign a value inside a case and not directly print it.
4. **Print the Responsibility**
    - Print the responsibility.
*/

import java.util.Scanner;

public class E1SwitchClass {
    public static void main(String[] args) {

        // 1. Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // 2. Capture Instructor Name
        System.out.println("Enter name of the instructor");
        String instructorName = scanner.nextLine();

        // 3. Determine Responsibility
        String responsibility;  // declare variable to store responsibility
        switch (instructorName) {
            case "Asghar":
                responsibility = "Will take care of Java Assignment";
                break;
            case "Sohail":
                responsibility = "Will take care of SDLC Assignment";
                break;
            case "Moazzam":
                responsibility = "Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                break;
            default:
                responsibility = "Invalid instructor selected";
        }

        // 4. Print the Responsibility
        System.out.println(responsibility);

        // Close the scanner
        scanner.close();


    }
}
