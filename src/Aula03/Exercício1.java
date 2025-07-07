package Aula03;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = leia.nextDouble();

        if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
}
