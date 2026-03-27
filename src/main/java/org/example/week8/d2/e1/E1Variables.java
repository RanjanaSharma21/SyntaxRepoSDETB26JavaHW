package org.example.week8.d2.e1;

public class E1Variables {

    public static void main(String[] args) {

        /*
         * 1. In your Student class, declare three instance variables:
         *    - int year;
         *    - String schoolName;
         *    - int batchNumber;
         *
         * 2. In your main method, create two objects of the Student class.
         *
         * 3. For the first object, assign:
         *      - year = 2050
         *      - schoolName = "Syntax"
         *      - batchNumber = 200
         *
         * 4. For the second object, assign:
         *      - year = 2051
         *      - schoolName = "Tech"
         *      - batchNumber = 300
         *
         * 5. Use System.out.println to print the details for each student in the following format:
         *      "I am a student of batch [batchNumber] studying at [schoolName] in the year of [year]."
         *
         * 6. Ensure you print the details for both objects.
         */

        Student s1=new Student();
        s1.year=2050;
        s1.schoolName="Syntax";
        s1.batchNumber=200;

        Student s2=new Student();
        s2.year=2051;
        s2.schoolName="Tech";
        s2.batchNumber=300;

        System.out.println("I am a student of batch "+ s1.batchNumber +" studying at Syntax in the year of "+ s1.year+".");
        System.out.println("I am a student of batch "+ s2.batchNumber +" studying at Tech in the year of "+ s2.year+".");
    }
}

