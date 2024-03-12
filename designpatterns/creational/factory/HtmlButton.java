package com.lld.designpatterns.creational.factory;

import static com.lld.utils.ConsolePrint.printLog;

public class HtmlButton implements Button{
    @Override
    public void render() {
        printLog("HTML Rendering....");
    }

    @Override
    public void click() {
        printLog("HTML Click.....");
    }
}
