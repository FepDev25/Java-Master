package com.cultodeportivo.p1_objectInputStream_y_objectOutputStream;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("John", "Doe", 30);
        EjemploImplementacion ejemplo = new EjemploImplementacion();
        ejemplo.serealizarObjeto(persona, "persona.dat");
        Object personaDeserealizada = ejemplo.deserealizarObjeto("persona.dat");
        System.out.println(personaDeserealizada);

        ArrayList<Object> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(new Persona("Jane", "Doe", 25));
        personas.add(new Persona("Felipe", "Peralta", 20));
        personas.add(new Persona("Luis", "Peralta", 20));
        personas.add(new Persona("Maria", "Peralta", 20));
        personas.add(new Persona("Andres", "Peralta", 20));
        personas.add(new Persona("Diana", "Peralta", 20));
        personas.add(new Persona("Eduardo", "Peralta", 20));
        personas.add(new Persona("Andrea", "Peralta", 20));

        ejemplo.serealizarObjetos(personas, "personas.dat");
        ArrayList<Object> personasDeserealizadas = ejemplo.deserealizarObjetos("personas.dat");
        personasDeserealizadas.forEach(System.out::println);
    }
    
}
