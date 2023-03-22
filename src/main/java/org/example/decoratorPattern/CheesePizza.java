package org.example.decoratorPattern;

public class CheesePizza implements IPizza{

    @Override
    public String doPizza() {
        return "I'm a Cheese Pizza";
    }
}
