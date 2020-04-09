package com.company;

public class Main {

    public static void main(String[] args)
    {
        try{
            QuadraticEquation sol = new QuadraticEquation();
            sol.solvesTheQuadraticEquation();
        }
        catch (DiscriminantNegativeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
