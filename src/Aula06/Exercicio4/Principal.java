package Aula06.Exercicio4;

public class Principal {
    public static void main(String[] args) {
        VerificarPrimo verifica = new VerificarPrimo();
        verifica.verificarPrimo(17);

        GerarPrimo gerador = new GerarPrimo();
        int proximo = gerador.gerarNumero(17);
        System.out.println("O próximo primo após 17 é: " + proximo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarNumeros(30);
    }
}
