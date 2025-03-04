package com.cultodeportivo.p1_conceptos_basicos.p8_paso_por_valor;

public class PasoPorValorExm {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Antes de llamar al método: " + numero);
        incrementar(numero);
        System.out.println("Después de llamar al método: " + numero);
    }

    public static void incrementar(int numero) {
        numero++;
        System.out.println("Dentro del método: " + numero);
    }
}
