package com.alpha.work2;

import com.alpha.work1.Device;
import com.alpha.work1.EthernetAdapter;
import com.alpha.work1.Monitor;

public class Runner {
    public void run(){

        Shape shape = new Shape("red");
        System.out.println(shape);
        System.out.println("Area: " + shape.calcArea());

        Circle circle = new Circle("green", 10.5);
        System.out.println(circle);
        System.out.println("Area: " + circle.calcArea());

        Rectangle rectangle = new Rectangle("blue", 4.0 , 5.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.calcArea());

        Triangle triangle = new Triangle("Black", 10.0, 10 , 5.0);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.calcArea());

        Shape[] shapes = {
                new Rectangle( "Red", 56.00, 100),
                new Rectangle("Blue", 10, 10),
                new Rectangle("Brown", 100, 100),
                new Rectangle( "Yellow", 5.0, 6.0),
                new Circle("Orange", 10),
                new Circle("Рurple", 100),
                new Circle( "White", 5.00),
                new Triangle("Black", 10.0, 10, 3.0),
                new Triangle("Gray", 3.0, 3.0, 3.0)
        };

        printShapesWithArea(shapes);
        printAllArea(shapes);
        printAreaByType(Triangle.class, shapes);
        printAreaByType2(shapes);
    }

    private void printShapesWithArea(Shape[] shapes) {
        for (Shape element: shapes) {
            System.out.println(element  + " Area: " + element.calcArea());
        }
    }

    private void printAllArea(Shape[] shapes) {
        double allArea = 0;
        for (Shape element: shapes) {
            allArea = allArea + element.calcArea();
        }
        System.out.println("All area of " + shapes.length + " shapes: " + allArea);
    }

    private void printAreaByType(Class type, Shape[] shapes) {
        double allArea = 0;
        for (Shape element: shapes) {
            if( type.equals(element.getClass())){
                allArea = allArea + element.calcArea();
            }
        }
        System.out.println("All area of type " + type.getSimpleName() + " shapes: " + allArea);
    }

    private void printAreaByType2(Shape[] shapes) {
        double allArea = 0;
        for (Shape element: shapes) {
            if(element instanceof Triangle){
                allArea = allArea + element.calcArea();
            }
        }
        System.out.println("All area of type " + Triangle.class.getSimpleName() + " shapes: " + allArea);
    }
}
