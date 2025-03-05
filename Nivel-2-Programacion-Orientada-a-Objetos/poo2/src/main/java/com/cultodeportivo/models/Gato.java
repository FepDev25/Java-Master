package com.cultodeportivo.models;

public class Gato extends Animal{

    public static int NUMERO_GATOS = 0;
    private String tipoGato;

    public Gato(){
        super();
        Gato.NUMERO_GATOS++;
    }

    public Gato(String nombre, Raza raza, Color color, int edad, String tipoGato) {
        super(nombre, raza, color, edad);
        this.tipoGato = tipoGato;
        Gato.NUMERO_GATOS++;
    }

    public String getTipoGato() {
        return tipoGato;
    }

    public void setTipoGato(String tipoGato) {
        this.tipoGato = tipoGato;
    }

    @Override
    public String sonido() {
        return "Miau miau";
    }

    @Override
    public int retornarTotal() {
        return Gato.NUMERO_GATOS;
    }

    @Override
    public String toString() {
        return "Gato [tipoGato=" + tipoGato + "]" + super.toString();
    }
    
}
