package Aula06.Exercicio3;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(5500.99);
        conta.consulta();

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(550.87);
        cc.cobraTarifa();
        cc.consulta();
        cc.sacar(400);
        cc.consulta();

    }
}
