# Conversor de Moedas

## 📖 Sobre o Projeto

Este é um conversor de moedas desenvolvido em Java, como parte do desafio proposto pelo programa **Oracle Next Education (ONE)** em parceria com a **Alura Latam**.

A aplicação permite ao usuário converter valores entre um conjunto pré-definido de moedas. As taxas de câmbio são obtidas em tempo real através da API pública [ExchangeRate-API](https://www.exchangerate-api.com/), garantindo que os valores de conversão estejam sempre atualizados.

## ✨ Funcionalidades

- **Menu Interativo:** Um menu simples e intuitivo no console para que o usuário escolha a conversão desejada.
- **Taxas de Câmbio Reais:** Conecta-se a uma API para buscar as taxas de câmbio mais recentes.
- **Conversões Disponíveis:**
  - Dólar Americano (USD) ↔ Peso Argentino (ARS)
  - Dólar Americano (USD) ↔ Real Brasileiro (BRL)
  - Dólar Americano (USD) ↔ Peso Colombiano (COP)
- **Código Limpo:** O projeto foi estruturado para separar as responsabilidades, como a interação com o usuário, a lógica de cálculo e o acesso à API.

## 🏛️ Estrutura do Projeto e Classes

O código foi organizado em várias classes, cada uma com uma responsabilidade específica para manter o código limpo e de fácil manutenção:

-   **`Main`**: A classe principal que inicia a aplicação. Sua única função é chamar o `Menu`.

-   **`Menu`**: Responsável por toda a interação com o usuário. Exibe as opções de conversão, captura a escolha do usuário e chama a `CalculadoraDeCambio` para realizar a operação.

-   **`DicionarioDeMoedas`**: Esta classe centraliza os nomes das moedas. Ela contém um mapa (`Map`) que associa o código de uma moeda (ex: "USD") ao seu nome por extenso (ex: "Dólar Americano"). Isso evita a repetição de strings pelo código e facilita a manutenção ou adição de novas moedas. Tanto o `Menu` quanto a `CalculadoraDeCambio` utilizam esta classe para exibir nomes legíveis ao usuário.

-   **`CalculadoraDeCambio`**: Contém a lógica de negócio da conversão. Ela recebe os códigos das moedas, busca a taxa de câmbio através da classe `EncontraTaxa`, realiza o cálculo e exibe o resultado formatado para o usuário.

-   **`EncontraTaxa`**: Faz a comunicação com a API externa (ExchangeRate-API). Ela constrói a URL da requisição, obtém a resposta em formato JSON e utiliza a biblioteca Gson para converter essa resposta em um objeto `Moeda`.

-   **`Moeda`**: É uma classe record que representa os dados da moeda retornados pela API. Ela armazena informações como o código da moeda de origem, o código da moeda de destino e a taxa de conversão (`conversion_rate`).

## 🛠️ Tecnologias Utilizadas

- **Java 17:** Linguagem principal do projeto.
- **Gson:** Biblioteca do Google para converter objetos Java em sua representação JSON e vice-versa.
- **ExchangeRate-API:** API utilizada para obter as taxas de câmbio.

## 🚀 Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone <url-do-seu-repositorio>
    ```
2.  **Abra na sua IDE:**
    - Importe o projeto na sua IDE Java de preferência (IntelliJ IDEA, Eclipse, etc.).
3.  **Adicione a biblioteca Gson:**
    - Certifique-se de que o arquivo `gson-2.10.1.jar` (ou a versão que estiver usando) está configurado no classpath do seu projeto.
4.  **Execute:**
    - Encontre a classe `Main.java` e execute o método `main()`.
    - O menu interativo aparecerá no console, pronto para uso.

---
Feito com ❤️ por José Carlos
