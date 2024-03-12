package com.lld.designpatterns.creational.abstractfactory;

import com.lld.designpatterns.creational.abstractfactory.products.button.Button;
import com.lld.designpatterns.creational.abstractfactory.products.button.MacOSButton;
import com.lld.designpatterns.creational.abstractfactory.products.checkbox.CheckBox;
import com.lld.designpatterns.creational.abstractfactory.products.checkbox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
}
