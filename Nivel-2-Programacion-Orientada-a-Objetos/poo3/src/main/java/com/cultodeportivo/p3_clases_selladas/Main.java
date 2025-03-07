package com.cultodeportivo.p3_clases_selladas;

import com.cultodeportivo.p3_clases_selladas.models.Camion;
import com.cultodeportivo.p3_clases_selladas.models.CamionChevrolet;
import com.cultodeportivo.p3_clases_selladas.models.CamionFord;
import com.cultodeportivo.p3_clases_selladas.models.Coche;
import com.cultodeportivo.p3_clases_selladas.models.Moto;
import com.cultodeportivo.p3_clases_selladas.models.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo moto = new Moto();
        Vehiculo coche = new Coche();
        Vehiculo camion = new Camion();
        Vehiculo camionChevrolet = new CamionChevrolet();
        Vehiculo camionFord = new CamionFord();

        moto.acelerar();
        coche.acelerar();
        camion.acelerar();
        camionChevrolet.acelerar();
        camionFord.acelerar();
    }
}
