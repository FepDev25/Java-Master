package com.cultodeportivo.p3_estructuras.p1_condicionales;

public class SwitchExm {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día no válido");
        }

        int numero = 0;
        switch (numero) {
            case 0 -> System.out.println("El número es cero");
            case 1, 3, 5, 7, 9 -> System.out.println("El número es impar");
            case 2, 4, 6, 8 -> System.out.println("El número es par");
            default -> System.out.println("Número no válido");
        }
    }
}
