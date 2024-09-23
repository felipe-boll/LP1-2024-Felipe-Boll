package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1153 {

  public static void descobrirFatorial() {
    Scanner tecladoScanner = new Scanner(System.in);

    int N = tecladoScanner.nextInt();
    int fat = 1;

    for (int i = 1; i <= N; i++) {
      fat *= i;
    }

    System.out.println(fat);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirFatorial();
  }
}
