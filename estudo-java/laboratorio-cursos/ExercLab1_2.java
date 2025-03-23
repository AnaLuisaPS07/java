import java.util.Scanner;

public class ExercLab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso[] cursos = new Curso[4];//cria 4 cursos

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite os dados do curso " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Turno: ");
            String turno = sc.nextLine();

            System.out.print("Duração (em anos): ");
            int duracao = sc.nextInt();
            sc.nextLine();

            System.out.print("Área: ");
            String area = sc.nextLine();

            cursos[i] = new Curso(nome, turno, duracao, area); //instanciano e armazenando no vetor
        }

        System.out.println("\nDados dos cursos:");
        for (Curso curso : cursos) {
            curso.exibirDados();
        }

        sc.close();
    }
}