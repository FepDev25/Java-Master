package com.cultodeportivo.p2_checked_unchecked.p2_unchecked;

public class EjemploUnchecked {
    public static void main(String[] args) {

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Provocará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error al acceder al elemento del array: " + e.getMessage());
        }

        // El compilador no obliga a manejar la excepción, pero se recomienda hacerlo.
        
    }
}
