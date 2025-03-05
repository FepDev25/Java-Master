package com.cultodeportivo.models.productos.musica;

import com.cultodeportivo.models.productos.Artista;
import com.cultodeportivo.models.productos.Pais;

public class Cantante extends Artista {

    private String disquera;

    public Cantante(String nombre, String apellidos, String fechaNacimiento, Pais pais, String disquera) {
        super(nombre, apellidos, fechaNacimiento, pais);
        this.disquera = disquera;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    @Override
    public String toString() {
        return "Cantante [disquera=" + disquera + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
                + fechaNacimiento + ", pais=" + pais + "]";
    }
    
}
