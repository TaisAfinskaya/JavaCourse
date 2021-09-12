package com.alpha.work1;

import java.util.Scanner;

public class Runner {
    public void run(){
        int number = inputNumber();
        double pi = MyCalculate.calcPi(number);
        System.out.println("PI =" + pi);

         pi = MyCalculate.calcPi2(number);
        System.out.println("PI =" + pi);
    }

    public int inputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements -> ");
        while (true) {
            if (sc.hasNextInt()){
                int number = sc.nextInt();
                if (number > 0) {
                    return number;
                }
            } else {
                sc.next();
            }
            System.out.println("Error enter number. Repeat!");
        }
    }

}
