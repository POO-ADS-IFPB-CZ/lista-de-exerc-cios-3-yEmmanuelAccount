package view;
import java.util.Scanner;

public class SequenciaFinobacci {
    public static void main(String[] args) {
        // criando scanner
        Scanner sc = new Scanner(System.in);

        // pedindo dados
        System.out.print("Informe o valor de n (quantidade de termos): ");
        int quantidadeEscolhida = sc.nextInt(); // lendo dado
        sc.close(); // fechando scanner

        long[] serie = gerarFibonacci(quantidadeEscolhida);

        // exibindo resultados
        System.out.print("Primeiros " + quantidadeEscolhida + " termos da série de Fibonacci: [");
        for (int i = 0; i < serie.length; i++) {
            System.out.print(serie[i]);

            // colocando "," entre oss números da sequência
            if (i < serie.length - 1) {
                System.out.print(", ");
            }
        }
        // fechando a sequência
        System.out.println("]");
    }

    // FUNÇÃO: gera a sequência de Fibonacci
    private static long[] gerarFibonacci(int num) {
        if (num <= 0) {
            return new long[0];
        }
        long[] fib = new long[num];
        fib[0] = 0;
        if (num > 1) {
            fib[1] = 1;
            for (int i = 2; i < num; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }
}
