package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1075 {

  public static void descobrirResto() {
    Scanner tecladoScanner = new Scanner(System.in);

    int N = tecladoScanner.nextInt();

    for (int i = 1; i <= 10000; i++) {
      if (i % N == 2) {
        System.out.println(i);
      }
    }

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirResto();
  }
}
