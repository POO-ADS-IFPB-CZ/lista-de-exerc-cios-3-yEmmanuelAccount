package model;

// importando dependências
import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {
    // atributos
        // limites
        private static final int numerosParaEscolher = 6;
        private static final int valorMax = 60;
        private static final int valorMin = 1;

        // estrutura
        private int[] numerosMegaSena;
        private int contador;

        // declarando variáveis
        int i;

        public MegaSena() {
            this.numerosMegaSena = new int[numerosParaEscolher];
            this.contador = 0;
        }

    // FUNÇÃO: tenta adicionar novo número aos escolhidos
    public int adicionarNumero (int numeroEscolhido) {
        // verifica se o número escolhido está dentro do intervalo de Mínimo e Máximo
        if (numeroEscolhido < valorMin || numeroEscolhido > valorMax) {
            return -1;
        }
        // verifica se o número escolhido já foi escolhido
        for (i = 0; i < contador; i++) {
            if (numerosMegaSena[i] == numeroEscolhido) {
                return 0;
            }
        }
        // verifica se o número escolhido foi adicionado com sucesso
        if (contador < numerosParaEscolher) {
            numerosMegaSena[contador++] = numeroEscolhido;
            return 1;
        }
        return 0;
    }

    // FUNÇÃO: ordena os números do array
    public void ordenarNumerosMegaSena() {
        Arrays.sort(numerosMegaSena);
    }

    // FUNÇÃO: verifica se o array de números escolhidos está completo
    public boolean estaCompleto() {
        if (contador == numerosParaEscolher) {
            return true;
        }
        return false;
    }

    // FUNÇÃO: retorna cópia do array com 6 posições
    public int[] getNumeros() {
            int[] copia = new int[contador];
            System.arraycopy(numerosMegaSena, 0, copia, 0, contador);
            return copia;
    }

}
