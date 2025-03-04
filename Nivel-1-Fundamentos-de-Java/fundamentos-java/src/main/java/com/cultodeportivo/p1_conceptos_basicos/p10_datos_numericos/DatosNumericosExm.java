package com.cultodeportivo.p1_conceptos_basicos.p10_datos_numericos;

public class DatosNumericosExm {

    public static void main(String[] args) {
        
        // Declaración de variables de diferentes tipos numéricos
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 20.5;

        // Imprimir valores de las variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);

        // Valores mínimos y máximos de cada tipo numérico
        System.out.println("************************");
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("************************");
        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("************************");
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("************************");
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("************************");
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("************************");
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);

      
    }
}