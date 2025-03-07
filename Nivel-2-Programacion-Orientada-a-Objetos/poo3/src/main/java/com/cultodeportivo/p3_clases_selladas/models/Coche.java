package com.cultodeportivo.p3_clases_selladas.models;

// Clase final, no puede ser extendida
public final class Coche extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("Coche acelera");
    }
}
