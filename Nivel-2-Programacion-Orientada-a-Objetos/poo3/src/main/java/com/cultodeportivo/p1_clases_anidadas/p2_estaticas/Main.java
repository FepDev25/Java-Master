package com.cultodeportivo.p1_clases_anidadas.p2_estaticas;

import com.cultodeportivo.p1_clases_anidadas.p2_estaticas.models.Universidad;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Universidad
        Universidad universidad = new Universidad("UPS");

        // Crear un Departamento (requiere una instancia de Universidad)
        Universidad.Departamento departamento = universidad.new Departamento("Ingeniería");
        departamento.agregarCurso(); // Accede al campo 'nombre' de Universidad

        // Crear un EmpleadoUniversitario (NO requiere una instancia de Universidad)
        Universidad.EmpleadoUniversitario emp1 = new Universidad.EmpleadoUniversitario(1, "Carlos Pérez");
        Universidad.EmpleadoUniversitario emp2 = new Universidad.EmpleadoUniversitario(2, "María Gómez");
        System.out.println(emp1);
        System.out.println(emp2);

        // Crear un Docente (NO requiere una instancia de Universidad)
        Universidad.Docente docente = new Universidad.Docente(3, "Pedro Rodríguez");
        docente.agregarMateria("Matemática");
        docente.agregarMateria("Física");
        System.out.println(docente);

        System.out.println("Número de empleados: " + Universidad.EmpleadoUniversitario.getNumeroEmpleados());


    }
}
