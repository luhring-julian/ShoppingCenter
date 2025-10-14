public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int qtdFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int tamanhoEstoque, Data dataAlvara) {
        super(nome, qtdFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    // Getters e Setters
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData do Alvara: " + dataAlvara;
    }
}