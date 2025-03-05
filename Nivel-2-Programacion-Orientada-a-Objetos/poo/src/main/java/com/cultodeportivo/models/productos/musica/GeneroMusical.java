package com.cultodeportivo.models.productos.musica;

public class GeneroMusical {

    private String nombre;

    public GeneroMusical(String nombre) {
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
        return "GeneroMusical [nombre=" + nombre + "]";
    }
    
}
