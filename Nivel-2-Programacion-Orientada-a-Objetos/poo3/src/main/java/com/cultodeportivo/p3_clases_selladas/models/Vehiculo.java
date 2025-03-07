package com.cultodeportivo.p3_clases_selladas.models;

// Clase sellada que permite solo las subclases especificadas
public sealed abstract class Vehiculo permits Coche, Moto, Camion {
    public abstract void acelerar();
}
