# Sistema de Batalha de Pokémons em Java

Este projeto é um sistema simples de batalha de Pokémons implementado em Java. O objetivo é praticar conceitos de polimorfismo e herança, permitindo a criação de diferentes tipos de Pokémons que podem realizar ataques específicos.

## Funcionalidades

- **Adicionar Pokémons**: Adiciona diferentes tipos de Pokémons à lista.
- **Exibir Estatísticas**: Exibe as estatísticas básicas dos Pokémons.
- **Realizar Ataques**: Cada Pokémon realiza um ataque específico com base em seu tipo.

## Estrutura do Projeto

### Classe `Pokemon`

Esta é a classe base abstrata que define atributos e métodos comuns a todos os Pokémons.

- **Atributos**:
  - `name`: Nome do Pokémon.
  - `type`: Tipo do Pokémon.

- **Métodos**:
  - `attack()`: Método abstrato para ser implementado pelas subclasses.
  - `stats()`: Método estático para exibir estatísticas de todos os Pokémons.

### Subclasses de `Pokemon`

As subclasses específicas de Pokémons que implementam o método `attack` com comportamentos diferentes:
- **Fire**: Ataque do tipo fogo.
- **Water**: Ataque do tipo água.
- **Grass**: Ataque do tipo grama.
- **Rattata**: Ataque do tipo normal.

### Classe `Main`

A classe principal que inicializa e gerencia os Pokémons. Permite adicionar Pokémons à lista, exibir suas estatísticas e realizar ataques.

