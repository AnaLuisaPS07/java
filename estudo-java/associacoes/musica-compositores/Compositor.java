package associacoes.musica-compositores;

public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "Compositor: " + nome + ", Nacionalidade: " + nacionalidade;
    }
}