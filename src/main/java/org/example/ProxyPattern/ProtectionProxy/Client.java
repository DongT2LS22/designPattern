package org.example.ProxyPattern.ProtectionProxy;

public class Client {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("gpcoder", "ADMIN");
        admin.load();
        admin.insert();

        UserService customer = new UserServiceProxy("customer", "guest");
        customer.load();
        customer.insert();
    }
}
