package associacoes.empregados;

import cliente.Endereco; 

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empresa: " + razaoSocial + ", CNPJ: " + cnpj + "\n" + endereco;
    }
}