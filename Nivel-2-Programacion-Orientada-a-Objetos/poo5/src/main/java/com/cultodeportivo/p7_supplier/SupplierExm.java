package com.cultodeportivo.p7_supplier;

import java.util.function.Supplier;

public class SupplierExm {
    public static void main(String[] args) {
        
        Supplier<String> saludar = () -> "hola";
        System.out.println(saludar.get());

        Supplier<Integer> aleatorio = () -> (int) (Math.random() * 100); // Genera un numero aleatorio
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());
    }
}
