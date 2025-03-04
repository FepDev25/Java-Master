package com.cultodeportivo.p1_conceptos_basicos.p6_strings;

public class StringsConcat {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "Mundo";
        
        // Usando el operador +
        String resultado1 = str1 + " " + str2;
        System.out.println("Usando +: " + resultado1);
        
        // Usando concat()
        String resultado2 = str1.concat(" ").concat(str2);
        System.out.println("Usando concat(): " + resultado2);
        
        // Usando StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        System.out.println("Usando StringBuilder: " + sb.toString());
        
        // Usando String.format()
        String resultado3 = String.format("%s %s", str1, str2);
        System.out.println("Usando String.format(): " + resultado3);
        
        // Usando join()
        String resultado4 = String.join(" ", str1, str2);
        System.out.println("Usando String.join(): " + resultado4);
    }
}
