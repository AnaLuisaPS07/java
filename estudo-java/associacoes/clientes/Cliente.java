package associacoes.clientes;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String toString() {
        return "Cliente: " + nome + ", CPF: " + cpf + "\n" + endereco;
    }
}