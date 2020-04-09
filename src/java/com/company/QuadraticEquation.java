package com.company;

import java.lang.*;

public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    public void solvesTheQuadraticEquation() throws DiscriminantNegativeException
    {
        CoefficientScanner sc = new CoefficientScanner();
        sc.scanCoefficient();
        a = sc.firstCoefficient;
        b = sc.secondCoefficient;
        c = sc.thirdCoefficient;
        double discriminant = calculateDiscriminant();
        if (discriminant == 0)
        {
            System.out.println("x: " + returnCoefficient());
        } else if (discriminant > 0)
        {
            System.out.println("x1: " + returnFirstCoefficient());
            System.out.println("x2: " + returnSecondCoefficient());
        } else
        {
            throw new DiscriminantNegativeException("Discriminant is negative");
        }
    }

    public double calculateDiscriminant()
    {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    public double returnFirstCoefficient()
    {
        return ((-b) - Math.sqrt(calculateDiscriminant())) / (2 * a);
    }

    public double returnSecondCoefficient()
    {
        return ((-b) + Math.sqrt(calculateDiscriminant())) / (2 * a);
    }

    public double returnCoefficient()
    {
        return (-b) / (2 * a);
    }
}
