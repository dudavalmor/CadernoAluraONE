package Aula05.Exercicio4;
//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
// modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double media(){
        return (nota1 + nota2) / 2;
    }
}
