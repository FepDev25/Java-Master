package com.cultodeportivo.p8_modularidad.p2_modificadores_acceso;

// Clase con diferentes niveles de acceso
public class ModificadoresAcceso {

    public String publico = "Soy público";       // Accesible desde cualquier parte
    private String privado = "Soy privado";      // Solo accesible dentro de la misma clase
    protected String protegido = "Soy protegido"; // Accesible dentro del mismo paquete o subclases
    String porDefecto = "Soy por defecto";        // Accesible solo dentro del mismo paquete

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public void mostrar() {
        System.out.println(publico);
        System.out.println(privado);
        System.out.println(protegido);
        System.out.println(porDefecto);
    }

    public static void main(String[] args) {
        ModificadoresAcceso obj = new ModificadoresAcceso();
        obj.mostrar();
    }
}
