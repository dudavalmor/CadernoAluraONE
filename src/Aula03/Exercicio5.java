package Aula03;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leia.nextInt();

        if (numero%2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}
