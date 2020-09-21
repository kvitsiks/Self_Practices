package Day48Inheritance;

import java.sql.SQLOutput;

public class BankAccount {
    /*
    create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
     */
    public String firstName;
    public String lastName;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String bankName;

    static {
        bankName = "Bank Of America";
    }

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing: $" + amount);
        balance -= amount;
    }
    public double availableBalance(){
        return getBalance();
    }

    public String toString() {
        return "account Holder " + getAccountHolder() +
                "\naccount Number " + getAccountNumber();
    }
}
