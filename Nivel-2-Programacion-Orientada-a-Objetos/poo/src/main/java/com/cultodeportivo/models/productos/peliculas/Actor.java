package com.cultodeportivo.models.productos.peliculas;

import com.cultodeportivo.models.productos.Artista;
import com.cultodeportivo.models.productos.Pais;

public class Actor extends Artista{

    private int numPeliculas;
    private Pelicula[] peliculas;

    public Actor(String nombre, String apellidos, String fechaNacimiento, Pais pais, int numPeliculas, Pelicula[] peliculas) {
        super(nombre, apellidos, fechaNacimiento, pais);
        this.numPeliculas = numPeliculas;
        this.peliculas = peliculas;
    }

    public int getNumPeliculas() {
        return numPeliculas;
    }

    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    
    
}
