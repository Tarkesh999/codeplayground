package com.lld.designpatterns.structural.decorator;

public class PlainPizza implements  Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
