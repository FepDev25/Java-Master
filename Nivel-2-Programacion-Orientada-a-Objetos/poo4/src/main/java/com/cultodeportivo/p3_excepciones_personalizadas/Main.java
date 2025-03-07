package com.cultodeportivo.p3_excepciones_personalizadas;

import com.cultodeportivo.p3_excepciones_personalizadas.models.Empleado;
import com.cultodeportivo.p3_excepciones_personalizadas.models.SueldoNegativoEx;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = null;
        try {
            empleado = new Empleado("Manuel", 300);
            empleado.setSueldo(-100);
        } catch (SueldoNegativoEx e) {
            System.out.println("Error al asignar el sueldo: " + e.getMessage());
        } finally {
           System.out.println("Empleado 1: "+empleado);
        }


        try {
            Empleado empleado2 = new Empleado("Manuel", -300);
            System.out.println("Emplado 2: " + empleado2);
        } catch (SueldoNegativoEx ex) {
            System.out.println("Error al asignar el sueldo: " + ex.getMessage());
        }
    }
}