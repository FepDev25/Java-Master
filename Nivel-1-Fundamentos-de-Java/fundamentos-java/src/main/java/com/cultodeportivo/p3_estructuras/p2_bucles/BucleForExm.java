package com.cultodeportivo.p3_estructuras.p2_bucles;

public class BucleForExm {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            } else {
                System.out.println("i = " + i + " es impar");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i = " + i + " es igual a 5");
                break;
            } else {
                System.out.println("i = " + i + " es diferente de 5");
            }
        }
       
    }
}
