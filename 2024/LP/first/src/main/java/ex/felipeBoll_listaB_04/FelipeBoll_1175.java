package ex.felipeBoll_listaB_04;

//import java.util.Scanner;

public class FelipeBoll_1175 {

  public static java.util.Scanner tecladoScanner = new java.util.Scanner(System.in);

  public static void imprimirArraysInt(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("N[%d] = %d\n", i, array[i]);
    }
  }

  public static int[] trocarPosicoes(int[] vetor) {
    for (int i = 0; i < vetor.length / 2; i++) {
      int ajuda = vetor[i];
      vetor[i] = vetor[vetor.length - i - 1];
      vetor[vetor.length - i - 1] = ajuda;
    }

    return vetor;
  }

  public static int[] preencherVetor(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = tecladoScanner.nextInt();
    }

    return vetor;

  }

  public static void main(String[] args) {
    int[] vetor = new int[20];
    vetor = preencherVetor(vetor);

    vetor = trocarPosicoes(vetor);
    imprimirArraysInt(vetor);
  }
}
