import java.util.Locale;

public class Frase {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int idade = 19;
        double salario = 1400.00;
        String nome = "Ana";
        char sexo = 'F';  

        System.out.println("A funcionária " + nome + ", sexo " + sexo + ", ganha R$ " + String.format("%.2f", salario)  + " e tem " + idade + " anos.");
    }
    
}
