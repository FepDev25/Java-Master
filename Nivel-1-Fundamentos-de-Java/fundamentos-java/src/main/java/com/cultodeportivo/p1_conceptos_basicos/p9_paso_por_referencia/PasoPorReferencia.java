package com.cultodeportivo.p1_conceptos_basicos.p9_paso_por_referencia;

public class PasoPorReferencia {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Antes de llamar al método: " + numeros[0]);
        incrementar(numeros);
        System.out.println("Después de llamar al método: " + numeros[0]);
    }

    public static void incrementar(int[] numeros) {
        numeros[0]++;
        System.out.println("Dentro del método: " + numeros[0]);
    }
}
