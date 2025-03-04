package com.cultodeportivo.p1_conceptos_basicos.p7_conversion_tipos;

public class ConversionDecimalesExm {
    public static void main(String[] args) {
        // Conversión de String a double
        String numeroStr = "123.45";
        double numeroDouble = Double.parseDouble(numeroStr);
        System.out.println("String a double: " + numeroDouble);
        
        // Conversión de String a Float
        float numeroFloat = Float.parseFloat(numeroStr);
        System.out.println("String a float: " + numeroFloat);
        
        // Conversión de double a String
        String strDesdeDouble = Double.toString(numeroDouble);
        System.out.println("double a String: " + strDesdeDouble);
        
        // Conversión de float a String
        String strDesdeFloat = Float.toString(numeroFloat);
        System.out.println("float a String: " + strDesdeFloat);
        
        // Conversión de double a int (pérdida de precisión)
        int numeroInt = (int) numeroDouble;
        System.out.println("double a int: " + numeroInt);
        
        // Conversión de float a int (pérdida de precisión)
        int numeroIntDesdeFloat = (int) numeroFloat;
        System.out.println("float a int: " + numeroIntDesdeFloat);
        
        // Conversión de double a long
        long numeroLong = (long) numeroDouble;
        System.out.println("double a long: " + numeroLong);
        
        // Conversión de double a float
        float numeroFloatDesdeDouble = (float) numeroDouble;
        System.out.println("double a float: " + numeroFloatDesdeDouble);

        // Conversión de float a double
        double numeroDoubleDesdeFloat = (double) numeroFloat;
        System.out.println("float a double: " + numeroDoubleDesdeFloat);

    }
}
