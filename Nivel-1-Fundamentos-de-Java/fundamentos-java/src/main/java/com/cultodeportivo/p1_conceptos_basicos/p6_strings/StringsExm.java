package com.cultodeportivo.p1_conceptos_basicos.p6_strings;

public class StringsExm {
    public static void main(String[] args) {
        // Declaración de Strings
        String saludo = "Hola, Mundo!";
        String nombre = "Felipe";
        String textoLargo = "Este es un texto largo que puede contener múltiples líneas y caracteres especiales como ñ, á, é, í, ó, ú.";

        // Concatenación de Strings
        String saludoCompleto = saludo + " Mi nombre es " + nombre + ".";
        System.out.println(saludoCompleto);
        System.out.println(textoLargo);

        // Comparación de Strings
        String otroSaludo = "Hola, Mundo!";
        System.out.println("¿Los saludos son iguales? " + saludo.equals(otroSaludo));
        System.out.println("Comparación lexicográfica: " + saludo.compareTo(otroSaludo));

    }
}