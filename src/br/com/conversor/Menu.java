package br.com.conversor;
import java.util.Scanner;

public class Menu {

    public void exibeMenu() {

        Scanner leitura = new Scanner(System.in);
        CalculadoraDeCambio calculadora = new CalculadoraDeCambio();
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("************************************************");
            System.out.println("Seja bem-vindo ao conversor de moedas!");
            System.out.println("1) Dólar Americano => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar Americano");
            System.out.println("3) Dólar Americano => Real Brasileiro");
            System.out.println("4) Real Brasileiro => Dólar Americano");
            System.out.println("5) Dólar Americano => Peso Colombiano");
            System.out.println("6) Peso Colombiano => Dólar Americano");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("************************************************");

            opcao = leitura.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            String moedaOrigem;
            String moedaConvertida;


            switch (opcao) {
                case 1 -> {
                    moedaOrigem = "USD";
                    moedaConvertida = "ARS";
                }
                case 2 -> {
                    moedaOrigem = "ARS";
                    moedaConvertida = "USD";
                }
                case 3 -> {
                    moedaOrigem = "USD";
                    moedaConvertida = "BRL";
                }
                case 4 -> {
                    moedaOrigem = "BRL";
                    moedaConvertida = "USD";
                }
                case 5 -> {
                    moedaOrigem = "USD";
                    moedaConvertida = "COP";
                }
                case 6 -> {
                    moedaOrigem = "COP";
                    moedaConvertida = "USD";
                }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            calculadora.calcular(moedaOrigem, moedaConvertida);
        }
    }
}
