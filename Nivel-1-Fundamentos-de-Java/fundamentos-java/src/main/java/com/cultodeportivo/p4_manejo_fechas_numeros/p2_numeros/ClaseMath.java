package com.cultodeportivo.p4_manejo_fechas_numeros.p2_numeros;

public class ClaseMath {
    public static void main(String[] args) {
        // Constantes matemáticas
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Valor de E: " + Math.E);
        
        // Funciones básicas
        System.out.println("Máximo entre 10 y 20: " + Math.max(10, 20));
        System.out.println("Mínimo entre 10 y 20: " + Math.min(10, 20));
        System.out.println("Valor absoluto de -15: " + Math.abs(-15));
        
        // Potencias y raíces
        System.out.println("2 elevado a la 3: " + Math.pow(2, 3));
        System.out.println("Raíz cuadrada de 25: " + Math.sqrt(25));
        
        // Redondeo
        System.out.println("Redondeo de 8.5: " + Math.round(8.5));
        System.out.println("Redondeo hacia arriba de 8.1: " + Math.ceil(8.1));
        System.out.println("Redondeo hacia abajo de 8.9: " + Math.floor(8.9));
        
        // Trigonometría
        System.out.println("Seno de 45 grados: " + Math.sin(Math.toRadians(45)));
        System.out.println("Coseno de 45 grados: " + Math.cos(Math.toRadians(45)));
        System.out.println("Tangente de 45 grados: " + Math.tan(Math.toRadians(45)));
        
    }
}
