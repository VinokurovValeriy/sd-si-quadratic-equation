package com.company;

public class Main {

    public static void main(String[] args)
    {
        try{
            QuadraticEquation sol = new QuadraticEquation();
            sol.solvesTheQuadraticEquation();
        }
        catch (com.company.DiscriminantNegativeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
