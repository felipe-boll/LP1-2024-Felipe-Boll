package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1060 {

  public static void quantidadeDePositivos() {
    Scanner tecladoScanner = new Scanner(System.in);

    int quantidadeDePositivos = 0;

    for (int i = 0; i < 6; i++) {
      double valor = tecladoScanner.nextDouble();
      if (valor > 0) {
        quantidadeDePositivos++;
      }
    }

    System.out.printf("%d valores positivos\n", quantidadeDePositivos);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    quantidadeDePositivos();
  }
}
