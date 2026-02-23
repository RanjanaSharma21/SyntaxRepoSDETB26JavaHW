package org.example.week3.d3.e4;

import java.util.Scanner;

public class E4NestedIfAndScanner {
    public static void main(String[] args) {

   Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your coffee budget:");
        double budjet=scan.nextDouble();
        System.out.println("Do you prefer your coffee strong?");
        String preference=scan.next();

        if(budjet>=5.00){

            if(preference.equalsIgnoreCase("strong")){
                System.out.println("You should try an Espresso!");
            }else
                System.out.println("You should try a Latte!");
        }else
            System.out.println("You might enjoy a simple cup of Instant Coffee!");
        scan.close();
    }
}
