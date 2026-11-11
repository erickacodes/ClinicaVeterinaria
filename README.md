# 🐾 Sistema de Gerenciamento de Clínica Veterinária

## 1. Identificação

**Grupo 4:** Ericka, Marcos, Nicolas, Pedro, Rafael.

## 2. Sobre o projeto

Este projeto foi desenvolvido como atividade prática de Programação Orientada a Objetos em Java. O objetivo é criar um sistema simples para ajudar no gerenciamento de uma clínica veterinária.

O sistema permite cadastrar cães e gatos, listar os animais, buscar pelo código, remover cadastros, registrar consultas e atualizar o peso dos animais.

## 3. Como executar o projeto

Para executar o sistema, é necessário ter o **Java JDK 21** instalado e uma IDE, como o IntelliJ IDEA.

Passos:
1. Baixe ou clone o repositório do GitHub.
2. Abra o projeto na IDE.
3. Localize o arquivo `Main.java`.
4. Execute o método `main()`.

## 4. Classes e suas responsabilidades

O projeto possui cinco classes:

- **Animal:** classe principal que reúne as informações comuns dos animais, como código, nome, idade, peso e responsável.
- **Cao:** representa os cães e possui informações específicas, como raça e porte.
- **Gato:** representa os gatos e possui informações específicas, como cor e se vive somente dentro de casa.
- **ClinicaVeterinaria:** controla os animais cadastrados e realiza operações como adicionar, buscar, remover e atualizar informações.
- **Main:** inicia o programa e apresenta exemplos das funcionalidades do sistema.

## 5. Conceitos de orientação a objetos utilizados

- **Herança:** as classes `Cao` e `Gato` herdam características da classe `Animal`.
- **Sobrescrita:** cada classe possui sua própria versão do método `emitirSom()`, representando o som de cada animal.
- **Polimorfismo:** a lista `ArrayList<Animal>` permite armazenar cães e gatos juntos, tratando todos como animais.
- **Encapsulamento:** os atributos das classes são privados e acessados por métodos.
- **ArrayList:** utilizado para armazenar os animais e permitir adicionar, remover, buscar e listar os cadastros.

## 6. Dificuldades encontradas

Durante o desenvolvimento, uma das principais dificuldades foi entender como aplicar herança e polimorfismo na prática. Também foi necessário aprender a trabalhar com `ArrayList` para organizar os animais e realizar as operações do sistema.

Com o desenvolvimento do projeto, foi possível compreender melhor esses conceitos e como eles podem ser utilizados em uma situação real.

## 7. Fontes consultadas

- Material das aulas de Programação Orientada a Objetos.
- Documentação oficial do Java: https://docs.oracle.com/en/java/
- Pesquisas e exemplos sobre Java, herança, polimorfismo e ArrayList.
