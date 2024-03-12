package com.lld.designpatterns.structural.decorator;

public class MozarellaTopping extends  ToppingDecorator{

    public MozarellaTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Mozarella";
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }
}
