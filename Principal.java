import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        int opcao;

        do {
            System.out.println("\nMENU: ");
            System.out.println("\n(1) Cadastrar Loja");
            System.out.println("\n(2) Cadastrar Produto");
            System.out.println("\n(3) Sair");
            System.out.println("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    // Dados da Loja
                    System.out.println("Nome da Loja: ");
                    String nome = sc.nextLine();

                    System.out.println("Quantidade de Funcionários: ");
                    int qtdFunc = sc.nextInt();

                    System.out.println("Salário Base dos Funcionários: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    // Endereço
                    System.out.println("ENDEREÇO: ");
                    System.out.println("Rua: ");
                    String rua = sc.nextLine();

                    System.out.println("Número: ");
                    String numero = sc.nextLine();

                    System.out.println("Complemento: ");
                    String complemento = sc.nextLine();

                    System.out.println("Cidade: ");
                    String cidade = sc.nextLine();

                    System.out.println("Estado: ");
                    String estado = sc.nextLine();

                    System.out.println("País: ");
                    String pais = sc.nextLine();

                    System.out.println("CEP: ");
                    String cep = sc.nextLine();

                    Endereco endereco = new Endereco(rua, numero, complemento, cidade, estado, pais, cep);

                    // Data de Fundação
                    System.out.println("DATA DE FUNDAÇÃO: ");
                    System.out.println("Dia: ");
                    int dia = sc.nextInt();

                    System.out.println("Mês: ");
                    int mes = sc.nextInt();

                    System.out.println("Ano: ");
                    int ano = sc.nextInt();

                    Data dataFundacao = new Data(dia, mes, ano);
                    loja = new Loja(nome, qtdFunc, salario, endereco, dataFundacao, 0);

                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:
                    // Dados do Produto
                    System.out.println("Nome do Produto: ");
                    String nomeProduto = sc.nextLine();

                    System.out.println("Preço do Produto: ");
                    double preco = sc.nextDouble();

                    // Dados da Validade
                    System.out.println("DATA DE VALIDADE: ");
                    System.out.println("Dia: ");
                    int diaVal = sc.nextInt();

                    System.out.println("Mês: ");
                    int mesVal = sc.nextInt();

                    System.out.println("Ano: ");
                    int anoVal = sc.nextInt();

                    Data dataValidade = new Data(diaVal, mesVal, anoVal);

                    produto = new Produto(nomeProduto, preco, dataValidade);

                    System.out.println("Produto criado com sucesso!");
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    break;
            }
        } while (opcao != 3);

        // Após a criação
        if (produto != null) {
            Data referencia = new Data(26, 05, 2025);
            if (produto.estaVencido(referencia)) {
                System.out.println("PRODUTO VENCIDO!");
            } else {
                System.out.println("O produto não está vencido.");
            }
        }

        if (loja != null) {
            System.out.println("\nInformações da Loja: ");
            System.out.println(loja);
        }

        sc.close();
    }
}
