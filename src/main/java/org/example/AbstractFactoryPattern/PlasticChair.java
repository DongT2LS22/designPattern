package org.example.AbstractFactoryPattern;

public class PlasticChair implements Chair{

    @Override
    public void create() {
        System.out.println("This is plastic chair");
    }
}
