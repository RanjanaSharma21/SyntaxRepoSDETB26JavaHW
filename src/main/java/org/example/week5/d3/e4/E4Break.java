package org.example.week5.d3.e4;
/*
1. **Declare and Initialize the Array**
   - Create an array of strings representing items on a production line: `{"Item1", "Item2", "Defective", "Item3", "Item4"}`.

2. **Iterate Through the Array Using an Enhanced For Loop**
   - Use an enhanced `for` loop to iterate through the array.

3. **Use the `break` Keyword**
   - Inside the loop, use an `if` statement to check if the current item is `"Defective"`.
   - If it is, print a message `"Defective item found. Stopping the production line."` and use the `break` keyword to exit the loop.

4. **Process the Current Item**
   - If the item is not defective, print `"Processing [ItemName]"`.

*/
public class E4Break {
    public static void main(String[] args) {

        String[] items = {"Item1", "Item2", "Defective", "Item3", "Item4"};

        for (String item : items) {
            if (item.equals("Defective")) {
                System.out.println("Defective item found. Stopping the production line.");
                break;
            }
            System.out.println("Processing " + item);
        }

    }
}
