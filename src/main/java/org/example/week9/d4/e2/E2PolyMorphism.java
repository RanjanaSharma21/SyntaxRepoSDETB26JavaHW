package org.example.week9.d4.e2;

public class E2PolyMorphism {
    public static void main(String[] args) {

    /*
     *    - Create an array of Shape objects.
     *    - Add a Circle object (e.g., radius 5) and a Rectangle object (e.g., width 4, height 6).
     *    - Use a normal for loop to iterate over the array and call calculateArea() on each object.
     *    - Print the returned values.
     *
     */
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.calculateArea());
        }
    }
}
