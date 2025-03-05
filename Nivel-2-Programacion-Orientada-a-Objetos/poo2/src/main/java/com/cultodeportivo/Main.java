package com.cultodeportivo;

import com.cultodeportivo.models.Animal;
import com.cultodeportivo.models.Color;
import com.cultodeportivo.models.Gato;
import com.cultodeportivo.models.Perro;
import com.cultodeportivo.models.Raza;

public class Main {
    public static void main(String[] args) {
        Animal perro1 = new Perro();
        perro1.setNombre("Mikey");
        perro1.setEdad(2);
        perro1.setColor(Color.AMARILLO);
        perro1.setRaza(new Raza("Golden"));
        ((Perro) perro1).setTipoPerro("Perro Grande");
        String sonidoPerro = ((Perro) perro1).sonido();
        System.out.println(sonidoPerro);
        System.out.println(perro1);

        Animal perro2 = new Perro();
        perro2.setNombre("Cirilo");
        perro2.setEdad(2);
        perro2.setColor(Color.AMARILLO);
        perro2.setRaza(new Raza("Golden"));
        ((Perro) perro2).setTipoPerro("Perro Grande");
        String sonidoPerro2 = ((Perro) perro2).sonido();
        System.out.println(sonidoPerro2);
        System.out.println(perro2);

        Animal perro3 = new Perro();
        perro3.setNombre("Actros");
        perro3.setEdad(2);
        perro3.setColor(Color.AMARILLO);
        perro3.setRaza(new Raza("Golden"));
        ((Perro) perro3).setTipoPerro("Perro Grande");
        String sonidoPerro3 = ((Perro) perro3).sonido();
        System.out.println(sonidoPerro3);
        System.out.println(perro3);

        Animal perro4 = new Perro();
        perro4.setNombre("Toby");
        perro4.setEdad(2);
        perro4.setColor(Color.AMARILLO);
        perro4.setRaza(new Raza("Golden"));
        ((Perro) perro4).setTipoPerro("Perro Grande");
        String sonidoPerro4 = ((Perro) perro4).sonido();
        System.out.println(sonidoPerro4);
        System.out.println(perro4);

        Animal perro5 = new Perro();
        perro5.setNombre("Buddy");
        perro5.setEdad(3);
        perro5.setColor(Color.MARRON);
        perro5.setRaza(new Raza("Labrador"));
        ((Perro) perro5).setTipoPerro("Perro Mediano");
        String sonidoPerro5 = ((Perro) perro5).sonido();
        System.out.println(sonidoPerro5);
        System.out.println(perro5);

        Animal perro6 = new Perro();
        perro6.setNombre("Rocky");
        perro6.setEdad(4);
        perro6.setColor(Color.NEGRO);
        perro6.setRaza(new Raza("Pastor Aleman"));
        ((Perro) perro6).setTipoPerro("Perro Grande");
        String sonidoPerro6 = ((Perro) perro6).sonido();
        System.out.println(sonidoPerro6);
        System.out.println(perro6);

        Animal gato1 = new Gato();
        gato1.setNombre("Bruno");
        gato1.setEdad(4);
        gato1.setColor(Color.BLANCO);
        gato1.setRaza(new Raza("Runa"));
        ((Gato) gato1).setTipoGato("Gato pequeño");
        String sonidoGato = ((Gato) gato1).sonido();
        System.out.println(sonidoGato);
        System.out.println(gato1);

        Animal gato2 = new Gato();
        gato2.setNombre("Toby");
        gato2.setEdad(4);
        gato2.setColor(Color.BLANCO);
        gato2.setRaza(new Raza("Runa"));
        ((Gato) gato2).setTipoGato("Gato pequeño");
        String sonidoGato2 = ((Gato) gato2).sonido();
        System.out.println(sonidoGato2);
        System.out.println(gato2);

        Animal gato3 = new Gato();
        gato3.setNombre("Whiskers");
        gato3.setEdad(3);
        gato3.setColor(Color.NEGRO);
        gato3.setRaza(new Raza("Persa"));
        ((Gato) gato3).setTipoGato("Gato Grande");
        String sonidoGato3 = ((Gato) gato3).sonido();
        System.out.println(sonidoGato3);
        System.out.println(gato3);
        System.out.println(gato2);  

        System.out.println("Numero de perros: " + perro2.retornarTotal());
        System.out.println("Numero de gatos: " + gato1.retornarTotal());
    }
} 