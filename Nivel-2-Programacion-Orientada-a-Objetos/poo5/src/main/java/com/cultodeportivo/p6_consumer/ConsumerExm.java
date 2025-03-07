package com.cultodeportivo.p6_consumer;

import java.util.function.Consumer;

public class ConsumerExm {
    public static void main(String[] args) {
        
        Consumer<String> imprimir = s -> System.out.println(s);
        imprimir.accept("hola");

        Consumer<String> imprimir2 = System.out::println;
        imprimir2.accept("hola");

    }
}
