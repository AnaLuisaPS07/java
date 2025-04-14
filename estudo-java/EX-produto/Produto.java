//Parte 1 - código para mantém o estoque de produtos de uma loja
//implementei tambem um menu de opções para o usuário interagir com o programa
public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= 0) {
            System.out.println("Quantidade inválida para venda.");
            return;
        }
        
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
            double total = quantidadeVendida * valor;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades de " + nome);
            System.out.println("Total da venda: R$ " + total);
        } else {
            System.out.println("Estoque insuficiente. Temos apenas " + quantidade + " unidades de " + nome);
        }
    }

    public void comprar(int quantidadeComprada, double novoValor) {
        if (quantidadeComprada <= 0 || novoValor <= 0) {
            System.out.println("Valores inválidos para compra.");
            return;
        }
        
        quantidade += quantidadeComprada;
        valor = novoValor;
        System.out.println("Compra realizada: " + quantidadeComprada + " unidades de " + nome);
        System.out.println("Novo valor unitário: R$ " + valor);
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada <= 0) {
            System.out.println("Quantidade inválida para compra.");
            return;
        }
        
        quantidade += quantidadeComprada;
        System.out.println("Compra realizada: " + quantidadeComprada + " unidades de " + nome);
        System.out.println("Valor unitário mantido: R$ " + valor);
    }

    public String consultar() {
        return "Código: " + codigo + 
               "\nNome: " + nome + 
               "\nQuantidade: " + quantidade + 
               "\nTipo: " + tipo + 
               "\nValor: R$ " + valor;
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean equals(Produto outroProduto) {
        if (this.nome == null || this.tipo == null || outroProduto.nome == null || outroProduto.tipo == null) {
            return false;
        }
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);
    }

    public String getInfoBasica() {  //para exibir informações no menu
        return codigo + " - " + nome + " (" + tipo + ")";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}