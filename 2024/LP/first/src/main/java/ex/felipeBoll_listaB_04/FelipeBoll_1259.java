package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1259 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static int[] SepararParesEImpares(int[] paresEImpares) {
    int[] pares = new int[paresEImpares.length];
    int[] impares = new int[paresEImpares.length];
    int[] paresEImparesOrganizados = new int[paresEImpares.length];

    for (int i = 0; i < paresEImpares.length; i++) {
      if (paresEImpares[i] % 2 == 0) {
        pares[i] = paresEImpares[i];
      } else {
        impares[i] = paresEImpares[i];
      }
    }

    for (int i = 0; i < paresEImpares.length; i++) {

    }

    return paresEImparesOrganizados;
  }

  public static void main(String[] args) {
    int quantEntradas = tecladoScanner.nextInt();
    int[] paresEImpares = new int[quantEntradas];

    for (int i = 0; i < paresEImpares.length; i++) {
      paresEImpares[i] = tecladoScanner.nextInt();
    }

  }
}
