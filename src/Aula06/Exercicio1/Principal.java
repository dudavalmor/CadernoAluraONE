package Aula06.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.defineModelo("Sedan");
        carro.definePreco(100000.55, 55000, 15983.55);
        carro.informacoes();
    }
}
