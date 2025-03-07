package com.cultodeportivo.p1_clases_anidadas.p1_no_estaticas.models;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados;

    public Tienda() {
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public Tienda(String nombre, String direccion, String ciudad, String pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tienda [nombre=").append(nombre)
        .append(", dirección=").append(direccion)
        .append(", ciudad=").append(ciudad)
        .append(", país=").append(pais)
        .append("]\nProductos:\n");

        productos.forEach(p -> sb.append("  - ").append(p).append("\n"));
        
        sb.append("Empleados:\n");
        empleados.forEach(e -> sb.append("  - ").append(e).append("\n"));

        return sb.toString();
    }


    public class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
        }
    }

    public class Empleado {
        private String nombre;
        private String cargo;

        public Empleado(String nombre, String cargo) {
            this.nombre = nombre;
            this.cargo = cargo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return "Empleado [nombre=" + nombre + ", cargo=" + cargo + "]";
        }
    }


}
