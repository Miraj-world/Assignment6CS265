import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        annualInterestRate = 0;
        transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }


    public String toString() {
        return "Date: " + date + "\nType: " + type + "\nAmount: " + amount + "\nBalance: " + balance + "\nDescription: " + description + "\n";
    }
}
