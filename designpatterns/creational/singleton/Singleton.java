package com.lld.designpatterns.creational.singleton;

public final class Singleton {

    public static volatile  Singleton instance;
    private String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        Singleton result = instance;
        if(result != null) return result;

        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
