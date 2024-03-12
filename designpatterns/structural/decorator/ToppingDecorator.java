package com.lld.designpatterns.structural.decorator;

abstract class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;
    ToppingDecorator(Pizza pizza){
        tempPizza = pizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }
}
