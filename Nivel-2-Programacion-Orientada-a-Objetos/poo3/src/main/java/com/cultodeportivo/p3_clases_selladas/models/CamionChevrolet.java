package com.cultodeportivo.p3_clases_selladas.models;

// Clase final, no puede ser extendida
public final class CamionChevrolet extends Camion {

    @Override
    public void acelerar() {
        System.out.println("Camion Chevrolet acelera");
    }
}
    