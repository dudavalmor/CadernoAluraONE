package Aula06.Exercicio3;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado");
    }

    public void sacar (double valor){
       if (saldo > valor) {
           saldo = saldo - valor;
           System.out.println("Saque de R$" + valor + " foi realizado.");
       } else {
           System.out.println("Não saldo disponível para esse saque.");
       }
    }

    public void consulta(){
        System.out.println("Saldo atual: R$" + saldo);
    }


}
