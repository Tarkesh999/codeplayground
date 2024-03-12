package com.lld.designpatterns.creational.factory;

public class Demo {

    public static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    static void configure(){
        System.setProperty("temp","html");
        if(System.getProperty("temp").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HTMLDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
