package com.company;

public class Main {

    public static void main(String[] args){
        try{
        QuadraticSolution sol = new QuadraticSolution();
        sol.scanCoefficient();
        sol.solution();
        }
        catch (DiscremenantIsNegativeException ex){
        System.out.println(ex.getMessage());
        }
    }
}
