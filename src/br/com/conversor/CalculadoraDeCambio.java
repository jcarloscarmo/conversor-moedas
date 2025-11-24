package br.com.conversor;

import java.util.Scanner;

public class CalculadoraDeCambio {

    public void calcular(String moedaOrigem, String moedaConvertida) {
        try {
            EncontraTaxa encontraTaxa = new EncontraTaxa();
            Moeda novaMoeda = encontraTaxa.converterMoeda(moedaOrigem, moedaConvertida);




            System.out.println("\nDigite o valor que você deseja converter:");
            Scanner leitura = new Scanner(System.in);
            double valorParaConverter = leitura.nextDouble();
            double valorConvertido = valorParaConverter * novaMoeda.conversion_rate();

            System.out.printf("%.2f %s equivalem a %.2f %s",
                    valorParaConverter,
                    DicionarioDeMoedas.getNomeMoeda(moedaOrigem),
                    valorConvertido,
                    DicionarioDeMoedas.getNomeMoeda(moedaConvertida));


            System.out.println("\nRetornando para o menu...\n\n");
            Thread.sleep(4000);

        } catch (RuntimeException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println("Não foi possível essa conversão");
        }
    }
}
