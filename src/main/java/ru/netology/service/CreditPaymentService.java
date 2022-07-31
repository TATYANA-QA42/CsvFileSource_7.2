package ru.netology.service;

import org.apache.commons.math3.util.Precision;

public class CreditPaymentService {
    public double calculate(double loanAmount, double loanTerm, double interestRate) {
        double numberMonths = loanTerm * 12;
        double monthlyInterestRate = 1 + interestRate / 12 / 100;
        double exponentiation = Math.pow(monthlyInterestRate, numberMonths);
        double Annuity = interestRate / 12 / 100 * exponentiation / (exponentiation - 1);//x - сумма кредита, у - срок , z - процент
        double result = loanAmount * Annuity;
        return Precision.round(result, 2);
    }
}
