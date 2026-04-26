package org.example.week9.d5.e2;
/*
as private instance variable `radius` of type double.
    - Has private final variable PI as `private final double PI = Math.PI;`.
    - Create a constructor of Circle class which `radius` of type double as parameter.
        - Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass `Circle` as Parameter
        and use this keyword to assign values to private instance variable radius.
        - Sample code:
      `public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }`
    - **Override the `calculateArea()` Method:**
        - Provide the implementation for the `calculateArea()` method
        and implement the logic to display area of the circle using the formula Area=PI*radius*radius.
        - Example - `Area of Circle is 78.54`.
    - **Override the `calculatePerimeter()` Method:**
        - Provide the implementation for the `calculatePerimeter()` method
        and implement the logic to display area of the rectangle using the formula Perimeter=2*PI*radius.
        - Example - `Perimeter of Circle is 31.41`.
 */
public class Circle extends Shape {

    private final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.printf("Area of Circle is %.2f%n", Math.PI * radius * radius);

    }

    public void calculatePerimeter() {
        System.out.printf("Perimeter of Circle is %.2f%n", 2*PI*radius);
    }
}
