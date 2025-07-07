package Aula03;

import java.util.Scanner;

//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
public class Exercício3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("Escolha uma opção");
            System.out.println("1- Calcular área do quadrado");
            System.out.println("2- Calcular área do círcullo");
            System.out.println("3- Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = leia.nextInt();

            if (opcao == 1){
                System.out.println("Digite o lado do quadrado: ");
                double lado = leia.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
            } else if (opcao == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raio = leia.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
            } else if (opcao == 3) {
                System.out.println("Finalizando o programa");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
