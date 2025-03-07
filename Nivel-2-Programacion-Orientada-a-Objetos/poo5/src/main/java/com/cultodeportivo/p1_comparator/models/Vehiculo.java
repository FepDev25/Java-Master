package com.cultodeportivo.p1_comparator.models;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int precio;
    private int anio;

    public Vehiculo(String marca, String modelo, int precio, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", anio=" + anio + "]";
    }

    
}
