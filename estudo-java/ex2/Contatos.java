package ex2;

public class Contatos {
    private int telefone;
    private String email;
    private String endereco;

    public Contatos(String email, int telefone, String endereco) {
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }


    public String toString() {
        return "Telefone: " + telefone + ", Email: " + email + ", Endereco: " + endereco;
    }
}
