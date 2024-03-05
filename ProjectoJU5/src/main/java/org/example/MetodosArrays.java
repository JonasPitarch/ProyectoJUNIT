package org.example;

import java.util.Arrays;

public class MetodosArrays {

    public int sumarArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    public boolean contieneElemento(int[] array, int elemento) {
        return Arrays.stream(array).anyMatch(e -> e == elemento);
    }


}