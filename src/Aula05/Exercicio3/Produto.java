package Aula05.Exercicio3;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicaDesconto(double percentual){
        double desconto = preco * (percentual/100);
        preco = preco - desconto;
    }

}
