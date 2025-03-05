package com.cultodeportivo.p6_sistema.p1_variables_entorno;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> variablesEntorno = System.getenv();

        // Imprimir todas las variables de entorno
        System.out.println("Variables de entorno:");
        for (Map.Entry<String, String> entry : variablesEntorno.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
