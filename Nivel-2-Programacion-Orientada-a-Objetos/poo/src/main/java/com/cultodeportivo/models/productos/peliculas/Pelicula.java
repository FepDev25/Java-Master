package com.cultodeportivo.models.productos.peliculas;

import java.util.Arrays;

import com.cultodeportivo.models.productos.Reproducible;

public class Pelicula implements Reproducible{

    private String titulo;
    private Director director;
    private int duracion;
    private GeneroPelicula genero;
    @Override
    public void adelantar() {
        System.out.println("Adelantando la pelicula");
    }

    @Override
    public void anterior() {
        System.out.println("Retrocediendo la pelicula");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion);
        System.out.println("Genero: " + genero);
        System.out.println("Anio: " + anio);
        System.out.println("Actores: " + Arrays.toString(actores)); 
    }

    @Override
    public void pausar() {
        System.out.println("Pausando la pelicula");
    }

    @Override
    public void rebobinar() {
        System.out.println("Rebobinando la pelicula");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la pelicula");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente la pelicula");
    }

    private int anio;
    private Actor[] actores;

    public Pelicula(String titulo, Director director, int duracion, GeneroPelicula genero, int anio, Actor[] actores) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.anio = anio;
        this.actores = actores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Actor[] getActores() {
        return actores;
    }

    public void setActores(Actor[] actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", genero=" + genero
                + ", anio=" + anio + ", actores=" + Arrays.toString(actores) + "]";
    }

    
    
}