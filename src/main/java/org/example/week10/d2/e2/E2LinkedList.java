package org.example.week10.d2.e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

public class E2LinkedList {
    public static void main(String[] args) {

        /*
         * Heads Up This is a little bit tricky
         * 1. Create an ArrayList or LinkedList of Integer.
         * 2. Filter the list to remove ages not between 25 and 60:
         *    - Use ages.removeIf(age -> age < 25 || age > 60);
         *
         * 3. Sort the list:
         *    - Use Collections.sort(ages);
         *
         * 4. Calculate the average:
         *    - Initialize a sum variable to 0.
         *    - Loop through the list to add up all ages.
         *    - Compute the average as sum divided by the number of elements.
         *
         * 5. Print the results:
         *    - Print the sorted list of remaining ages.
         *    - Print the average age.
         *
         * Expected output should be:
         * Remaining ages: [30, 35, 40, 45, 50, 55, 60]
         * Average age: 45.0
         */
        LinkedList<Integer> list = new LinkedList<>();
        //60, 30, 35, 70, 45, 50, 55, 22, 65, 40
        list.add(60);
        list.add(30);
        list.add(35);
        list.add(70);
        list.add(45);
        list.add(50);
        list.add(55);
        list.add(22);
        list.add(65);
        list.add(40);

        list.removeIf(age -> age < 25 || age > 60);

        Collections.sort(list);
        System.out.println("Remaining ages: "+list);

        int sum = 0;
        double avg = 0;

        for(Integer i : list){
          sum = sum + i;
        }

        avg = sum / list.size();
        System.out.println("Average age: "+avg);



    }

}
