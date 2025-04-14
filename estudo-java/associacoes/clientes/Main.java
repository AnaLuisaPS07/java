package associacoes.clientes;

public class MainClienteEndereco {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua da Agua", 11, "Ao lado da igreja", 
                                         "12345-678", "Flores Velha", "Flores de Goias", "GO");
        Cliente cliente1 = new Cliente("Eliene de Souza", "123.456.789-00", endereco1);
        
        System.out.println(cliente1);
    }
}