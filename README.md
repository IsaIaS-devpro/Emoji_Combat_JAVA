# Emoji_Combat_JAVA
 
📄 Projeto: Lutadores
Este projeto simula o gerenciamento de um torneio de lutas, onde cada lutador tem suas informações pessoais, recordes de vitórias, derrotas e empates. O programa permite visualizar o status de um lutador e acompanhar o seu desempenho nas lutas.

🛠️ Funcionalidades
Apresentar Lutador: Exibe as informações detalhadas sobre um lutador, como nome, nacionalidade, idade, altura, peso e recordes de vitórias, derrotas e empates.
Status: Mostra a categoria do lutador e suas estatísticas de vitórias, derrotas e empates.
Ganhar Luta: Aumenta o número de vitórias do lutador.
Perder Luta: Aumenta o número de derrotas do lutador.
Empatar Luta: Aumenta o número de empates do lutador.
🚀 Tecnologias Utilizadas
Java
Programação Orientada a Objetos (POO)
Encapsulamento, Métodos e Construtores
🔍 Estrutura do Projeto
Classe Lutador

Representa um lutador no torneio com atributos e métodos para gerenciar o status de vitórias, derrotas e empates.
Atributos:
nome: Nome do lutador.
nacionalidade: País de origem do lutador.
idade: Idade do lutador.
altura: Altura do lutador.
peso: Peso do lutador.
categoria: Categoria de peso do lutador (Leve, Médio, Pesado, etc.).
vitorias: Número de vitórias do lutador.
derrotas: Número de derrotas do lutador.
empates: Número de empates do lutador.
Métodos principais:
apresentar: Exibe as informações completas do lutador.
status: Exibe o status do lutador (categoria e recordes).
ganharLuta: Incrementa o número de vitórias.
perderLuta: Incrementa o número de derrotas.
empatarLuta: Incrementa o número de empates.
Classe main

Ponto de entrada do programa.
Cria um array de lutadores e exibe as informações de um lutador específico.

💡 Conceitos Aplicados
Encapsulamento: Atributos privados com métodos get e set para acesso controlado.
Construtores: Inicializa as instâncias dos objetos Lutador com os dados fornecidos.
Estruturas de Decisão: Cálculo da categoria de peso do lutador com base no peso.
