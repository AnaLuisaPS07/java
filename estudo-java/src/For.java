import java.util.Scanner;

public class For {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int qtd, numero, soma = 0;

        System.out.print("De quantos numeros deseja efetuar a soma? ");
        qtd = sc.nextInt();

        for(int i=1; i<=qtd; i++){
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            soma +=numero;
        }

        System.out.print("SOMA = " + soma);
        sc.close();
    }
}