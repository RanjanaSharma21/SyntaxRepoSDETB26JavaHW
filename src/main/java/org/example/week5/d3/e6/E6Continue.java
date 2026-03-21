package org.example.week5.d3.e6;
/*

1. **Declare and Initialize the Array**
   - Create an array of strings representing items in inventory: `{"Item1", "Out of Stock", "Item2", "Item3", "Out of Stock", "Item4"}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `continue` Keyword**
   - Inside the loop, use an `if` statement to check if the current item is `"Out of Stock"`.
   - If it is, use the `continue` keyword to skip the current iteration.

4. **Process the Current Item**
   - For each item that is not out of stock, print `"Processing [ItemName]"`.
*/
public class E6Continue {
    public static void main(String[] args) {

        String[] inventory = {"Item1", "Out of Stock", "Item2", "Item3", "Out of Stock", "Item4"};

        for (String item : inventory) {
            if (item.equals("Out of Stock")) {
                continue;
            }
            System.out.println("Processing " + item);
        }

    }
}
