package com.cultodeportivo.models.productos.musica;

import java.util.Arrays;

public class Album {

    private Cantante cantante;
    private String titulo;
    private int anio;
    private GeneroMusical genero;
    private int numCanciones;
    private Cancion[] canciones;

    public Album(Cantante cantante, String titulo, int anio, GeneroMusical genero, int numCanciones, Cancion[] canciones) {
        this.cantante = cantante;
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.numCanciones = numCanciones;
        this.canciones = canciones;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Album [cantante=" + cantante + ", titulo=" + titulo + ", anio=" + anio + ", genero=" + genero
                + ", numCanciones=" + numCanciones + ", canciones=" + Arrays.toString(canciones) + "]";
    }

    
    
}
