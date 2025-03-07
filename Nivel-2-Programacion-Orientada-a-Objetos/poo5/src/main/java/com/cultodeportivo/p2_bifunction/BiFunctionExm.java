package com.cultodeportivo.p2_bifunction;

import java.util.function.BiFunction;

public class BiFunctionExm {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
        System.out.println(sumar.apply(2, 3));

        BiFunction<Double, Double, Double> calcularDescuento = (a, b) -> a - (a * b);
        System.out.println(calcularDescuento.apply(100.0, 0.2));
        System.out.println(calcularDescuento.apply(5560.54, 0.11));

        BiFunction<String, String, String> concatenar = (a, b) -> a + b;
        System.out.println(concatenar.apply("Hola", " Mundo"));

        BiFunction<String, String, String> concatenar2 = String::concat;
        System.out.println(concatenar2.apply("Hola", " Mundo"));

        BiFunction<String, String, String> sumarStrings = (a, b) -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        System.out.println(sumarStrings.apply("34", "87"));
        
    }
}
