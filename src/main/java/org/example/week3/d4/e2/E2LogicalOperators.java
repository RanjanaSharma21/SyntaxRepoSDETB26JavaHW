package org.example.week3.d4.e2;

import java.util.Scanner;

public class E2LogicalOperators {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter your monthly rent expense");
    int rentExpense=input.nextInt();
    System.out.println("Please enter your monthly food expense");
     int foodExpense=input.nextInt();
     System.out.println("Please enter your monthly transportation expense");
     int transportationExpense=input.nextInt();
     System.out.println("Please enter your monthly entertainment expense");
     int entertainmentExpense=input.nextInt();


     if(rentExpense>foodExpense && transportationExpense>entertainmentExpense){
         System.out.println("You are prioritizing essentials well.");
     }else
         System.out.println("You need to rethink your spending priorities.");
    }
}
