package com.meli.codigomorse;

import com.meli.codigomorse.Equivalences;

import java.util.ArrayList;

public class CodigoMorse {

    public String convertir(String cadena){
        var equivalences = Equivalences.obtenerEquivalencias();
        var cadenaArreglo = cadena.split(" ");
        var cadenaConvertida = new ArrayList<>();

        for (int i = 0; i < cadenaArreglo.length; i++) {
            var flag = equivalences.get(cadenaArreglo[i]);
            cadenaConvertida.add(flag);
        }
        String end = "";
        for (var Char: cadenaConvertida) {
            end += Char;
        }
        return end;
    }

    public void test(){}
}
