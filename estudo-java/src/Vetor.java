import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas posicoes tera o vetor? ");
        int posi = sc.nextInt();

        double[] vet = new double [posi];

        for(int i=0; i<posi; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("VETOR: ");
        for(int i=0; i<posi; i++){
            System.out.println(String.format("%.2f", vet[i]));
        }

        sc.close();
    }
}