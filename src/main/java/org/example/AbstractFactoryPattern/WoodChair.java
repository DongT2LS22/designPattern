package org.example.AbstractFactoryPattern;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("This is wood chair");
    }
}
