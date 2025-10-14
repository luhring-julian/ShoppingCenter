public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int qtdFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos) {
        super(nome, qtdFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getters e Setters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeguro de Eletrônicos: R$ " + seguroEletronicos;
    }
}
