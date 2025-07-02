package com.autobots.java.mobileBanking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccount {
    protected String accountNumber;// наследникам и внутри пакета доступны
    protected double balance;
    protected final Client owner;
    protected final Currency currency;
    protected final List<Transaction> transactions = new ArrayList<>();

    public BankAccount(Client owner, Currency currency) {
        this.owner = owner;
        this.currency = currency;
        this.accountNumber = UUID.randomUUID().toString();
    }

    // методы

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

    public void addTransaction(String type, double amount){
        transactions.add(new Transaction(type,amount));


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public Currency getCurrency() {
        return currency;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}