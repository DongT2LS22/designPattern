package org.example.factoryPattern;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.MBBank);
        System.out.println(bank.getBankName()); // TPBank
    }
}
