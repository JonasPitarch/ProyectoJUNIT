package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodosArraysTest {

    @Test
    void sumarArray() {
        MetodosArrays metodosArrays = new MetodosArrays();
        assertEquals(10, metodosArrays.sumarArray(new int[]{1, 2, 3, 4}));
    }

    @Test
    void contieneElemento() {
        MetodosArrays metodosArrays = new MetodosArrays();
        assertTrue(metodosArrays.contieneElemento(new int[]{1, 2, 3, 4}, 3));
    }
}