
import java.util.Scanner;

public class calculoIMC {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre o nome da pessoa:");
		String nome = sc.nextLine();
		System.out.println("Entre a idade:");
		int idade = Integer.parseInt(sc.nextLine());
		System.out.println("Entre a altura:");
		double altura = Double.parseDouble(sc.nextLine());
		System.out.println("Entre a peso:");
		double peso = Double.parseDouble(sc.nextLine());
		double imc = peso / (altura*altura);
		
		System.out.println("Nome: " + nome + " - Idade: "
		+ idade + " - Altura: " + altura + " - Peso: "
		+ peso + " - IMC: " + imc);
		
		System.out.println();
		//sc.´close();
	}

}
