package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_2456 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static char descobrirOrdem(int[] ordemCartas) {
        char c_d_n = ' ';

        for (int i = 0; i < ordemCartas.length; i++) {
            ordemCartas[i] = tecladoScanner.nextInt();

            if (ordemCartas[i] > ordemCartas[i - 1]) {
                c_d_n = 'C';
            } else if (ordemCartas[i] < ordemCartas[i - 1]) {
                c_d_n = 'D';
            } else {
                c_d_n = 'N';
            }
        }

        return c_d_n;

    }

    public static void main(String[] args) {
        int[] ordemCartas = new int[5];

        System.out.println(descobrirOrdem(ordemCartas));

    }
}
