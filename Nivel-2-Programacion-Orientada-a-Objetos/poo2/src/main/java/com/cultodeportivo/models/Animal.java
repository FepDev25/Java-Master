package com.cultodeportivo.models;

public abstract class Animal {
    protected String nombre;
    protected Raza raza;
    protected Color color;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, Raza raza, Color color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public abstract String sonido();
    public abstract int retornarTotal();

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}