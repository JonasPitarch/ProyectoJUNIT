package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumericMethodsTest {

    @Test
    void metodoNumerico() {
        assertEquals(5, NumericMethods.metodoNumerico(2, 3));
        assertEquals(10,NumericMethods.metodoNumerico(7,3));
        assertEquals(2,NumericMethods.metodoNumerico(0,2));
    }
}