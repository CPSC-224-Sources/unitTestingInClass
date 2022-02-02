package edu.gonzaga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount ba = new BankAccount(100.0, "Henry");
        System.out.println(ba);
        ba.credit(50.0);
        System.out.println(ba);
        ba.debit(30.0);
        System.out.println(ba);

        ba.debit(-50.0);
        System.out.println(ba);

    }
}
