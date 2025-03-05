package com.cultodeportivo.models.productos.musica;

import com.cultodeportivo.models.productos.Reproducible;

public class Cancion implements Reproducible {
    
    private Album album;
    private String titulo;
    private int duracion;
    private String letra;

    public Cancion(Album album, String titulo, int duracion, String letra) {
        this.album = album;
        this.titulo = titulo;
        this.duracion = duracion;
        this.letra = letra;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Cancion [album=" + album + ", titulo=" + titulo + ", duracion=" + duracion + ", letra=" + letra + "]";
    }

    @Override
    public void adelantar() {
        System.out.println("Adelantando canción");
    }

    @Override
    public void anterior() {
        System.out.println("Canción anterior");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información de la canción");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando canción");
    }

    @Override
    public void rebobinar() {
        System.out.println("Rebobinando canción");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente canción");
    }

    
}
