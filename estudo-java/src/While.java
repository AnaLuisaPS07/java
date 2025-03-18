import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero, soma = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        while (numero != 0){
            soma += numero;
            System.out.print("Digite outro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("---------------------------");
        System.out.println("A soma dos numeros eh " + soma);

        sc.close();
    }
}