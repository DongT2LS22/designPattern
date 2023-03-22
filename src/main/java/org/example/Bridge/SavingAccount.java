package org.example.Bridge;

public class SavingAccount implements Account{

    @Override
    public void openAccount() {
        System.out.println("Saving...");
    }
}
