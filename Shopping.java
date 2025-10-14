public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // Método insereLoja
    public boolean insereLoja(Loja l) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = l;
                return true;
            }
        }
        return false;
    }

    // Método removeLoja
    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;
        for (Loja l : lojas) {
            if (l != null) {
                switch (tipo.toLowerCase()) {
                    case "cosmetico":
                        if (l instanceof Cosmetico)
                            contador++;
                        break;
                    case "vestuario":
                        if (l instanceof Vestuario)
                            contador++;
                        break;
                    case "bijuteria":
                        if (l instanceof Bijuteria)
                            contador++;
                        break;
                    case "alimentacao":
                        if (l instanceof Alimentacao)
                            contador++;
                        break;
                    case "informatica":
                        if (l instanceof Informatica)
                            contador++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return contador;
    }

    // Método lojaSeguroMaisCaro
    public Loja lojaSeguroMaisCaro() {
        Loja maisCara = null;
        double maiorSeguro = 0;
        for (Loja l : lojas) {
            if (l instanceof Informatica) {
                Informatica inf = (Informatica) l;
                if (inf.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = inf.getSeguroEletronicos();
                    maisCara = inf;
                }
            }
        }
        return maisCara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\nEndereço: ").append(endereco).append("\nLojas:\n");
        for (Loja l : lojas) {
            if (l != null)
                sb.append(l.toString()).append("\n");
        }
        return sb.toString();
    }
}
