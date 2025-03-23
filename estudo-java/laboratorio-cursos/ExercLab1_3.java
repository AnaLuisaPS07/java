import java.util.Scanner;

public class ExercLab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos cursos deseja criar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Curso[] cursos = new Curso[quantidade];

        for (int i = 0; i < quantidade; i++) {
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

            cursos[i] = new Curso(nome, turno, duracao, area);
        }

        System.out.println("\nDados dos cursos:");
        for (Curso curso : cursos) {
            curso.exibirDados();
        }

        sc.close();
    }
}