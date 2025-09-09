Board Project

Um projeto de exemplo baseado no repositório Digital Innovation One Board
, aprimorado para Spring Boot 3 com JDK 17 e integração com Spring Data JPA. Este projeto é uma aplicação de aprendizado, ideal para estudar conceitos de APIs REST, persistência de dados e boas práticas de desenvolvimento Java.

🔹 Tecnologias Utilizadas

Java 17

Spring Boot 3

Spring Data JPA

Banco de dados H2 (em memória)

Gradle como gerenciador de dependências

IntelliJ IDEA (recomendado)

Git para versionamento

🔹 Funcionalidades do Projeto

Estrutura básica de uma API REST

Controle de entidades usando JPA e repositórios

Endpoints CRUD (Create, Read, Update, Delete)

Configuração pronta para testes locais usando H2

Preparado para extensões futuras de funcionalidades

🔹 Estrutura do Projeto
board/
│
├── src/main/java/com/example/board/
│   ├── controller/       # Controladores REST
│   ├── model/            # Entidades JPA
│   ├── repository/       # Interfaces JpaRepository
│   ├── service/          # Lógica de negócio (opcional)
│   └── BoardApplication.java
│
├── src/main/resources/
│   ├── application.properties # Configurações do Spring Boot
│
├── build.gradle
├── settings.gradle
└── README.md

🔹 Como Executar

Clone o repositório

git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
cd NOME_DO_REPOSITORIO


Abra no IntelliJ IDEA

Selecione Open → Escolha a pasta do projeto

Certifique-se de usar o JDK 17

Sincronize o Gradle (Reload All Gradle Projects)

Executar a aplicação

./gradlew bootRun


ou execute a classe principal BoardApplication.java diretamente pelo IntelliJ.

Acessar a API

Por padrão, a aplicação roda em: http://localhost:8080

Você pode testar os endpoints usando Postman, Insomnia ou curl

🔹 Dependências Principais
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.h2database:h2'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

🔹 Boas Práticas Incluídas

Uso de Spring Data JPA para persistência

Estrutura MVC organizada

Preparação para testes unitários e de integração

Configuração simples do banco H2 para desenvolvimento rápido

Compatível com JDK 17

🔹 Próximos Passos / Melhorias

Integração com banco MySQL ou PostgreSQL

Implementação de autenticação e autorização (Spring Security)

Validações e tratamento de erros globais

Testes unitários e integração com cobertura de código

Documentação automática via Swagger

🔹 Contato / Autor
Cesar Ferreira
