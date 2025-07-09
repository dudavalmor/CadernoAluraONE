package Aula06.Exercicio2;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("miau miau");
    }

    public void arranharMoveis(){
        System.out.println("O gato arranha moveis.");
    }
}
