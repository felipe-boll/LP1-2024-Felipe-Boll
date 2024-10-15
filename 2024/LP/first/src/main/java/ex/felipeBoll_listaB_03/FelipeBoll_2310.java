package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_2310 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void calcularEImprimirPorcentagensDoTime(int totalS, int totalB, int totalA, int totalS1, int totalB1,
      int totalA1) {

    double porcentagensS = (totalS1 * 100.0) / totalS;
    double porcentagensB = (totalB1 * 100.0) / totalB;
    double porcentagensA = (totalA1 * 100.0) / totalA;

    System.out.printf("Pontos de Saque: %.2f %%.\nPontos de Bloqueio: %.2f %%.\nPontos de Ataque: %.2f %%.\n",
        porcentagensS, porcentagensB, porcentagensA);

  }

  public static void main(String[] args) {

    int numJogadores = tecladoScanner.nextInt();

    // total de tentativas
    int totalS = 0;
    int totalB = 0;
    int totalA = 0;
    // total de acertos
    int totalS1 = 0;
    int totalB1 = 0;
    int totalA1 = 0;

    for (int i = 0; i < numJogadores; i++) {

      tecladoScanner.next();

      int S = tecladoScanner.nextInt();
      int B = tecladoScanner.nextInt();
      int A = tecladoScanner.nextInt();

      int S1 = tecladoScanner.nextInt();
      int B1 = tecladoScanner.nextInt();
      int A1 = tecladoScanner.nextInt();

      totalS += S;
      totalB += B;
      totalA += A;

      totalS1 += S1;
      totalB1 += B1;
      totalA1 += A1;
    }

    calcularEImprimirPorcentagensDoTime(totalS, totalB, totalA, totalS1, totalB1, totalA1);

  }
}
