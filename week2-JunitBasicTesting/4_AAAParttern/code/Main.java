package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            FactorialCalculator factorialCalculator = new FactorialCalculator();
            int number = 5;
            long result = factorialCalculator.factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}