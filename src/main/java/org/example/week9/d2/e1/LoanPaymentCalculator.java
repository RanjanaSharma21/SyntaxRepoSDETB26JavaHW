package org.example.week9.d2.e1;

public class LoanPaymentCalculator {

    public Double calculatePayment(double loanAmount, double interestRate) {
        return (loanAmount * (1 + interestRate / 100)) / 12;
    }

    public Double calculatePayment(double loanAmount, double interestRate, double numberOfMonths) {
        return (loanAmount * (1 + interestRate / 100)) / numberOfMonths;
    }

    public Double calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment) {
        return ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths;
    }


}
