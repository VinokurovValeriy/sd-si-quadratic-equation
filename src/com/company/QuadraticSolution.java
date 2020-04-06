package com.company;

import java.lang.*;
import java.util.Scanner;

public class QuadraticSolution {
    private double x1;
    private double x2;
    private double singleX;
    private double D;
    private double a;
    private double b;
    private double c;

    public void scanCoefficient() throws DiscremenantIsNegativeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("First coefficient:");
        a = sc.nextInt();
        System.out.println("second coefficient:");
        b = sc.nextInt();
        System.out.println("third coefficient:");
        c = sc.nextInt();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
    }

    public void solution() throws DiscremenantIsNegativeException {
        D = (Math.pow(b, 2) - (4 * a * c));
        if (D == 0) {
            singleX = (-b) / (2 * a);
            System.out.println("x:" + singleX);
        } else if (D > 0) {
            x1 = ((-b) - Math.sqrt(D)) / (2 * a);
            x2 = ((-b) + Math.sqrt(D)) / (2 * a);
            System.out.println("x1:" + x1);
            System.out.println("x2:" + x2);
        } else {
            throw new DiscremenantIsNegativeException("D is negative");
        }
    }
}
