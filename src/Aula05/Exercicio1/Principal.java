package Aula05.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(100);
        conta.setSaldo(5328.54);
        conta.titular = "Maria Silva";

        System.out.println("TItular: " + conta.titular);
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Numero da conta: " + conta.getNumeroConta());

    }
}
