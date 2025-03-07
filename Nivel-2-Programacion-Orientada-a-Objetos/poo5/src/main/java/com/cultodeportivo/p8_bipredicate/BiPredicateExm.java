package com.cultodeportivo.p8_bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExm {

    public static void main(String[] args) {
        
        BiPredicate<Integer, Integer> esPar = (i1, i2) -> i1 % 2 == 0 && i2 % 2 == 0;
        System.out.println("2 y 4 son pares: " + esPar.test(2, 4));
        System.out.println("2 y 3 son pares: " + esPar.test(2, 3));
        System.out.println("10 y 10000 son pares: " + esPar.test(10, 10000));

        BiPredicate<Integer, Integer> primerMayorQueSegundo = (i1, i2) -> i1 > i2;
        System.out.println("2 y 4: " + primerMayorQueSegundo.test(2, 4));
        System.out.println("4 y 2: " + primerMayorQueSegundo.test(4, 2));
        System.out.println("10 y 10000: " + primerMayorQueSegundo.test(10, 10000));
    }   
}