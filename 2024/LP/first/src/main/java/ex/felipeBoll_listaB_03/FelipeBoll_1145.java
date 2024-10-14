package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1145 {

  public static Scanner teladoScanner = new Scanner(System.in);

  public static void main(String[] args) {
    int x = teladoScanner.nextInt();
    int y = teladoScanner.nextInt();

    for (int i = 1; i <= y; i++) {
      if (i % x == 0) {
        System.out.printf("%d\n", i);
      } else
        System.out.printf("%d ", i);
    }

  }
}
