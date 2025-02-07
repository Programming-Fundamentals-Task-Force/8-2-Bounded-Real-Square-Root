package com.lab;

public class App {
    public static void main(String[] args) {
        try {
            double result = MathUtils.squareRoot(25.0);
            System.out.println("Result: " + result);
            result = MathUtils.squareRoot(-9);
            System.out.println("Result: " + result);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Computation completed.");
        }
    }
}
