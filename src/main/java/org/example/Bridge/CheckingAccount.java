package org.example.Bridge;

public class CheckingAccount implements Account{

    @Override
    public void openAccount() {
        System.out.print(" Checking...");
    }
}
