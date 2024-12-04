# Sistema de Vendas - TapiocasHtml

**TapiocasHtml** é uma aplicação de vendas de tapiocas desenvolvida utilizando **Kotlin** para o backend e **HTML/CSS/JavaScript** para o frontend. O backend é desenvolvido com o **Spring Boot**, utilizando o framework Kotlin, e o banco de dados utilizado é o **PostgreSQL** para armazenar as informações de vendas.

Este repositório contém o código completo do sistema, incluindo a implementação do frontend e do backend, além da integração com o banco de dados.

## Tela Principal 
![alt text](<Captura de tela/Captura de tela 2024-12-03 231131.png>)

## PopUp se não ouver compras no CPF
![alt text](<Captura de tela/Captura de tela 2024-12-03 230522.png>)

## PopUp do Historico de compras do CPF
![alt text](<Captura de tela/Captura de tela 2024-12-03 225217.png>)

## PopUP se digitar um CPF se tiver letras ou caracteres especiais 
![alt text](<Captura de tela/Captura de tela 2024-12-03 225136.png>)

## PopUp se a venda for Realizada com sucesso 
![alt text](<Captura de tela/Captura de tela 2024-12-03 225119.png>)

## Tecnologias Utilizadas

- **Frontend:**
  - **HTML5** - Estruturação da interface web.
  - **CSS** - Estilização da interface.
  - **JavaScript** - Interação com o backend via chamadas API (AJAX).
  - **Tela Responsiva** - com uma tela responsiva para varios tamanhos de tela
  
- **Backend:**
  - **Kotlin** - Linguagem principal para o desenvolvimento do backend.
  - **Spring Boot** - Framework utilizado para criar a aplicação e expor a API RESTful.
  
- **Banco de Dados:**
  - **PostgreSQL** - Sistema de banco de dados relacional para persistência de dados.
  
- **Ferramentas:**
  - **IntelliJ IDEA** - IDE utilizada para o desenvolvimento do backend.
  - **PgAdmin** - Ferramenta para gerenciar o PostgreSQL.

## Funcionalidades

- **Cadastro de Vendas:** O sistema permite registrar as vendas de tapiocas, com campos como CPF do cliente, data da venda, descrição do produto e preço.
- **Histórico de Compras:** Os usuários podem consultar o histórico de compras utilizando o CPF.
- **Interface Web:** Uma interface simples e responsiva feita com HTML/CSS/JS para interação com o backend.

## Instalação

### Pré-requisitos

- **Java JDK 21 ou superior** - Para rodar o Spring Boot.
- **PostgreSQL** - Sistema de gerenciamento de banco de dados.
- **PgAdmin** - Para gerenciar o PostgreSQL.
- **IntelliJ IDEA** - Para o desenvolvimento backend.
- **Visual Studio Code** (ou qualquer editor de sua preferência) para o frontend.

### Passos para Instalar

#### 1. Clonar o Repositório

Clone o repositório para sua máquina local:

```bash
git clone https://github.com/geovane833/TapiocasHtml.git
