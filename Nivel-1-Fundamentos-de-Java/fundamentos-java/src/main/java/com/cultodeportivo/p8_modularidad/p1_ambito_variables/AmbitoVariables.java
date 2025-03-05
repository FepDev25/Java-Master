package com.cultodeportivo.p8_modularidad.p1_ambito_variables;

public class AmbitoVariables {
    
    // Variable de instancia (existe mientras el objeto esté en memoria)
    private int variableInstancia = 10;

    // Variable estática (existe mientras la clase esté cargada en memoria)
    private static int variableEstatica = 20;

    public int getVariableInstancia() {
        return variableInstancia;
    }

    public void setVariableInstancia(int variableInstancia) {
        this.variableInstancia = variableInstancia;
    }

    public static int getVariableEstatica() {
        return variableEstatica;
    }

    public static void setVariableEstatica(int variableEstatica) {
        AmbitoVariables.variableEstatica = variableEstatica;
    }

    public void metodoEjemplo() {
        // Variable local (existe solo dentro de este método)
        int variableLocal = 30;
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Variable de instancia: " + variableInstancia);
        System.out.println("Variable estática: " + variableEstatica);
    }

    public static void main(String[] args) {
        AmbitoVariables obj = new AmbitoVariables();
        obj.metodoEjemplo();
    }
}
