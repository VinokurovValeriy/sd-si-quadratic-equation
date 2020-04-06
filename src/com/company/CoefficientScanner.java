package com.company;

import java.util.Scanner;

public class CoefficientScanner
{
    protected double a;
    protected double b;
    protected double c;

    public void scanCoefficient()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First coefficient:");
        a = sc.nextDouble();
        System.out.println("second coefficient:");
        b = sc.nextDouble();
        System.out.println("third coefficient:");
        c = sc.nextDouble();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
    }
}
