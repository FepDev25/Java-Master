package com.cultodeportivo.p5_function;

import java.util.function.Function;

public class FunctionExm {
    public static void main(String[] args) {

        Function<Integer, Integer> cuadrado = i -> i * i;
        System.out.println(cuadrado.apply(2));

        Function<Integer, Integer> cubo = i -> i * i * i;
        System.out.println(cubo.apply(2));

        Function<String, Integer> obtenerLongitud = s -> s.length();
        System.out.println(obtenerLongitud.apply("hola"));

        Function<String, Integer> obtenerLongitud2 = String::length;
        System.out.println(obtenerLongitud2.apply("hola"));

        Function<String, String> mayusculas = s -> s.toUpperCase();
        System.out.println(mayusculas.apply("hola"));
    }
}
