package com.lld.designpatterns.creational.factory;

public class HTMLDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
