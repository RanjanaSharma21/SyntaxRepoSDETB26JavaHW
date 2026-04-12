package org.example.week8.d4.e2;

public class AccessTester {
    private String name;
    String city;
    public int batchNumber;

    public void display() {
        this.name = "John";
        System.out.println("My name is " + name + " and I live in " + city + "." + " I study at Syntax in batch " + batchNumber + ".");
    }

}
