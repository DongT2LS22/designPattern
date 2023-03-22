package org.example.AbstractFactoryPattern;

public class PlasticTable implements Table{
    @Override
    public void create() {
        System.out.println("This is plastic table");
    }
}
