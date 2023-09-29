package edu.gonzaga;

/*
 * 
 */
abstract class Transaction {
    protected String typeName = "";
    protected Double amount = 0.0;
    private static Integer idCounter = 1;
    private Integer uniqueID = 0;

    public Transaction() {
        this.uniqueID = idCounter++;
    }

    @Override
    public String toString() {
        return "Transaction (" + this.uniqueID + ") " + typeName + " | amount: $" + amount;
    }

    public Double getAmount() {
        return amount;
    }
}

class Credit extends Transaction {
    public Credit(Double amount) {
        super();
        this.typeName = "credit";
        this.amount = amount;
    }
}

class Debit extends Transaction {
    public Debit(Double amount) {
        super();
        this.typeName = "debit";
        this.amount = amount;
    }
}



/*
 * 
 */
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











/*
        if(newFunds < 0) {
        throw new IllegalArgumentException("Cannot credit negative amounts.");
        }
 */