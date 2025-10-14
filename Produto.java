public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Getters e Setters

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Preço
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Data de Validade
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método estaVencido
    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno())
            return true;
        if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes())
                return true;
            if (dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia()) {
                return true;
            }
        }
        return false;
    }

    // toString
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Data de Validade; " + dataValidade;
    }
}
