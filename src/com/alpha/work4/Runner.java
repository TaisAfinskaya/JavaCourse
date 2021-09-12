package com.alpha.work4;

import com.alpha.work4.calcarea.Calculate;

import java.util.Scanner;

public class Runner {
    public void run(){
        double radius = inputCircleRadius();
        double areaCircle = Calculate.areaCircle(radius);
        System.out.println("AreaCircle: " + areaCircle);

        System.out.println();

        int side = inputSquareSide();
        int areaSquare = Calculate.areaSquare(side);
        System.out.println("AreaSquare: " + areaSquare);

    };

    public double inputCircleRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius -> ");
        while (true) {
            if (sc.hasNextDouble()){
                double radius = sc.nextDouble();
                if (radius > 0) {
                    return radius;
                }
            } else {
                sc.next();
            }
            System.out.println("Error enter radius. Repeat!");
        }
    }

    public int inputSquareSide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a square -> ");
        while (true) {
            if (sc.hasNextInt()){
                int side = sc.nextInt();
                if (side > 0) {
                    return side;
                }
            } else {
                sc.next();
            }
            System.out.println("Error enter side of a square. Repeat!");
        }
    }
}
