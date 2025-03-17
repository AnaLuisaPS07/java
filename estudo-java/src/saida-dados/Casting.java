import java.util.Locale;

public class Casting {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int a = 5;
        int b = 2;
        
        double resultado = a / b;
        System.out.println(resultado);

        double resultado2 = (double) a / b;
        System.out.println(resultado2);
        
    }
}
