# Atividade Avaliativa - Prova 2025.2 (Dezembro)

Esta pasta contém a atividade avaliativa passada em sala para obtenção de nota referente à **2ª Avaliação (2025.2)** da disciplina **Programação Imperativa (SIN 1012)** — UNICAP (Sistemas para Internet), ministrada pelo Prof. Márcio Bueno.

## Sobre a atividade
O objetivo deste material foi servir como treino preparatório para a prova oficial de dezembro. Os exercícios foram desenvolvidos em **Java**, simulando um sistema de controle de contas bancárias e movimentações financeiras com base nas classes `Conta` e `Operacao`.

## Conteúdo da pasta (5 Questões)

* **Questão 1 (`cadastrarConta`):** Função para cadastrar uma nova conta corrente no vetor, verificando se há espaço disponível (`TAM_CONTAS`), impedindo IDs duplicados e bloqueando saldos ou limites negativos.
* **Questão 2 (`buscaBinariaCliente`):** Função de busca binária que procura uma conta no vetor a partir do nome do cliente e retorna sua posição (ou `-1`, caso não encontre).
* **Questão 3 (`insertionSortCliente`):** Função que ordena o vetor de contas em ordem alfabética pelo nome do cliente utilizando o algoritmo de inserção direta (*Insertion Sort*).
* **Questão 4 (`filtraOperacoes`):** Função que filtra todas as movimentações financeiras de um determinado ID de conta para um vetor auxiliar e retorna a quantidade de operações encontradas.
* **Questão 5 (`extrato`):** Procedimento que calcula o histórico de saldo e exibe na tela o extrato formatado com o saldo anterior, as **5 últimas operações** (Depósito, Saque ou Transferência) e o saldo atual da conta.
