package com.alpha.work2;

public class Triangle extends Shape{
    double a;
    double b;
    double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ": color = " + color + '\'' +
                ", a = " + a +
                ", b = " + b +
                ", c = " + c;
    }

    @Override
    public double calcArea() {
        double area;
        double semiPerimeter = (a + b + c)/2;
        area = Math.sqrt(semiPerimeter*(semiPerimeter - a)*(semiPerimeter - b)*(semiPerimeter - c));
        return area;
    }
}
