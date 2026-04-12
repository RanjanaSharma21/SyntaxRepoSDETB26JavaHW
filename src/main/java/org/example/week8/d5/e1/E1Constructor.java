package org.example.week8.d5.e1;

import java.util.Scanner;

public class E1Constructor {
    public static void main(String[] args) {
        //   Create an object of SyntaxTechnologies using the non-argument constructor.
        //   Create another object using the parameterized constructor (pass values).
        //   Call the display() method on both objects.
        //5. Expected Output
        //   For the Non-Argument Constructor
        //   null 0 0 null
        //   For the Parameterized Constructor
        //   Syntax 6 2020 07302020
        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;

        /*
        Scanner input = new Scanner(System.in);;
        System.out.print("Enter School Name: ");
        schoolName = input.nextLine();
        System.out.print("Enter Batch Number: ");
        batch = input.nextInt();
        System.out.print("Enter Year: ");
        year = input.nextInt();
        input.nextLine(); //  consume leftover newline
        System.out.print("Enter Last Day Class: ");
        lastDayOfClass = input.nextLine();*/

        SyntaxTechnologies syntaxTechnologies = new SyntaxTechnologies();
        //System.out.println("For the Non-Argument Constructor");
        syntaxTechnologies.display();

        // Passing the inputted values of local variables to the parameterized constructor.
        //SyntaxTechnologies syntaxTechnologies2 = new SyntaxTechnologies(schoolName, batch, year, lastDayOfClass);

        // Passing fixed values to the parameterized constructor.
        SyntaxTechnologies syntaxTechnologies2 = new SyntaxTechnologies("Syntax", 6, 2020, "07302020");
        //System.out.println("For the Parameterized Constructor");
        syntaxTechnologies2.display();

    }
}
