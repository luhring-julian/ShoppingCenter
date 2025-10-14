public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        // Verifica se a data informada é válida
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Usando o padrão 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Getters e Setters

    // Dia
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    // Mes
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // Ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método verificaAnoBissexto
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12)
            return false;

        int[] diasMes = { 31, verificaAnoBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return dia >= 1 && dia <= diasMes[mes - 1];
    }

    private boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // toString
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
