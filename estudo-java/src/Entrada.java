import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);
    
    String nome;
    System.out.print("Entre com o nome do aluno: ");
    nome = sc.nextLine();
    System.out.print("NOME = " + nome);

    sc.close();
    }
}