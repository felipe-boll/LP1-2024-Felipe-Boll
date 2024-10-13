package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_2311 {

    public static Scanner teladoScanner = new Scanner(System.in);

    public static void descobrirNotaDasJogadoras() {

        String nomeJogadoras = teladoScanner.next();
        double grauDeDif = teladoScanner.nextDouble();

        double somaNota = 0;
        double maior = 0;
        double menor = 10;

        for (int i = 0; i < 7; i++) {
            double nota = teladoScanner.nextDouble();

            somaNota += nota;

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

        }

        double notaFinal = (somaNota - menor - maior) * grauDeDif;

        System.out.printf("%s %.2f\n", nomeJogadoras, notaFinal);

    }

    public static void main(String[] args) {

        int quantJogadoras = teladoScanner.nextInt();

        for (int i = 0; i < quantJogadoras; i++) {
            descobrirNotaDasJogadoras();
        }

    }
}
