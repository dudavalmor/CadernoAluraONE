package Aula03;

import java.util.Scanner;

//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leia.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial = fatorial*i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
