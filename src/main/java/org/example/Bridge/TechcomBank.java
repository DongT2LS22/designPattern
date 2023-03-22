package org.example.Bridge;

public class TechcomBank extends Bank{


    public TechcomBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account TechcomBank is a ");
        account.openAccount();
    }
}
