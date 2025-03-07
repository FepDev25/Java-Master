package com.cultodeportivo.p2_jackson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JacksonEjemplo jsonHandler = new JacksonEjemplo();
        
        // 🔹 Serializar un objeto
        Persona persona = new Persona("Ana", 25);
        jsonHandler.serializarObjeto(persona, "persona.json");

        // 🔹 Deserializar un objeto
        Persona personaDeserializada = jsonHandler.deserializarObjeto("persona.json", Persona.class);
        System.out.println("Objeto deserializado: " + personaDeserializada);

        // 🔹 Serializar una lista de objetos
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Luis", 30));
        listaPersonas.add(new Persona("Maria", 22));
        listaPersonas.add(new Persona("Carlos", 40));
        jsonHandler.serializarLista(listaPersonas, "personas.json");

        // 🔹 Deserializar una lista de objetos
        List<Persona> listaDeserializada = jsonHandler.deserializarLista("personas.json", Persona.class);
        System.out.println("Lista deserializada: " + listaDeserializada);
    }
}