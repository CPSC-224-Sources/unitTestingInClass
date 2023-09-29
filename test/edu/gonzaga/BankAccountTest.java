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
    void initialName() {
        Double initialBal = 50.75;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);
        System.out.println(ba);
        Assertions.assertEquals(ownerName, ba.getName());
    }

    @Test
    void test_InitializeNegativeBalance() {
        Double initialBal = -0.10;
        String ownerName = "Jenny";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(initialBal, ownerName);
        });
    }

    @Test
    void test_Credit_10() {
        Double initialBal = 50.75;
        Double creditAmt = 10.0;
        Double expectedBal = 60.75;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);

        ba.credit(creditAmt);

        Double actualBal = ba.getBalance();

        Assertions.assertEquals(expectedBal, actualBal);
    }

    @Test
    void test_Debit_15() {
        Double initialBal = 50.75;
        Double debitAmt = 15.0;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);

        ba.debit(debitAmt);

        Double expectedBal = 50.75 - 15.0;  // ?????
        Double actualBal = ba.getBalance();

        Assertions.assertEquals(expectedBal, actualBal);
    }

    @Test
    void test_Debit_015() {
        Double initialBal = 50.75;
        Double debitAmt = 0.15;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);

        ba.debit(debitAmt);

        Double expectedBal = 50.75 - 0.15;
        Double actualBal = ba.getBalance();

        Assertions.assertEquals(expectedBal, actualBal);
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
    }
 */


}
