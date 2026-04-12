package org.example.week8.d2.e1;

public class Student {
    int year;
    String schoolName;
    int batchNumber;

    public void assignValues(int yr, String school, int batch) {
        year = yr;
        schoolName=school;
        batchNumber=batch;
    }

    public void printValues() {
        System.out.println("I am a student of batch "+batchNumber+" studying at "+schoolName+" in the year of "+year+".");
    }

}
