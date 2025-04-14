package ex2;

public class Main {
    public static void main(String[] args) {
        Contatos c1 = new Contatos("loja@gmail.com", 123456789, "Rua dos Bobos, 0");
        Contatos c2 = new Contatos("loja123@gmail.com", 555272998, "Rua Ipê, 3");
        Contatos c3 = new Contatos("loja321@gmail.com", 111234512, "Rua Velha, 11");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3.toString());// não precisa
    }
}
