package com.cultodeportivo.p6_sistema.p3_asignar_propiedades_sistema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("fundamentos-java/src/main/resources/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            p.setProperty("bestTeam","Chelsea FC");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            System.out.println(System.getProperty("bestTeam"));
        } catch(FileNotFoundException e){
            System.err.println("no existe el archivo = " + e);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("error de entrada y salida = " + e);
            System.exit(1);
        }
    }
}
