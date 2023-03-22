package org.example.AbstractFactoryPattern;

public class WoodTable implements Table{
    @Override
    public void create() {
        System.out.println("This is wood table");
    }
}
