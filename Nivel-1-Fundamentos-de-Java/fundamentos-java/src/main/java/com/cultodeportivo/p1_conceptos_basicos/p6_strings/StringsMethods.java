package com.cultodeportivo.p1_conceptos_basicos.p6_strings;

public class StringsMethods {

    public static void main(String[] args) {
        // Declaración de Strings
        String frase = "Hola, soy Felipe y estudio computación.";

        // Métodos comunes de Strings
        System.out.println("Longitud de la frase: " + frase.length());
        System.out.println("El carácter en la posición 1: " + frase.charAt(1));
        System.out.println("La frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("La frase en minúsculas: " + frase.toLowerCase());
        System.out.println("¿La frase contiene 'Felipe'? " + frase.contains("Felipe"));
        System.out.println("Reemplazar 'Felipe' por 'Juan': " + frase.replace("Felipe", "Juan"));
        System.out.println("Subcadena de la frase (0, 4): " + frase.substring(0, 4));
        System.out.println("¿La frase empieza con 'Hola'? " + frase.startsWith("Hola"));
        System.out.println("¿La frase termina con 'computación.'? " + frase.endsWith("computación."));
        System.out.println("Índice de la primera aparición de 'Felipe': " + frase.indexOf("Felipe"));
        System.out.println("Índice de la última aparición de 'Felipe': " + frase.lastIndexOf("Felipe"));
        System.out.println("¿La frase está vacía? " + frase.isEmpty());
        System.out.println("Comparación lexicográfica con 'Hola, soy Juan y estudio computación.': " + frase.compareTo("Hola, soy Juan y estudio computación."));
        System.out.println("¿La frase es igual a 'Hola, soy Felipe y estudio computación.'? " + frase.equals("Hola, soy Felipe y estudio computación."));
        System.out.println("¿La frase es igual a 'hola, soy felipe y estudio computación.' ignorando mayúsculas? " + frase.equalsIgnoreCase("hola, soy felipe y estudio computación."));
        System.out.println("Frase sin espacios en blanco al inicio y al final: '" + frase.trim() + "'");
        System.out.println("Dividir la frase por espacios: ");
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }        
        System.out.println("Repetir la frase 3 veces: " + frase.repeat(3));
        System.out.println("Reemplazar todas las vocales por '*': " + frase.replaceAll("[aeiouAEIOU]", "*"));
        System.out.println("Convertir la frase a un array de caracteres: ");
        char[] caracteres = frase.toCharArray();
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("¿La frase es blanca o está vacía? " + frase.isBlank());
        System.out.println("Unir palabras con '-': " + String.join("-", palabras));
    }
}
