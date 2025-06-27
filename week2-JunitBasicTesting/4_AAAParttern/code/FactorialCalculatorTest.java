package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    FactorialCalculator factorialCalculator;

    @BeforeEach
    public void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @Test
    @DisplayName("Test factorial of 0")
    public void testFactorialOfZero() {
        long result = factorialCalculator.factorial(0);
        assertEquals(1, result, "Expected 1 but got " + result);
    }

    @Test
    @DisplayName("Test factorial of 1")
    public void testFactorialOfOne() {
        long result = factorialCalculator.factorial(1);
        assertEquals(1, result, "Expected 1 but got " + result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5, 6})
    @DisplayName("Parametrized test for factorial of positive integers")
    public void testFactorialOfPositiveIntegers(int number) {
        long result = factorialCalculator.factorial(number);
        long expected = 1;
        for (int i = 2; i <= number; i++) {
            expected *= i;
        }
        assertEquals(expected, result, "Expected " + expected + " but got " + result + " for input " + number);
    }

    @Test
    @DisplayName("Test factorial of negative number throws exception")
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> factorialCalculator.factorial(-1) ,
                "Expected IllegalArgumentException for negative input");
    }

    @AfterEach
    public void tearDown() {
        factorialCalculator = null;
    }
}
