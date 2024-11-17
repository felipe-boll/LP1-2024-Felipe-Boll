package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_2456 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static char descobrirOrdem(int[] ordemCartas) {
        boolean PrimeiraVezC = true;
        boolean PrimeiraVezD = true;

        for (int i = 0; i < ordemCartas.length - 1; i++) {

            if (ordemCartas[i] < ordemCartas[i + 1]) {
                PrimeiraVezD = false;
            } else if (ordemCartas[i] > ordemCartas[i + 1]) {
                PrimeiraVezC = false;
            }
        }

        if (PrimeiraVezC) {
            return 'C';
        } else if (PrimeiraVezD) {
            return 'D';
        } else {
            return 'N';
        }

    }

    public static void main(String[] args) {
        int[] ordemCartas = new int[5];

        for (int i = 0; i < ordemCartas.length; i++) {
            ordemCartas[i] = tecladoScanner.nextInt();
        }

        System.out.println(descobrirOrdem(ordemCartas));

    }
}
