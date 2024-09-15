package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1115 {

  public static void descobrirQuadrante() {
    Scanner tecladoScanner = new Scanner(System.in);

    while (true) {

      int x = tecladoScanner.nextInt();
      int y = tecladoScanner.nextInt();
      String quadrante = "";

      if (x == 0 || y == 0) {
        break;
      }

      if (x > 0 && y > 0) {
        quadrante = "primeiro";
      } else if (x < 0 && y > 0) {
        quadrante = "segundo";
      } else if (x < 0 && y < 0) {
        quadrante = "terceiro";
      } else if (x > 0 && y < 0) {
        quadrante = "quarto";
      }

      System.out.println(quadrante);

    }

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirQuadrante();
  }
}
