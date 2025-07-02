package com.autobots.java.bankApllication;

public interface Bank {
    double gatBalance();
    void deposit (double amount);
    void withdraw (double amount);
    String getBankName();



    static void tranferFunds(Bank sender, Bank recipient, double transferAmount){
        sender.withdraw(transferAmount);
        recipient.deposit(transferAmount);

    }
}
