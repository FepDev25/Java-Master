package com.cultodeportivo.p1_clases_anidadas.p3_clases_locales;

import com.cultodeportivo.p1_clases_anidadas.p3_clases_locales.models.CafeShop;

public class Main {
    public static void main(String[] args) {
        CafeShop cafeShop = new CafeShop("Cafe Shop", "Calle 123");
        cafeShop.pedido();
    }
    
}
