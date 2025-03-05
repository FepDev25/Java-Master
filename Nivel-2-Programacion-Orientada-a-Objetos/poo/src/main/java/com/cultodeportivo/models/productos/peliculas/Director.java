package com.cultodeportivo.models.productos.peliculas;

public class Director {
    private String nombre;
    private String apellido;

    public Director(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Director() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    @Override
    public String toString() {
        return "Director [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    
}
