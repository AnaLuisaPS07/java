import java.util.Scanner;

public class DoWhile {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double c, f;
        char resp;
        
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = 9.0 * c / 5.0 + 32.0;
            System.out.println("Equivalente en Fahrenheit: " + f);
            System.out.println("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        }while (resp == 's');

        sc.close();
    }
}