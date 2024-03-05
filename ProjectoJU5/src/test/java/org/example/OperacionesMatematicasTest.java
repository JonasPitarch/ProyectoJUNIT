package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {

    @Test
    void sumar() {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();
        assertEquals(5, operaciones.sumar(2, 3));
    }

    @Test
    void restar() {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();
        assertEquals(2, operaciones.restar(5, 3));
        assertEquals(3,operaciones.restar(8,6));
    }
    //en este estoy provocando un error en el segundo de restar
}