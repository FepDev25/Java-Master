package com.cultodeportivo.p7_archivos.p1_manejo_archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoArchivos {

    // Método estático para crear un nuevo archivo
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    // Método estático para leer el contenido de un archivo
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método estático para anexar texto a un archivo existente
    public static void anexarArchivo(String nombreArchivo, String texto) {
        File archivo = new File(nombreArchivo);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(texto);
            bw.newLine();
            System.out.println("Texto añadido correctamente al archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al anexar al archivo: " + e.getMessage());
        }
    }

    // Método estático para escribir texto en un archivo (sobrescribiendo su contenido)
    public static void escribirArchivo(String nombreArchivo, String texto) {
        File archivo = new File(nombreArchivo);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(texto);
            System.out.println("Texto escrito correctamente en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
