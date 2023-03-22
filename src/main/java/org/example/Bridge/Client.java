package org.example.Bridge;

public class Client {
    public static void main(String[] args) {
        Bank bank = new TechcomBank(new SavingAccount());
        bank.openAccount();
    }
}
