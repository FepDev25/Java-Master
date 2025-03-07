package com.cultodeportivo.p3_gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonEjemplo {
    
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // 🔹 Serializar un objeto a un archivo JSON
    public void serializarObjeto(Object objeto, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(objeto, writer);
            System.out.println("Objeto guardado exitosamente en " + fileName);
        } catch (IOException e) {
            System.out.println("Error al guardar objeto: " + e.getMessage());
        }
    }

    // 🔹 Deserializar un objeto desde un archivo JSON
    public <T> T deserializarObjeto(String fileName, Class<T> clase) {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            System.out.println("Error al leer objeto: " + e.getMessage());
            return null;
        }
    }

    // 🔹 Serializar un ArrayList de objetos a un archivo JSON
    public void serializarLista(List<?> lista, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(lista, writer);
            System.out.println("Lista guardada exitosamente en " + fileName);
        } catch (IOException e) {
            System.out.println("Error al guardar lista: " + e.getMessage());
        }
    }

    // 🔹 Deserializar un ArrayList de objetos desde un archivo JSON
    public <T> List<T> deserializarLista(String fileName, Class<T> clase) {
        try (FileReader reader = new FileReader(fileName)) {
            Type tipoLista = TypeToken.getParameterized(List.class, clase).getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.out.println("Error al leer lista: " + e.getMessage());
            return null;
        }
    }
}
