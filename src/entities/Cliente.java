package entities;

public class Cliente {

    public String nome;
    public String endereço;
    public long telefone;
    public float divida;
    public String cadastro;

    public void ImprimeCadastro() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereço);
        System.out.println("Telefone: " + telefone);
        System.out.printf("Dívida: R$%.2f\n", divida);
        System.out.println("Data de Cadastro: " + cadastro);
        System.out.println();
    }

    public void AddDivida(float valorDaDivida) {
        divida += valorDaDivida;
    }

    public void AddPagamento(float valorDoPagamento) {
        divida -= valorDoPagamento;
    }

}
