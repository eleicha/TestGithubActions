package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.addition(3, 2), "Addition should return the sum of two numbers");
    }
}
