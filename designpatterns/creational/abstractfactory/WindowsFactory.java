package com.lld.designpatterns.creational.abstractfactory;

import com.lld.designpatterns.creational.abstractfactory.products.button.Button;
import com.lld.designpatterns.creational.abstractfactory.products.button.WindowsButton;
import com.lld.designpatterns.creational.abstractfactory.products.checkbox.CheckBox;
import com.lld.designpatterns.creational.abstractfactory.products.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
