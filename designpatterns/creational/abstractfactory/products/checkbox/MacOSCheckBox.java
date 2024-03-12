package com.lld.designpatterns.creational.abstractfactory.products.checkbox;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
