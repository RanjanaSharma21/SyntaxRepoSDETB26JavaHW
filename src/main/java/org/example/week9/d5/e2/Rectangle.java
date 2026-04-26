package org.example.week9.d5.e2;

/*
 Has private instance variables `width` and `height` both double.
      - Create a constructor of Rectangle class which `width` and `height` of type double as parameters.
      - Inside constructor,Use super keyword to call the constructor of Shape class(parent class)
        and pass `Rectangle` as Parameter and use this keyword to assign values to private instance variables length and width.
      - Sample code:
        `public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }`
      - **Override the `calculateArea()` Method:**
         - Provide the implementation for the `calculateArea()` method and
           implement the logic to display area of the rectangle using the formula Area=length*breath.
         - Example - `Area of Rectangle is 24.00`.
      - **Override the `calculatePerimeter()` Method:**
         - Provide the implementation for the `calculatePerimeter()` method
           and implement the logic to display area of the rectangle using the formula Perimeter=2*(length+breath).
         - Example - `Perimeter of Rectangle is 20.00`.
         -
 */

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = this.width * this.height;
        System.out.printf("Area of Rectangle is %.2f%n", area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (this.width + this.height);
        System.out.printf("Perimeter of Rectangle is %.2f%n", perimeter);
    }


}
