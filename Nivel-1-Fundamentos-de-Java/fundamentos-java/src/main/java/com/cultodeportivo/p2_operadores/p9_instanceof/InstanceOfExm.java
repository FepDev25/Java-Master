package com.cultodeportivo.p2_operadores.p9_instanceof;

public class InstanceOfExm {
    public static void main(String[] args) {
        String nombre = "Felipe";
        boolean esString = nombre instanceof String;
        System.out.println("¿Es un String? " + esString);

        Object obj = new Object();
        boolean esObjeto = obj instanceof Object;
        System.out.println("¿Es un objeto? " + esObjeto);

        Integer numero = 10;
        boolean esNumero = numero instanceof Integer;
        System.out.println("¿Es un número? " + esNumero);
    }
}
