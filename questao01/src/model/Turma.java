package model;

public class Turma {
    private Aluno[] alunos;
    private int contador;
    private static final int CAPACIDADE_INICIAL = 10;

    public Turma() {
        this.alunos = new Aluno[CAPACIDADE_INICIAL];
        this.contador = 0;
    }

    /** Adiciona um aluno (redimensiona se necessário) */
    public void adicionar(Aluno aluno) {
        if (contador >= alunos.length) {
            // dobrar capacidade
            Aluno[] novo = new Aluno[alunos.length * 2];
            System.arraycopy(alunos, 0, novo, 0, alunos.length);
            alunos = novo;
        }
        alunos[contador++] = aluno;
    }

    /** Retorna array com alunos aprovados */
    public Aluno[] listarAprovados() {
        Aluno[] temp = new Aluno[contador];
        int idx = 0;
        for (int i = 0; i < contador; i++) {
            if (alunos[i].isAprovado()) {
                temp[idx++] = alunos[i];
            }
        }
        return java.util.Arrays.copyOf(temp, idx);
    }

    /** Retorna array com alunos reprovados */
    public Aluno[] listarReprovados() {
        Aluno[] temp = new Aluno[contador];
        int idx = 0;
        for (int i = 0; i < contador; i++) {
            if (!alunos[i].isAprovado()) {
                temp[idx++] = alunos[i];
            }
        }
        return java.util.Arrays.copyOf(temp, idx);
    }
}