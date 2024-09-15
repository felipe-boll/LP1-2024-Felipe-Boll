package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1151 {

  public static void fibonacci() {
    Scanner tecladoScanner = new Scanner(System.in);

    int primeiroTermo = 0;
    int segundoTermo = 1;
    int termoSeguinte;

    int casaFibonacci = tecladoScanner.nextInt();

    System.out.printf("%d %d", primeiroTermo, segundoTermo);

    for (int i = 3; i <= casaFibonacci; i++) {
      termoSeguinte = primeiroTermo + segundoTermo;
      System.out.printf(" %d", termoSeguinte);

      primeiroTermo = segundoTermo;
      segundoTermo = termoSeguinte;

    }

    System.out.println();

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    fibonacci();
  }
}
