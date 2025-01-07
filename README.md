# Lutadores Project

## Descrição

Este projeto é uma simulação simples de lutas entre personagens, desenvolvida em Java. Ele inclui a criação de lutadores com atributos específicos, como nome, nacionalidade, idade, peso e categoria. Além disso, o projeto permite que lutas sejam realizadas entre lutadores, com resultados gerados aleatoriamente.

Funcionalidades

Criação de Lutadores:

Cada lutador possui atributos como nome, nacionalidade, idade, altura, peso, categoria, número de vitórias, derrotas e empates.

Categorização Automática:

O peso do lutador define automaticamente sua categoria (Leve, Médio, Pesado ou Inválido).

Simulação de Luta:

Lutas podem ser marcadas entre lutadores da mesma categoria.

O resultado da luta é gerado aleatoriamente (Vitória, Derrota ou Empate).

Atualização de Status:

Após cada luta, o status de vitórias, derrotas e empates dos lutadores é atualizado.

Classes e Métodos Principais

### 1. Lutador

Atributos: Nome, nacionalidade, idade, altura, peso, categoria, vitórias, derrotas, empates.

Métodos:

apresentar(): Exibe informações detalhadas sobre o lutador.

status(): Mostra o status atual do lutador.

ganharLuta(), perderLuta(), empatarLuta(): Atualizam os resultados das lutas.

### 2. Luta

Atributos: Desafiado, desafiante, número de rounds, status de aprovação.

Métodos:

marcarLuta(Lutador lutador1, Lutador lutador2): Marca uma luta se os lutadores estiverem na mesma categoria e forem diferentes.

lutar(): Realiza a luta e determina o vencedor.

### 3. Main

Cria lutadores e realiza simulações de lutas.

Tecnologias Utilizadas

Linguagem de Programação: Java

Biblioteca padrão do Java

## Melhorias Futuras

Adicionar interface gráfica para melhor interação do usuário.

Implementar diferentes tipos de lutas (e.g., torneios, batalhas de equipes).

Incluir mais atributos e habilidades para os lutadores.