package com.cultodeportivo.p1_clases_anidadas.p2_estaticas.models;

import java.util.ArrayList;

public class Universidad {
    private String nombre;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Clase interna (inner class)
    public class Departamento {
        private String nombreDepartamento;

        public Departamento(String nombreDepartamento) {
            this.nombreDepartamento = nombreDepartamento;
        }
        
        public void agregarCurso() {
            System.out.println("Agregando curso en " + nombre); // Accede al campo 'nombre' de Universidad
        }

        public String getNombreDepartamento() {
            return nombreDepartamento;
        }

        public void setNombreDepartamento(String nombreDepartamento) {
            this.nombreDepartamento = nombreDepartamento;
        }
    }
    
    // Clase estática anidada (static nested class)
    public static class EmpleadoUniversitario {
        private static int numeroEmpleados = 0; // Mejor como private
        private int id;
        private String nombre;
        
        public EmpleadoUniversitario(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
            numeroEmpleados++;
        }
    
        public static int getNumeroEmpleados() { // Getter para acceder al valor
            return numeroEmpleados;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "EmpleadoUniversitario [id=" + id + ", nombre=" + nombre + "]";
        }
    }

    public static class Docente extends EmpleadoUniversitario {
        private ArrayList<String> materias;

        public Docente(int id, String nombre) {
            super(id, nombre);
            this.materias = new ArrayList<>();
        }

        public void agregarMateria(String materia) {
            materias.add(materia);
        }

        public ArrayList<String> getMaterias() {
            return materias;
        }

        public void setMaterias(ArrayList<String> materias) {
            this.materias = materias;
        }

        @Override
        public String toString() {
            return "Docente [materias=" + materias + "]" + super.toString();
        }
    
    }
    

}