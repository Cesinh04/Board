# Modelo de Relatório do Projeto Board

## 1. Identificação do Projeto

* **Nome do Projeto:** Board - Aplicação de Gerenciamento de Tarefas
* **Autor:** Cesar Felipe Ferreira Dos Santos
* **Data:** 15/08/2025
* **Versão:** 1.0

## 2. Objetivo

O objetivo deste projeto é desenvolver uma aplicação que permita gerenciar tarefas e atividades de forma prática e visual, utilizando conceitos de Java, Spring Boot, JPA e uma interface web simples.

## 3. Funcionalidades Implementadas

* Criar, visualizar, editar e deletar tarefas.
* Categorizar tarefas por status (concluída, em andamento, pendente).
* Persistência dos dados usando banco de dados H2 ou outro configurado.
* API REST para operações CRUD.
* Possibilidade de integração futura com front-end.

## 4. Tecnologias Utilizadas

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **H2 Database** (ou outro banco configurável)
* **Maven/Gradle** para gerenciamento de dependências
* **IntelliJ IDEA** como IDE de desenvolvimento

## 5. Estrutura do Projeto

```
board-project/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ com/seuprojeto/board
│  │  │      ├─ controller/    <- classes que gerenciam requisições HTTP
│  │  │      ├─ model/         <- classes de entidade do banco
│  │  │      └─ repository/    <- interfaces de persistência
│  │  └─ resources/
│  │      ├─ application.properties <- configuração do banco e aplicação
│  └─ test/               <- testes automatizados
├─ build.gradle ou pom.xml  <- gerenciamento de dependências
├─ README.md               <- descrição do projeto
└─ modelo-relatorio.md     <- relatório detalhado
```

## 6. Execução do Projeto

1. Abrir o projeto no IntelliJ IDEA.
2. Certificar que o JDK 17 está configurado.
3. Executar a aplicação através da classe principal `BoardApplication.java`.
4. Acessar a API pelo navegador ou ferramenta de teste (Postman/Insomnia) em `http://localhost:8080`.

## 7. Possíveis Melhorias

* Adicionar autenticação e autorização de usuários.
* Criar interface web com React ou Angular.
* Integração com banco de dados externo (MySQL, PostgreSQL).
* Implementar filtros e ordenação de tarefas.
* Adicionar testes unitários e de integração mais robustos.

## 8. Referências

* Repositório original: [GitHub DIO Board](https://github.com/digitalinnovationone/board)
* Documentação Spring Boot: [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
* Documentação Spring Data JPA: [https://spring.io/projects/spring-data-jpa](https://spring.io/projects/spring-data-jpa)
