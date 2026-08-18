# 📍 ConsumoAPI-CEP

> Aplicação desenvolvida em **Java** para consulta de endereços através de um CEP, utilizando uma **API REST**.

---

## 💻 Sobre o projeto

O **ConsumoAPI-CEP** é um projeto desenvolvido para praticar o consumo de APIs em Java.

A aplicação recebe um CEP, realiza uma requisição para a **API ViaCEP** e retorna informações relacionadas ao endereço consultado.

Este projeto foi desenvolvido como parte dos meus estudos em **Desenvolvimento de Software para Multiplataformas**.

---

## 🚀 Funcionalidades

* 🔎 Consulta de endereço através do CEP
* 🌐 Consumo de API REST
* 📦 Recebimento de dados em formato JSON
* ☕ Implementação utilizando Java
* 🧩 Organização do código em diferentes responsabilidades

---

## 🛠️ Tecnologias utilizadas

* ☕ **Java**
* 🌐 **API REST**
* 📦 **JSON**
* 🔗 **ViaCEP**
* 💻 **IntelliJ IDEA**

---

## 🔄 Como funciona

O funcionamento da aplicação segue este fluxo:

```text
👤 Usuário
   ↓
📍 Informa o CEP
   ↓
☕ Aplicação Java
   ↓
🌐 Requisição para a API ViaCEP
   ↓
📦 API retorna os dados em JSON
   ↓
🏠 Informações do endereço
```

---

## 📂 Estrutura do projeto

```text
src
└── br.edu.fatecpg
    ├── model
    ├── service
    │   └── Consomeapi.java
    └── view
        └── Main.java
```

### 📌 `service`

Responsável pela comunicação com a API e realização da requisição HTTP.

### 📌 `view`

Contém a classe principal responsável pela execução da aplicação.

### 📌 `model`

Package destinado às classes que representam os dados utilizados pela aplicação.

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/isabellaguerra/ConsumoAPI-CEP.git
```

### 2. Abra o projeto no IntelliJ IDEA

Abra a pasta do projeto e aguarde o IntelliJ configurar o ambiente Java.

### 3. Execute a classe `Main`

Execute o método:

```java
public static void main(String[] args)
```

### 4. Informe um CEP

A aplicação realizará a consulta e exibirá o resultado retornado pela API.

---

## 🎯 Objetivo

Este projeto foi criado com o objetivo de desenvolver conhecimentos práticos em:

* Consumo de APIs
* Requisições HTTP
* Integração entre aplicações e serviços externos
* Manipulação de respostas JSON
* Organização de projetos Java

---

## 📚 Aprendizados

Durante o desenvolvimento, pratiquei conceitos importantes de Java, principalmente a utilização de `HttpClient`, `HttpRequest` e `HttpResponse` para realizar requisições e consumir informações disponibilizadas por uma API.

---

## 👩‍💻 Desenvolvido por

**Isabella Guerra**

Estudante de **Desenvolvimento de Software para Multiplataformas — FATEC**

📍 São Paulo, Brasil

---

⭐ Se este projeto foi útil para você, fique à vontade para explorar o repositório!
