package org.example.week5.d3.e5;

/*
1. **Declare and Initialize the Array**
   - Create an array of doubles representing sensor readings: `{15.5, -1.0, 20.0, 22.5, -2.0, 18.0, 21.5}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `continue` Keyword**
   - Inside the loop, use an `if` statement to check if the current reading is negative.
   - If it is, use the `continue` keyword to skip the current iteration.

4. **Process the Valid Reading**
   - For each valid (non-negative) reading, print `"Valid reading: [Reading] units"`.

*/
public class E5Continue {
    public static void main(String[] args) {

        double[] readings = {15.5, -1.0, 20.0, 22.5, -2.0, 18.0, 21.5};
        for (double reading : readings) {

            if (reading < 0) {
                continue;
            }
            System.out.println("Valid reading: " + reading + " units");
        }



    }
}
