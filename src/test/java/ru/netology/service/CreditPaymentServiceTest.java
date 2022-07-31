package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CreditPaymentServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testCalculate(double expected, double loanAmount, double loanTerm, double interestRate) {
        CreditPaymentService service = new CreditPaymentService();
        double actual = service.calculate(loanAmount, loanTerm, interestRate);
        Assertions.assertEquals(expected, actual);
    }
}


