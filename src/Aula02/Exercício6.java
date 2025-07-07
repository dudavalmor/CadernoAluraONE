package Aula02;

public class Exercício6 {
    public static void main(String[] args) {
        double precoOriginal = 150.50;
        double percentualDesconto = 10;

        double precoFinal = precoOriginal - (precoOriginal * (percentualDesconto/100));

        System.out.println("Preço final: R$ " + precoFinal);
    }
}
