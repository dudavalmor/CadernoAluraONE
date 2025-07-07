package Aula05.Exercicio4;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Eduarda");
        aluno.setNota1(7.5);
        aluno.setNota2(8.3);
        System.out.println(aluno.media());
    }
}
