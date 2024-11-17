package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1180 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static int[] descobrirMenorEPosicao(int[] vetor) {
    int[] menorEPosicao = new int[2];
    // menor valor
    menorEPosicao[0] = Integer.MAX_VALUE;
    // posição do menor valor
    menorEPosicao[1] = 0;

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] < menorEPosicao[0]) {
        menorEPosicao[0] = vetor[i];
        menorEPosicao[1] = i;
      }
    }

    return menorEPosicao;
  }

  public static void main(String[] args) {
    int numElementos = tecladoScanner.nextInt();
    int[] vetor = new int[numElementos];

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = tecladoScanner.nextInt();
    }

    int[] menorEPosicao = descobrirMenorEPosicao(vetor);

    System.out.printf("Menor valor: %d\nPosicao: %d\n", menorEPosicao[0], menorEPosicao[1]);

  }
}
