package com.cultodeportivo.models.personal;

public class Cliente extends Persona {

    private String email;
    private String fechaNacimiento;

    public Cliente(String nombre, String apellidos, String cedula, String telefono, String direccion, String email, String fechaNacimiento) {
        super(nombre, apellidos, cedula, telefono, direccion);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Email: " + email);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Cliente [persona=+"+ super.toString() + "email=" + email + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    
    
}
