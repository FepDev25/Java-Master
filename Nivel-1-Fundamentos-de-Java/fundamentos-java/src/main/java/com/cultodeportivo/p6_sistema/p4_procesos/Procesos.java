package com.cultodeportivo.p6_sistema.p4_procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Procesos {
    public static void main(String[] args) {
        try {
            // 1. Ejecutar un comando simple (listar archivos en Fedora)
            ejecutarProceso(new String[]{"ls", "-l"});

            // 2. Obtener el directorio actual
            ejecutarProceso(new String[]{"pwd"});

            // 3. Abrir la calculadora de Fedora (requiere GNOME)
            ProcessBuilder pb = new ProcessBuilder("gnome-calculator");
            pb.start();

        } catch (IOException e) {
            System.err.println("Error al ejecutar el proceso: " + e.getMessage());
        }
    }

    private static void ejecutarProceso(String[] comando) throws IOException {
        ProcessBuilder pb = new ProcessBuilder(comando);
        Process proceso = pb.start();

        // Capturar la salida del proceso
        BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }

        // Capturar errores en caso de que existan
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));
        while ((linea = errorReader.readLine()) != null) {
            System.err.println("Error: " + linea);
        }
    }
}
