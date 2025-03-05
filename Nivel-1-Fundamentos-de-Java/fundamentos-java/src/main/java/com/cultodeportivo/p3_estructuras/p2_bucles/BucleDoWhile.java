package com.cultodeportivo.p3_estructuras.p2_bucles;

public class BucleDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

        i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
            i++;
        } while (i < 10);

        i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            } else {
                System.out.println("i = " + i + " es impar");
            }
            i++;
        } while (i < 10);

    }
}
