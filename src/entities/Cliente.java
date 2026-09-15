package entities;

public class Cliente {

    public String Nome;
    public String Endereço;
    public long Telefone;
    public float Divida;
    public String Cadastro;

    public void ImprimeCadastro() {
        System.out.println("Nome: " + Nome);
        System.out.println("Endereço: " + Endereço);
        System.out.println("Telefone: " + Telefone);
        System.out.printf("Dívida: R$%.2f\n", Divida);
        System.out.println("Data de Cadastro: " + Cadastro);
        System.out.println();
    }

    public void AddDivida(float valorDaDivida) {
        Divida += valorDaDivida;
    }

    public void AddPagamento(float valorDoPagamento) {
        Divida -= valorDoPagamento;
    }

}
