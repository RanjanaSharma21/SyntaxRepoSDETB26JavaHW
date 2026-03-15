package org.example.week5.d3.e1;
/*
1. **Declare and Initialize the Array**
   - Create an array of integers with a size of 11 (to store the years 2025 through 2035).

2. **Fill the Array with Years Using a For Loop**
   - Use a standard `for` loop to add the years 2025 to 2035 into the array.

3. **Print the Array Values Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array and print each value on a new line.

 */
public class E1EnhancedForLoop {
    public static void main(String[] args) {

        int[] years = new int[11];
        int year=2025;
        for (int i=0; i<=10; i++) {
            years[i] = year++;
        }
        for (int i : years) {
            System.out.println(i); }

    }
}
