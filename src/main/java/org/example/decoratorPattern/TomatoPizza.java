package org.example.decoratorPattern;

public class TomatoPizza implements IPizza{

    @Override
    public String doPizza() {
        return "I'm a Tomato Pizza";
    }
}
