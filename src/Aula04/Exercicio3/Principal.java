package Aula04.Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "Cruel Summer";
        musica.artista = "Taylor Swift";
        musica.anoDeLancamento = 2019;
        musica.exibeFichaTecnica();

        musica.avaliaMusica(9.5);
        musica.avaliaMusica(9.7);
        musica.avaliaMusica(10);

        double media = musica.mediaAvaliacoes();
        System.out.println("Média: " + media);
    }
}
