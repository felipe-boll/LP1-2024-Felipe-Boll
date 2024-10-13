package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_2297 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void descobrirVencedorDoBafo(int quantRodadas, int quantTestes) {
    String vencedor = " ";
    int totalFigurinhasViradas_A = 0;
    int totalFigurinhasViradas_B = 0;

    for (int i = 0; i < quantRodadas; i++) {
      int figurinhasViradas_A = tecladoScanner.nextInt();
      int figurinhasViradas_B = tecladoScanner.nextInt();

      totalFigurinhasViradas_A += figurinhasViradas_A;
      totalFigurinhasViradas_B += figurinhasViradas_B;
    }

    if (totalFigurinhasViradas_A > totalFigurinhasViradas_B) {
      vencedor = "Aldo";
    } else if (totalFigurinhasViradas_B > totalFigurinhasViradas_A) {
      vencedor = "Beto";
    }

    System.out.printf("Teste %d\n%s\n", quantTestes, vencedor);
    System.out.println();
  }

  public static void main(String[] args) {

    int quantTestes = 0;

    while (true) {
      int quantRodadas = tecladoScanner.nextInt();

      if (quantRodadas == 0) {
        break;
      }

      quantTestes++;

      descobrirVencedorDoBafo(quantRodadas, quantTestes);
    }
  }
}
