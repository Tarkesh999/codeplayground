package com.lld.designpatterns.creational.builder;


public class Computer {

    //required params
    private String HDD;
    private String RAM;

    //optional Params
    private boolean isGraphicsCardEnabled;

    private Computer(ComputerBuilder computerBuilder){
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        System.out.println(String.format("The HDD is %s and the RAM is %s and graphic card is enabled: %s",
                HDD,RAM,isGraphicsCardEnabled));
    }

    public static class ComputerBuilder{
        //required params
        private String HDD;
        private String RAM;

        //optional Params
        private boolean isGraphicsCardEnabled;

        public ComputerBuilder(String HDD, String RAM){
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
