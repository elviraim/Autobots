package com.autobots.java.mobileBanking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
    private final String fullName;
    private final String clientID;
    private final String pin;
    private final List<BankAccount>accounts=new ArrayList<>();
    // создаем конструктор, убираем clientID - мы не даем, система сама автоматом присваевается банком
    // автоинкриминтироваться, поэтому в параметры не выносим

    public Client(String fullName, String pin) {
        this.fullName = fullName;
        this.pin =pin;
        this.clientID=String.valueOf(UUID.randomUUID());
    }
    // создадим метод

    public boolean authenticate (String inputPin){
        return this.pin.equals(inputPin); // если правильно ввел пин
    }
    void addAccount (BankAccount account){
        accounts.add(account);
    }

    public String getFullName() {
        return fullName;
    }

    public String getClientID() {
        return clientID;
    }
    public String getPin() {
        return pin;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }


    // из-за того что файнали сет не сможем сформировать

}
