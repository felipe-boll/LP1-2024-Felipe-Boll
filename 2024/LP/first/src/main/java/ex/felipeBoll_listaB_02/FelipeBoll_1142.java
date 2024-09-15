package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1142 {
  public static void main(String[] args) {
    int N = new Scanner(System.in).nextInt();
    for (int i = 0; i < N * 3; i += 4)
      System.out.printf("%d %d %d PUM\n", i + 1, i + 2, i + 3);
  }
}
