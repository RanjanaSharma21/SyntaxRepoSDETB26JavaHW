package org.example.week10.d1.e3;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args){

        /*

         * 1. create an ArrayList of type Integer:
         *    - Example: ArrayList<Integer> orders = new ArrayList<>();
         *
         * 2. Add order quantities for a product (e.g., "Widget") using the add() method:
         *    - Try adding distinct numbers such as 10, 20, 15, 30, 25.
         *
         * 3. Use a normal for loop to iterate over the ArrayList:
         *    - Loop from index 0 to orders.size() - 1.
         *    - Print each element using System.out.println().
         *
         * 4. The expected output should be the order quantities, each on its own line:
         *    10
         *    20
         *    15
         *    30
         *    25
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(25);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

}
