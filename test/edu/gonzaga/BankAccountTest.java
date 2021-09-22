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
}
