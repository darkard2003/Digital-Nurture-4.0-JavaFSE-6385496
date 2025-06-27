package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleAssertionsTest {
    @Test
    public void testAssertions(){
        assertEquals(5+3, 8, "5 + 3 should equal 8");
        assertTrue(5 > 3, "5 should be greater than 3");
        assertFalse(3 > 5, "3 should not be greater than 5");
        assertNull(null, "This should be null");
        assertNotNull("Hello", "This should not be null");
        assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0; // This will throw an ArithmeticException
        }, "Division by zero should throw ArithmeticException");
    }
}
