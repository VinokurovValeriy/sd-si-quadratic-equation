package com.company;

import java.util.Scanner;

public class CoefficientScanner
{
    double firstCoefficient;
    double secondCoefficient;
    double thirdCoefficient;

    public void scanCoefficient()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First coefficient:");
        firstCoefficient = sc.nextDouble();
        System.out.println("second coefficient:");
        secondCoefficient = sc.nextDouble();
        System.out.println("third coefficient:");
        thirdCoefficient = sc.nextDouble();
        System.out.println(firstCoefficient + "x^2 + " + secondCoefficient + "x + " + thirdCoefficient + " = 0");
    }
}
