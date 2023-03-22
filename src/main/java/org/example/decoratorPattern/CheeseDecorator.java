package org.example.decoratorPattern;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = mPizza.doPizza();
        return type + addCheese();
    }

    private String addCheese(){
        return " Cheese";
    }
}
