package Aula06.Exercicio3;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobraTarifa(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$" + tarifaMensal + " foi cobrada.");
        System.out.println("Saldo atualizado: R$" + saldo);
    }
}
