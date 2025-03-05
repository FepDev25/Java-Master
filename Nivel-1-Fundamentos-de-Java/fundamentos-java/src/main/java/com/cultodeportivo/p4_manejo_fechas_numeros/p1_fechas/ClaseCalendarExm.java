package com.cultodeportivo.p4_manejo_fechas_numeros.p1_fechas;

import java.util.Calendar;

public class ClaseCalendarExm {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calendar
        Calendar calendario = Calendar.getInstance();
        
        // Mostrar la fecha y hora actual
        System.out.println("Fecha y hora actual: " + calendario.getTime());
        
        // Obtener el año, mes, día, hora, minuto y segundo
        int año = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);
        System.out.println("Año: " + año);
        System.out.println("Mes: " + mes);
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Segundo: " + segundo);
        
        // Modificar la fecha y hora
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, 5);
        calendario.set(Calendar.DAY_OF_MONTH, 15);
        calendario.set(Calendar.HOUR_OF_DAY, 12);
        calendario.set(Calendar.MINUTE, 30);
        calendario.set(Calendar.SECOND, 0);
        System.out.println("Fecha y hora modificada: " + calendario.getTime());
        
        // Comparación de fechas
        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(2024, 5, 15, 12, 30, 0);
        boolean antes = calendario.before(calendario2);
        boolean despues = calendario.after(calendario2);
        System.out.println("¿Fecha modificada es antes de la fecha específica? " + antes);
        System.out.println("¿Fecha modificada es después de la fecha específica? " + despues);
    }
}
