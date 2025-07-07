package Aula02;
//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor
// de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
public class Exercício5 {
    public static void main(String[] args) {
        double valorEmDolares = 10.5;

        double convertido = valorEmDolares * 4.94;

        System.out.println("O valor em real é R$ " + convertido);
    }
}
