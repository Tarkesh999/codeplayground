package com.lld.designpatterns.structural.bridge;

public class Rectangle extends Shapes{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String getShapeName() {
        return "Rectangle with color as : " + color.getColorName() + " and shape id " + shapeId;
    }
}
