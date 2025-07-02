package com.autobots.java.mobileBanking;



public class DepositAccount extends BankAccount{

    public DepositAccount(Client owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    public void deposit(double amount) {
        balance +=amount;
        addTransaction("Deposit", amount);
    }

    @Override
    public boolean withdraw(double amount) { // cнимает деньги с баланса
        if (amount <= balance){
            balance -= amount;
            addTransaction("Withdraw", amount);
            return true;
        }
        return false;
    }
}

