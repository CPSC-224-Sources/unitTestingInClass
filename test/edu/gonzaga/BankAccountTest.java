package edu.gonzaga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    //@Rule
    //public final ExpectedException exception = ExpectedException.none();

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
        Credit credit = new Credit(50.0);
        System.out.println(credit);
    }

    @Test
    void test_CreateDebit() {
        Debit debit = new Debit(70.0);
        System.out.println(debit);
    }


    /*
    @Test
    void negativeCredit() {
        Double initialBal = 50.75;
        Double negativeAmount = -1.5;
        String ownerName = "Jenny";
        BankAccount ba = new BankAccount(initialBal, ownerName);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ba.credit(negativeAmount);
        });
    }
    */
}
