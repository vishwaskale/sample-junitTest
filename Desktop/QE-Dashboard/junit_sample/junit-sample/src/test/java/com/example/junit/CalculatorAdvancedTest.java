package com.example.junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
//import com.example.junit.Calculator;

public class CalculatorAdvancedTest {
    @ParameterizedTest
    @CsvSource({"0,0,0", "-1,-1,-2", "100,200,300", "-5,5,0"})
    void testAddVarious(int a, int b, int expected) {
    Calculator calc = new Calculator();
    assertEquals(expected, calc.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({"0,0,0", "-1,-1,0", "100,200,-100", "-5,5,-10"})
    void testSubtractVarious(int a, int b, int expected) {
        
        Calculator calc = new Calculator();
        assertEquals(expected, calc.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({"0,0,0", "-1,-1,1", "100,2,200", "-5,5,-25"})
    void testMultiplyVarious(int a, int b, int expected) {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({"6,3,2", "-10,2,-5", "100,10,10"})
    void testDivideVarious(int a, int b, int expected) {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.divide(a, b));
    }

    @Test
    void testDivideNegative() {
        Calculator calc = new Calculator();
        assertEquals(-2, calc.divide(-6, 3));
        assertEquals(-2, calc.divide(6, -3));
        assertEquals(2, calc.divide(-6, -3));
    }

    @RepeatedTest(3)
    void testMultiplyByZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.multiply(0, 100));
        assertEquals(0, calc.multiply(100, 0));
    }
}
