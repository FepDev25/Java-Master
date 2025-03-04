package com.cultodeportivo.p1_conceptos_basicos.p4_enteros;

public class EnterosExm {

    public static void main(String[] args) {
        
        // Declaración de variables de tipo entero
        int int_1 = 10;
        int int_2 = 20;
        int int_3 = -5;

        System.out.println("int_1: " + int_1);
        System.out.println("int_2: " + int_2);
        System.out.println("int_3: " + int_3);

        // Operaciones aritméticas
        System.out.println("int_1 + int_2: " + (int_1 + int_2));
        System.out.println("int_1 - int_2: " + (int_1 - int_2));
        System.out.println("int_1 * int_2: " + (int_1 * int_2));
        System.out.println("int_1 / int_2: " + (int_1 / int_2));
        System.out.println("int_1 % int_2: " + (int_1 % int_2));

        // Comparaciones
        System.out.println("int_1 == int_2: " + (int_1 == int_2));
        System.out.println("int_1 != int_2: " + (int_1 != int_2));
        System.out.println("int_1 > int_2: " + (int_1 > int_2));
        System.out.println("int_1 < int_2: " + (int_1 < int_2));
        System.out.println("int_1 >= int_2: " + (int_1 >= int_2));
        System.out.println("int_1 <= int_2: " + (int_1 <= int_2));

        // Conversión de enteros a otros tipos
        double int_1_double = int_1;
        System.out.println("int_1 como double: " + int_1_double);

        // Uso de enteros en declaraciones condicionales
        if (int_1 > int_2) {
            System.out.println("int_1 es mayor que int_2");
        } else {
            System.out.println("int_1 no es mayor que int_2");
        }

        // Uso de enteros en bucles
        for (int i = 0; i < int_1; i++) {
            System.out.println("i: " + i);
        }

        int counter = 0;
        while (counter < int_1) {
            System.out.println("counter: " + counter);
            counter++;
        }
    }

}