package com.cultodeportivo.models.personal;

public class Cargo {
    
    private String nombre;
    private String descripcion;
    private double salario;

    public Cargo(String nombre, String descripcion, double salario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo [nombre=" + nombre + ", descripcion=" + descripcion + ", salario=" + salario + "]";
    }

    

}
