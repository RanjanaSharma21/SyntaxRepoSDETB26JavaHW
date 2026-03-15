package org.example.week5.d3.e3;
/*
1. **Declare and Initialize the Array**
   - Create an array of doubles representing temperature readings in degrees Celsius: `{36.5, 37.0, 37.5, 38.0, 39.5, 40.0, 40.5}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `break` Keyword**
   - Inside the loop, use an `if` statement to check if the current temperature is greater than or equal to `39.5`.
   - If it is, print a message `"Critical temperature reached: [Temperature]°C. Stopping monitoring."` and use the `break` keyword to exit the loop.

4. **Print the Current Temperature**
   - For each temperature before the break condition is met, print `"Temperature is normal: [Temperature]°C"`.

 */
public class E3Break {
    public static void main(String[] args) {

        double[] temp = {36.5, 37.0, 37.5, 38.0, 39.5, 40.0, 40.5};
        for (double currentTemp : temp) {
            if (currentTemp < 39.5) {
                System.out.println("Temperature is normal: "+currentTemp+"°C. Stopping monitoring.");
            }
            else{
               System.out.println("Critical temperature reached: "+currentTemp+"°C. Stopping monitoring.");
               break;
           }
        }


    }
}
