package edu.gonzaga;

public class BankAccount {
    private Double balance;
    private String name;

    public BankAccount(Double startingBalance, String ownerName) {
        this.balance = startingBalance;
        this.name = ownerName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double newBalance) {
        this.balance = newBalance;
    }

    public String getName() {
        return this.name + ".";
    }

    public void credit(Double newFunds) {
        this.balance += newFunds;
    }

    public void debit(Double spentFunds) {
        this.balance -= spentFunds;
    }
}
