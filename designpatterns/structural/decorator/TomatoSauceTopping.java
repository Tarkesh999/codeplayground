package com.lld.designpatterns.structural.decorator;

public class TomatoSauceTopping extends ToppingDecorator{

    public TomatoSauceTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " with Tomato Sauce";
    }

    @Override
    public int getCost() {
        return tempPizza.getCost() + 5;
    }
}
