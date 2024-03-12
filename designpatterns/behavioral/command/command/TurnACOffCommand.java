package com.lld.designpatterns.behavioral.command.command;

import com.lld.designpatterns.behavioral.command.receiver.AirConditioner;

public class TurnACOffCommand implements ICommand {

    AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
