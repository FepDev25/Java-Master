package com.cultodeportivo.p1_conceptos_basicos.p5_decimales;

public class DoubleExm {

    public static void main(String[] args) {
        
        // Declaración de variables de tipo double
        double double_1 = 10.5;
        double double_2 = 20.3;
        double double_3 = -5.7;

        System.out.println("double_1: " + double_1);
        System.out.println("double_2: " + double_2);
        System.out.println("double_3: " + double_3);

        // Operaciones aritméticas
        System.out.println("double_1 + double_2: " + (double_1 + double_2));
        System.out.println("double_1 - double_2: " + (double_1 - double_2));
        System.out.println("double_1 * double_2: " + (double_1 * double_2));
        System.out.println("double_1 / double_2: " + (double_1 / double_2));
        System.out.println("double_1 % double_2: " + (double_1 % double_2));

        // Comparaciones
        System.out.println("double_1 == double_2: " + (double_1 == double_2));
        System.out.println("double_1 != double_2: " + (double_1 != double_2));
        System.out.println("double_1 > double_2: " + (double_1 > double_2));
        System.out.println("double_1 < double_2: " + (double_1 < double_2));
        System.out.println("double_1 >= double_2: " + (double_1 >= double_2));
        System.out.println("double_1 <= double_2: " + (double_1 <= double_2));

        // Conversión de doubles a otros tipos
        int double_1_int = (int) double_1;
        System.out.println("double_1 como entero: " + double_1_int);

        // Uso de doubles en declaraciones condicionales
        if (double_1 > double_2) {
            System.out.println("double_1 es mayor que double_2");
        } else {
            System.out.println("double_1 no es mayor que double_2");
        }

    }

}