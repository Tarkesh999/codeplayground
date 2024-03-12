package com.lld.designpatterns.behavioral.command;

import com.lld.designpatterns.behavioral.command.command.TurnACOnCommand;
import com.lld.designpatterns.behavioral.command.invoker.MyRemoteControl;
import com.lld.designpatterns.behavioral.command.receiver.AirConditioner;

public class Client {

    public static void main(String[] args){

        //AC Object - Receiver
        AirConditioner ac = new AirConditioner();

        //Remote Object - Invoker
        MyRemoteControl remote = new MyRemoteControl();

        remote.setCommand(new TurnACOnCommand(ac));
        remote.pressButton();

        remote.undo();

    }
}
