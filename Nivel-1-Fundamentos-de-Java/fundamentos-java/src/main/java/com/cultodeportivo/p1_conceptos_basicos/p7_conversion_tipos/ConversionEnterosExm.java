package com.cultodeportivo.p1_conceptos_basicos.p7_conversion_tipos;

public class ConversionEnterosExm {
    public static void main(String[] args) {
        // Conversión de String a int
        String numeroStr = "123";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("String a int: " + numeroInt);
        
        // Conversión de String a Integer
        Integer numeroInteger = Integer.valueOf(numeroStr);
        System.out.println("String a Integer: " + numeroInteger);
        
        // Conversión de int a String
        String strDesdeInt = Integer.toString(numeroInt);
        System.out.println("int a String: " + strDesdeInt);
        
        // Conversión de int a Integer (autoboxing)
        Integer numeroAutoboxing = numeroInt;
        System.out.println("int a Integer (Autoboxing): " + numeroAutoboxing);
        
        // Conversión de Integer a int (unboxing)
        int numeroUnboxing = numeroInteger;
        System.out.println("Integer a int (Unboxing): " + numeroUnboxing);
        
        // Conversión de int a double
        double numeroDouble = (double) numeroInt;
        System.out.println("int a double: " + numeroDouble);
        
        // Conversión de String a double
        String doubleStr = "45.67";
        double numeroDouble2 = Double.parseDouble(doubleStr);
        System.out.println("String a double: " + numeroDouble2);
        
        // Conversión de double a String
        String strDesdeDouble = Double.toString(numeroDouble2);
        System.out.println("double a String: " + strDesdeDouble);
        
        // Conversión de int a byte
        byte numeroByte = (byte) numeroInt;
        System.out.println("int a byte: " + numeroByte);
        
        // Conversión de int a long
        long numeroLong = numeroInt;
        System.out.println("int a long: " + numeroLong);
    }
}
