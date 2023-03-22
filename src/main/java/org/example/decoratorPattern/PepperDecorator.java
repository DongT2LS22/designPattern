package org.example.decoratorPattern;

public class PepperDecorator extends PizzaDecorator{

    public PepperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = mPizza.doPizza();
        return type + addPepper();
    }
    private String addPepper(){
        return " Pepper";
    }
}
