package com.lld.designpatterns.creational.abstractfactory.products.button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOsButton.");
    }
}
