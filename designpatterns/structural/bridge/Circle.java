package com.lld.designpatterns.structural.bridge;

public class Circle extends Shapes{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String getShapeName() {
        return "Circle with color as  " + color.getColorName() + " and shape id " + shapeId;
    }
}
