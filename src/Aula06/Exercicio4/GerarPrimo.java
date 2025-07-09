package Aula06.Exercicio4;

public class GerarPrimo extends NumerosPrimos{
    public int gerarNumero(int ultimoPrimoConhecido){
        int proximo = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximo)){
            proximo++;
        }
        return proximo;
    }
}
