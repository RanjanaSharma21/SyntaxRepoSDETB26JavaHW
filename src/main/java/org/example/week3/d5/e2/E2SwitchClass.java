package org.example.week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType=input.nextInt();
        double cost=0.0;
        switch(mealType)
        {
            case 1:
                cost=5.0;
                System.out.println("The price of your meal is $" +cost);
                break;
            case 2:
                cost=10.0;
                System.out.println("The price of your meal is $" +cost);
                break;
            case 3:
                cost=15.0;
                System.out.println("The price of your meal is $" +cost);
                break;

            default:
                System.out.println("Invalid meal type entered");


        }

    }
}
