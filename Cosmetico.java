public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int qtdFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double taxaComercializacao) {
        super(nome, qtdFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getters e Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}
