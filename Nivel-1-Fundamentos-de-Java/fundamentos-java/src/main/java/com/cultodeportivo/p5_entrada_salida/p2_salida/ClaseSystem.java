package com.cultodeportivo.p5_entrada_salida.p2_salida;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ClaseSystem {
    public static void main(String[] args) throws FileNotFoundException {
        
        // Ejemplo de System.out
        System.out.println("Este es un ejemplo de salida con System.out.println.");
        System.out.print("Este es un ejemplo de salida con System.out.print (sin salto de línea).");
        System.out.println(); // Salto de línea para que la salida se vea más ordenada
        int edad = 25;
        System.out.printf("La edad es: %d años%n", edad);

        // Ejemplo de System.err
        System.err.println("Este es un mensaje de error usando System.err.println.");
        System.err.print("Este es un mensaje de error usando System.err.print (sin salto de línea).");
        System.err.println(); // Salto de línea para que la salida se vea más ordenada

        // Redirigiendo System.out a un archivo
        PrintStream fileOut = new PrintStream("fundamentos-java/src/main/resources/salida.txt");
        System.setOut(fileOut); // Ahora System.out escribe en el archivo "salida.txt"
        System.out.println("Este mensaje irá al archivo salida.txt.");

    }
}
