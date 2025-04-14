package ex1;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private int telefone;

    public Pessoa(String nome, int idade, String sexo, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    
    public String getDados() {
        return "Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo + " Telefone: " + telefone;
    }

    
    
}
