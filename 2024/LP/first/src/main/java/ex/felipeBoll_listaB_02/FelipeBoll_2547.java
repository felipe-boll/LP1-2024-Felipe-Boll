package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2547 {

  public static void descobrirQuemPodeEntrar() {
    Scanner tecladoScanner = new Scanner(System.in);

    int altura = 0;
    int total = 0;

    while (tecladoScanner.hasNext()) {

      int numVisitantes = tecladoScanner.nextInt();
      int altMin = tecladoScanner.nextInt();
      int altMax = tecladoScanner.nextInt();

      for (int i = 0; i < numVisitantes; i++) {
        altura = tecladoScanner.nextInt();
        if (altura >= altMin && altura <= altMax) {
          total++;
        }
      }

      System.out.println(total);

    }
    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirQuemPodeEntrar();
  }
}
