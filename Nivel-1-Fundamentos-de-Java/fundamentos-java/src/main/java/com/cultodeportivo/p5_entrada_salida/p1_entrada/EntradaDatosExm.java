package com.cultodeportivo.p5_entrada_salida.p1_entrada;

import java.util.Scanner;

public class EntradaDatosExm {
    public static void main(String[] args) {
        // Ejemplo de entrada de datos
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Introduce tu nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Introduce tu edad: ");
            int edad = entrada.nextInt();
            System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        }
       
    }
}
