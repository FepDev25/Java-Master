package com.cultodeportivo.models.personal;

public class Empleado extends Persona {

    private Cargo cargo;
    private String fechaIngreso;

    public Empleado(String nombre, String apellidos, String cedula, String telefono, String direccion, Cargo cargo, String fechaIngreso) {
        super(nombre, apellidos, cedula, telefono, direccion);
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cargo: " + cargo.getNombre());
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    @Override
    public String toString() {
        return "Empleado [persona=+"+ super.toString() + "cargo=" + cargo + ", fechaIngreso=" + fechaIngreso + "]";
    }
    
}
