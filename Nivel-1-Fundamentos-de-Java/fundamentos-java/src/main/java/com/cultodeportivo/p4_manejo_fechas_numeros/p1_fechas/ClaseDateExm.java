package com.cultodeportivo.p4_manejo_fechas_numeros.p1_fechas;

import java.util.Date;

public class ClaseDateExm {
    public static void main(String[] args) {
        // Crear una instancia de la clase Date
        Date fechaActual = new Date();
        
        // Mostrar la fecha y hora actual
        System.out.println("Fecha y hora actual: " + fechaActual);
        
        // Obtener el tiempo en milisegundos desde 1970-01-01
        long tiempoMilisegundos = fechaActual.getTime();
        System.out.println("Tiempo en milisegundos desde 1970: " + tiempoMilisegundos);
        
        // Crear una fecha específica (deprecated)
        @SuppressWarnings("deprecation")
        Date fechaEspecifica = new Date(124, 5, 15); // Año 2024 (124 + 1900), Junio (5 + 1), Día 15
        System.out.println("Fecha específica: " + fechaEspecifica);
        
        // Comparación de fechas
        boolean antes = fechaEspecifica.before(fechaActual);
        boolean despues = fechaEspecifica.after(fechaActual);
        System.out.println("¿Fecha específica es antes de la actual? " + antes);
        System.out.println("¿Fecha específica es después de la actual? " + despues);
    }
}
