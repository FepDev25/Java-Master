package com.cultodeportivo.p8_modularidad.p3_clases_metodos_estaticos;

public class ClaseEstatica {

    // Variable estática
    private static int contador = 0;

    // Método estático
    public static void incrementar() {
        contador++;
        System.out.println("Contador: " + contador);
    }

    public static void main(String[] args) {
        ClaseEstatica.incrementar();
        ClaseEstatica.incrementar();
    }
}
