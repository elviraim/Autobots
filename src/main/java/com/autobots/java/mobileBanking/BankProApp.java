package com.autobots.java.mobileBanking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BankProApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Client> clients = new ArrayList<>();

    public static void main(String[] args) {
        seedTestData();
        System.out.println("Welcome to Bank System!");
        System.out.println("Enter clientID: ");
        String inputID = scanner.nextLine();


        UUID clientID;
        try {
            clientID = UUID.fromString(inputID);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid format clientID.");
            return;
        }
        System.out.println("Enter PIN code: ");
        String inputPin = scanner.nextLine();

        Client currentClient = null;
        for (Client c : clients) {
            if (c.getClientID().equals(clientID) && c.authenticate(inputPin)) {
                currentClient = c;
                break;
            }
        }
        if (currentClient == null) {
            System.out.println("Invalid client ID or PIN.");
            return;

        }

        System.out.println("Logig successful. Welcome, " + currentClient.getFullName());
        showMainMenu(currentClient);

    }
    public static void showMainMenu(Client currentClient){
        while (true) {

            System.out.println("\n====Меню====");
            System.out.println("1. Show accounts");
            System.out.println("2. Transfer between accounts");
            System.out.println("3. Show transaction history");
            System.out.println("0. Exit");
            System.out.println("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> showAccounts(currentClient);
                case "2" -> transferBetweenAccounts(currentClient);
                case "3" -> showTransactions(currentClient);
                case "0" -> {
                    System.out.println("Exit from System.Good luck");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }

        }
    }
    private static void seedTestData() {
        Client alice = new Client("Alice Johnson", "1234");
        BankAccount usdAccount = new DepositAccount(alice, Currency.USD);
        BankAccount eurAccount = new CreditAccount(alice, Currency.EUR);
        usdAccount.deposit(1000);
        eurAccount.deposit(500);

        alice.addAccount(usdAccount);
        alice.addAccount(eurAccount);

        clients.add(alice);

        System.out.println("Test Client ID: " + alice.getClientID());
        System.out.println("PIN: 1234");

        Client bob = new Client("Bob Smith", "4321");
        DepositAccount bobDeposit = new DepositAccount(bob, Currency.KGS);
        bobDeposit.deposit(100000);
        bob.addAccount(bobDeposit);
        clients.add(bob);

        System.out.println("\n=== Test Clients ===");
        for (Client c : clients) {
            System.out.println("Name: " + c.getFullName());
            System.out.println("Client ID: " + c.getClientID());
            System.out.println("PIN: 4321");
            System.out.println("Accounts:");
            for (BankAccount acc : c.getAccounts()) {
                System.out.println("  - " + acc.getClass().getSimpleName() + ": " + acc.getAccountNumber() + " | " + acc.getCurrency() + " | Balance: " + acc.getBalance());
                ;
            }
            System.out.println();
        }


    }

    private static void showAccounts(Client client) {
        for (BankAccount account : client.getAccounts()) {
            System.out.println("Account type: " + account.getClass().getSimpleName());
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Currency: " + account.getCurrency());
            System.out.println("_________________________________________");
        }
    }

    private static BankAccount findAccountGlobally(String accountNumber) {
        for (Client c : clients) {
            for (BankAccount acc : c.getAccounts()) {
                if (acc.getAccountNumber().toString().equals(accountNumber)) {
                    return acc;
                }
            }
        }
        return null;
    }

    private static void transferBetweenAccounts(Client client) {
        System.out.println("Enter sender account number: ");
        String fromNumber = scanner.nextLine().trim();

        System.out.println("Enter receiver account number: ");
        String toNumber = scanner.nextLine().trim();

        BankAccount from = findAccountGlobally(fromNumber);
        BankAccount to = findAccountGlobally(toNumber);

        if (from == null || to == null) {
            System.out.println("Invalid account number(s).");
            return;
        }
        if (!client.getAccounts().contains(from)) {
            System.out.println("You can only send money from your own accounts.");
            return;
        }

        System.out.println("Enter amount: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
            if (amount <= 0) {
                System.out.println("Amount must be positive.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format.");
            return;
        }
        boolean success = BankService.transfer(from, to, amount);
        if(success){
            System.out.println("Transfer successful.");
        }else {
            System.out.println("Transfer failed. Possible reasons:");
            System.out.println("- Insufficient funds");
            System.out.println("- Exceeds credit limit (for credit accounts)");
        }
    }
    private static void showTransactions (Client client){
        for(BankAccount account : client.getAccounts()) {
            System.out.println("Transactions for Account: " + account.getAccountNumber());
            for (Transaction t : account.getTransactions()) {
                System.out.println(t);
            }
            System.out.println("__________________________________________");
        }
    }
}
