package com.example.junit;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        // Critical issue: no check for division by zero
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
