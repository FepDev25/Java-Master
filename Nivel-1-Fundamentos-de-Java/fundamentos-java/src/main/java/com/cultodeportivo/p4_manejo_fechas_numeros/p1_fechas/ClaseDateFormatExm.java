package com.cultodeportivo.p4_manejo_fechas_numeros.p1_fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDateFormatExm {
    public static void main(String[] args) {
        // Crear una instancia de Date con la fecha actual
        Date fechaActual = new Date();
        
        // Formatos de fecha
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formato3 = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
        
        // Imprimir fechas en diferentes formatos
        System.out.println("Formato 1 (dd/MM/yyyy): " + formato1.format(fechaActual));
        System.out.println("Formato 2 (yyyy-MM-dd HH:mm:ss): " + formato2.format(fechaActual));
        System.out.println("Formato 3 (día completo, fecha completa): " + formato3.format(fechaActual));
        
        // Parsear una fecha a partir de un String
        String fechaStr = "15/06/2024";
        try {
            Date fechaParseada = formato1.parse(fechaStr);
            System.out.println("Fecha parseada: " + fechaParseada);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }
}
