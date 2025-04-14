package associacoes.musica-compositores;

public class Main {
    public static void main(String[] args) {
        Compositor compositor1 = new Compositor("Michael Jackson", "Americana");
        Compositor compositor2 = new Compositor("Renato Russo", "Brasileira");
        
        Musica musica1 = new Musica("Billie Jean", 1982, "Pop", compositor1);
        Musica musica2 = new Musica("Tempo Perdido", 1986, "Rock", compositor1);

        System.out.println(musica1);
        System.out.println("\n" + musica2);
    }
}