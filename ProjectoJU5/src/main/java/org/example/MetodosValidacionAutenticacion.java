package org.example;

public class MetodosValidacionAutenticacion {
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8;
    }
}
