package Aula04.Exercicio3;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliaMusica(double nota){
       avaliacao = avaliacao + nota;
       numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao/numAvaliacoes;
    }
}
