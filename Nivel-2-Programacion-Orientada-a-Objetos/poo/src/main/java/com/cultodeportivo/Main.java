package com.cultodeportivo;

import com.cultodeportivo.models.personal.Cargo;
import com.cultodeportivo.models.personal.Empleado;
import com.cultodeportivo.models.personal.Persona;
import com.cultodeportivo.models.productos.Artista;
import com.cultodeportivo.models.productos.Pais;
import com.cultodeportivo.models.productos.peliculas.Actor;
import com.cultodeportivo.models.productos.peliculas.Director;
import com.cultodeportivo.models.productos.peliculas.GeneroPelicula;
import com.cultodeportivo.models.productos.peliculas.Pelicula;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********************Ejemplo Empleado***********************");
        Cargo cargo = new Cargo("Gerente","Gerente de la empresa", 1000.0);

        Persona emp1 = new Empleado();
        emp1.setNombre("Juan");
        emp1.setApellidos("Perez");
        emp1.setCedula("1234567890");
        emp1.setTelefono("0987654321");
        emp1.setDireccion("Calle 1");
        ((Empleado) emp1).setCargo(cargo);
        ((Empleado) emp1).setFechaIngreso("01/01/2020");

        emp1.mostrarDatos();
        System.out.println(emp1);

        System.out.println("***********************Ejemplo Pelicula***********************");
        Pais pais = new Pais("USA");

        Artista actor1 = new Actor();
        actor1.setNombre("Tom");
        actor1.setApellidos("Hanks");
        actor1.setFechaNacimiento("09/07/1956");
        ((Actor) actor1).setNumPeliculas(10);
        ((Actor) actor1).setPais(pais);

        Artista actor2 = new Actor();
        actor2.setNombre("Keanu");
        actor2.setApellidos("Reeves");
        actor2.setFechaNacimiento("02/09/1964");
        ((Actor) actor2).setNumPeliculas(15);
        ((Actor) actor2).setPais(pais);

        Artista actor3 = new Actor();
        actor3.setNombre("Will");
        actor3.setApellidos("Smith");
        actor3.setFechaNacimiento("25/09/1968");
        ((Actor) actor3).setNumPeliculas(20);
        ((Actor) actor3).setPais(pais);

        Director director1 = new Director();
        director1.setNombre("Steven");
        director1.setApellido("Spielberg");

        GeneroPelicula genero = new GeneroPelicula("Accion");

        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo("Matrix");
        pelicula.setDirector(director1);
        pelicula.setDuracion(120);
        pelicula.setGenero(genero);
        pelicula.setAnio(1999);
        pelicula.setActores(new Actor[]{(Actor) actor1, (Actor) actor2, (Actor) actor3});

        System.out.println(pelicula);
        pelicula.adelantar();
        pelicula.mostrarInfo();
        
    }
}