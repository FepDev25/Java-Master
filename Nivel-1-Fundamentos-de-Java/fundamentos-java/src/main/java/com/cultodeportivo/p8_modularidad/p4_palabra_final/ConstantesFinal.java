package com.cultodeportivo.p8_modularidad.p4_palabra_final;

public class ConstantesFinal {

    // Constante (el valor no puede cambiar)
    public static final double PI = 3.1416;

    // Método final (no puede ser sobreescrito en subclases)
    public final void metodoFinal() {
        System.out.println("Este método no puede ser sobreescrito.");
    }

    public static void main(String[] args) {
        System.out.println("Valor de PI: " + PI);
    }
}
