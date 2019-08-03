package com.brunoa;

public class BankAccount {
    private int number;
    private double balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(5454854, "Haitem Zeg", "brunoavinint@example.com", "03454646", 4000);
        System.out.println("Empty Constructor");

    }

    public BankAccount(int number, String customerName, String email, String phoneNumber, double balance) {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " processed:  New balance is " + balance);
    }

    public void withdraw(double amount) {
        double newBalance =  this.balance - amount;
        if (newBalance >= 0) {
            this.balance = newBalance;
            System.out.println("Withdrawal of " + amount + " processed: " + balance + " remaining");
        } else {
            System.out.println("Only " + balance + " available: Withdrawal not processed");
        }
    }
}
