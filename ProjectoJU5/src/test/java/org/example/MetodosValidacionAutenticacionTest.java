package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodosValidacionAutenticacionTest {

    @Test
    void validarCorreoElectronico() {
        MetodosValidacionAutenticacion metodosVA = new MetodosValidacionAutenticacion();
        assertTrue(metodosVA.validarCorreoElectronico("usuario@example.com"));
    }

    @Test
    void validarContraseña() {
        MetodosValidacionAutenticacion metodosVA = new MetodosValidacionAutenticacion();
        assertTrue(metodosVA.validarContraseña("contraseñaSegura123"));
    }
}