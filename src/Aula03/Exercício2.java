package Aula03;

import java.util.Scanner;

//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais,
// diferentes, o primeiro é maior ou o segundo é maior.
public class Exercício2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = leia.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = leia.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("Números diferentes");
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("Números diferentes");
            System.out.println("O segundo número é maior");
        }
    }
}
