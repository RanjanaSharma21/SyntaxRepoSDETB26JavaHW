package org.example.week3.d3.e5;

import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {
     int age;
     String license;
     Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age:");
        age=input.nextInt();
        System.out.println("Do you have a valid driver's license? (yes/no):");
        license=input.next();
        if(age>=21){
            if(license.equalsIgnoreCase("yes")){
                System.out.println("You are eligible to rent a car.");
            }else
                System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");

        }else
            System.out.println("You are not eligible to rent a car because you are too young.");
    }
}
