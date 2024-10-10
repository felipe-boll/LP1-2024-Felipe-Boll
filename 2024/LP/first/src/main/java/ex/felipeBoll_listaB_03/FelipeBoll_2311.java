package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_2311 {

    public static Scanner teladoScanner = new Scanner(System.in);

    public static void descobrirNotaDasJogadoras(int quantJogadoras) {

        for (int i = 0; i < quantJogadoras; i++) {
            String nomeJogadoras = teladoScanner.next();
            double grauDeDif = teladoScanner.nextDouble();

            double soma = 0;
            double maior = 0;
            double menor = 10;

            for (int j = 0; j <= 7; j++) {
                double nota = teladoScanner.nextDouble();

                if (nota > maior) {
                    maior = nota;
                }

                if (nota < menor) {
                    menor = nota;
                }

                soma += nota;
            }

            soma -= maior;
            soma -= menor;
            soma *= grauDeDif;

            System.out.printf("%s %f\n", nomeJogadoras, soma);

        }

    }

    public static void main(String[] args) {


        int quantJogadoras = teladoScanner.nextInt();

        descobrirNotaDasJogadoras(quantJogadoras);

    }
}
