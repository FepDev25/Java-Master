package com.cultodeportivo.p3_gson;

public class Laptop {
    private String marca;
    private String modelo;
    private int ram;
    private int discoDuro;

    public Laptop(String marca, String modelo, int ram, int discoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.discoDuro = discoDuro;
    }

    public Laptop() {}

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
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getDiscoDuro() {
        return discoDuro;
    }
    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                ", discoDuro=" + discoDuro +
                '}';
    }

    
}
