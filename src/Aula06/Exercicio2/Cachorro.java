package Aula06.Exercicio2;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    public void abanarRabo(){
        System.out.println("O cachorro abana o rabo");
    }
}
