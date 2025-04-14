package associacoes.alunos;

public class Main {
    public static void main(String[] args) {
        Departamento deptTI = new Departamento("Instituto de Informatica", "INF");
        Curso engenhariaDeSoftware = new Curso("Engenharia de Software", "ES", INF);
        Aluno aluno1 = new Aluno("João Silva", "2024001", 2024, engenhariaDeSoftware);
        
        System.out.println(aluno1);
    }
}