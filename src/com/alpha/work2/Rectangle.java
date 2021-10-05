package com.alpha.work2;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ": color = " + color +
                ", width = " + width +
                ", height = " + height;
    }

    @Override
    public double calcArea() {
        double area = width*height;
        return area;
    }
}
