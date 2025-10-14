public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int qtdFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas) {
        super(nome, qtdFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.metaVendas = metaVendas;
    }

    // Getters e Setters
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas: R$ " + metaVendas;
    }
}
