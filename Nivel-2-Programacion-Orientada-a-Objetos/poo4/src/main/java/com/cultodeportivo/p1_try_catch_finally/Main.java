package com.cultodeportivo.p1_try_catch_finally;

import com.cultodeportivo.p1_try_catch_finally.models.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        try {
            int result = calc.dividir(4, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Operación ejecutada.");
        }
    }
}
