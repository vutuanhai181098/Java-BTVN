package model;

import service.IAccount;

public class Account implements IAccount {
    private String name;
    private String accountNumber;
    private String email;
    private double accountBalance;

    public Account(String name, String accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Email: " + email + ", Account Balance: " + accountBalance + ".";
    }

    @Override
    public double recharge(double amount) {
        return getAccountBalance() + amount;
    }

    @Override
    public String changeEmail(String email) {
        return email;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }
}
