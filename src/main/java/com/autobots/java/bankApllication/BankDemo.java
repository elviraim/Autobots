package com.autobots.java.bankApllication;

import com.autobots.streamApi.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class BankDemo {
    public static void main(String[] args) throws Exception {
        Mbank aliiaMBank = new Mbank(111122255465L, 444444444,"MBank");
        System.out.println(aliiaMBank.gatBalance());
        aliiaMBank.deposit(100000);
        System.out.println("__________________");
        System.out.println(aliiaMBank.gatBalance());

        Optima ulugbekOptima = new Optima(125543646623L, 555555555,"Optima");
        Bank.tranferFunds(aliiaMBank, ulugbekOptima, 500);
        Demir zinaidaDemir = new Demir(213134133553L, 666666666,"Demir");
        System.out.println(zinaidaDemir.gatBalance());

        Demir elviraDemir = new Demir(213134133545L, 777777777,"Demir");
        elviraDemir.deposit(50000);




        System.out.println("--------");
        BankBase.allBankRecords.stream().filter((n->n.gatBalance() > 100)).forEach(System.out::println);
        System.out.println("--------");
        double allSumBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::gatBalance).sum();
        System.out.println(allSumBanks);


        System.out.println(BankBase.allBankRecords);
        System.out.println(BankBase.allBankRecords.size());
        System.out.println(aliiaMBank.gatBalance());
        System.out.println(zinaidaDemir.gatBalance());
        System.out.println(ulugbekOptima.gatBalance());
        System.out.println(elviraDemir.gatBalance());



        System.out.println("*************");
        Map<String, List<BankBase>> groupedByBankName =
                BankBase.allBankRecords.stream()
                        .collect(Collectors.groupingBy(BankBase::getBankName));


        for (Map.Entry<String, List<BankBase>> entry : groupedByBankName.entrySet()) {
            System.out.println(entry.getKey() + ": " +entry.getValue().size());
            for (BankBase bank: entry.getValue()){
                System.out.println("Account number: " + bank.getAccountNumber()+"\nRouting number: " + bank.getRoutingNumber() );

            }

        }

        Map<String, Double> totalBalancePerBank =
                BankBase.allBankRecords.stream()
                        .collect(Collectors.groupingBy(BankBase::getBankName, // группируем по названию банка
                                Collectors.summingDouble(Bank::gatBalance)  // суммируем баланс
                        ));
        for (Map.Entry<String, Double> entry : totalBalancePerBank.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue() + ": ");
        }
        Map<String, List<BankBase>> usersByBankName =
                BankBase.allBankRecords.stream()
                        .collect(Collectors.groupingBy(BankBase::getBankName));


        for (Map.Entry<String, List<BankBase>> entry : groupedByBankName.entrySet()) {
            System.out.println(entry.getKey() + ": " +entry.getValue().size());
            for (BankBase bank: entry.getValue()){
                System.out.println("Account number: " + bank.getAccountNumber()+"\nRouting number: " + bank.getRoutingNumber() );

            }

        }




    }


}
