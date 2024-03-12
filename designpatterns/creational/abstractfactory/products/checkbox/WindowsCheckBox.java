package com.lld.designpatterns.creational.abstractfactory.products.checkbox;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
