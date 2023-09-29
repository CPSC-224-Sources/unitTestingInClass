package edu.gonzaga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void initialBalance() {
        Double initialBal = 50.75;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);
        System.out.println(ba);
        Assertions.assertEquals(initialBal, ba.getBalance());
    }

    @Test
    void test_CreateCredit() {
        Credit credit = new Credit(50.00);
        System.out.println(credit);
    }

    @Test
    void test_CreateDebit() {
        Debit debit = new Debit(25.00);
        System.out.println(debit);
    }


    /*
    @Test
    void creditAccount() {
        Double initialBal = 50.75;
        Double creditAmount = 10.0;
        Double expectedBalance = 60.75;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);

        ba.credit(creditAmount);    // Act

        Assertions.assertEquals(expectedBalance, ba.getBalance()); // Assert
    }

    */


/*
    @Test
    void debitAccount() {
        Double initialBal = 50.75;
        Double debitAmount = 10.0;
        Double expectedBalance = 40.75;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);

        ba.debit(debitAmount);    // Act

        Assertions.assertEquals(expectedBalance, ba.getBalance()); // Assert
    }

    @Test
    void negativeDebit() {
        Double initialBal = 50.75;
        Double negativeAmount = -1.5;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ba.debit(negativeAmount);
        });
    }
 */


}
