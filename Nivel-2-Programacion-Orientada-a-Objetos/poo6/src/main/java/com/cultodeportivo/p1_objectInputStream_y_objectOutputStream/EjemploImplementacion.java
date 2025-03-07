package com.cultodeportivo.p1_objectInputStream_y_objectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EjemploImplementacion {
    
    public void serealizarObjeto(Object objeto, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(objeto);
            System.out.println("Objeto guardada");
        } catch (Exception e) {
            System.out.println("Error al guardar objeto: " + e.getMessage());
        }
    }

    public Object deserealizarObjeto(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Object objetoDeserealizado = objectInputStream.readObject();
            return objetoDeserealizado;
        } catch (Exception e) {
            System.out.println("Error al deserealizar objeto: " + e.getMessage());
        }
        return null;
    }

    public void serealizarObjetos(ArrayList<Object> objetos, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(objetos);
            System.out.println("Objetos guardados");
        } catch (Exception e) {
            System.out.println("Error al guardar objetos: " + e.getMessage());
        }
    }

    public ArrayList<Object> deserealizarObjetos(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            @SuppressWarnings("unchecked")
            ArrayList<Object> objetosDeserealizados = (ArrayList<Object>) objectInputStream.readObject();
            return objetosDeserealizados;
        } catch (Exception e) {
            System.out.println("Error al deserealizar objetos: " + e.getMessage());
        }
        return null;
    }
}
