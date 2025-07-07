package Aula04.Exercicio4;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Renault";
        carro.ano = 2019;
        carro.cor = "preto";

        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.idade() + " anos");
    }
}
