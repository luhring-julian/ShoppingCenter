<a id="topo"></a>

# Shopping Center

![GitHub repo size](https://img.shields.io/github/repo-size/luhring-julian/ShoppingCenter?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/luhring-julian/ShoppingCenter?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/luhring-julian/ShoppingCenter?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/luhring-julian/ShoppingCenter?style=for-the-badge)

## Descrição do Projeto

<p align="justify">
Aplicativo simples em Java (console) para cadastrar <b>lojas</b> e <b>produtos</b> em um shopping center. Projeto desenvolvido como trabalho final da disciplina <b>Laboratório I - Unisinos</b>. Implementação focada em <b>orientação a objetos</b> e <b>validação de datas</b> (incluindo anos bissextos). Desenvolvido originalmente no <b>BlueJ</b>.
</p>

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Funcionalidades

- Cadastro de lojas
- Cadastro de produtos
- Validação de datas (com tratamento de ano bissexto)
- Estruturas básicas de domínio: `Shopping`, `Loja`, `Produto`, `Data`, `Endereço`, etc.

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Estrutura do Projeto

```
├── ☕ Alimentacao.java
├── ☕ Bijuteria.java
├── ☕ Cosmetico.java
├── ☕ Data.java
├── ☕ Endereco.java
├── ☕ Informatica.java
├── ☕ Loja.java
├── ☕ Principal.java  ← ponto de entrada
├── ☕ Produto.java
├── 📖 README.md
├── ☕ Shopping.java
└── ☕ Vestuario.java
```

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Tecnologias Usadas

[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](#)

<!-- Para mais shields de tecnologia, acessar: https://github.com/inttter/md-badges -->

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Pré-Requisitos

<p align="justify">
Você pode executar o projeto no <b>BlueJ</b> (ambiente original) ou via <b>JDK</b> no terminal/IDE.
</p>

- [Java JKD 17+](https://www.oracle.com/br/java/technologies/downloads/) (recomendado);
- [BlueJ 5.x](https://www.bluej.org/) (opcional, caso queira replicar o ambiente didático);
- VSCode com a extensão <i>Extension Pack for Java</i> (opcional).

Verifique também a sua versão do Java:

```
java -version
javac -version
```

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Como Executar

- Faça um clone do repositório

```
git clone https://github.com/luhring-julian/ShoppingCenter.git
cd ShoppingCenter
```

### BlueJ (ambiente original recomendado)

- Abra o BlueJ
- File -> Open Project... e selecione a pasta do repositório
- Dê duplo-clique na classe `Principal` e clique em <b>void main(String[] args)</b> para executar
- Sigas as instruções no console
  > O programa foi concebido para rodar via terminal no BlueJ (sem GUI), em linha com a proposta da disciplina

### Terminal (JDK)

- Na pasta raiz do projeto, compile todos os `.java` e execute o `Principal`:
  - Windows (PoweShell/CMD):
  ```
  javac *.java
  java Principal
  ```
  - macOS/Lineux (bash/zsh):
  ```
  javac *.java
  java Principal
  ```

### VS Code

- Instale o <b><i>Extension Pack for Java</i></b>
- Abra a pasta do projeto no VS Code
- Localize o arquivo `Principal.java`
- Clique em <b>Run</b>

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Como Testar

- Criar o Shopping
  - Informe nome e endereço (rua, número, cidade, estado, país, CEP) quando solicitado
- Cadastrar uma Loja (ex: Vestuário)
  - Nome da loja: `Estilo & Cia`
  - Endereço: preencha normalmente
  - Data de inauguração: teste <b>ano bissexto</b> - por exemplo: `29/02/2024`
  - Verifique se o sistema aceita datas válidas e rejeita inválidas (ex: `31/11/2024`)
- Cadastrar Produtos na Loja
  - Produto 1: `Camiseta Básica`, preço `79.90`, data de validade em branco (se o domínio permitir) ou uma data futura coerente
  - Produto 2 (Alimentação): `Chocolate 70%`, preço `12.50`, validade `15/07/2026` - confirme tratamento de validade
- Listar/Imprimir dados
  - Verifique se as lojas e produtos aparecem corretamente associados ao shopping
- Casos-limite úteis
  - Datas: `29/02` em anos não bissextos (deve falhar)
  - Preços negativos (devem ser recusados)
  - Nomes vazios (devem ser recusados)

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Tarefas em Aberto

- [ ] Adicionar menus claros e validações de entrada robustas no `Principal`
- [ ] Criar testes unitários (JUnit) para `Data`, `Produto` e `Loja`
- [ ] Evoluir para interface gráfica (JavaFX/Swing) ou API REST (Spring Boot)

<a href="#topo"><p align="right">Voltar ao topo</p></a>

## Desenvolvido por [Julian Luhring](https://github.com/luhring-julian)

### [![LinkedIn](https://custom-icon-badges.demolab.com/badge/LinkedIn-0A66C2?logo=linkedin-white&logoColor=fff)](https://www.linkedin.com/in/julianluhring) [![GitHub](https://img.shields.io/github/followers/luhring-julian?label=follow&style=social)](https://github.com/luhring-julian)

#### Este projeto foi criado como um projeto acadêmico para fins de aprendizado e portfólio.

<a href="#topo"><p align="right">Voltar ao topo</p></a>
