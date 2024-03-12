package com.lld.designpatterns.creational.factory;

import static com.lld.utils.ConsolePrint.printLog;

public class WindowsButton implements Button{
    @Override
    public void render() {
        printLog("Windows Rendering.... ");
    }

    @Override
    public void click() {
        printLog("Windows Click..... ");
    }
}
