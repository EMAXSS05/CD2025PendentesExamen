package com.xulioxesus;

/**
 * Clase que dispone de un solo método.
 */
class BubbleSort {
    /**
     * Método que se encarga de ordenar.
     * @param arr es un array de enteros.
     * @param n   es un numero entero.
     * @author Emanuel Rodriguez Baltazar.
     */
    public void ordenar(int[] arr, int n) {
        int i;
        int j;
        /**
         * Variable auxiliar que nos ayudará a intercambiar los valores.
         */
        int temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }
}
