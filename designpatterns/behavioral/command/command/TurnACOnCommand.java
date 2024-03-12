package com.lld.designpatterns.behavioral.command.command;

import com.lld.designpatterns.behavioral.command.receiver.AirConditioner;

public class TurnACOnCommand implements ICommand {

    AirConditioner ac;
    public  TurnACOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
