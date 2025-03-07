package com.cultodeportivo.p3_gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("HP", "Pavilion", 8, 500);
        GsonEjemplo gsonEjemplo = new GsonEjemplo();
        gsonEjemplo.serializarObjeto(laptop, "laptop.json");
        laptop = gsonEjemplo.deserializarObjeto("laptop.json", Laptop.class);
        System.out.println(laptop);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", "Pavilion", 8, 500));
        laptops.add(new Laptop("Acer", "Aspire", 8, 500));
        laptops.add(new Laptop("Asus", "Vivobook", 8, 500));
        laptops.add(new Laptop("Lenovo", "IdeaPad", 8, 500));
        laptops.add(new Laptop("Dell", "XPS", 8, 500));

        gsonEjemplo.serializarLista(laptops, "laptops.json");
        List<Laptop> laptopsDeserializados = gsonEjemplo.deserializarLista("laptops.json", Laptop.class); 
        laptopsDeserializados.forEach(System.out::println);

    }
}
