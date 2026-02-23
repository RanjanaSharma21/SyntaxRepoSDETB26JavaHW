package org.example.week3.d4.e4;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      boolean isWeekend;
      boolean isAvailable;
      String subject;

        System.out.println("Is it weekend? (true/false)");
        isWeekend=input.nextBoolean();

        System.out.println("Are you available? (true/false)");
        isAvailable=input.nextBoolean();

        if(isWeekend && isAvailable)
        {
            subject="Java";
        }
        else if(!isWeekend && isAvailable)
        {
            subject="manual testing";
        }
        else
        {
            subject="no subject";
        }

        System.out.println("Today you will be learning " + subject);
    }
}
