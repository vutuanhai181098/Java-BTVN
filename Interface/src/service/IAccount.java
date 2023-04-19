package service;

import model.Account;

public interface IAccount {
    double recharge(double amount);
    String changeEmail(String email);
    void displayInfo();
}
