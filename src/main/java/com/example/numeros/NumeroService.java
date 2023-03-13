package com.example.numeros;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {
        /** El numero 13 de la mala suerte
         * Crear un algoritmo que pasado un numero n debe retonar
         * la cantidad de numeros que hay sin contar los que contengan
         * el 13,
         *
         * Ejemplo 1
         * numero = 100
         * numeros a descartar =  13
         * total numeros: 99
         *
         * Ejemplo 2:
         * numero = 1000
         * numeros a descartar =  13, 130...139
         * total numeros: 989
         *
         * Ejemplo 2:
         * numero = 3800
         * numeros a descartar = 13, 130..139 , 1300...1399.
         * total numeros: 3699
         */

        int contador13=0;
        int aquiVamos=1;
        for (int i=0;i<n;i++){
            String str= Integer.toString(aquiVamos);
            boolean contiene13 = str.startsWith("13");
            if (contiene13){
                contador13++;
            }
            aquiVamos++;
        }
        int resultado = n - contador13;

        return resultado;
    }
}
