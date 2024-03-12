package com.lld.designpatterns.creational.abstractfactory;

import com.lld.designpatterns.creational.abstractfactory.products.button.Button;
import com.lld.designpatterns.creational.abstractfactory.products.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}