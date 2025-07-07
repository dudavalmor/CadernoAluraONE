package Aula05.Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Calça");
        produto.setPreco(150.99);
        produto.aplicaDesconto(15);
        System.out.println(produto.getPreco());
    }
}
