package com.cultodeportivo.p2_clases_anonimas;

public class Main {

    @FunctionalInterface
    interface Animal {
        void sonido();
    }

    public static void main(String[] args) {

        Animal animal = () -> {
            System.out.println("Guau guau");
        };
        animal.sonido();

        Thread contador1 = new Thread(() -> {
            iterarBucleConSleep(1, 1, 5);
        });
        
        Thread contador2 = new Thread(() -> {
            iterarBucleConSleep(2, 5, 10);
        });
        
        Runnable contador3 = () -> {
            iterarBucleConSleep(3, 10, 15);
        };
        
        contador1.start();
        contador2.start();
        new Thread(contador3).start();
    }

    public static void iterarBucleConSleep(int codigo, int desde, int hasta) {
        System.out.println("Contador: " + codigo);
        for (int i = desde; i < hasta; i++) {
            System.out.println("Contador 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
