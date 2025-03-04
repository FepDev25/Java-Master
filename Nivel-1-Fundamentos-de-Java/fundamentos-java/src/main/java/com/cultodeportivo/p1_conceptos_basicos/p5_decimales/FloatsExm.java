package com.cultodeportivo.p1_conceptos_basicos.p5_decimales;

public class FloatsExm {

    public static void main(String[] args) {
        
        // Declaración de variables de tipo float
        float float_1 = 10.5f;
        float float_2 = 20.3f;
        float float_3 = -5.7f;

        System.out.println("float_1: " + float_1);
        System.out.println("float_2: " + float_2);
        System.out.println("float_3: " + float_3);

        // Operaciones aritméticas
        System.out.println("float_1 + float_2: " + (float_1 + float_2));
        System.out.println("float_1 - float_2: " + (float_1 - float_2));
        System.out.println("float_1 * float_2: " + (float_1 * float_2));
        System.out.println("float_1 / float_2: " + (float_1 / float_2));
        System.out.println("float_1 % float_2: " + (float_1 % float_2));

        // Comparaciones
        System.out.println("float_1 == float_2: " + (float_1 == float_2));
        System.out.println("float_1 != float_2: " + (float_1 != float_2));
        System.out.println("float_1 > float_2: " + (float_1 > float_2));
        System.out.println("float_1 < float_2: " + (float_1 < float_2));
        System.out.println("float_1 >= float_2: " + (float_1 >= float_2));
        System.out.println("float_1 <= float_2: " + (float_1 <= float_2));

        // Conversión de floats a otros tipos
        int float_1_int = (int) float_1;
        System.out.println("float_1 como entero: " + float_1_int);

        // Uso de floats en declaraciones condicionales
        if (float_1 > float_2) {
            System.out.println("float_1 es mayor que float_2");
        } else {
            System.out.println("float_1 no es mayor que float_2");
        }

    }

}