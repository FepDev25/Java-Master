package com.cultodeportivo.p4_manejo_fechas_numeros.p2_numeros;

public class ClaseMathRandomRxm {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 1
        double randomValue = Math.random();
        System.out.println("Valor aleatorio entre 0 y 1: " + randomValue);
        
        // Generar un número aleatorio entre 1 y 100
        int min = 1;
        int max = 100;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Valor aleatorio entre 1 y 100: " + randomInt);
        
      
    }
}
