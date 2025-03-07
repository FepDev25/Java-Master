package com.cultodeportivo.p3_clases_selladas.models;

// Clase sellada que solo permite ser extendida por CamionChevrolet y CamionFord
public sealed class Camion extends Vehiculo permits CamionChevrolet, CamionFord {

    @Override
    public void acelerar() {
        System.out.println("Camion acelera");
    }
}
