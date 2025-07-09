package Aula06.Exercicio4;

public class VerificarPrimo extends NumerosPrimos{
    public void verificarPrimo(int numero){
        if (verificarPrimalidade(numero)){
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}
