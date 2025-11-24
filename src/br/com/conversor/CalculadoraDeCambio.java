package br.com.conversor;

public class CalculadoraDeCambio {

    public void calcular(String moedaOrigem, String moedaConvertida) {
        try {
            EncontraTaxa encontraTaxa = new EncontraTaxa();
            Moeda novaMoeda = encontraTaxa.converterMoeda(moedaOrigem, moedaConvertida);

            double valorParaConverter = 1.0;
            double valorConvertido = valorParaConverter * novaMoeda.conversion_rate();

            System.out.println("A taxa de conversão de 1 " + DicionarioDeMoedas.getNomeMoeda(moedaOrigem) +
                    " para " + DicionarioDeMoedas.getNomeMoeda(moedaConvertida) +
                    " é: " + novaMoeda.conversion_rate());


            System.out.println("Retornando para o menu...\n\n");
            Thread.sleep(4000);

        } catch (RuntimeException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}