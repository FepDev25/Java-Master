package com.cultodeportivo.p1_clases_anidadas.p1_no_estaticas;

import com.cultodeportivo.p1_clases_anidadas.p1_no_estaticas.models.Tienda;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda de deportes", "Calle 123", "Ciudad", "País");
        
        Tienda.Producto producto1 = tienda.new Producto("Camiseta", 19.99);
        Tienda.Producto producto2 = tienda.new Producto("Pantalón", 29.99);
        
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);

        Tienda.Empleado empleado1 = tienda.new Empleado("Juan", "Vendedor");
        Tienda.Empleado empleado2 = tienda.new Empleado("María", "Cajero");
        
        tienda.agregarEmpleado(empleado1);
        tienda.agregarEmpleado(empleado2);
        
        System.out.println(tienda);
    }
}
