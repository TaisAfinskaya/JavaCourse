package com.alpha.work1;

public class MyCalculate {
    public static double calcPi(int numberElements) {
        double result = 0.0;

        for (int i = 1; i <= numberElements; i++) {
            double divider = 2 * i - 1;
            final double NUMERATOR = 4.0;
            if (i % 2 != 0) {
                result += NUMERATOR / divider;
            } else {
                result -= NUMERATOR / divider;
            }
        }
        return result;
    }

    public static double calcPi2(int numberElements) {
        double pi = 0.0;

        boolean isOdd = true;

        int divider =1;
        for (int i = 1; i <= numberElements; i++, divider+=2) {
            double part = 4.0 / divider;
            if (isOdd) {
                pi += part;
                isOdd = false;
            } else {
                pi -= part;
                isOdd = true;
            }
        }
        return pi;
    }
}

