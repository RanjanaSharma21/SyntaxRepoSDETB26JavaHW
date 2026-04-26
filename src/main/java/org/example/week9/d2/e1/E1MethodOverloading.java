package org.example.week9.d2.e1;

public class E1MethodOverloading {
    public static void main(String[] args){

        // Heads Up This is a little bit tricky
        // No Hints are left Intentionally
        LoanPaymentCalculator loanPaymentCalculator = new LoanPaymentCalculator();
        Double payment;
        payment = loanPaymentCalculator.calculatePayment(10000.0, 5.00);
        System.out.printf("%.2f%n", payment);
        payment = loanPaymentCalculator.calculatePayment(10000.0, 5.00, 24);
        System.out.printf("%.2f%n", payment);
        payment = loanPaymentCalculator.calculatePayment(10000.0, 5.00, 24, 2000);
        System.out.printf("%.2f%n", payment);



        //System.out.println(loanPaymentCalculator.calculatePayment(10000, 5));
        //System.out.println(loanPaymentCalculator.calculatePayment(10000, 5, 24));
        //System.out.println(loanPaymentCalculator.calculatePayment(10000, 5, 24, 2000));
    }
}

