package org.example.week7.d3.e1;

public class E1ClassAndObject {
    public static void main(String[] args) {
        // Create a class in the same package named 'Student'
        class Student {
            // Declare a String variable named 'name' and an integer variable named 'roll_no'
            String name;
            int age;
        }



        // Create an object of the class 'Student'
        Student s1 = new Student();


        // Assign the value "John" to the 'name' variable
        s1.name="John";

        // Assign the value 2 to the 'roll_no' variable
        s1.age=2;


        // Print the values of 'name' and 'roll_no' in the specified format
        System.out.println("Name is "+s1.name+" and roll number is "+s1.age);

    }
}
