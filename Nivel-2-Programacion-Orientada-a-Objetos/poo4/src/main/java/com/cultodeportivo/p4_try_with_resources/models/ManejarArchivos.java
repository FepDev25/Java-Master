package com.cultodeportivo.p4_try_with_resources.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejarArchivos {

    public static void leerArchivo(String filePath) {

        // Los recursos se cierran automáticamente
        try (FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
    }

}
