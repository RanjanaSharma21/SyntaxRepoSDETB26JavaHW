package org.example.week9.d4.e2;

public class Circle extends Shape {
    /*
     *    - Make sure Circle extends Shape.
     *    - Add a field for the radius and a constructor to set the radius.
     *    - Override calculateArea() to return Math.PI * radius * radius.
     */
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        //return Math.PI * Math.pow(radius, 2);
        return Math.PI * radius * radius;
    }

}
