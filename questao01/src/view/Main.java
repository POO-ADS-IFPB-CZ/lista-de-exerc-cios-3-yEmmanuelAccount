package view;
import model.*;

public class Main {
    public static void main(String[] args) {
        // Criando alunos
        Aluno aluno1 = new Aluno("Maria", "2025001");
        Aluno aluno2 = new Aluno("João", "2025002");
        Aluno aluno3 = new Aluno("Ana", "2025003");

        // Cadastrando notas
        aluno1.cadastrarNota(8.0);
        aluno1.cadastrarNota(7.5);
        aluno1.cadastrarNota(9.0);
        aluno1.cadastrarNota(6.0);
        // Tentativa de exceder o máximo de notas
        boolean extraNota = aluno1.cadastrarNota(10.0);
        System.out.println("Tentativa de cadastrar 5ª nota para Maria: " + extraNota);

        aluno2.cadastrarNota(5.0);
        aluno2.cadastrarNota(6.5);

        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(7.0);

        // Calculando médias e status
        System.out.printf("%s (matrícula %s) - média: %.2f - aprovado? %b%n",
                aluno1.getNome(), aluno1.getMatricula(), aluno1.calcularMedia(), aluno1.isAprovado());
        System.out.printf("%s (matrícula %s) - média: %.2f - aprovado? %b%n",
                aluno2.getNome(), aluno2.getMatricula(), aluno2.calcularMedia(), aluno2.isAprovado());
        System.out.printf("%s (matrícula %s) - média: %.2f - aprovado? %b%n",
                aluno3.getNome(), aluno3.getMatricula(), aluno3.calcularMedia(), aluno3.isAprovado());

        // Criando turma e adicionando alunos
        Turma turma = new Turma();
        turma.adicionar(aluno1);
        turma.adicionar(aluno2);
        turma.adicionar(aluno3);

        // Listando aprovados
        System.out.println("\nAlunos aprovados:");
        for (Aluno a : turma.listarAprovados()) {
            System.out.printf("%s - média: %.2f%n", a.getNome(), a.calcularMedia());
        }

        // Listando reprovados
        System.out.println("\nAlunos reprovados:");
        for (Aluno a : turma.listarReprovados()) {
            System.out.printf("%s - média: %.2f%n", a.getNome(), a.calcularMedia());
        }
    }
}
