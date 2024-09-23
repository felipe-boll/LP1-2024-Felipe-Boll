package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1170 {

    public static void descobrirDuracaoDaComidaDosBlobs() {
        Scanner tecladoScanner = new Scanner(System.in);

        int quantTestes = tecladoScanner.nextInt();

        for (int i = 0; i < quantTestes; i++) {
            double quantInicialDeComida = tecladoScanner.nextDouble();
            int dias = 0;

            while (quantInicialDeComida > 1.0) {
                quantInicialDeComida /= 2.0;
                dias++;
            }
            System.out.printf("%d dias\n", dias);
        }

        tecladoScanner.close();
    }

    public static void main(String[] args) {
        descobrirDuracaoDaComidaDosBlobs();
    }
}
