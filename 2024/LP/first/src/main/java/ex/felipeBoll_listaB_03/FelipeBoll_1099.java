package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1099 {

    public static Scanner teladoScanner = new Scanner(System.in);

    public static int descobrirMaior(int x, int y) {
        int maior;

        if (y > x) {
            maior = y;
        } else {
            maior = x;
        }

        return maior;

    }

    public static int descobrirMenor(int x, int y) {
        int menor;

        if (x > y) {
            menor = y;
        } else
            menor = x;

        return menor;

    }

    public static void descobrirSomaImparesCons(int quantTestes) {

        for (int i = 0; i < quantTestes; i++) {
            int x = teladoScanner.nextInt();
            int y = teladoScanner.nextInt();

            int maior = descobrirMaior(x, y);
            int menor = descobrirMenor(x, y);
            int somaImpares = 0;

            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }
            System.out.println(somaImpares);

        }

    }

    public static void main(String[] args) {

        int quantTestes = teladoScanner.nextInt();

        descobrirSomaImparesCons(quantTestes);

    }
}