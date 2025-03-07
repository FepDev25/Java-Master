package com.cultodeportivo.p3_biconsumer;

import java.util.function.BiConsumer;

import javax.swing.JOptionPane;

public class BiConsumerExm {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> sumar = (a, b) -> System.out.println(a + b);
        sumar.accept(2, 3);

        BiConsumer<String, String> concatenar = (a, b) -> System.out.println(a + b);
        concatenar.accept("Hola", " Mundo");

        BiConsumer<String, String> mostrarMensajeEmergente = (titulo, mensaje) -> {
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
        };

        mostrarMensajeEmergente.accept("Ventana Emergente", "Este es el mensaje que se mostrará en la ventana emergente.");
    }
}
