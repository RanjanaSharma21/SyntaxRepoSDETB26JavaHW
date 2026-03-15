package org.example.week5.d3.e2;
/*
1. **Declare and Initialize the Array**
   - Create an array of integers representing test durations. For example, you can use the following values:
     `{45, 82, 63, 95, 50, 70, 110, 55, 60}`.

2. **Set a Threshold for Slow Tests**
   - Decide on a threshold value for what you consider a slow test. For instance, tests that run longer than 70 seconds are flagged as slow.

3. **Extract and Print Slow Test Durations**
   - Use an enhanced for loop to iterate over the array.
   - Inside the loop, use an `if` statement to check if the current test duration exceeds the threshold.
   - If it does, print that test duration.

 */
public class E2EnhancedForLoop {
    public static void main(String[] args) {

        int[] testDurations = {45, 82, 63, 95, 50, 70, 110, 55, 60};
        int threshold = 70;
        System.out.println("Slow test durations (greater than 70 seconds):");

        for (int duration : testDurations) {
            if (duration > threshold) {
                System.out.println(duration);
            }
        }

    }
}
