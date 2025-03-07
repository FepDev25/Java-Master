package com.cultodeportivo.p1_comparator;

import java.util.ArrayList;
import java.util.Comparator;

import com.cultodeportivo.p1_comparator.models.Persona;
import com.cultodeportivo.p1_comparator.models.Vehiculo;

public class ComparatorExm {
    public static void main(String[] args) {
        System.out.println("****************Ejemplo Strings***************");
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("Luis");
        nombres.add("Maria");
        nombres.add("Ana"); 
        nombres.add("Javier");

        Comparator<String> comparador = (String o1, String o2) -> o1.compareTo(o2);

        nombres.sort(comparador);
        System.out.println(nombres);

        nombres.sort(comparador.reversed());
        System.out.println(nombres);

        nombres.sort(String::compareTo);
        System.out.println(nombres);

        System.out.println("****************Ejemplo Personas***************");
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepe", 10));
        personas.add(new Persona("Luis", 20));
        personas.add(new Persona("Maria", 30));
        personas.add(new Persona("Ana", 40));
        personas.add(new Persona("Javier", 50));

        personas.sort(Comparator.naturalOrder()); // Porque usa la interfaz Comparable
        System.out.println(personas);

        Comparator<Persona> comparador3 = (Persona o1, Persona o2) -> o1.getNombre().compareTo(o2.getNombre());
        personas.sort(comparador3);
        System.out.println(personas);

        personas.sort(comparador3.reversed());
        System.out.println(personas);

        personas.sort(Comparator.comparing(Persona::getNombre));
        System.out.println(personas);

        System.out.println("****************Ejemplo Vehiculos***************");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford", "Mustang", 50000, 2016));
        vehiculos.add(new Vehiculo("Ford", "Raptor", 45000, 2000));
        vehiculos.add(new Vehiculo("Chevrolet", "Camaro", 35000, 2020));
        vehiculos.add(new Vehiculo("Chevrolet", "Corvette", 78000, 2014));
        vehiculos.add(new Vehiculo("Toyota", "Camry", 140000, 2013));

        vehiculos.sort((Vehiculo v1, Vehiculo v2) -> Integer.compare(v1.getPrecio(), v2.getPrecio()));
        System.out.println("Ordenado por precio");
        vehiculos.forEach(v -> System.out.println(v));

        System.out.println("Ordenado por anio");
        vehiculos.sort(Comparator.comparingInt(Vehiculo::getAnio));
        vehiculos.forEach(v -> System.out.println(v));

        System.out.println("Ordenado por anios inverso");
        vehiculos.sort(Comparator.comparingInt(Vehiculo::getAnio).reversed());
        vehiculos.forEach(v -> System.out.println(v));
    }
}
