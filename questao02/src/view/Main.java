package view;

import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MegaSena jogo = new MegaSena();

        System.out.println("Digite 6 números para seu jogo da Mega-Sena (1 a 60), sem repetir:");
        while (!jogo.estaCompleto()) {
            System.out.printf("Número %d: ", jogo.getNumeros().length + 1);
            int num = sc.nextInt();
            int res = jogo.adicionarNumero(num);
            switch (res) {
                case -1:
                    System.out.println("Número fora do intervalo [1-60], tente novamente.");
                    break;
                case 0:
                    System.out.println("Número já inserido ou limite atingido, tente outro.");
                    break;
                case 1:
                    System.out.println("Número aceito.");
                    break;
            }
        }
        sc.close();

        jogo.ordenarNumerosMegaSena();
        System.out.println("\nSeus números ordenados:");
        for (int n : jogo.getNumeros()) {
            System.out.printf("%d  ", n);
        }
        System.out.println();
    }
}
