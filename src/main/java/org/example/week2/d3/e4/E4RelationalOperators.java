package org.example.week2.d3.e4;

public class E4RelationalOperators {
    public static void main(String[] args) {
// Step 1: Declare and initialize variables
        int age=18;
        int temperature=30;
        int score=75;

// Step 2: Write Relational Comparisons (Ensure the test cases pass)
//   - Compare 'age' with 18 using the greater than or equal operator (>=):
//       Expected: (age >= 18) should output true.
//   - Compare 'temperature' with 35 using the less than operator (<):
//       Expected: (temperature < 35) should output true.
//   - Compare 'score' with 75 using the equality operator (==):
//       Expected: (score == 75) should output true.
//   - Compare 'score' with 100 using the not equal operator (!=):
//       Expected: (score != 100) should output true.
//   - Compare 'age' with 20 using the less than operator (<):
//       Expected: (age < 20) should output true.

        boolean isAgeTrue = (age >= 18);
        boolean isTempCorrect = (temperature < 35);
        boolean isScoreMatch = (score == 75);
        boolean isNotHundred = (score != 100);
        boolean isTeenage = (age < 20);


// Step 3: Print Each Comparison Result
//   - Use System.out.println to print the result of each relational expression.
//   - Ensure each print statement outputs exactly the boolean value as expected:

        System.out.println(isAgeTrue);
        System.out.println(isTempCorrect);
        System.out.println(isScoreMatch);
        System.out.println(isNotHundred);
        System.out.println(isTeenage);



        /* Or  I can simply write as below instead of declaring extra 5 boolean variables and waste memory
         // Step 2 & 3: Can be combined to check with Relational Comparisons operators and Print Results

        // (age >= 18)
        System.out.println(age >= 18);

        // (temperature < 35)
        System.out.println(temperature < 35);

        // (score == 75)
        System.out.println(score == 75);

        // (score != 100)
        System.out.println(score != 100);

        // (age < 20)
        System.out.println(age < 20);
         */



    }
}

