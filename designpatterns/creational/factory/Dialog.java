package com.lld.designpatterns.creational.factory;

public abstract class Dialog{
    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
