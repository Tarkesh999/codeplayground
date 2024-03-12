package com.lld.designpatterns.behavioral.command.receiver;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is Off");
    }

    public void setTemperature(int temp){
        temperature = temp;
        System.out.println("Temparature changed to: " + temp);
    }
}
