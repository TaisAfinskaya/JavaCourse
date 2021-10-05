package com.alpha.work2;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ": color = " + color +
                ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI + radius * radius;
    }
}
