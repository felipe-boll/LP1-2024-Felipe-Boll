package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1397 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void descobrirPontosDosJogadores(int quantRodadas) {

    int pontosJogador_1 = 0;
    int pontosJogador_2 = 0;

    for (int i = 0; i < quantRodadas; i++) {
      int numeroJogador_1 = tecladoScanner.nextInt();
      int numeroJogador_2 = tecladoScanner.nextInt();

      if (numeroJogador_1 > numeroJogador_2) {
        pontosJogador_1++;
      } else if (numeroJogador_1 < numeroJogador_2) {
        pontosJogador_2++;
      }

    }
    System.out.printf("%d %d\n", pontosJogador_1, pontosJogador_2);
  }

  public static void main(String[] args) {

    while (true) {
      int quantRodadas = tecladoScanner.nextInt();

      if (quantRodadas == 0) {
        break;
      }

      descobrirPontosDosJogadores(quantRodadas);

    }

  }
}
