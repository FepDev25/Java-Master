package com.cultodeportivo.p7_archivos;

import com.cultodeportivo.p7_archivos.p1_manejo_archivos.ManejoArchivos;

public class Main {
    public static void main(String[] args) {
        // Crear un archivo
        ManejoArchivos.crearArchivo("archivo.txt");

        // Escribir en un archivo
        ManejoArchivos.escribirArchivo("archivo.txt", "Hola, soy un texto de prueba. ");

        // Leer un archivo
        ManejoArchivos.leerArchivo("archivo.txt");

        // Anexar texto a un archivo
        ManejoArchivos.anexarArchivo("archivo.txt", "Este texto se añade al archivo.");

        // Leer el archivo de nuevo
        ManejoArchivos.leerArchivo("archivo.txt");
    }
}
