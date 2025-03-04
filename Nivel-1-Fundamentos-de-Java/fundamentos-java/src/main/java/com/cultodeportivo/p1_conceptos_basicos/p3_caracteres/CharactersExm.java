package com.cultodeportivo.p1_conceptos_basicos.p3_caracteres;

public class CharactersExm {

    public static void main(String[] args) {
        
        char char_1 = 'a';
        char char_2 = 'b';
        char char_3 = 77; // ASCII value for 'M'

        System.out.println("char_1: " + char_1);
        System.out.println("char_2: " + char_2);
        System.out.println("char_3: " + char_3);

        // Comparación de caracteres
        System.out.println("char_1 == char_2: " + (char_1 == char_2));
        System.out.println("char_1 < char_2: " + (char_1 < char_2));

        // Operaciones con caracteres
        char char_4 = (char) (char_1 + 1);
        System.out.println("char_4 (char_1 + 1): " + char_4);

        // Conversión de caracteres a enteros
        int char_1_int = char_1;
        System.out.println("char_1 como entero: " + char_1_int);

        // Uso de caracteres en declaraciones condicionales
        if (char_1 == 'a') {
            System.out.println("char_1 es 'a'");
        } else {
            System.out.println("char_1 no es 'a'");
        }
    }

}