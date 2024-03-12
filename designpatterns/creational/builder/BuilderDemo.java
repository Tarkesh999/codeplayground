package com.lld.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args){
        Computer computer =new Computer.ComputerBuilder("HDD","RAM")
                                    .setGraphicsCardEnabled(true)
                                    .setHDD("New HDD").build();

    }
}
