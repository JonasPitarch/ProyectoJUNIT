package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodosGeneralesTest {

    @Test
    void esPar() {
        MetodosGenerales metodos = new MetodosGenerales();
        assertTrue(metodos.esPar(4));
        assertFalse(metodos.esPar(3));
    }

    @Test
    void esPrimo() {
        MetodosGenerales metodos = new MetodosGenerales();
        assertTrue(metodos.esPrimo(8));//si quei ponemos 7 dara bien el test
        assertFalse(metodos.esPrimo(9));
    }//error provocado adrede
}