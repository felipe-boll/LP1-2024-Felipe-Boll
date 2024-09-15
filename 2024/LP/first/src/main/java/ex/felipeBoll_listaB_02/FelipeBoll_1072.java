package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1072 {

  public static void descobrirValoresDentroEForaDoIntervalo() {
    Scanner tecladoScanner = new Scanner(System.in);

    int N = tecladoScanner.nextInt();
    int in = 0;
    int out = 0;

    for (int i = 0; i < N; i++) {
      int X = tecladoScanner.nextInt();

      if (X >= 10 && X <= 20) {
        in++;
      } else
        out++;
    }

    System.out.printf("%d in\n%d out\n", in, out);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirValoresDentroEForaDoIntervalo();
  }
}
