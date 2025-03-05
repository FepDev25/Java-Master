package com.cultodeportivo.models;

public class Raza {
    private String nombre;

    public Raza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Raza [nombre=" + nombre + "]";
    }

    

    
}
