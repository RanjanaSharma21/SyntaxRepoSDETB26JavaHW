package org.example.week9.d4.e2;

public class Rectangle extends Shape {
    /*
     *    - Make sure Rectangle extends Shape.
     *    - Add fields for width and height and a constructor to set them.
     *    - Override calculateArea() to return width * height.
     */
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return (width * height);
    }
}
