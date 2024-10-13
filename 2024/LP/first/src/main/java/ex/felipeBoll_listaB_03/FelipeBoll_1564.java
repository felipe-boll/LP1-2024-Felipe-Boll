package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1564 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {

    while (tecladoScanner.hasNextInt()) {

      int numReclamacoes = tecladoScanner.nextInt();
      String copa = "";

      if (numReclamacoes == 0) {
        copa = "vai ter copa!";
      } else
        copa = "vai ter duas!";

      System.out.printf("%s\n", copa);
    }

  }
}
