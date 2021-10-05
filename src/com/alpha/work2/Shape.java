package com.alpha.work2;

public class Shape {
    String  color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ": color = " + color;
    }

    public double calcArea(){
        return 0.0;
    }
}
