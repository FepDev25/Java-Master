package com.cultodeportivo.p1_clases_anidadas.p3_clases_locales.models;

import java.util.Scanner;

public class CafeShop {
    private String nombre;
    private String direccion;

    public CafeShop(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void pedido(){
        try (Scanner sc = new Scanner(System.in)) {
            class Cafe{
                private final String nombre;
                private final double precio;
                
                public String getNombre() {
                    return nombre;
                }
                
                public double getPrecio() {
                    return precio;
                }
                
                public Cafe(String nombre, double precio) {
                    this.nombre = nombre;
                    this.precio = precio;
                }
            }
            
            class Cliente{
                private  final String nombre;
                
                public Cliente(String nombre) {
                    this.nombre = nombre;
                }
                
                public String getNombre() {
                    return nombre;
                }
            }
            
            System.out.println("Introduzca el nombre del cliente: ");
            Cliente cliente = new Cliente(sc.nextLine());
            System.out.println("Introduzca el nombre del cafe: ");
            String cafeName = sc.nextLine();
            System.out.println("Introduzca el precio del cafe: ");
            String cafePriceString = sc.nextLine();
            double cafePrice = Double.parseDouble(cafePriceString);
            Cafe cafe = new Cafe(cafeName, cafePrice);
            System.out.println("El cliente " + cliente.getNombre() + " ha pedido un cafe " + cafe.getNombre() + " por " + cafe.getPrecio() + " euros");
        }


    }
    
}
