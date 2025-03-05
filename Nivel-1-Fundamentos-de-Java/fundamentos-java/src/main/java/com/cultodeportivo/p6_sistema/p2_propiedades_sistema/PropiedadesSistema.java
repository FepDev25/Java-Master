package com.cultodeportivo.p6_sistema.p2_propiedades_sistema;

public class PropiedadesSistema {
    public static void main(String[] args) {
        // Imprimir todas las propiedades del sistema
        System.out.println("Propiedades del sistema:");
        System.getProperties().list(System.out);

        // Imprimir una propiedad concreta
        System.out.println("Propiedad 'java.version': " + System.getProperty("java.version"));
    }
}
