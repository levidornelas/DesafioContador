# Projeto Contador Java

## Descrição
Este projeto implementa um contador simples em Java que solicita ao usuário dois números inteiros e realiza uma contagem do primeiro até o segundo número. O programa inclui tratamento de exceções personalizado para garantir que o primeiro número seja sempre menor que o segundo.

## Principais Características
- Input via console para dois números inteiros
- Validação dos parâmetros de entrada
- Tratamento de exceções personalizado
- Contagem sequencial entre os números informados

## Estrutura do Projeto
O projeto é composto por duas classes principais:

### Contador.java: Classe principal que:
- Recebe input do usuário
- Executa a lógica de contagem
- Trata as exceções

### ParametrosInvalidosException.java: Classe de exceção personalizada que:
- Herda de Exception
- Fornece mensagem de erro específica para parâmetros inválidos

## Como Usar
1. Execute o programa
2. Digite o primeiro número quando solicitado
3. Digite o segundo número quando solicitado
4. O programa realizará a contagem ou informará se os parâmetros são inválidos
