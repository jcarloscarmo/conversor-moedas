package br.com.conversor;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EncontraTaxa {

    public Moeda converterMoeda(String moedaOrigem, String moedaConvertida) {
        // Monta a URL para conversão de PAR(pair da API) (ex: USD para BRL)
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/d2bb284f68cdd8d5ad5f2304/pair/" + moedaOrigem + "/" + moedaConvertida);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Transforma JSON em Objeto Moeda usando o record para armazenar os dados
            return new Gson().fromJson(response.body(), Moeda.class);

        } catch (Exception e) {
            // Se der erro, lança uma excessão
            throw new RuntimeException("Não foi possível  buscar a taxa de conversão");
        }
    }
}