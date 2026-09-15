package application;

import entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();  // (Instanciando o OBJETO - CLIENTE)

        String opcao;

        do {
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Adicionar dívida");
            System.out.println("3 - Adicionar Pagamento");
            System.out.println("4 - Imprimir cadastro");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.next();
            System.out.println();

            switch (opcao) {
                case "1":
                    sc.nextLine(); // Limpar o buffer do next()

                    System.out.println("Digite o nome do cliente: ");
                    cliente.nome = sc.nextLine();

                    System.out.println("Digite o endereço do cliente: ");
                    cliente.endereço = sc.nextLine();

                    System.out.println("Digite o telefone do cliente: ");
                    cliente.telefone = sc.nextLong();

                    System.out.println("Digite a dívida do cliente: ");
                    cliente.divida = sc.nextFloat();

                    sc.nextLine(); // Limpando o Buffer

                    System.out.println("Digite a data de cadastro do cliente: ");
                    cliente.cadastro = sc.nextLine();

                    break;

                case "2":
                    System.out.println("Digite o valor da dívida a ser adicionada: ");
                    float valor = sc.nextFloat();
                    cliente.AddDivida(valor);
                    break;

                case "3":
                    System.out.println("Digite o valor do pagamento a ser adicionado: ");
                    float pagamento = sc.nextFloat();
                    cliente.AddPagamento(pagamento);
                    break;

                case "4":
                    cliente.ImprimeCadastro();
                    break;

                case "5":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("5"));

        sc.close();
    }
}
