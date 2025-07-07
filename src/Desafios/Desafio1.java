package Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome = "Lucia Pevensie";
        String tipoConta = "Conta Corrente";
        double saldo = 3500.75;
        int opcao = 0;

        System.out.println("---------------------------------");
        System.out.println("\nDADOS INICIAIS DO CLIENTE");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("\n---------------------------------");

        while (opcao != 4) {
            System.out.println("\nDigite uma opção para continuar: ");
            System.out.println("1- Verificar saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            opcao = leia.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da conta é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que será depositado: ");
                double valorDeposito = leia.nextDouble();
                saldo = saldo + valorDeposito;
                System.out.println("Valor depositado");
            } else if (opcao == 3) {
                System.out.println("Digite o valor que será transferido: ");
                double valorTransferencia = leia.nextDouble();

                if (valorTransferencia > saldo){
                    System.out.println("Não há saldo disponível para transferir esse valor.");
                } else {
                    saldo = saldo - valorTransferencia;
                    System.out.println("O valor foi transferido");
                }
            } else if (opcao == 4) {
                System.out.println("Finalizando o programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

    }
}
