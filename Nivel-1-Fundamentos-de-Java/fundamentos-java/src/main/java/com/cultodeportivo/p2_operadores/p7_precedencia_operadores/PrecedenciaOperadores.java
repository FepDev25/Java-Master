package com.cultodeportivo.p2_operadores.p7_precedencia_operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        
        // Ejemplo de precedencia de operadores
        int resultado1 = a + b * c;
        System.out.println("a + b * c = " + resultado1); // Multiplicación tiene mayor precedencia
        
        int resultado2 = (a + b) * c;
        System.out.println("(a + b) * c = " + resultado2); // Paréntesis cambia la precedencia
        
        int resultado3 = a / b + c;
        System.out.println("a / b + c = " + resultado3); // División antes que suma
        
        int resultado4 = a / (b + c);
        System.out.println("a / (b + c) = " + resultado4); // Paréntesis cambia la precedencia
        
        boolean resultado5 = a > b && b > c;
        System.out.println("a > b && b > c = " + resultado5); // && tiene mayor precedencia que >
        
        boolean resultado6 = a > b || b < c && a > c;
        System.out.println("a > b || b < c && a > c = " + resultado6); // && se evalúa antes que ||
        
        boolean resultado7 = !(a > b) || b == c;
        System.out.println("!(a > b) || b == c = " + resultado7); // ! tiene mayor precedencia que ||
    }
}
