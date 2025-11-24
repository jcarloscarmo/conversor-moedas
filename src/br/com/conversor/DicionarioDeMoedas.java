package br.com.conversor;

import java.util.HashMap;
import java.util.Map;

public class DicionarioDeMoedas {

    private static final Map<String, String> dicionario = new HashMap<>();

    static {
        dicionario.put("USD", "Dólar Americano");
        dicionario.put("ARS", "Peso Argentino");
        dicionario.put("BRL", "Real Brasileiro");
        dicionario.put("COP", "Peso Colombiano");
    }

    public static String getNomeMoeda(String codigoMoeda) {
        return dicionario.getOrDefault(codigoMoeda, codigoMoeda);
    }
}