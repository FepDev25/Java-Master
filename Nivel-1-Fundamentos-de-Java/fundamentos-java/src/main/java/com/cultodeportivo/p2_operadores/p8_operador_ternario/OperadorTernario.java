package com.cultodeportivo.p2_operadores.p8_operador_ternario;

public class OperadorTernario {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int mayor = (a > b) ? a : b;
        System.out.println("El mayor es: " + mayor);

        String nombre = "Felipe";
        String mensaje = (nombre.equals("Felipe")) ? "Hola Felipe" : "No eres Felipe";
        System.out.println(mensaje);
    }
}
