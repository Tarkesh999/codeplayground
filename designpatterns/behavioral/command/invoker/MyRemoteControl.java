package com.lld.designpatterns.behavioral.command.invoker;

import com.lld.designpatterns.behavioral.command.command.ICommand;

import java.util.Stack;

public class MyRemoteControl {

    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo(){
        if(!acCommandHistory.empty()){
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
