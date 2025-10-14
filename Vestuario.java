public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int qtdFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados) {
        super(nome, qtdFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.produtosImportados = produtosImportados;
    }

    // Getters e Setters
    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProdutos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}
