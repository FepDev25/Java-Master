package com.cultodeportivo.p2_operadores.p3_operadores_incrementales;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        
        // Operador de incremento
        System.out.println("Valor inicial de x: " + x);

        // Pre-incremento
        System.out.println("x después de ++x: " + ++x);

        // Post-incremento
        System.out.println("x después de x++ " + x++);
        System.out.println("Segundo llamado: " + x);
        
        // Uso en expresiones
        int resultado1 = x++ + y;
        System.out.println("Resultado de x++ + y: " + resultado1 + " (x ahora es " + x + ")");
        
        int resultado2 = ++x + y;
        System.out.println("Resultado de ++x + y: " + resultado2 + " (x ahora es " + x + ")");
        
        int resultado3 = y-- - x;
        System.out.println("Resultado de y-- - x: " + resultado3 + " (y ahora es " + y + ")");
        
        int resultado4 = --y + x;
        System.out.println("Resultado de --y + x: " + resultado4 + " (y ahora es " + y + ")");
    }
}