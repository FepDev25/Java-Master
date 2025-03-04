package com.cultodeportivo.p1_conceptos_basicos.p2_booleans;

public class BooleansExm {

    public static void main(String[] args) {

        // Declaración de variables de tipo boolean

        boolean bool_1 = true;
        boolean bool_2 = false;

        System.out.println("bool_1: " + bool_1);
        System.out.println("bool_2: " + bool_2);
        
        System.out.println("bool_1 && bool_2: " + (bool_1 && bool_2));
        System.out.println("bool_1 || bool_2: " + (bool_1 || bool_2));
        System.out.println("!bool_1: " + !bool_1);
        System.out.println("!bool_2: " + !bool_2);

        // Uso de booleanos en declaraciones condicionales
        if (bool_1) {
            System.out.println("bool_1 es verdadero");
        } else {
            System.out.println("bool_1 es falso");
        }

        if (bool_2) {
            System.out.println("bool_2 es verdadero");
        } else {
            System.out.println("bool_2 es falso");
        }

        // Uso de booleanos en bucles
        int counter = 0;
        while (bool_1 && counter < 3) {
            System.out.println("El contador es: " + counter);
            counter++;
        }
    }

}