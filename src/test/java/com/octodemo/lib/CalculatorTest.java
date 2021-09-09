package com.octodemo.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest
{

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        // calling the add
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void subtraction() {
        assertEquals(2, calculator.sub(4, 2));
        assertEquals(0, calculator.sub(2, 2));
        assertEquals(1, calculator.sub(3, 2));
    }

    @Test
    void testSimpleMethods() {
        assertEquals(null, calculator.toUpper(""));
        assertEquals("DEMO", calculator.toUpper("dEmo"));
    }


}
