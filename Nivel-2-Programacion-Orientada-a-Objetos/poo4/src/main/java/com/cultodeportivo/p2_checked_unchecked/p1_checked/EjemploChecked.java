package com.cultodeportivo.p2_checked_unchecked.p1_checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploChecked {
    public static void main(String[] args) {
        
        try {
            FileReader file = new FileReader("archivo.txt");
            try (BufferedReader br = new BufferedReader(file)) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }

    }
}
