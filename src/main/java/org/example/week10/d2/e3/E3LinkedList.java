package org.example.week10.d2.e3;


import java.util.LinkedList;
import java.util.List;

public class E3LinkedList {

    public List<String>  RemoveCountriesStartingWithA(List<String> countryList){
        countryList.removeIf(country -> country.startsWith("A"));
        return countryList;
    };
    public static void main(String[] args) {


        // Create a method removeCountriesStartingWithA that takes a List<String> as a parameter.
        // Remove all elements from the list that start with the letter 'A'.
        // Return the updated list.
        // In the main method, add the following country names to the List<String>:
        // "USA", "Argentina", "Kazakhstan", "Australia", "Pakistan", "Russia"
        // Call the removeCountriesStartingWithA method and pass the list of country names as a parameter.
        // Print the updated list, which should no longer contain countries starting with 'A'.
        List<String> countryList = new LinkedList<>();
        countryList.add("USA");
        countryList.add("Argentina");
        countryList.add("Kazakhstan");
        countryList.add("Australia");
        countryList.add("Pakistan");
        countryList.add("Russia");

        E3LinkedList e3 = new E3LinkedList();
        List<String> list = e3.RemoveCountriesStartingWithA(countryList);
        System.out.println(list);



    }
}
