package model;

import java.util.Arrays;

public class Aluno {
    private static final int MAX_NOTAS = 4;
    private double[] notas = new double[MAX_NOTAS];
    private int contadorNotas = 0;
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    /**
     * Adiciona uma nota (máximo de 4) e retorna true se bem-sucedido
     */
    public boolean cadastrarNota(double nota) {
        if (contadorNotas < MAX_NOTAS) {
            notas[contadorNotas++] = nota;
            return true;
        }
        return false;
    }

    /**
     * Calcula a média das notas cadastradas
     */
    public double calcularMedia() {
        if (contadorNotas == 0) {
            return 0.0;
        }
        return Arrays.stream(notas, 0, contadorNotas)
                .average()
                .orElse(0.0);
    }

    /**
     * Verifica se o aluno está aprovado (média ≥ 7.0)
     */
    public boolean isAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
