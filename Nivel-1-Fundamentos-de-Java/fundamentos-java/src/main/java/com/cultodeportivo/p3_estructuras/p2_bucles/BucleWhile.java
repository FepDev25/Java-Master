package com.cultodeportivo.p3_estructuras.p2_bucles;

public class BucleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
            i++;
        }

        i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            } else {
                System.out.println("i = " + i + " es impar");
            }
            i++;
        }

    
    }
}
