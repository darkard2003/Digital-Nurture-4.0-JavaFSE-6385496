package org.example;

import org.junit.Test;

public class SimpleMathTest {
    @Test
    public void testAdd() {
        SimpleMath math = new SimpleMath();
        int result = math.add(2, 3);
        assert result == 5 : "Expected 5 but got " + result;

    }
}
