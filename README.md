# DevSuperior - Java Spring Professional

## Desafio 05 - DScommerce
Neste desafio trabalhamos conceitos de implementar autorização ao projeto DScommerce.

O que utilizamos no backend:
- Java
- Framework Spring Boot

O desafio consiste em usar todos os conceitos aprendidos no curso como Jpa com hibernate além do uso do spring security para autenticação.

As APIs implementadas foram:
- Auth - /oauth2/token
- Categories /categories
- Order - /orders
- Product - /products
- User - /users/me

## Como executar
Clonar este repositório, importar na IDE de preferência e executar a classe principal `DscommerceApplication`.

O banco de dados H2 poderá ser consultado pelo client web do H2 no [link](http://localhost:8080/h2-console) e os dados de conexão ao banco H2 estão no arquivo `src/main/resources/application-test.properties`.

A API vai estar disponível no [link](http://localhost:8080).