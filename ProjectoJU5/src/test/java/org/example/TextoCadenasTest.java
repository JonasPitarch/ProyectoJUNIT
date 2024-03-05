package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextoCadenasTest {

    @Test
    void invertirCadena() {
        TextoCadenas textoCadenas = new TextoCadenas();
        assertEquals("aloh", textoCadenas.invertirCadena("hola"));
    }//test pasado con exito

    @Test
    void contarPalabras() {
        TextoCadenas textoCadenas = new TextoCadenas();
        assertEquals(3, textoCadenas.contarPalabras("Esto es una prueba"));
        assertEquals(5,textoCadenas.contarPalabras("Hola muy buenas tardes muchacho"));
    }//este test deve de dar error en el primero y acierto en el segundo

}