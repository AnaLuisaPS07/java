package associacoes.empregados;

package empregadoempresa;

import cliente.Endereco;

public class MainEmpregadoEmpresa {
    public static void main(String[] args) {
        Endereco enderecoEmpresa = new Endereco("Av. Paulista", 1000, "10º andar", 
                                              "01310-100", "Bela Vista", "São Paulo", "SP");
        Empresa empresa1 = new Empresa("12.345.678/0001-99", "Tech Solutions Ltda", enderecoEmpresa);
        Empregado empregado1 = new Empregado("Carlos Souza", "#E1001", empresa1);
        
        System.out.println(empregado1);
    }
}