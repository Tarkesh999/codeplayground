package com.lld.designpatterns.behavioral.chainofresponsibility;

public class AddNumbers implements Chain{

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "add"){

            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()+request.getNumber2()));

        } else {
            System.out.println("Unable to process in Add, delegating to the next");
            nextInChain.calculate(request);

        }

    }
}
