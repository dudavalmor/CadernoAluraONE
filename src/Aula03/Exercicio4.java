package Aula03;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número para saber a tabuada: ");
        int numero = leia.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + i*numero);
        }
    }
}
