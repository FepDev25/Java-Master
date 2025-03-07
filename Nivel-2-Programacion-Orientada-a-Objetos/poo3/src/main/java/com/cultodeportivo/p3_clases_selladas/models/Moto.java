package com.cultodeportivo.p3_clases_selladas.models;

// Clase non-sealed, permite nuevas subclases sin restricciones
public non-sealed class Moto extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("Moto acelera");
    }
}
