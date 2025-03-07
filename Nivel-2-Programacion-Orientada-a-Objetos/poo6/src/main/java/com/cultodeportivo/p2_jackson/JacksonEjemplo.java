package com.cultodeportivo.p2_jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonEjemplo {
    
    private final ObjectMapper objectMapper = new ObjectMapper();

    // 🔹 Serializar un objeto a un archivo JSON
    public void serializarObjeto(Object objeto, String fileName) {
        try {
            objectMapper.writeValue(new File(fileName), objeto);
            System.out.println("Objeto guardado exitosamente en " + fileName);
        } catch (IOException e) {
            System.out.println("Error al guardar objeto: " + e.getMessage());
        }
    }

    // 🔹 Deserializar un objeto desde un archivo JSON
    public <T> T deserializarObjeto(String fileName, Class<T> clase) {
        try {
            return objectMapper.readValue(new File(fileName), clase);
        } catch (IOException e) {
            System.out.println("Error al leer objeto: " + e.getMessage());
            return null;
        }
    }

    // 🔹 Serializar un ArrayList de objetos a un archivo JSON
    public void serializarLista(List<?> lista, String fileName) {
        try {
            objectMapper.writeValue(new File(fileName), lista);
            System.out.println("Lista guardada exitosamente en " + fileName);
        } catch (IOException e) {
            System.out.println("Error al guardar lista: " + e.getMessage());
        }
    }

    // 🔹 Deserializar un ArrayList de objetos desde un archivo JSON
    public <T> List<T> deserializarLista(String fileName, Class<T> clase) {
        try {
            return objectMapper.readValue(new File(fileName), new TypeReference<List<T>>() {});
        } catch (IOException e) {
            System.out.println("Error al leer lista: " + e.getMessage());
            return null;
        }
    }
}
