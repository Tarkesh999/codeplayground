package com.lld.designpatterns.creational.abstractfactory;

import com.lld.designpatterns.creational.abstractfactory.products.button.Button;
import com.lld.designpatterns.creational.abstractfactory.products.checkbox.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
