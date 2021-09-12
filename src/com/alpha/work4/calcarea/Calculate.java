package com.alpha.work4.calcarea;

public class Calculate {
    private static final double PI = 3.1415926;

    public static double areaCircle(double radius){
        double area = PI * radius * radius;
        return area;
    }

    public static int areaSquare(int side){
        int area = side * side;
        return area;
    }

}

// площадь круга S = 3.1415926 × r2
// площадь квадрата S = a × a
