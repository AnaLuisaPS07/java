package associacoes.clientes;

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String complemento, String cep, 
                   String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return "Endereço: " + rua + ", " + numero + " " + complemento + 
               ", " + bairro + ", " + cidade + "/" + estado + " - CEP: " + cep;
    }
}
