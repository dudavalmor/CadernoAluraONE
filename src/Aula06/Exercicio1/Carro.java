package Aula06.Exercicio1;

public class Carro {
    String modelo;
    double preco1;
    double preco2;
    double preco3;

    public void defineModelo(String modelo){
        this.modelo = modelo;
    }

    public void definePreco(double preco1, double preco2, double preco3){
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public double maior(){
        double maior = preco1;
        if (maior < preco2){
            maior = preco2;
        }

        if (maior < preco3){
            maior = preco3;
        }

        return maior;
    }

    public double menor(){
        double menor = preco1;
        if (menor > preco2){
            menor = preco2;
        }

        if (menor > preco3){
            menor = preco3;
        }

        return menor;
    }

    public void informacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + preco1);
        System.out.println("Preço Ano 2: " + preco2);
        System.out.println("Preço Ano 3: " + preco3);
        System.out.println("Maior preço: " + maior());
        System.out.println("Menor preço: " + menor());
    }
}
