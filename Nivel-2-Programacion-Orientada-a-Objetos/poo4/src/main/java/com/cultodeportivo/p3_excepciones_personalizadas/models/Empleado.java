package com.cultodeportivo.p3_excepciones_personalizadas.models;

public class Empleado {

    private String nombre;
    private int sueldo;

    public Empleado(String nombre, int sueldo) throws SueldoNegativoEx {
        this.nombre = nombre;
        if (sueldo < 0) {
            throw new SueldoNegativoEx("El sueldo no puede ser negativo");
        }
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) throws SueldoNegativoEx {
        if (sueldo < 0) {
            throw new SueldoNegativoEx("El sueldo no puede ser negativo");
        }
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
