package com.cultodeportivo.models;

public class Perro extends Animal{

    private String tipoPerro;
    public static int NUMERO_PERROS = 0;

    public Perro() {
        super();
        Perro.NUMERO_PERROS++;
    }

    public Perro(String nombre, Raza raza, Color color, int edad, String tipoPerro) {
        super(nombre, raza, color, edad);
        this.tipoPerro = tipoPerro;
        Perro.NUMERO_PERROS++;
    }
    
    public String getTipoPerro() {
        return tipoPerro;
    }

    public void setTipoPerro(String tipoPerro) {
        this.tipoPerro = tipoPerro;
    }

    @Override
    public String sonido() {
        return "Guau guau";
    }

    @Override
    public int retornarTotal() {
        return Perro.NUMERO_PERROS;
    }

    @Override
    public String toString() {
        return "Perro [tipoPerro=" + tipoPerro + "]" + super.toString();
    }
    
}
