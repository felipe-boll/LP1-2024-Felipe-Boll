package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1066 {

  public static void descobrirParesImparesPositivosNegativos() {
    Scanner tecladoScanner = new Scanner(System.in);

    int pares = 0;
    int impares = 0;
    int positivos = 0;
    int negativos = 0;

    for (int i = 0; i < 5; i++) {
      double valor = tecladoScanner.nextDouble();

      if (valor > 0) {
        positivos++;
      } else if (valor < 0) {
        negativos++;
      }

      if (valor % 2 == 0) {
        pares++;
      } else
        impares++;
    }

    System.out.printf(
        "%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", pares,
        impares, positivos, negativos);

    tecladoScanner.close();

  }

  public static void main(String[] args) {
    descobrirParesImparesPositivosNegativos();
  }
}
