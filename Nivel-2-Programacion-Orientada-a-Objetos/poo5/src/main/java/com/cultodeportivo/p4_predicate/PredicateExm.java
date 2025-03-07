package com.cultodeportivo.p4_predicate;

import java.util.function.Predicate;

public class PredicateExm {
    public static void main(String[] args) {

        Predicate<Integer> esPar = i -> i % 2 == 0;
        System.out.println("2 es par: " +esPar.test(2));
        System.out.println("3 es par: " + esPar.test(3));

        Predicate<String> esPalindromo = s -> s.equals(new StringBuilder(s).reverse().toString());
        System.out.println("oso es palindromo: " + esPalindromo.test("oso"));
        System.out.println("pepe es palindromo: " + esPalindromo.test("pepe"));

        Predicate<String> esUnCorreo = s -> s.contains("@");
        System.out.println("felipe@gmail.com es correo: " + esUnCorreo.test("felipe@gmail.com"));
        System.out.println("felipe.com es correo: " + esUnCorreo.test("felipe.com"));
    }
}
