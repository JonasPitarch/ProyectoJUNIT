package org.example;

public class MetodosGenerales {
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
