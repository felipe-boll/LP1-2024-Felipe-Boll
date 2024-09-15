package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1064 {

  public static void quantidadeDePositivosEMedia() {
    Scanner tecladoScanner = new Scanner(System.in);

    int quantidadeDePositivos = 0;
    double somaPositivos = 0;

    for (int i = 0; i < 6; i++) {
      double valor = tecladoScanner.nextDouble();

      if (valor > 0) {
        quantidadeDePositivos++;
        somaPositivos += valor;
      }
    }

    double media = somaPositivos / quantidadeDePositivos;

    System.out.printf("%d valores positivos\n%.1f\n", quantidadeDePositivos, media);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    quantidadeDePositivosEMedia();
  }
}
