package com.cultodeportivo.p4_manejo_fechas_numeros.p2_numeros;

public class SistemasNumericos {
    public static void main(String[] args) {
        
        int numeroDecimal = 45;

        // Convertir el número decimal a binario
        String binario = Integer.toBinaryString(numeroDecimal);
        System.out.println("Número en binario: " + binario);

        // Convertir el número decimal a octal
        String octal = Integer.toOctalString(numeroDecimal);
        System.out.println("Número en octal: " + octal);

        // Convertir el número decimal a hexadecimal
        String hexadecimal = Integer.toHexString(numeroDecimal);
        System.out.println("Número en hexadecimal: " + hexadecimal);

        // Convertir un número binario a decimal
        String numeroBinario = "101101"; // 45 en binario
        int decimalDesdeBinario = Integer.parseInt(numeroBinario, 2);
        System.out.println("Número binario '101101' convertido a decimal: " + decimalDesdeBinario);

        // Convertir un número octal a decimal
        String numeroOctal = "55"; // 45 en octal
        int decimalDesdeOctal = Integer.parseInt(numeroOctal, 8);
        System.out.println("Número octal '55' convertido a decimal: " + decimalDesdeOctal);

        // Convertir un número hexadecimal a decimal
        String numeroHexadecimal = "2D"; // 45 en hexadecimal
        int decimalDesdeHex = Integer.parseInt(numeroHexadecimal, 16);
        System.out.println("Número hexadecimal '2D' convertido a decimal: " + decimalDesdeHex);
    }
}
