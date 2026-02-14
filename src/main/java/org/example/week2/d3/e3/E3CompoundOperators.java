package org.example.week2.d3.e3;

public class E3CompoundOperators {
    public static void main(String[] args) {


// Step 1: Declare Variables and Initialize with Values for each compound operator
//         (e.g., addOp, subOp, mulOp, divOp, modOp)
        int addOperator=10;
        int subOperator=20;
        int mulOperator=5;
        int divOperator=40;
        int modOperator=17;

// Step 2: Apply Compound Operators to Modify Each Variable's Value
//         (e.g., addOp += 5, subOp -= 3, mulOp *= 3, divOp /= 5, modOp %= 5)
        addOperator+=5;
        subOperator-=3;
        mulOperator*=3;
        divOperator/=5;
        modOperator%=5;

// Step 3: Print the Updated Values to Observe the Results
//         (e.g., print the values of addOp, subOp, mulOp, divOp, and modOp)
        System.out.println(addOperator);
        System.out.println(subOperator);
        System.out.println(mulOperator);
        System.out.println(divOperator);
        System.out.println(modOperator);
    }
}
