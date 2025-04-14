package ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Aninha, ", 19, "F,", 123456789);
        Pessoa p2 = new Pessoa("Gabriel,", 18, "M,", 987654321);
        Pessoa p3 = new Pessoa("Nabucodonosor,", 99999, "M,", 666666666);
        
        System.out.println(p1.getDados());
        System.out.println(p2.getDados());
        System.out.println(p3.getDados());
    }
    
}
