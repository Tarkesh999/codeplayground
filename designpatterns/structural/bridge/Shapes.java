package com.lld.designpatterns.structural.bridge;

import java.util.UUID;

public abstract class Shapes {

    long shapeId;
    Color color;

    Shapes(Color color){
        this.shapeId = UUID.randomUUID().getMostSignificantBits();
        this.color = color;
    }

    public void samplePrint(){
        System.out.println("Heyy from Shapes!");
    }

    public abstract String getShapeName();
}
