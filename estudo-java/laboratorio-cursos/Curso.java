public class Curso {
    private String nome;//atributos
    private String turno;
    private int duracao; //em anos
    private String area;

    //construtor da classe
    public Curso(String nome, String turno, int duracao, String area) {
        this.nome = nome;
        this.turno = turno;
        this.duracao = duracao;
        this.area = area;
    }

    //acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return turno;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getArea() {
        return area;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Turno: " + turno);
        System.out.println("Duração: " + duracao + " anos");
        System.out.println("Área: " + area);
        System.out.println();
    }
}