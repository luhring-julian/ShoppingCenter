public class Loja {
    private String nome;
    private int qtdFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Construtor com todos os atributos
    public Loja(String nome, int qtdFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,
            int tamanhoEstoque) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    // Construtor apenas com nome e quantidade
    public Loja(String nome, int qtdFuncionarios) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.salarioBaseFuncionario = -1; // Valor padrão
        this.endereco = null; // Endereço não definido
        this.dataFundacao = null; // Data de Fundação não definida
        this.estoqueProdutos = new Produto[10]; // Tamanho padrão do estoque
    }

    // Getters e Setters

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Quantidade de Funcionários
    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    // Salário Base Funcionário
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Endereço
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Data de Fundação
    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    // Método gastosComSalario
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1)
            return -1; // Retorna -1 se o salário base não foi definido
        return qtdFuncionarios * salarioBaseFuncionario;
    }

    // Método tamanhoLoja
    public char tamanhoLoja() {
        if (qtdFuncionarios < 10)
            return 'P';
        else if (qtdFuncionarios <= 30)
            return 'M';
        else
            return 'G';
    }

    // Método insereProduto
    public boolean insereProduto(Produto p) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = p;
                return true; // Produto inserido com sucesso
            }
        }
        return true; // Estoque cheiro, não foi possível inserir o produto
    }

    // Método removeProduto
    public boolean removeProduto(String name) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)) {
                estoqueProdutos[i] = null; // Remove o produto
                return true; // Produto removido com sucesso
            }
        }
        return false; // Produto não encontrado
    }

    // Método imprimeProdutos
    public void imprimeProdutos() {
        for (Produto p : estoqueProdutos) {
            if (p != null)
                System.out.println(p);
        }
    }

    @Override
    // ToString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loja: ").append(nome).append("\nFuncionários: ").append(qtdFuncionarios).append("\nSalárioBase: ")
                .append(salarioBaseFuncionario).append("\nEndereço: ").append(endereco).append("\nData de Fundação: ")
                .append(dataFundacao);

        return sb.toString(); // Retorna a representação da loja
    }

}